package ecentro;

public interface CRUD<T> {
    public T add(T elem);
    public T[] query(String filter);
    public T get(String id);
    public T update(String id, T data);
    public T delete(String id);
}
