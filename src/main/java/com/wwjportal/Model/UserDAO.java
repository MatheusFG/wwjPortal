package com.wwjportal.Model;

import org.hibernate.Session;
import org.springframework.ui.Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by User on 11/04/2016.
 */
public class UserDAO {

    public void CreateUser(String login, String senha , Model model){
        try {

            // Open new Session.
            Session session = com.wwjportal.Config.Main.getSession().getSessionFactory().openSession();
            session.beginTransaction();

            //Get system time.

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            String data = sdf.format(new Date());

            System.out.println("System Time: " + data);


            User user = new User();
            //Set values.
            user.setUser_login(login);
            user.setUser_password(senha);
            user.setUser_creation(data);



            // Save user object.
            session.save(user);

            // Add html tags.
            model.addAttribute("login", user.getUser_login());
            model.addAttribute("password", user.getUser_password());
            model.addAttribute("message", "User has been created !");


            session.getTransaction().commit();

            // Show on springBoot console.
            System.out.println("Login: " + user.getUser_login());
            System.out.println("Password: " + user.getUser_password());

        }
        catch (Exception e){


            // Add message html.
            model.addAttribute("message", "Error, try again !");

            if(e.equals("could not execute statement")){
                throw e;
            }

            System.out.println(e);

        }
    }
}
