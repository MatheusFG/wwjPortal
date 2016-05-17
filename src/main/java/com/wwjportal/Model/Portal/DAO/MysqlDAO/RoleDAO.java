package com.wwjportal.Model.Portal.DAO.MysqlDAO;

import com.wwjportal.Config.MySQLMain;
import com.wwjportal.Model.Portal.Role;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.ui.Model;

/**
 * Created by User on 27/04/2016.
 */
public class RoleDAO {

    Session session = MySQLMain.getSession().getSessionFactory().openSession();

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public void CreateRole(int id, String name , String operator, String status ,Model model){
        try {

            // Open new Session.

            session.beginTransaction();


            Role role = new Role();
            //Set values.

            role.setRole_id(id);
            role.setRole_name(name);
            role.setRole_operator(null);
            role.setRole_status(status);



            // Save user object.
            session.save(role);


            System.out.println("Role Created");

            // Add html tags.
            model.addAttribute("message", "Role has been created !");


            session.getTransaction().commit();

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

    public Role findRole(int id) {

        return (Role) MySQLMain.getSession().createCriteria(Role.class).add(Restrictions.idEq(id)).uniqueResult();
    }

}
