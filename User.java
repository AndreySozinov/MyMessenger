package mymessenger;

public class User extends BaseUser implements UserAction{
    public User(String name, String lastName, int birthYear) {
        super(name, lastName, birthYear);
    }

    @Override
    public void sendMessage(BaseUser to, String text) {
        RepoMsg msg = new RepoMsg();
        msg.save(new Message(User.this, to, text));
    }

    @Override
    public void editMessage(Long id, String newText) {
        RepoMsg msg = new RepoMsg();
        msg.editMsg(id, newText);
    }
}
