package app.DAO;

import java.util.List;

public interface IDAO<T, ID> {
    T create(T entity);
    T findById(ID id);
    List<T> getAll();
    void update(T entity);
    void remove(ID id);
}
