/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Markos
 */
public class SectionTest {
    
    public SectionTest() {
    }
    
   

    /**
     * Test of addBulletListItem method, of class Section.
     */
    @Test
    public void testAddBulletListItem() {
        
        System.out.println("addBulletListItem");
        
        BulletListItem item = new BulletListItem() ;
        
        Section sec = new Section("Education");
        
        
        item.setLocation("Greece");
        
        sec.addBulletListItem(item);
        
        String output = sec.getList().getItemList().get(0).getLocation();
        
        assertEquals("Not the same item",output, "Greece");
       
    }

    /**
     * Test of addParagraph method, of class Section.
     */
    @Test
    public void testAddParagraph() {
        System.out.println("addParagraph");
        String contents = "i am a paragraph";
        Section instance = new Section("Education");
        instance.addParagraph(contents);
        String output = instance.getParagraph().getContents();
        
        assertEquals("Not the same paragraph",output, contents);
        
       
    }

  
}
