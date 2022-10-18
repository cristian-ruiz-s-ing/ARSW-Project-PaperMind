package edu.eci.arsw.Bibliotecas.services;

import edu.eci.arsw.Bibliotecas.exception.ResourceNotFoundException;
import edu.eci.arsw.Bibliotecas.model.Biblioteca;
import edu.eci.arsw.Bibliotecas.repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecaServices {

    @Autowired
    BibliotecaRepository bibliotecaRepository;

    public void save(Biblioteca biblioteca){
        this.bibliotecaRepository.save(biblioteca);
    }

    public Biblioteca getBibliotecaById(Long idBiblioteca) throws ResourceNotFoundException {
        Biblioteca biblioteca = bibliotecaRepository.findById(idBiblioteca).orElseThrow(() -> new ResourceNotFoundException(String.format("No se encontro la biblioteca con el ID: %d", idBiblioteca)));
        return biblioteca;
    }
}
