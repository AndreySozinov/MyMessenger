package mymessenger;

public interface Repository <T, ID>{
    public ID save(T t);
    public T findById(ID id);
    public void deleteById(ID id);
}
