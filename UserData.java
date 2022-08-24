package mymessenger;

public class UserData {
    private static Long id;
    BaseUser user;

    public UserData(BaseUser user) {
        id++;
        this.user = user;
    }

    public static Long getId() {
        return id;
    }

    public BaseUser getUser() {
        return user;
    }

    @Override
    public String toString() {
        return String.format("id: %d Name: %s Surname: %s Year of birth: %d",
                        id, user.getFirstName(), user.getLastName(), 
                        user.getBirthYear());
    }
}
