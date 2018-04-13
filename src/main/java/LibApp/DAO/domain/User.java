package LibApp.DAO.domain;

import java.util.Date;

public class User {

    private Long id;
    private String login;
    private Date dateofbirth;
    private String name;

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {

    }

    public User(Long id, String login) {
        this.id = id;
        this.login = login;
    }

    public User(Long id, String login, String name) {
        this.id = id;
        this.login = login;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
