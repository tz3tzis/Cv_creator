/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.*;


public class BulletListItem {
    
    private Date date;
    private String qualification;
    private String eshablishment;
    private String location;
    private String course;
    private String CompanyName;
    private String JobTitle;
    private String Experience;
    private String Skill;
    private String Resp;
    private String achievement;
    private ArrayList<BulletListItem> AchievementList;

   
    
    
    
   
    public BulletListItem() {
     this.AchievementList = new ArrayList<>();
     }

    public ArrayList<BulletListItem> getAchievementList() {
        return AchievementList;
    }
    
    
    
     public String getResp() {
        return Resp;
    }

    public void setResp(String Resp) {
        this.Resp = Resp;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }
    
     public String getSkill() {
        return Skill;
    }

    public void setSkill(String Skill) {
        this.Skill = Skill;
    }
    
    
    public String getExperience() {
        return Experience;
    }

    public void setExperience(String Experience) {
        this.Experience = Experience;
    }
    

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String JobTitle) {
        this.JobTitle = JobTitle;
    }
   

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getEshablishment() {
        return eshablishment;
    }

    public void setEshablishment(String eshablishment) {
        this.eshablishment = eshablishment;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
    
    
    
}
