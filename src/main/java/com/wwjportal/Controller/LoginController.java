package com.wwjportal.Controller;

import com.wwjportal.Model.User;
import com.wwjportal.Model.DAO.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;

/**
 * Created by User on 11/04/2016.
 */


@Controller
public class LoginController {

    private UserDAO daoAccess = new UserDAO();

    //Search user, to grants permission to access dashboard.
    @RequestMapping(value = "/dashboard", method = RequestMethod.POST)
    public String FindUser(@RequestParam(value = "login") String login, String password, Model model, HttpSession session){

        User user = daoAccess.CheckAcess(login,password,model);

       if(user != null){

           //Set a session UsuarioLogado.
           session.setAttribute("usuariologado", user);

           // Find records users/alarms
           daoAccess.findAll(model);


           // Can use in archive App Properties(Spring Boot) server.session.timeout= #;
           // Time session.
           // session.setMaxInactiveInterval(1*60);
           return "dashboard";
        }
        else{
           return "login";
       }


    }


    //Exclude session.
    @RequestMapping(value = "/logout")
    public String logout(Model model,HttpSession session){

        //Delete session
        session.invalidate();

        model.addAttribute("message", "Logout Successful !");

        return "login";
    }

    @RequestMapping(value = "/newAccount")
    public String newAccount(){

        return "newaccount";
    }

}
