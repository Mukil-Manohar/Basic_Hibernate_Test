package hibernatetestapp;
// Generated 1 Jun, 2018 10:13:49 AM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;

/**
 * Usermsthistory generated by hbm2java
 */
public class Usermsthistory  implements java.io.Serializable {


     private long id;
     private Optionmst optionmst;
     private Tablelist tablelist;
     private Usermst usermst;
     private Integer userid;
     private String usercode;
     private String username;
     private Serializable password;
     private Date lastmoddate;

    public Usermsthistory() {
    }

	
    public Usermsthistory(long id) {
        this.id = id;
    }
    public Usermsthistory(long id, Optionmst optionmst, Tablelist tablelist, Usermst usermst, Integer userid, String usercode, String username, Serializable password, Date lastmoddate) {
       this.id = id;
       this.optionmst = optionmst;
       this.tablelist = tablelist;
       this.usermst = usermst;
       this.userid = userid;
       this.usercode = usercode;
       this.username = username;
       this.password = password;
       this.lastmoddate = lastmoddate;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public Optionmst getOptionmst() {
        return this.optionmst;
    }
    
    public void setOptionmst(Optionmst optionmst) {
        this.optionmst = optionmst;
    }
    public Tablelist getTablelist() {
        return this.tablelist;
    }
    
    public void setTablelist(Tablelist tablelist) {
        this.tablelist = tablelist;
    }
    public Usermst getUsermst() {
        return this.usermst;
    }
    
    public void setUsermst(Usermst usermst) {
        this.usermst = usermst;
    }
    public Integer getUserid() {
        return this.userid;
    }
    
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public String getUsercode() {
        return this.usercode;
    }
    
    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public Serializable getPassword() {
        return this.password;
    }
    
    public void setPassword(Serializable password) {
        this.password = password;
    }
    public Date getLastmoddate() {
        return this.lastmoddate;
    }
    
    public void setLastmoddate(Date lastmoddate) {
        this.lastmoddate = lastmoddate;
    }




}

