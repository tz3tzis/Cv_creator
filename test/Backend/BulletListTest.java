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
public class BulletListTest {
    
    public BulletListTest() {
    }
    
  
    @Test
    public void testGetItemList() {
        System.out.println("getItemList");
        BulletList instance = new BulletList();
        BulletListItem item = new BulletListItem();
        
        item.setCompanyName("Google");
        
        instance.addBulletListItem(item);
        
        String result = instance.getItemList().get(0).getCompanyName();
        
        assertEquals("Not the same company name", result, "Google");
       
    }
    
}
