package com.wwjportal.Controller;

import com.wwjportal.Model.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by User on 11/04/2016.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/newAccount")
    public String login(@RequestParam(value = "login") String login, String password, Model model){

        UserDAO daoAccess = new UserDAO();

        daoAccess.CreateUser(login,password,model);


        return "index";
    }

}
