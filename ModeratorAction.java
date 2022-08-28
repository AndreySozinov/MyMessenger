package mymessenger;

public interface ModeratorAction extends UserAction{
    public void deleteMsg(Integer id);
    public void showAllMessages();
}
