package com.wwjportal.Controller;

import com.wwjportal.Model.AlarmDB.SqlServerDAO.AlarmUsersDao;
import com.wwjportal.Model.Portal.User;
import com.wwjportal.Model.Portal.DAO.MysqlDAO.UserDAO;
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
    private AlarmUsersDao alarmdao = new AlarmUsersDao();

    @RequestMapping(value="/report")
    public String showReports(Model model, HttpSession session){


        //Get a session
        User name = (User) session.getAttribute("usuariologado");

        if(name == null){
            return "404";
        }
        else{

            //Find all Users on db.
            alarmdao.findAllAlarm(model);
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
