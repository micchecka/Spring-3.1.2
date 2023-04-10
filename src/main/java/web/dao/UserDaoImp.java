package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUserById(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> getListOfUsers() {
        TypedQuery<User> query = entityManager.createQuery("from User", User.class);
        return query.getResultList();
    }


    @Override
    public User editUser(User user) {
        return entityManager.merge(user);
    }

    @Override
    public void deleteUser(Long id) {
        entityManager.createQuery(
                        "delete from User where id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }

}
