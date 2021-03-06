package hibernatetestapp;
// Generated 1 Jun, 2018 10:13:49 AM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usermst generated by hbm2java
 */
public class Usermst  implements Serializable {


     private int id;
     private Tablelist tablelist;
     private String code;
     private String name;
     private Serializable password;
     private Character issystemuser;
     private String loginstarttime;
     private String loginendtime;
     private Integer languageid;
     private Character isactive;
     private Integer usertypebccid;
     private String defaultemalid;
     private Serializable defaultemalipassword;
     private String defaultemailsignature;
     private String defaultphoneno;
     private Integer lastmoduserid;
     private Date lastmoddate;
     private Set usermsthistories = new HashSet(0);

    public Usermst() {
    }

	
    public Usermst(int id) {
        this.id = id;
    }
    public Usermst(int id, Tablelist tablelist, String code, String name, Serializable password, Character issystemuser, String loginstarttime, String loginendtime, Integer languageid, Character isactive, Integer usertypebccid, String defaultemalid, Serializable defaultemalipassword, String defaultemailsignature, String defaultphoneno, Integer lastmoduserid, Date lastmoddate, Set usermsthistories) {
       this.id = id;
       this.tablelist = tablelist;
       this.code = code;
       this.name = name;
       this.password = password;
       this.issystemuser = issystemuser;
       this.loginstarttime = loginstarttime;
       this.loginendtime = loginendtime;
       this.languageid = languageid;
       this.isactive = isactive;
       this.usertypebccid = usertypebccid;
       this.defaultemalid = defaultemalid;
       this.defaultemalipassword = defaultemalipassword;
       this.defaultemailsignature = defaultemailsignature;
       this.defaultphoneno = defaultphoneno;
       this.lastmoduserid = lastmoduserid;
       this.lastmoddate = lastmoddate;
       this.usermsthistories = usermsthistories;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Tablelist getTablelist() {
        return this.tablelist;
    }
    
    public void setTablelist(Tablelist tablelist) {
        this.tablelist = tablelist;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Serializable getPassword() {
        return this.password;
    }
    
    public void setPassword(Serializable password) {
        this.password = password;
    }
    public Character getIssystemuser() {
        return this.issystemuser;
    }
    
    public void setIssystemuser(Character issystemuser) {
        this.issystemuser = issystemuser;
    }
    public String getLoginstarttime() {
        return this.loginstarttime;
    }
    
    public void setLoginstarttime(String loginstarttime) {
        this.loginstarttime = loginstarttime;
    }
    public String getLoginendtime() {
        return this.loginendtime;
    }
    
    public void setLoginendtime(String loginendtime) {
        this.loginendtime = loginendtime;
    }
    public Integer getLanguageid() {
        return this.languageid;
    }
    
    public void setLanguageid(Integer languageid) {
        this.languageid = languageid;
    }
    public Character getIsactive() {
        return this.isactive;
    }
    
    public void setIsactive(Character isactive) {
        this.isactive = isactive;
    }
    public Integer getUsertypebccid() {
        return this.usertypebccid;
    }
    
    public void setUsertypebccid(Integer usertypebccid) {
        this.usertypebccid = usertypebccid;
    }
    public String getDefaultemalid() {
        return this.defaultemalid;
    }
    
    public void setDefaultemalid(String defaultemalid) {
        this.defaultemalid = defaultemalid;
    }
    public Serializable getDefaultemalipassword() {
        return this.defaultemalipassword;
    }
    
    public void setDefaultemalipassword(Serializable defaultemalipassword) {
        this.defaultemalipassword = defaultemalipassword;
    }
    public String getDefaultemailsignature() {
        return this.defaultemailsignature;
    }
    
    public void setDefaultemailsignature(String defaultemailsignature) {
        this.defaultemailsignature = defaultemailsignature;
    }
    public String getDefaultphoneno() {
        return this.defaultphoneno;
    }
    
    public void setDefaultphoneno(String defaultphoneno) {
        this.defaultphoneno = defaultphoneno;
    }
    public Integer getLastmoduserid() {
        return this.lastmoduserid;
    }
    
    public void setLastmoduserid(Integer lastmoduserid) {
        this.lastmoduserid = lastmoduserid;
    }
    public Date getLastmoddate() {
        return this.lastmoddate;
    }
    
    public void setLastmoddate(Date lastmoddate) {
        this.lastmoddate = lastmoddate;
    }
    public Set getUsermsthistories() {
        return this.usermsthistories;
    }
    
    public void setUsermsthistories(Set usermsthistories) {
        this.usermsthistories = usermsthistories;
    }




}


