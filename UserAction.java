package mymessenger;

public interface UserAction extends BaseUserAction<BaseUser, String>{
    void editMessage(Integer id, String newText);
}
