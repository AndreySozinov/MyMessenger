package mymessenger;

public interface BaseUserAction<T, TEXT> {
    public void sendMessage(T t, TEXT text);
}
