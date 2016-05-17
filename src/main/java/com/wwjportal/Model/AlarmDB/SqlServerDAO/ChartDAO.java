package com.wwjportal.Model.AlarmDB.SqlServerDAO;

import com.wwjportal.Config.SQLServerMain;
import org.hibernate.Session;
/**
 * Created by User on 13/05/2016.
 */
public class ChartDAO {

    Session session = SQLServerMain.getSession().getSessionFactory().openSession();

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
