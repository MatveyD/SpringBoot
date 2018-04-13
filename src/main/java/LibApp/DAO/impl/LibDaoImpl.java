package LibApp.DAO.impl;

import LibApp.DAO.LibDAO;
import LibApp.DAO.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LibDaoImpl implements LibDAO{

    @Autowired
    private JdbcOperations jdbcOperations;

    @Autowired
    NamedParameterJdbcOperations namedParameterJdbcOperations;

    private static final String GET_USERS_BY_ID = "SELECT * FROM users WHERE id=?";
    private static final String GET_ALL_USERS ="SELECT * FROM users";
    private static final String CREATE_NEW_USER = "INSERT INTO users (id, login, name) VALUES (nextval('users_seq'),?,?)";

    @Override
    public User getUserById(Long id) {
        List<User> users = jdbcOperations.query(GET_USERS_BY_ID, new BeanPropertyRowMapper<User>(User.class), id);
        return !users.isEmpty() ? users.get(0) : null;
    }

    @Override
    public List<User> getAll() {
        List <User> users = jdbcOperations.query(GET_ALL_USERS, new BeanPropertyRowMapper<User>(User.class));
        return !users.isEmpty() ? users: null;
    }

    @Override
    public int createUser(User user) {
        return jdbcOperations.update(CREATE_NEW_USER, user.getLogin(), user.getName());
    }
}
