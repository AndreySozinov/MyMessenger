package mymessenger;

public interface BaseUserAction<T, TEXT> {
    void sendMessage(T t, TEXT text);
}
