package com.wwjportal.Model;

import com.wwjportal.Config.Main;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.ui.Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by User on 11/04/2016.
 */
public class UserDAO {

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


            System.out.println("Entrou no Mysql");
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

    public User findUser(int id) {

        return (User) Main.getSession().createCriteria(User.class).add(Restrictions.idEq(id)).uniqueResult();
    }

    public User findByName(String login) {
        try {

            //O metodo usado agora é o eq().
            // Precisamos informar 2 parametros para ele.
            //O 1° é o atributo (nome) declarado na classe User.
            //Não confundir com o campo da tabela, deve ser o atributo.
            //O 2° parametro é o recebido pelo metodo, que contem o nome usado.

            return (User) Main.getSession().createCriteria(User.class).add(Restrictions.eq("user_login", login)).uniqueResult();



        } finally {

        }
    }

    public void findAll(Model model){

        try {

            Criteria criteria = Main.getSession().createCriteria(User.class);
            ArrayList<User> logins = (ArrayList) criteria.list();

            for(int i = 0; i < logins.size(); i++){
                model.addAttribute("count", i+1);
            }

            model.addAttribute("ArrayLogins", logins);

        }

        finally {

            // Finally.

        }


    }


    public User CheckAcess(String login, String password, Model model){


        User user = new User();
        user = findByName(login);

        if(user == null){

            model.addAttribute("message", "Login or Password incorrect.");
            return null;

        }
        else if(!password.equals(user.getUser_password()) ){


            System.out.println("LOGIN: " + user.getUser_login() + "PASSWORD: " + user.getUser_password());
            model.addAttribute("message", "Login or Password incorrect.");
            return null;

        }
        else{

            System.out.println("Logged-in...");
            return user;
        }

    }


}
