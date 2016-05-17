package com.wwjportal.Controller;

import com.wwjportal.Model.Portal.DAO.MysqlDAO.RoleDAO;
import com.wwjportal.Model.Portal.DAO.MysqlDAO.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by User on 11/04/2016.
 */

@Controller
public class IndexController {

    //Redirect page.
    @RequestMapping(value="/")
    public String index(Model model){


       /*RoleDAO das = new RoleDAO();

            das.CreateRole(1, "user", "fundador", "ativo", model);
            das.CreateRole(22, "admin", "fundador", "ativo", model);
            UserDAO dao = new UserDAO();

            dao.CreateUser("wonderware","123123",model);
            dao.CreateUser("user", "123123", model);*/


        return "login";

    }

}
