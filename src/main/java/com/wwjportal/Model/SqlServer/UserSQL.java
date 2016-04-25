package com.wwjportal.Model.SqlServer;

import com.wwjportal.Model.User;
import org.hibernate.Session;
import org.springframework.ui.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by User on 22/04/2016.
 */
public class UserSQL {
    Session session = com.wwjportal.Config.Main.getSession().getSessionFactory().openSession();

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public void CreateUser(String login, String senha , Model model){
        try {

            // Open new Session.

            session.beginTransaction();


            System.out.println("Entrou no SqlSever");
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
