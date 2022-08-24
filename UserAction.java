package mymessenger;

public interface UserAction extends BaseUserAction<BaseUser, String>{
    public void editMessage(Long id, String newText);
}
