package dao;

import model.User;

public interface UserDao {
    public User getUserByEmailAndPassword(String email, String pass);
}
