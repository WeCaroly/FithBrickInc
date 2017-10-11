package appLayer;

import dataLayer.DBuser;
import webapp.todo;

import javax.persistence.EntityManager;
import java.util.ArrayList;

public class User {
    private DBuser db_User = new DBuser();
    public boolean isValidUserCredentials(String sUserName, String sUserPassword){
        return db_User.isValidUserLogin(sUserName,sUserPassword);
    }

}
