package LibApp.web.controller;

import LibApp.DAO.domain.User;
import LibApp.service.LibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private LibService libService;

    @RequestMapping(value={"/","/index"})
    public String defaultPage (Model model){
        return "index";
    }

    @RequestMapping("/user")
    public String showUser(Model model){
        //String out = "hello my friend";
        User user = libService.getUserById(3L);
        model.addAttribute("user",user);
        return "showUsers";
    }

    @RequestMapping("/users")
    public String showAll (Model model){
        List<User> users = libService.getAll();
        model.addAttribute("users",users);
        return  "showAll";
    }

    @RequestMapping("/register")
    public String register (Model model){
        return "registration";
    }

    @RequestMapping(value="/create", method = RequestMethod.POST )
    public  String createUser(@RequestParam("login") String login, @RequestParam("name") String name){
        int insertedRowsCount = libService.createUser(new User(null, login, name));
        return insertedRowsCount==1 ? "creationFailure" : "creationFailure";
    }

}
