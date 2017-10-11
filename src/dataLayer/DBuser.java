package dataLayer;

import webapp.User;

import java.sql.*;

public class DBuser {

    //JDB driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    static final String DB_URL = "jdbc:mysql://localhost:3306/fithbrickinc";
    //static final String DB_URL = "jdbc:mysql://localhost/fithbrichinc";
    //static final String DB_URL = "jdbc:mysql://aa19qfog95k5ari.cmg7kglbmqka.us-east-1.rds.amazonaws.com:3306/webbapplogin";

    private static final String USER = "root";
    static final String PASS = "password";

    public boolean isValidUserLogin(String sUsername, String sPassowrd)
    {
        boolean isValid = false;

        Connection con = null;
        Statement stmt = null;
        String sql;

        //look up in dataBase

            //step 2 register JDBC driver
            try {
                Class.forName(JDBC_DRIVER);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try{//step 3 open connection

            System.out.print("Connecting to db....");
            con = DriverManager.getConnection(DB_URL,USER,PASS);

            //step 4
            System.out.print("creating statement.... ");
            stmt = con.createStatement();

            sql = "SELECT * FROM users WHERE uname = \"" + sUsername
                    + "\" AND password = \"" + sPassowrd+ "\"" ;
            System.out.println(sql);

            ResultSet rs = stmt.executeQuery(sql);

            //step 5 extract data from result set
            if(rs.next()){
                isValid = true;
            }
            //step 6 close up db
            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //use to close
            try{
                if(stmt!=null){
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.print("closed the DB!");
        return isValid;
    }

     /*       if(todoItem != null ) {
                //sql = "INSERT INTO todo (TODO, user) VALUES (" + todoItem + "," + userItem + ");";
                sql = "INSERT INTO todo (TODO, user) VALUES (\'"+ todoItem +"\',\'"+ userItem +"\');";
                System.out.println(sql);
                int rs = stmt.executeUpdate(sql);
        }
   */
    public void sendRegister(User newUser){
        Connection con = null;
        Statement stmt = null;
        String sql;

        //look up in dataBase

        //step 2 register JDBC driver
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{//step 3 open connection

            System.out.print("Connecting to db....");
            con = DriverManager.getConnection(DB_URL,USER,PASS);

            //step 4
            System.out.print("creating statement.... ");
            stmt = con.createStatement();

            sql = "INSERT INTO USER ()VALUE (" + newUser.getFname() +"," + newUser.getLname() + ","
                    + newUser.getUname() + ","+ newUser.getAge() + "," + newUser.getEname() + ","
                    + newUser.getEdoman() + ","+ newUser.getEcom() + "," + newUser.getGender()
                    + "," + newUser.isReciveEmail() + "," + newUser.getPAss() + ")";
            System.out.println(sql);

            ResultSet rs = stmt.executeQuery(sql);

            //step 5 close up db
            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //use to close
            try{
                if(stmt!=null){
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.print("closed the DB!");
    }

}
