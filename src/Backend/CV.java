/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.Date;

import java.util.ArrayList;



public class CV {
    
   
  
    
    
    private String   Name;
    private String   LastName;
    private String   Country ;
    private String   Email;
    private String     Number;
    private String   Gender;
    private String   Address;
    private Date     date;
  
    
    private ArrayList<Section> sections = new ArrayList<>();

    public CV(){ 

    }

    public Section addSection(String input){
       
      
       Section section = new Section(input);
       sections.add(section);

    
        return section;

    }
    
    public Section addSubSection(String input){
       Section section = new Section(input);
        for(int i=0; i<this.sections.size(); i++){
            if(this.sections.get(i).getTitle().equals("Skills")){
                this.sections.get(i).getSkillsList().add(section);
            }
        }

       return section;
    }

    
    public void addParagraph(String contents){
        
        for(int i=0; i<this.sections.size(); i++){
            if(this.sections.get(i).getTitle().equals("ProfessionalProfile")){
                this.sections.get(i).addParagraph(contents);
                
            }else if(this.sections.get(i).getTitle().equals("Interests")){
                this.sections.get(i).addParagraph(contents);
                
            }else if(this.sections.get(i).getTitle().equals("AdditionalInfo")){
                this.sections.get(i).addParagraph(contents);
                
            }else if(this.sections.get(i).getTitle().equals("CoreStrengths")){
                this.sections.get(i).addParagraph(contents);    
            }    
            
        }
        
        
    }
    
    
    
    

    public void addBulletListItem(BulletListItem item){
                for(int i=0; i<this.sections.size(); i++){
                        if(this.sections.get(i).getTitle().equals("Education")){
                            this.sections.get(i).addBulletListItem(item);

                        }else if(this.sections.get(i).getTitle().equals("Courses")){
                            this.sections.get(i).addBulletListItem(item);

                        }else if(this.sections.get(i).getTitle().equals("")){
                            this.sections.get(i).addBulletListItem(item);

                        }else if(this.sections.get(i).getTitle().equals("Career")){
                            this.sections.get(i).addBulletListItem(item);
                            
                        }else if(this.sections.get(i).getTitle().equals("Skills")){
                            this.sections.get(i).addBulletListItem(item);    
                        }    
        }
    }
    
    
    
    
    public ArrayList<Section> getSections() {
        return sections;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

  public void setName(String name){
    
    this.Name = name;
    
}

public String getName(){
    
     return Name;
}

 public void setLastName(String name){
    
    this.LastName = name;
    
}
 
 public String getLastName(){
    
     return LastName;
}
   
 public void setEmail(String email){
    
    this.Email = email;
    
}
 
 public String getEmail(){
    
     return Email;
} 
 

  public void setAddress(String address){
    
    this.Address = address;
    
}
  
 public String getAddress(){
    
     return Address;
}   
  
public void setGender(String gender){
    this.Gender = gender;
} 

public void setNumber(String number){
    
    this.Number = number;
    
}

    public void setCountry(String Country) {
        this.Country = Country;
    }




    public String getNumber(){
    
     return Number;
    }

    public String getCountry() {
        return Country;
    }

    public String getGender() {
        return Gender;
    }


    

}
