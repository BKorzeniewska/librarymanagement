package com.codetreatise.generic;

import java.util.List;

/**
 * @author Mateusz Toczek & Beata Korzeniewska
 * @since 08-01-2023
 */

public interface GenericService<T extends Object> {

	T save(T entity);
    
    T update(T entity);
  
    void delete(T entity);
  
    void delete(Long id);
    
    void deleteInBatch(List<T> entities);
  
    T find(Long id);
  
    List<T> findAll();
}
