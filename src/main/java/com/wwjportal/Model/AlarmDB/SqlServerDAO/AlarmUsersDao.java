package com.wwjportal.Model.AlarmDB.SqlServerDAO;

import com.wwjportal.Config.MySQLMain;
import com.wwjportal.Config.SQLServerMain;
import com.wwjportal.Model.AlarmDB.UserDetail;
import com.wwjportal.Model.Portal.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.ui.Model;

import java.util.ArrayList;

/**
 * Created by User on 11/04/2016.
 */
public class AlarmUsersDao extends SQLServerMain{

    Session session = SQLServerMain.getSession().getSessionFactory().openSession();


    public void setSession(Session session) {
        this.session = session;
    }


    public void findAllAlarm(Model model){

        try {


            Criteria criteria = getSession().createCriteria(UserDetail.class);
            ArrayList<UserDetail> logins = (ArrayList) criteria.list();

            model.addAttribute("count", logins.size()+1);
            model.addAttribute("ArrayLogins", logins);

        }

        catch (Exception e){

            System.out.println(e);

            // Finally.

        }


    }



}
