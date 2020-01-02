/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Markos
 */
public class CVTest {
    
    public CVTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
 
    /**
     * Test of addSection method, of class CV.
     */
    @Test
    public void testAddSection() {
        System.out.println("addSection");
        String input = "ProfessionalProfile";
        CV instance = new CV();
        instance.addSection(input);
        String output = instance.getSections().get(0).getTitle();
        
        assertEquals("Not in arraylist sections",output, input);
        
    }

    /**
     * Test of addSubSection :create a new CV , add a section Skills and then to check if 
     * it works correctly get the expected output from 2 array lists .
     */
    @Test
    public void testAddSubSection() {
        System.out.println("addSubSection");
        String input = "JAVA";
        CV instance = new CV();
        instance.addSection("Skills");
        instance.addSubSection("JAVA");
        String output = instance.getSections().get(0).getSkillsList().get(0).getTitle();
        assertEquals("Not the same subsection (skills)",output, input);
       
    }

    /**
     * Test of addParagraph method, of class CV.
     */
    @Test
    public void testAddParagraph() {
        System.out.println("addParagraph");
        String contents = "AWESOME CONTENTS!!!";
        CV instance = new CV();
        instance.addSection("Interests");
        instance.addParagraph(contents);
        String expContents = instance.getSections().get(0).getParagraph().getContents();
        assertEquals("not the same contents",expContents,contents);
       
    }

    /**
     * Test of addBulletListItem method, of class CV.
     */
    @Test
    public void testAddBulletListItem() {
        System.out.println("addBulletListItem");
        
        BulletListItem item = new BulletListItem() ;
        
        CV instance = new CV();
        
        instance.addSection("Courses");
        
        item.setCourse("English");
        
        instance.addBulletListItem(item);
        
        String output = instance.getSections().get(0).getList().getItemList().get(0).getCourse();
        
        assertEquals("Not the same item",output, "English");
       
    }

    /**
     * Test of getSections method, of class CV.
     */
   

}