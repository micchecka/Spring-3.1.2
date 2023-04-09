package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void deleteUserById(long id) ;

//    void edit(User user, long id);

    User getUserById(long id) ;

    List<User> getListOfUsers();
    User editUser(User user);

    void deleteUser(Long id);
}
