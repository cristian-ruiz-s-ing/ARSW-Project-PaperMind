package edu.eci.arsw.impl;

import edu.eci.arsw.commons.GenericServiceImpl;
import edu.eci.arsw.dao.api.BibliotecaDaoAPI;
import edu.eci.arsw.model.Biblioteca;
import edu.eci.arsw.service.api.BibliotecaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class BibliotecaServiceImpl extends GenericServiceImpl<Biblioteca, Long> implements BibliotecaServiceAPI {

    @Autowired
    private BibliotecaDaoAPI bibliotecaDaoAPI;

    @Override
    public CrudRepository<Biblioteca, Long> getDao() {
        return bibliotecaDaoAPI;
    }
}
