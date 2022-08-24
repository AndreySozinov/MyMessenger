package mymessenger;

public interface ModeratorAction extends UserAction{
    public void deleteMsg(Long id);
    public void showAllMessages();
}
