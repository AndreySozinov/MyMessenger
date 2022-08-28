package mymessenger;

public interface UserAction extends BaseUserAction<BaseUser, String>{
    public void editMessage(Integer id, String newText);
}
