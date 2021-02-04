package loteria.orangeteste.loteria.service;

import loteria.orangeteste.loteria.model.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    User save(User user);

    Long count();

    void delete(User user);

    Boolean existsByEmail(String email);;

    User findByEmail(String email);
}
