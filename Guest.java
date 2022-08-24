package mymessenger;

public class Guest extends BaseUser implements BaseUserAction<BaseUser, String>{
    public Guest() {
        super();
    }

    @Override
    public void sendMessage(BaseUser to, String text) {
        RepoMsg msg = new RepoMsg();
        msg.save(new Message(Guest.this, to, text));
    }
}
