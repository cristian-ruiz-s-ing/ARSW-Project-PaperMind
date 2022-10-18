package edu.eci.arsw.Bibliotecas.controller;

import edu.eci.arsw.Bibliotecas.exception.ResourceNotFoundException;
import edu.eci.arsw.Bibliotecas.model.Biblioteca;
import edu.eci.arsw.Bibliotecas.repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

@RestController //es un controller especial en RESTful especificacion y equivale a la suma de @Controller y @ResponseBody.
@RequestMapping("/api")
public class BibliotecaController {

    @Autowired
    private BibliotecaRepository bibliotecaRepository;

	//Get Bibliotecas
    @GetMapping("/bibliotecas")
    public List<Biblioteca> getAllBibliotecas(){
        return this.bibliotecaRepository.findAll();
    }

    //Get Biblioteca by ID
    @GetMapping("/bibliotecas/{id}")
    public ResponseEntity<?> getBibliotecaById(@PathVariable(value = "id") Long idBibilioteca) throws ResourceNotFoundException { //@PathVariable indica que nos referimos a datos incluidos dentro del mismo path del pedido
        Biblioteca biblioteca = bibliotecaRepository.findById(idBibilioteca).orElseThrow(() -> new ResourceNotFoundException(String.format("No se encontro la biblioteca con el ID: %d", idBibilioteca)));
        return new ResponseEntity<>(biblioteca,HttpStatus.ACCEPTED);
    }

    //Save Biblioteca
    @PostMapping("/bibliotecas")
    public ResponseEntity<?> createBiblioteca(@RequestBody Biblioteca biblioteca){
        try {
            return new ResponseEntity<>(this.bibliotecaRepository.save(biblioteca), HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity<>("Error al crear nueva Biblioteca",HttpStatus.FORBIDDEN);
        }
    }

    //Update Bibblioteca
    @PutMapping("/bibliotecas/{id}")
    public ResponseEntity<?> updateBiblioteca(@PathVariable(value = "id") Long bibliotecaId, @RequestBody Biblioteca bibliotecaDatos) throws ResourceNotFoundException {
        Biblioteca biblioteca = bibliotecaRepository.findById(bibliotecaId).orElseThrow(() -> new ResourceNotFoundException(String.format("No se encontro la biblioteca con el ID: %d", bibliotecaId)));

        biblioteca.setNombre(bibliotecaDatos.getNombre());
        biblioteca.setFecha_modificacion(LocalDateTime.now());
        biblioteca.setDescripcion(bibliotecaDatos.getDescripcion());

        return new ResponseEntity<>(this.bibliotecaRepository.save(biblioteca), HttpStatus.ACCEPTED);
    }

    //Delete Biblioteca
    @DeleteMapping("/bibliotecas/{id}")
    public ResponseEntity<?> deleteBiblioteca(@PathVariable(value = "id") Long bibliotecaId) throws ResourceNotFoundException {
        Biblioteca biblioteca = bibliotecaRepository.findById(bibliotecaId).orElseThrow(() -> new ResourceNotFoundException(String.format("No se encontro la biblioteca con el ID: %d", bibliotecaId)));
        this.bibliotecaRepository.delete(biblioteca);
        return new ResponseEntity<>("Biblioteca Borrada", HttpStatus.OK);
    }
}
