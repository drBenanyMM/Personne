package dao;

import java.util.List;

public interface Dao<T> {

	List<T> getAll();

	T getById(int id);

	void save(T t);

	void update(T t, int params[]);

	void delete(T t);
}