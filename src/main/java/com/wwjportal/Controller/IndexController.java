package com.wwjportal.Controller;

import com.wwjportal.Model.DAO.RoleDAO;
import com.wwjportal.Model.DAO.UserDAO;
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


        return "login";

    }

}
