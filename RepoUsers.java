package mymessenger;

import java.util.List;

public class RepoUsers implements Repository<BaseUser, Long>{
    @Override
    public Long save(BaseUser user) {
        List<UserData> userTable = DataBase.getUserTable();
        userTable.add(new UserData(user));
        return UserData.getId();
    }

    @Override
    public BaseUser findById(Long id) {
        List<UserData> userTable = DataBase.getUserTable();
        for (UserData user : userTable) {
            if (user.getId() == id) {
                return user.getUser();
            }
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        List<UserData> userTable = DataBase.getUserTable();
        for (UserData user : userTable) {
            if (user.getId() == id) {
                userTable.remove(user);
            }
        }
        
    }
}
