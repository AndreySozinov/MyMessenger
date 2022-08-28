package mymessenger;

public interface Repository <T, ID>{
    ID save(T t);
    T findById(ID id);
    void deleteById(ID id);
}
