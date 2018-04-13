package LibApp.web.controller;

import LibApp.DAO.domain.User;
import LibApp.service.LibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private LibService libService;

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

}
