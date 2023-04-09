package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void deleteUserById(long id) ;



    User getUserById(long id);

    List<User> getListOfUsers();

    User editUser(User user);

    void deleteUser(Long id);
}
