package com.wwjportal.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by User on 11/04/2016.
 */

@Controller
public class IndexController {

    @RequestMapping(value="/")
    public String index(){return "login";}

}
