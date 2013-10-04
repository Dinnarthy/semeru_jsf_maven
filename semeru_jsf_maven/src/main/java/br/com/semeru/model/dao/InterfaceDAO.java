
package br.com.semeru.model.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;


public interface InterfaceDAO<T> {
    
    void save(T entity);
    void update (T entity);
    void delete (T entity);
    void merge (T entity);
    
    T getEntity(Serializable id);
    T getEntityByDetachedCriteria(DetachedCriteria detachedCriteria);
    List<T> getEntities();
    List<T> getListByDetachedCriteria(DetachedCriteria detachedCriteria);
    
    
}
