package edu.eci.arsw.Bibliotecas.impl;

import edu.eci.arsw.Bibliotecas.commons.GenericServiceImpl;
import edu.eci.arsw.Bibliotecas.dao.api.BibliotecaDaoAPI;
import edu.eci.arsw.Bibliotecas.model.biblioteca;
import edu.eci.arsw.Bibliotecas.service.api.BibliotecaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class BibliotecaServiceImpl extends GenericServiceImpl<biblioteca, Long> implements BibliotecaServiceAPI {

    @Autowired
    private BibliotecaDaoAPI bibliotecaDaoAPI;

    @Override
    public CrudRepository<biblioteca, Long> getDao() {
        return bibliotecaDaoAPI;
    }
}
