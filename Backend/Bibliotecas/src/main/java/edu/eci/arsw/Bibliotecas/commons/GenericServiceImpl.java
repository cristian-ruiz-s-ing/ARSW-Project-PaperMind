package edu.eci.arsw.Bibliotecas.commons;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Optional;

@Service
public abstract class GenericServiceImpl<T, ID extends Serializable> implements GenericServiceAPI<T, ID> {

    @Override
    public T save(T entity) {
        return getDao().save(entity);
    }

    @Override
    public void delete(ID id) {
        getDao().deleteById(id);
    }

    @Override
    public T get(ID id) {
        Optional<T> obj = getDao().findById(id);
        if(obj.isPresent()){
            return obj.get();
        }
        return null;
    }

    @Override
    public ArrayList<T> getAll() {
        ArrayList<T> listaBiblioteca = new ArrayList<>();
        getDao().findAll().forEach(obj -> listaBiblioteca.add(obj));
        return listaBiblioteca;
    }

    public abstract CrudRepository<T, ID> getDao();
}
