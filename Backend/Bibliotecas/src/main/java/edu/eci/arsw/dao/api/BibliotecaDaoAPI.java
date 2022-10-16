package edu.eci.arsw.dao.api;

import org.springframework.data.repository.CrudRepository;

import edu.eci.arsw.model.biblioteca;

/**
 * El DAO maneja la conexión con la fuente de datos para obtener y almacenar datos.
 * DAO de la Biblioteca.
 * No es necesario implementar el DAO, ya que lo estamos llevando a cabo en CrudRepository.
 */
public interface BibliotecaDaoAPI extends CrudRepository<biblioteca, Long>{
	
}
