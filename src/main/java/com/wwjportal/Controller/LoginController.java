package com.wwjportal.Controller;

import com.wwjportal.Model.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by User on 11/04/2016.
 */
@Controller
public class LoginController {

    private UserDAO daoAccess = new UserDAO();

    @RequestMapping(value="/dashboard", method = RequestMethod.GET)
    public String error(){
        return "404";
    }

    @RequestMapping(value = "/dashboard", method = RequestMethod.POST)
    public String FindUser(@RequestParam(value = "login") String login, String password, Model model){


       if(daoAccess.CheckAcess(login,password,model) == true){
           return "dashboard";
        }
        else{
           return "login";
       }


    }

    @RequestMapping(value = "/newAccount")
    public String login(@RequestParam(value = "login") String login, String password, Model model){



        daoAccess.CreateUser(login,password,model);


        return "index";
    }

}
