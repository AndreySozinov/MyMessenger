package mymessenger;

public abstract class BaseUser {
    private String firstName;
    private String lastName;
    private int birthYear;
    private static int count;

    public BaseUser(String name, String lastName, int birthYear) {
        this.firstName = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public BaseUser() {
        this("user" + count++, "", 0);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
