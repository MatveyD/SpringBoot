package LibApp.DAO;

import LibApp.DAO.domain.User;

import java.util.List;

public interface LibDAO {

    /**
     * Returns user by id.
     * @param id id of a user
     * @return user
     */
    User getUserById(Long id);

    List<User> getAll();

    int createUser(User user);

}
