/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import Backend.CV;

 public abstract class FileGenerator {
     
     private CV cv;
    public FileGenerator(CV cv) {
        this.cv=cv;
    }
    
     public CV getCV(){
        return cv;
      }
     
    public abstract void printTXT();
    public abstract void printLatex();
    
}
