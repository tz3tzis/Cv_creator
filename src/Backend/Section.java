/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import java.util.ArrayList;


public class Section {

    private String title;
    private BulletList list;
    private Paragraph paragraph;
    private ArrayList<Section> SkillsList;

    private BulletList ExpList;

    
    public Section(String input) {
        this.list = new BulletList();
        
        if(input.equals("ProfessionalProfile")){
          
           this.setTitle("ProfessionalProfile");
        
       }else if(input.equals("Skills")){
           this.setTitle("Skills");
           SkillsList = new ArrayList<>();

        
       }else if(input.equals("Career")){
            this.setTitle("Career");

       }else if(input.equals("Education")){
            this.setTitle("Education");

       }else if(input.equals("Courses")){
            this.setTitle("Courses");
            
       }else if(input.equals("AdditionalInfo")){
            this.setTitle("AdditionalInfo");
            
       }else if(input.equals("Interests")){
            this.setTitle("Interests");
            
       }else if(input.equals("CoreStrengths")){
            this.setTitle("CoreStrengths");
            
       }else{
           this.setTitle(input);
           ExpList = new BulletList();
       }
        
    }
    
        public void addBulletListItem(BulletListItem item){
            list.addBulletListItem(item);
        }

    
    public void addParagraph(String contents){
        this.paragraph = new Paragraph();
        paragraph.setContents(contents);
    }

    public Paragraph getParagraph() {
        return paragraph;
    }

    public ArrayList<Section> getSkillsList() {
        return SkillsList;
    }

    
    
    
    public BulletList getList() {
        return list;
    }

    public BulletList getExpList() {
        return ExpList;
    }
    

    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    
}


