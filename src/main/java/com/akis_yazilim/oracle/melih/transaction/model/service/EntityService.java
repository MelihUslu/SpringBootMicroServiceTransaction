package com.akis_yazilim.oracle.melih.transaction.model.service;

import java.util.List;

public interface EntityService<E, I>
{
    E findById(I id);

    List<E> findAll();

    E save(E entity);

    void deleteByID(I id);
}
