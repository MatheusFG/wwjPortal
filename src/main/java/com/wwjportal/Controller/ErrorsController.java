package com.wwjportal.Controller;


import com.wwjportal.Model.User;
import com.wwjportal.Model.DAO.UserDAO;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by User on 13/04/2016.
 */
@Controller
public class ErrorsController implements ErrorController {

    private static final String PATH = "/error";
    private UserDAO daoAccess = new UserDAO();


    //Verify session user.
    @RequestMapping(value={"/dashboard"}, method = RequestMethod.GET)
    public String userNotFound(Model model, HttpSession session){



        User userSession=(User) session.getAttribute("usuariologado");

        if(userSession == null){

            return "404";
        }
        else{
            daoAccess.findAll(model);
            return "dashboard";
        }
    }


    //Everyone nonexistent pages.
    @RequestMapping(value = PATH)
    public String error() {
        return "404";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
