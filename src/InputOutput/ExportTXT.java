/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import Backend.CV;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public  class ExportTXT   extends FileGenerator{

    private String FileName;
    public ExportTXT(CV thecv, String x) {
        super( thecv);
        this.FileName=x;
    }
    
    
    
    @Override
    public void printTXT() {
       

            try{
                  PrintWriter outputStream = new PrintWriter(FileName);   
                   SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yyyy");
                  Date BirthdayDate = super.getCV().getDate();
                  String date =  sdf5.format(BirthdayDate);








                 outputStream.println( super.getCV().getName()        + "\t" + super.getCV().getNumber()      + "\r\n" + 
                                       super.getCV().getLastName()     + "\t" + date                           + "\r\n" +
                                       super.getCV().getEmail()        + "\t" + super.getCV().getCountry()  + "\r\n" +
                                                         "\t" +  super.getCV().getGender()+ "\r\n");


                  for(int j=0; j<super.getCV().getSections().size(); j++){
                            if(super.getCV().getSections().get(j).getTitle().equals("ProfessionalProfile")){

                                      outputStream .println(" ProfessionalProfile: \r\n " + super.getCV().getSections().get(j).getParagraph().getContents()+"\r\n" );


                            }  
                  }

                  for(int j=0; j<super.getCV().getSections().size(); j++){
                            if(super.getCV().getSections().get(j).getTitle().equals("CoreStrengths")){

                                      outputStream .println(j+"CoreStrengths: \r\n" + super.getCV().getSections().get(j).getParagraph().getContents() );


                            }  
                  }
                   for(int i=0; i< super.getCV().getSections().size(); i++){
                              if( super.getCV().getSections().get(i).getTitle().equals("Skills")){
                                  outputStream.println("Skills and Experience \r\n");
                                  for(int j=0; j< super.getCV().getSections().get(i).getSkillsList().size(); j++){
                                      for(int k=0; k< super.getCV().getSections().get(i).getSkillsList().get(j).getExpList().getItemList().size(); k++){

                                          outputStream.println( super.getCV().getSections().get(i).getSkillsList().get(j).getTitle()+" exp:  "+ super.getCV().getSections().get(i).getSkillsList().get(j).getExpList().getItemList().get(k).getExperience() );
                                      }
                                  }

                              }
                   }
                    outputStream.println(" ");
                   
                   for(int i=0; i<super.getCV().getSections().size(); i++ ){
                          if(super.getCV().getSections().get(i).getTitle().equals("ProfessionalExprerience")){
                              outputStream.println(" ProfessionalExprerience \r\n");
                            for(int j=0; j<super.getCV().getSections().get(i).getList().getItemList().size(); j++ ){
                                  System.out.println(j+"ProfessionalProfile:" + super.getCV().getSections().get(i).getList().getItemList().get(j).getCompanyName() );
                                  System.out.println(j+"ProfessionalProfile:" + super.getCV().getSections().get(i).getList().getItemList().get(j).getJobTitle() );

                                  for(int k=0; k<super.getCV().getSections().get(i).getList().getItemList().get(j).getAchievementList().size(); k++ ){
                                              System.out.println(k + "achievement" + super.getCV().getSections().get(i).getList().getItemList().get(j).getAchievementList().get(k).getAchievement() );

                               }

                          }

                  }


              } 

                    outputStream.println(" ");
                   for(int j=0; j<super.getCV().getSections().size(); j++){
                            if(super.getCV().getSections().get(j).getTitle().equals("Career")){
                                 outputStream.println("Career  \r\n");
                                   for(int i=0; i<super.getCV().getSections().get(j).getList().getItemList().size(); i++ ){


                                       outputStream .println(  super.getCV().getSections().get(j).getList().getItemList().get(i).getCompanyName()
                                               +"  "+ super.getCV().getSections().get(j).getList().getItemList().get(i).getJobTitle()
                                                           );
                                        //Date DateCareer = super.getCV().getSections().get(j).getList().getItemList().get(i).getDate();
                                       // dateCareer=sdf5.format(DateCareer);
                                        //outputStream .println(i+"Career:" +dateCareer ) ;

                                               }  

                            }  
                  }
                       outputStream.println(" ");
                  for(int j=0; j<super.getCV().getSections().size(); j++){
                            if(super.getCV().getSections().get(j).getTitle().equals("Education")){
                                 outputStream.println("Education\r\n");
                                   for(int i=0; i<super.getCV().getSections().get(j).getList().getItemList().size(); i++ ){
                                    outputStream .print( super.getCV().getSections().get(j).getList().getItemList().get(i).getQualification() +"\t");
                                       outputStream .print( super.getCV().getSections().get(j).getList().getItemList().get(i).getLocation() +"\t");
                                       outputStream .println( super.getCV().getSections().get(j).getList().getItemList().get(i).getEshablishment());
                                    // Date DateEducation = super.getCV().getSections().get(j).getList().getItemList().get(i).getDate();
                                    // String dateEducation=sdf3.format(DateEducation);
                                   //  outputStream .println(i+"education:" + dateEducation);
                                   }
                            }  
                  }
                                       outputStream.println(" ");

                   for(int j=0; j<super.getCV().getSections().size(); j++){
                            if(super.getCV().getSections().get(j).getTitle().equals("Courses")){
                                   outputStream.println("Courses\r\n");  
                                for(int i=0; i<super.getCV().getSections().get(j).getList().getItemList().size(); i++ ){
                                     outputStream .print( super.getCV().getSections().get(j).getList().getItemList().get(i).getCourse() );
                                     outputStream .print(   super.getCV().getSections().get(j).getList().getItemList().get(i).getLocation() );
                                     outputStream .println(super.getCV().getSections().get(j).getList().getItemList().get(i).getEshablishment() );
                                    //   Date DateCourse =super.getCV().getSections().get(j).getList().getItemList().get(i).getDate();
                                    //   String dateCourse=sdf4.format(DateCourse);
                                    //    outputStream .println(i+"Courses:" + dateCourse); 
                                   }
                            }  
                  }
                                        outputStream.println(" ");

                    for(int j=0; j<super.getCV().getSections().size(); j++){
                            if(super.getCV().getSections().get(j).getTitle().equals("AdditionalInfo")){

                                      outputStream .println("AdditionalInfo:  \r\n " + super.getCV().getSections().get(j).getParagraph().getContents() );


                            }  
                  }
                                         outputStream.println(" ");

                    for(int j=0; j<super.getCV().getSections().size(); j++){
                            if(super.getCV().getSections().get(j).getTitle().equals("Interests")){

                                      outputStream .println("Interests: \r\n " + super.getCV().getSections().get(j).getParagraph().getContents() );


                            }  
                  }
                    
                    
                    
                    System.out.println(FileName+"  done!!!");
                             outputStream.close();

         }   catch (FileNotFoundException ex) {
              Logger.getLogger(ExportTXT.class.getName()).log(Level.SEVERE, null, ex);
          }

    
    }
    @Override
    public void printLatex() {
       return;
    }

    
}
