package app.DAO;

import java.util.List;
import java.util.Optional;

public interface GenericDAO<T, ID> {
    T create(T entity);
    T findById(ID id);
    List<T> getAll();
    void update(T entity);
    void remove(ID id);
}
