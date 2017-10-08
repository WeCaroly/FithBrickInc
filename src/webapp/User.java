/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp;

/**
 *
 * @author carol_8wybosj
 */
public class User {
    String fname, lname, uname;
    String ename, edoman, ecom;
    int age;
    char gender;
    boolean reciveEmail;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEdoman() {
        return edoman;
    }

    public void setEdoman(String edoman) {
        this.edoman = edoman;
    }

    public String getEcom() {
        return ecom;
    }

    public void setEcom(String ecom) {
        this.ecom = ecom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isReciveEmail() {
        return reciveEmail;
    }

    public void setReciveEmail(boolean reciveEmail) {
        this.reciveEmail = reciveEmail;
    }


}
