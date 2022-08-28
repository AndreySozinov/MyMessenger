package mymessenger;

/**
 * Разработать "мессенджер". Нужен следующий функционал:
 *- различные виды пользователей: обычный user, админ, модератор и т.д. 
 *  Наделить пользователей различными ролями.
 *- различные хранилища: сообщения, пользователи и т.д.
 *- продумать модель сообщений: дата отправки, возможность редактирования, 
 *  возможность удаления, дата обновления сообщения.
 *
 * Дополнительно:
 *- поиск по сообщениям;
 *- проявить фантазию и добавить свой функционал.
 */
public class App {
    public static void main(String[] args) {
        RepoUsers users = new RepoUsers();
        RepoMsg messages = new RepoMsg();

        Guest guest01 = new Guest();
        User user01 = new User("Имя1", "Фамилия1", 2002);
        Moderator moderator01 = new Moderator("Имя2", "Фамилия2", 2000);
        Admin admin01 = new Admin("Имя2", "Фамилия3", 1990);

        users.save(guest01);
        users.save(user01);
        users.save(moderator01);
        users.save(admin01);

        guest01.sendMessage(user01, "Hello guys!");
        user01.sendMessage(guest01, "Hello");
        moderator01.sendMessage(guest01, "Log in");
        moderator01.showAllMessages();
        moderator01.editMessage(3, "Log in, please");
        admin01.sendMessage(moderator01, "I delete him");
        admin01.showAllUsers();
        admin01.deleteUser(1);
    }
}
