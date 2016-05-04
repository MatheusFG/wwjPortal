package com.wwjportal.Controller;

import com.wwjportal.Model.User;
import com.wwjportal.Model.DAO.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


/**
 * Created by User on 13/04/2016.
 */
@Controller
public class DashboardController {

    private UserDAO daoAccess = new UserDAO();

    @RequestMapping(value="/report")
    public String showReports(Model model, HttpSession session){


        //Get a session
        User name = (User) session.getAttribute("usuariologado");

        if(name == null){
            return "404";
        }
        else{

            //Find all Users on db.
            daoAccess.findAll(model);
            return "report";
        }

    }

    @RequestMapping(value="/chart")
    public String showCharts(Model model, HttpSession session){
        User name = (User) session.getAttribute("usuariologado");
        if(name == null){
            return "404";
        }
        else{
            return "charts";
        }

    }


}
