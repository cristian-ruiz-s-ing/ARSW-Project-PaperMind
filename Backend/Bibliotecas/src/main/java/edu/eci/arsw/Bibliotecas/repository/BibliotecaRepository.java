package edu.eci.arsw.Bibliotecas.repository;

import edu.eci.arsw.Bibliotecas.model.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //componente encargado de resolver el acceso a los datos de nuestro micro-servicio.
public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long> {

}
