package edu.eci.arsw.Bibliotecas.dao.api;

import org.springframework.data.repository.CrudRepository;

import edu.eci.arsw.Bibliotecas.model.biblioteca;

public interface BibliotecaDaoAPI extends CrudRepository<biblioteca, Long>{
	
}
