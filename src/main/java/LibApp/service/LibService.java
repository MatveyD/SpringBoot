package LibApp.service;

import LibApp.DAO.domain.User;

import java.util.List;

public interface LibService {

    /**
     * Returns user by id
     * @param id id of the user to find
     * @return user
     */
    User getUserById(Long id);

    List<User> getAll();

    int createUser(User user);

}
