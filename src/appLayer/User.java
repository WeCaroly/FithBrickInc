package appLayer;

import dataLayer.DBuser;

public class User {
    private DBuser db_User = new DBuser();
    public boolean isValidUserCredentials(String sUserName, String sUserPassword){
        return db_User.isValidUserLogin(sUserName,sUserPassword);
    }

}
