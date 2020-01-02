/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Backend.*;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

import template_packet.ChooseFilleName;






/**
 *
 * @author stel
 */
public class cvTemplate extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String   Birthday ;
    private String   Qualification;
    private String   Location6;
                    
    
            
    //Combined
    
 
    private String  Com_Paragraph_of_responsibilities;
    
    
    //Functional
    
     private String  F_Company_name;        
    private Date DateCareer;
   private Date DateEducation;
   private Date DateCourse, DateProProf ,DateProfesional;
   
   private Date DateCareer2;
   private Date DateEducation2;
   private Date DateCourse2,DateProProf2,DateProfesional2 ;
   
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private CV cv;
    private Section section;
    private BulletListItem item;

    private int flag=0;
   private int flag1=0;
    private int flag2=0;
    private int flag3=0;
    public cvTemplate() {
        
        
        //initComponents();
    }

     
    public cvTemplate(CV cv2 ) {
        initComponents();
        this.cv = cv2;
        
    }
    
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        new javax.swing.JPopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Combined = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        Com_CompanyNameTextField = new javax.swing.JTextField();
        Com_JobTitleTextField = new javax.swing.JTextField();
        Com_ResposibilitiesTextField = new javax.swing.JTextField();
        Com_Achievement_X_TextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        com_add_Experience_button = new javax.swing.JButton();
        com_remove_Experience_button = new javax.swing.JButton();
        com_update_Experience_Button = new javax.swing.JButton();
        com_skill_button = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        com_experience_button = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        com_add_skill_Button1 = new javax.swing.JButton();
        com_remove_skill_button = new javax.swing.JButton();
        com_update_skill_button = new javax.swing.JButton();
        Com_DateTextFiled = new javax.swing.JTextField();
        Functional = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        F_CompanyNameTextField = new javax.swing.JTextField();
        F_JobTitleTextField = new javax.swing.JTextField();
        fun_add_career_button = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Fun_add_skill_button = new javax.swing.JButton();
        fun_remove_skill_button = new javax.swing.JButton();
        fun_upadate_skill_button = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        skillTextField = new javax.swing.JTextField();
        experienceTextField = new javax.swing.JTextField();
        Fun_DateTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CareerTable = new javax.swing.JTable();
        CareerMessage = new javax.swing.JLabel();
        CareerRemove = new javax.swing.JButton();
        UpdateCareer = new javax.swing.JButton();
        ErrorDateCareer = new javax.swing.JLabel();
        Chronologikal = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        C_CompanyNameTextField = new javax.swing.JTextField();
        C_JobTitleTextField = new javax.swing.JTextField();
        C_resposibilitiesTextfield = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        C_Achievement_X_TextField = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        C_CoreStrengthTextArea = new javax.swing.JTextArea();
        chro_add_buuton = new javax.swing.JButton();
        chro_remove_button = new javax.swing.JButton();
        chro_update_buuton = new javax.swing.JButton();
        Chro_DateTextField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        LastNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MailTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        CountryTextField = new javax.swing.JTextField();
        MaleRadioButton = new javax.swing.JRadioButton();
        FemaleRadioButton = new javax.swing.JRadioButton();
        jLabel48 = new javax.swing.JLabel();
        NumberTextField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        QuallificationTextField = new javax.swing.JTextField();
        EstablishmentTextField5 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        LocationTextField5 = new javax.swing.JTextField();
        CourseTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        EstablishmentTextField6 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        LocationTextField6 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Additional_infoTextArea = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        InterestsTextArea = new javax.swing.JTextArea();
        add_Course_Button = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        add_Education_Button = new javax.swing.JButton();
        birth = new javax.swing.JTextField();
        Education_Date_TextField = new javax.swing.JTextField();
        Date_Course_TextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        EducationTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        CourseTable = new javax.swing.JTable();
        EducationRemove = new javax.swing.JButton();
        EducationMessage = new javax.swing.JLabel();
        RemoveCourse = new javax.swing.JButton();
        CourseMessage = new javax.swing.JLabel();
        EducationUpdate = new javax.swing.JButton();
        CourseUpdate = new javax.swing.JButton();
        ErrorDateEducation = new javax.swing.JLabel();
        ErrorDateCourse = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ProfessionalProfTextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        exportTxt = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CV Maker");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);

        jPanel4.setLayout(new java.awt.CardLayout());

        jLabel72.setText("Achievement X");

        jLabel67.setText("Job Title");

        jLabel49.setText("Company Name");

        jLabel70.setText("List of achievements ");

        Com_CompanyNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Com_CompanyNameTextFieldFocusLost(evt);
            }
        });

        Com_JobTitleTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Com_JobTitleTextFieldFocusLost(evt);
            }
        });

        Com_ResposibilitiesTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Com_ResposibilitiesTextFieldFocusLost(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(0, 51, 255));
        jLabel20.setText("3. SKILLS AND EXPERIENCE");

        jLabel21.setForeground(new java.awt.Color(0, 51, 255));
        jLabel21.setText("4. PROFESSIONAL EXPERIENCE");

        jLabel69.setText("Date(DD/MM/YYYY)");

        jLabel68.setText("Paragraph of responsibilities");

        com_add_Experience_button.setText("add");
        com_add_Experience_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_add_Experience_buttonActionPerformed(evt);
            }
        });

        com_remove_Experience_button.setText("remove");
        com_remove_Experience_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_remove_Experience_buttonActionPerformed(evt);
            }
        });

        com_update_Experience_Button.setText("update");
        com_update_Experience_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_update_Experience_ButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Skills and Experience on :  ");

        jLabel8.setText("write your experience");

        com_add_skill_Button1.setText("add");
        com_add_skill_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_add_skill_Button1ActionPerformed(evt);
            }
        });

        com_remove_skill_button.setText("remove");
        com_remove_skill_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_remove_skill_buttonActionPerformed(evt);
            }
        });

        com_update_skill_button.setText("update");
        com_update_skill_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_update_skill_buttonActionPerformed(evt);
            }
        });

        Com_DateTextFiled.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Com_DateTextFiledFocusLost(evt);
            }
        });

        javax.swing.GroupLayout CombinedLayout = new javax.swing.GroupLayout(Combined);
        Combined.setLayout(CombinedLayout);
        CombinedLayout.setHorizontalGroup(
            CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CombinedLayout.createSequentialGroup()
                .addGroup(CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CombinedLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel20))
                    .addGroup(CombinedLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CombinedLayout.createSequentialGroup()
                                .addComponent(jLabel68)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Com_ResposibilitiesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CombinedLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CombinedLayout.createSequentialGroup()
                                        .addComponent(jLabel70)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(CombinedLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(CombinedLayout.createSequentialGroup()
                                                .addComponent(jLabel69)
                                                .addGap(4, 4, 4)
                                                .addComponent(Com_DateTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(CombinedLayout.createSequentialGroup()
                                                .addComponent(jLabel72)
                                                .addGap(18, 18, 18)
                                                .addComponent(Com_Achievement_X_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(264, 264, 264))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CombinedLayout.createSequentialGroup()
                                .addGroup(CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CombinedLayout.createSequentialGroup()
                                        .addGroup(CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(CombinedLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel8)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(com_experience_button, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                            .addComponent(com_skill_button)))
                                    .addGroup(CombinedLayout.createSequentialGroup()
                                        .addComponent(jLabel49)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Com_CompanyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CombinedLayout.createSequentialGroup()
                                        .addGap(252, 252, 252)
                                        .addGroup(CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(CombinedLayout.createSequentialGroup()
                                                .addComponent(jLabel67)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Com_JobTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel21))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(CombinedLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(com_update_skill_button))
                                    .addGroup(CombinedLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(com_add_skill_Button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(com_remove_skill_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(97, 97, 97)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(com_remove_Experience_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(com_update_Experience_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(com_add_Experience_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(302, 302, 302))
        );
        CombinedLayout.setVerticalGroup(
            CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CombinedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(45, 45, 45)
                .addGroup(CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(com_skill_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(com_add_skill_Button1))
                .addGap(18, 18, 18)
                .addGroup(CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CombinedLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7))
                    .addComponent(com_experience_button, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CombinedLayout.createSequentialGroup()
                        .addComponent(com_remove_skill_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(com_update_skill_button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(Com_JobTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69)
                    .addComponent(Com_CompanyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(Com_DateTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Com_ResposibilitiesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68))
                .addGap(19, 19, 19)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CombinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Com_Achievement_X_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72)
                    .addComponent(com_add_Experience_button))
                .addGap(14, 14, 14)
                .addComponent(com_remove_Experience_button)
                .addGap(18, 18, 18)
                .addComponent(com_update_Experience_Button)
                .addGap(18, 18, 18))
        );

        jPanel4.add(Combined, "card2");

        jLabel28.setForeground(new java.awt.Color(0, 51, 255));
        jLabel28.setText("3. SKILLS AND EXPERIENCE");

        jLabel29.setForeground(new java.awt.Color(0, 51, 255));
        jLabel29.setText("4. CAREER SUMMARY");

        jLabel57.setText("Company Name");

        jLabel58.setText("Job Title");

        jLabel60.setText("Date (DD/MM/YY)");

        F_CompanyNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                F_CompanyNameTextFieldFocusLost(evt);
            }
        });

        F_JobTitleTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                F_JobTitleTextFieldFocusLost(evt);
            }
        });

        fun_add_career_button.setText("add");
        fun_add_career_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fun_add_career_buttonActionPerformed(evt);
            }
        });

        jLabel9.setText("Skills and Experience on :  ");

        Fun_add_skill_button.setText("add");
        Fun_add_skill_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fun_add_skill_buttonActionPerformed(evt);
            }
        });

        fun_remove_skill_button.setText("remove");
        fun_remove_skill_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fun_remove_skill_buttonActionPerformed(evt);
            }
        });

        fun_upadate_skill_button.setText("update");
        fun_upadate_skill_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fun_upadate_skill_buttonActionPerformed(evt);
            }
        });

        jLabel10.setText("write your experience");

        skillTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skillTextFieldActionPerformed(evt);
            }
        });

        Fun_DateTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Fun_DateTextFieldFocusLost(evt);
            }
        });

        CareerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Conpany Name", "Job Ttitle", "Date"
            }
        ));
        CareerTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CareerTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(CareerTable);

        CareerMessage.setBackground(new java.awt.Color(255, 255, 255));
        CareerMessage.setForeground(new java.awt.Color(255, 0, 0));

        CareerRemove.setText("Remove");
        CareerRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CareerRemoveActionPerformed(evt);
            }
        });

        UpdateCareer.setText("Update");
        UpdateCareer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCareerActionPerformed(evt);
            }
        });

        ErrorDateCareer.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout FunctionalLayout = new javax.swing.GroupLayout(Functional);
        Functional.setLayout(FunctionalLayout);
        FunctionalLayout.setHorizontalGroup(
            FunctionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FunctionalLayout.createSequentialGroup()
                .addGroup(FunctionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FunctionalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(FunctionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(FunctionalLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(skillTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FunctionalLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(FunctionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FunctionalLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(experienceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(FunctionalLayout.createSequentialGroup()
                                        .addComponent(jLabel57)
                                        .addGap(27, 27, 27)
                                        .addComponent(F_CompanyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(FunctionalLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(FunctionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addGroup(FunctionalLayout.createSequentialGroup()
                                .addComponent(jLabel58)
                                .addGap(18, 18, 18)
                                .addComponent(F_JobTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(FunctionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FunctionalLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(FunctionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ErrorDateCareer, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FunctionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fun_upadate_skill_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fun_remove_skill_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Fun_add_skill_button, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FunctionalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fun_DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(FunctionalLayout.createSequentialGroup()
                .addGroup(FunctionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FunctionalLayout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel28))
                    .addGroup(FunctionalLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FunctionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CareerRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UpdateCareer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fun_add_career_button, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FunctionalLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(CareerMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(456, Short.MAX_VALUE))
        );
        FunctionalLayout.setVerticalGroup(
            FunctionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FunctionalLayout.createSequentialGroup()
                .addGroup(FunctionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FunctionalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel28)
                        .addGap(23, 23, 23)
                        .addGroup(FunctionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(skillTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FunctionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(experienceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(FunctionalLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Fun_add_skill_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fun_remove_skill_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fun_upadate_skill_button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(ErrorDateCareer, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FunctionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(F_CompanyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58)
                    .addComponent(F_JobTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60)
                    .addComponent(Fun_DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CareerMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FunctionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FunctionalLayout.createSequentialGroup()
                        .addComponent(fun_add_career_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CareerRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UpdateCareer)))
                .addGap(46, 46, 46))
        );

        jPanel4.add(Functional, "card2");

        Chronologikal.setName(""); // NOI18N

        jLabel54.setText("Company Name");

        jLabel55.setText("Job Title");

        jLabel56.setText("Date(DD/MM/YYYY)");

        jLabel76.setText("Paragraph of responsibilities");

        jLabel85.setText("List of achievements");

        jLabel86.setText("Achievement X");

        C_CompanyNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                C_CompanyNameTextFieldFocusLost(evt);
            }
        });
        C_CompanyNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_CompanyNameTextFieldActionPerformed(evt);
            }
        });

        C_JobTitleTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                C_JobTitleTextFieldFocusLost(evt);
            }
        });

        C_resposibilitiesTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                C_resposibilitiesTextfieldFocusLost(evt);
            }
        });

        jLabel36.setForeground(new java.awt.Color(0, 51, 255));
        jLabel36.setText("3. CORE STRENGTHS");

        jLabel38.setForeground(new java.awt.Color(0, 51, 255));
        jLabel38.setText("4. PROFESSIONAL EXPERIENCE");

        C_CoreStrengthTextArea.setColumns(20);
        C_CoreStrengthTextArea.setRows(5);
        C_CoreStrengthTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                C_CoreStrengthTextAreaFocusLost(evt);
            }
        });
        jScrollPane8.setViewportView(C_CoreStrengthTextArea);

        chro_add_buuton.setText("add");
        chro_add_buuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chro_add_buutonActionPerformed(evt);
            }
        });

        chro_remove_button.setText("remove");
        chro_remove_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chro_remove_buttonActionPerformed(evt);
            }
        });

        chro_update_buuton.setText("update");
        chro_update_buuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chro_update_buutonActionPerformed(evt);
            }
        });

        Chro_DateTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Chro_DateTextFieldFocusLost(evt);
            }
        });
        Chro_DateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chro_DateTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChronologikalLayout = new javax.swing.GroupLayout(Chronologikal);
        Chronologikal.setLayout(ChronologikalLayout);
        ChronologikalLayout.setHorizontalGroup(
            ChronologikalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChronologikalLayout.createSequentialGroup()
                .addGroup(ChronologikalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChronologikalLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(ChronologikalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChronologikalLayout.createSequentialGroup()
                                .addComponent(jLabel76)
                                .addGap(361, 361, 361)
                                .addGroup(ChronologikalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(chro_remove_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chro_update_buuton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chro_add_buuton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(ChronologikalLayout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addGap(10, 10, 10)
                                .addGroup(ChronologikalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C_CompanyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ChronologikalLayout.createSequentialGroup()
                                        .addGap(142, 142, 142)
                                        .addComponent(jLabel85))
                                    .addGroup(ChronologikalLayout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addGroup(ChronologikalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(C_resposibilitiesTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(ChronologikalLayout.createSequentialGroup()
                                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(95, 95, 95))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ChronologikalLayout.createSequentialGroup()
                                                .addComponent(jLabel55)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(C_JobTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel56)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Chro_DateTextField))))))
                            .addGroup(ChronologikalLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel86)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C_Achievement_X_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ChronologikalLayout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(473, Short.MAX_VALUE))
        );
        ChronologikalLayout.setVerticalGroup(
            ChronologikalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChronologikalLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addGroup(ChronologikalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(C_CompanyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                    .addComponent(C_JobTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Chro_DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(ChronologikalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(C_resposibilitiesTextfield))
                .addGroup(ChronologikalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChronologikalLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChronologikalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel85)
                        .addGap(18, 18, 18)
                        .addGroup(ChronologikalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C_Achievement_X_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ChronologikalLayout.createSequentialGroup()
                                .addComponent(chro_remove_button)
                                .addGap(18, 18, 18)
                                .addComponent(chro_update_buuton)))))
                .addGap(18, 18, 18)
                .addComponent(chro_add_buuton)
                .addContainerGap())
        );

        jPanel4.add(Chronologikal, "card2");

        jLabel26.setForeground(new java.awt.Color(0, 51, 255));
        jLabel26.setText("1. GENERAL INFORMATION");

        NameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NameTextFieldFocusLost(evt);
            }
        });
        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        LastNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LastNameTextFieldFocusLost(evt);
            }
        });

        jLabel2.setText("Last Name :");

        jLabel1.setText("Name :");

        MailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MailTextFieldFocusLost(evt);
            }
        });

        jLabel3.setText("Mail :");

        jLabel4.setText("Birthday(DD/MM/YYYY)):");

        jLabel46.setText("Country :");

        CountryTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CountryTextFieldFocusLost(evt);
            }
        });

        buttonGroup1.add(MaleRadioButton);
        MaleRadioButton.setText("Male");
        MaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(FemaleRadioButton);
        FemaleRadioButton.setText("Female");
        FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleRadioButtonActionPerformed(evt);
            }
        });

        jLabel48.setText("Gender :");

        NumberTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NumberTextFieldFocusLost(evt);
            }
        });

        jLabel27.setForeground(new java.awt.Color(0, 51, 255));
        jLabel27.setText("2. PROFESSIONAL PROFILE");

        jLabel30.setForeground(new java.awt.Color(0, 51, 255));
        jLabel30.setText(" 5. EDUCATION AND TRAINING");

        QuallificationTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                QuallificationTextFieldFocusLost(evt);
            }
        });

        EstablishmentTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EstablishmentTextField5FocusLost(evt);
            }
        });

        jLabel59.setText("Establishment");

        jLabel5.setText("Qualification");

        jLabel62.setText("Date(DD/MM/YY)");

        jLabel61.setText("Location");

        LocationTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LocationTextField5FocusLost(evt);
            }
        });

        CourseTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CourseTextFieldFocusLost(evt);
            }
        });
        CourseTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseTextFieldActionPerformed(evt);
            }
        });

        jLabel15.setText("Course");

        EstablishmentTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EstablishmentTextField6FocusLost(evt);
            }
        });

        jLabel64.setText("Establishment");

        jLabel63.setText("Date(DD/MM/YY)");

        jLabel65.setText("Location");

        LocationTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LocationTextField6FocusLost(evt);
            }
        });

        jLabel31.setForeground(new java.awt.Color(0, 51, 255));
        jLabel31.setText("6. FURTHER COURSES");

        jLabel32.setForeground(new java.awt.Color(0, 51, 255));
        jLabel32.setText("7. ADDITIONAL INFORMATION");

        Additional_infoTextArea.setColumns(20);
        Additional_infoTextArea.setRows(5);
        Additional_infoTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Additional_infoTextAreaFocusLost(evt);
            }
        });
        jScrollPane5.setViewportView(Additional_infoTextArea);

        jLabel34.setForeground(new java.awt.Color(0, 51, 255));
        jLabel34.setText("8. INTERESTS");

        InterestsTextArea.setColumns(20);
        InterestsTextArea.setRows(5);
        InterestsTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                InterestsTextAreaFocusLost(evt);
            }
        });
        jScrollPane9.setViewportView(InterestsTextArea);

        add_Course_Button.setText("Add");
        add_Course_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_Course_ButtonActionPerformed(evt);
            }
        });

        jLabel50.setText("Phone Number:");

        add_Education_Button.setText("Add");
        add_Education_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_Education_ButtonActionPerformed(evt);
            }
        });

        birth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                birthFocusLost(evt);
            }
        });

        Education_Date_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Education_Date_TextFieldFocusLost(evt);
            }
        });

        Date_Course_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Date_Course_TextFieldFocusLost(evt);
            }
        });

        EducationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Qualifivation", "Establishment", "Location", "Date"
            }
        ));
        jScrollPane3.setViewportView(EducationTable);

        CourseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course", "Establishment", "Location", "Date"
            }
        ));
        jScrollPane4.setViewportView(CourseTable);

        EducationRemove.setText("Remove");
        EducationRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationRemoveActionPerformed(evt);
            }
        });

        EducationMessage.setForeground(new java.awt.Color(204, 0, 0));

        RemoveCourse.setText("Remove");
        RemoveCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveCourseActionPerformed(evt);
            }
        });

        CourseMessage.setForeground(new java.awt.Color(204, 0, 0));

        EducationUpdate.setText("Update");
        EducationUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationUpdateActionPerformed(evt);
            }
        });

        CourseUpdate.setText("Update");
        CourseUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseUpdateActionPerformed(evt);
            }
        });

        ErrorDateEducation.setForeground(new java.awt.Color(204, 0, 0));

        ErrorDateCourse.setForeground(new java.awt.Color(204, 0, 0));

        ProfessionalProfTextArea.setColumns(20);
        ProfessionalProfTextArea.setRows(5);
        ProfessionalProfTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ProfessionalProfTextAreaFocusLost(evt);
            }
        });
        jScrollPane6.setViewportView(ProfessionalProfTextArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel64))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CourseTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                            .addComponent(EstablishmentTextField6)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(351, 351, 351)
                                        .addComponent(jLabel61)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Education_Date_TextField)
                                            .addComponent(LocationTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RemoveCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(add_Course_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CourseUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel30))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                            .addComponent(jScrollPane9)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel34))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EducationRemove)
                            .addComponent(add_Education_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EducationUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CourseMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel59)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QuallificationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(EducationMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(ErrorDateEducation, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel65)
                                    .addComponent(jLabel63)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(EstablishmentTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(117, 117, 117)
                                        .addComponent(jLabel62)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LocationTextField6)
                                    .addComponent(Date_Course_TextField)
                                    .addComponent(ErrorDateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(299, 724, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel48)
                                .addGap(37, 37, 37)
                                .addComponent(MaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(FemaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabel27))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(246, 246, 246)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel50)
                                        .addComponent(jLabel46)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(CountryTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(birth))
                        .addGap(805, 805, 805))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel32)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CountryTextField, LastNameTextField, MailTextField, NameTextField, NumberTextField});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birth, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(MailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(CountryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaleRadioButton)
                    .addComponent(FemaleRadioButton)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(QuallificationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(LocationTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(EstablishmentTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(Education_Date_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EducationMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorDateEducation, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(add_Education_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EducationRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EducationUpdate))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(CourseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocationTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EstablishmentTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Date_Course_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorDateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CourseMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(add_Course_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoveCourse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CourseUpdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CountryTextField, LastNameTextField, MailTextField, NameTextField, NumberTextField});

        jScrollPane2.setViewportView(jPanel3);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Export");

        exportTxt.setText("choose form");
        exportTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportTxtActionPerformed(evt);
            }
        });
        jMenu2.add(exportTxt);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        setBounds(0, 0, 868, 1854);
    }// </editor-fold>//GEN-END:initComponents

    private void ProfessionalProfTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProfessionalProfTextAreaFocusLost
      try {
             cv.addSection("ProfessionalProfile");
            cv.addParagraph(ProfessionalProfTextArea.getText());
            

                   
        } catch (ExceptionInInitializerError e) {
            CountryTextField.setText("Enter a smaller discreption");
       }
    }//GEN-LAST:event_ProfessionalProfTextAreaFocusLost

    private void add_Course_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_Course_ButtonActionPerformed
          DefaultTableModel model = (DefaultTableModel)CourseTable.getModel();
            if(flag2 == 0){  //gia tin 1h fora
                cv.addSection("Courses");
                item = new BulletListItem();
                  model.addRow(new Object[]{CourseTextField.getText(),LocationTextField6.getText(),EstablishmentTextField6.getText(),Date_Course_TextField.getText()});
                item.setCourse(CourseTextField.getText());
                item.setLocation(LocationTextField6.getText());
                item.setEshablishment(EstablishmentTextField6.getText());
                item.setDate(DateCourse);
                 String Date33 =Date_Course_TextField.getText();
                try {
                    
                    DateCourse2=sdf.parse(Date33);
                } catch (ParseException ex) {
                    Logger.getLogger(cvTemplate.class.getName()).log(Level.SEVERE, null, ex);
                }

                cv.addBulletListItem(item);
                flag2++;
                
            }else{  //an yparxei hdh to section
                 String Date12 =Date_Course_TextField.getText();
                    try {

                        DateCourse = sdf.parse(Date12);
                    } catch (ParseException ex) {
                        Logger.getLogger(cvTemplate.class.getName()).log(Level.SEVERE, null, ex);
                    }
            
                    if(DateCourse.after(DateCourse2)){
                        System.out.println("mphka sto before" );

                        ErrorDateCourse.setText("dates should be from newest to latest");

                    }else{ 
                        try {
                                    item = new BulletListItem();
                                   model.addRow(new Object[]{CourseTextField.getText(),LocationTextField6.getText(),EstablishmentTextField6.getText(),Date_Course_TextField.getText()});
                                   item.setCourse(CourseTextField.getText());
                                   item.setLocation(LocationTextField6.getText());
                                   item.setEshablishment(EstablishmentTextField6.getText());
                                    item.setDate(DateCourse);

                           ErrorDateCourse.setText("");
                          DateCourse2=sdf.parse(Date12);
                          
                       }catch (ParseException ex) {
                           Logger.getLogger(cvTemplate.class.getName()).log(Level.SEVERE, null, ex);
                       }
                    
                for(int i=0; i<cv.getSections().size(); i++){
                    if(cv.getSections().get(i).getTitle().equals("Courses")){
                        
                        cv.addBulletListItem(item);
                         
                    }
                }
             }
          }
      
                  
            for(int i=0; i<section.getList().getItemList().size(); i++ ){
                System.out.println(i+"education:" + section.getList().getItemList().get(i).getCourse() );
                System.out.println(i+"education:" + section.getList().getItemList().get(i).getLocation() );
                System.out.println(i+"education:" + section.getList().getItemList().get(i).getEshablishment() );


            }
    }//GEN-LAST:event_add_Course_ButtonActionPerformed

    private void InterestsTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InterestsTextAreaFocusLost
        // TODO add your handling code here:
        cv.addSection("Interests");
        cv.addParagraph(InterestsTextArea.getText());
        System.out.println("test:"+ section.getParagraph().getContents());

        
    }//GEN-LAST:event_InterestsTextAreaFocusLost

    private void Additional_infoTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Additional_infoTextAreaFocusLost
        
       cv.addSection("AdditionalInfo");
        cv.addParagraph(Additional_infoTextArea.getText());
        System.out.println("test:"+ section.getParagraph().getContents());
        
    }//GEN-LAST:event_Additional_infoTextAreaFocusLost

    private void LocationTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LocationTextField6FocusLost
        try{

            Location6=LocationTextField6.getText();
            if(Location6.length()==0) LocationTextField6.setText("Enter a  location");
           
        }catch(ExceptionInInitializerError e){
            LocationTextField6.setText(" location ERROR");
        }
    }//GEN-LAST:event_LocationTextField6FocusLost

    private void EstablishmentTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EstablishmentTextField6FocusLost
        
        try{
            EstablishmentTextField6.getText();
           
        }catch(ExceptionInInitializerError e){
            EstablishmentTextField6.setText(" Establishment  Error");
        }
    }//GEN-LAST:event_EstablishmentTextField6FocusLost

    private void CourseTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CourseTextFieldFocusLost
        try{
            CourseTextField.getText();
           
        }catch(ExceptionInInitializerError e){
            CourseTextField.setText(" Course  Error");
        }
    }//GEN-LAST:event_CourseTextFieldFocusLost

    private void LocationTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LocationTextField5FocusLost
        try{

            LocationTextField5.getText();
         
        }catch(ExceptionInInitializerError e){
            LocationTextField5.setText(" location ERROR");
        }
    }//GEN-LAST:event_LocationTextField5FocusLost

    private void EstablishmentTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EstablishmentTextField5FocusLost
        try{
            EstablishmentTextField5.getText();
          
        }catch(ExceptionInInitializerError e){
            EstablishmentTextField5.setText(" Establishment  Error");
        }
    }//GEN-LAST:event_EstablishmentTextField5FocusLost

    private void QuallificationTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_QuallificationTextFieldFocusLost
    
        try{
            Qualification=QuallificationTextField.getText();
            if(Qualification.length()==0) QuallificationTextField.setText("Enter a Qualification");

        }catch(Exception e){
            QuallificationTextField.setText("Qualificatio ERROR");
        }
    }//GEN-LAST:event_QuallificationTextFieldFocusLost

    private void FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleRadioButtonActionPerformed
      
        cv.setGender("Female");
    }//GEN-LAST:event_FemaleRadioButtonActionPerformed

    private void MaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRadioButtonActionPerformed
        cv.setGender("Male");
        System.out.println("eimai " + cv.getGender());
    }//GEN-LAST:event_MaleRadioButtonActionPerformed

    private void CountryTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CountryTextFieldFocusLost
       
        try {
            CountryTextField.getText();
            cv.setCountry(CountryTextField.getText());
           

        } catch (Exception e) {
            CountryTextField.setText("Enter a valid Country");
        }
    }//GEN-LAST:event_CountryTextFieldFocusLost

    private void MailTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MailTextFieldFocusLost
       
        try {
            MailTextField.getText();

            cv.setEmail(MailTextField.getText());
            System.out.println("to email mou einai :"+ cv.getEmail());

        } catch (Exception e) {
            MailTextField.setText("Enter a valid Mail");
        }
    }//GEN-LAST:event_MailTextFieldFocusLost

    private void LastNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LastNameTextFieldFocusLost
        try {
            LastNameTextField.getText();

            cv.setLastName(LastNameTextField.getText());
            System.out.println("to epwnimo mou einai :"+ cv.getLastName());

        } catch (Exception e) {
            LastNameTextField.setText("Enter a valid LastName");
        }
    }//GEN-LAST:event_LastNameTextFieldFocusLost

    private void NameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameTextFieldFocusLost
      

        try {
            NameTextField.getText();

            cv.setName(NameTextField.getText());

            System.out.println("to onoma mou einai :"+ cv.getName());

        } catch (Exception e) {
            NameTextField.setText("Enter a valid Name");
        }
    }//GEN-LAST:event_NameTextFieldFocusLost

    private void com_update_skill_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_update_skill_buttonActionPerformed
       
    }//GEN-LAST:event_com_update_skill_buttonActionPerformed

    private void com_remove_skill_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_remove_skill_buttonActionPerformed
        
    }//GEN-LAST:event_com_remove_skill_buttonActionPerformed

    private void com_add_skill_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_add_skill_Button1ActionPerformed
 Section SubSection;
        if(flag3 == 0){  //gia tin 1h fora
              cv.addSection("Skills");
                item = new BulletListItem();
               // item.skillTextField.getText()
               
               SubSection = cv.addSubSection(com_skill_button.getText());
               
               item.setExperience(com_experience_button.getText());

               SubSection.getExpList().addBulletListItem(item);
               
 
                flag3++;
      //  }else{
        //    item = new BulletListItem();
         
        }else{
            item = new BulletListItem();
            item.setExperience(com_experience_button.getText());
            

                            
            
            for(int i=0; i<cv.getSections().size(); i++){   //gia add sto idio
                 if(cv.getSections().get(i).getTitle().equals("Skills")){  
                        for(int j=0; j<cv.getSections().get(i).getSkillsList().size(); j++){
                            if(cv.getSections().get(i).getSkillsList().get(j).getTitle().equals(com_skill_button.getText())){
                                cv.getSections().get(i).getSkillsList().get(j).getExpList().getItemList().add(item);
                                printtest();
                                return;
                            }
                        }

                 }   
            }
            
               SubSection = cv.addSubSection(com_skill_button.getText());
               SubSection.getExpList().addBulletListItem(item);
                                                printtest();
                                

        }
    }//GEN-LAST:event_com_add_skill_Button1ActionPerformed

    private void com_update_Experience_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_update_Experience_ButtonActionPerformed
      
    }//GEN-LAST:event_com_update_Experience_ButtonActionPerformed

    private void com_remove_Experience_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_remove_Experience_buttonActionPerformed
       

    }//GEN-LAST:event_com_remove_Experience_buttonActionPerformed

    private void com_add_Experience_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_add_Experience_buttonActionPerformed
       
        
        
        if(flag == 0){  //gia tin 1h fora
               cv.addSection("ProfessionalExprerience");
                item = new BulletListItem();
                item.setCompanyName(Com_CompanyNameTextField.getText());
                item.setJobTitle(Com_JobTitleTextField.getText());
                                
                String Date23 =Com_DateTextFiled.getText();
                try {
                    
                    DateProfesional2=sdf.parse(Date23);
                } catch (ParseException ex) {
                    Logger.getLogger(cvTemplate.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                item.setDate(DateProfesional);
                
                item.setResp(Com_ResposibilitiesTextField.getText());
                BulletListItem item2 = new BulletListItem();
                item2.setAchievement(Com_Achievement_X_TextField.getText());
                item.getAchievementList().add(item2);
                

                section.getList().getItemList().add(item);
                flag++;
                
            }else{  //an yparxei hdh to section
            
            
                    String Date12 =Chro_DateTextField.getText();
                    try {

                        DateProfesional = sdf.parse(Date12);
                    } catch (ParseException ex) {
                        Logger.getLogger(cvTemplate.class.getName()).log(Level.SEVERE, null, ex);
                    }
            
                    if(DateProfesional.after(DateProfesional2)){
                        System.out.println("mphka sto before" );

                        ErrorDateEducation.setText("dates should be from newest to latest");

                    }else{ 
                        try {
                            
                            for(int i=0; i<cv.getSections().size(); i++ ){
                                if(cv.getSections().get(i).getTitle().equals("ProfessionalExprerience")){
                                    for(int j=0; j<cv.getSections().get(i).getList().getItemList().size(); j++ ){
                                            if(cv.getSections().get(i).getList().getItemList().get(j).getCompanyName().equals(Com_CompanyNameTextField.getText())){
                                                                           BulletListItem item2 = new BulletListItem();
                                                item2.setAchievement(Com_Achievement_X_TextField.getText());
                                                 cv.getSections().get(i).getList().getItemList().get(j).getAchievementList().add(item2);
                                                 print();
                                                 return;
                                            }
                                    }

                                }
                            }                            
                            
                            item = new BulletListItem();
                            item.setCompanyName(Com_CompanyNameTextField.getText());
                            item.setJobTitle(Com_JobTitleTextField.getText());
                        
                            ErrorDateEducation.setText("");
                            DateProfesional2=sdf.parse(Date12);
                            item.setDate(DateProfesional);
                            
                            item.setResp(Com_ResposibilitiesTextField.getText());
                            BulletListItem item2 = new BulletListItem();
                            item2.setAchievement(Com_Achievement_X_TextField.getText());
                            item.getAchievementList().add(item2);
                        
                            
 
                       
                       }catch (ParseException ex) {
                           Logger.getLogger(cvTemplate.class.getName()).log(Level.SEVERE, null, ex);
                       }
                }

                for(int i=0; i<cv.getSections().size(); i++){
                    if(cv.getSections().get(i).getTitle().equals("ProfessionalExprerience")){
                        
                        cv.addBulletListItem(item);
                         
                    }
                }
            
                
        }
         
                 
        
        
    }//GEN-LAST:event_com_add_Experience_buttonActionPerformed

    private void Com_JobTitleTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Com_JobTitleTextFieldFocusLost
        // TODO add your handling code here:
        try{
            Com_JobTitleTextField.getText();
        }catch(ExceptionInInitializerError e){
            Com_JobTitleTextField.setText("Error");
        }
    }//GEN-LAST:event_Com_JobTitleTextFieldFocusLost

    private void Com_CompanyNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Com_CompanyNameTextFieldFocusLost
       
        try{
            Com_CompanyNameTextField.getText();
          
        }catch(ExceptionInInitializerError e){
            Com_CompanyNameTextField.setText("Error");
        }
    }//GEN-LAST:event_Com_CompanyNameTextFieldFocusLost

    private void chro_update_buutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chro_update_buutonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chro_update_buutonActionPerformed

    private void chro_remove_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chro_remove_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chro_remove_buttonActionPerformed

    //not final-checkagain
    private void chro_add_buutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chro_add_buutonActionPerformed

  if(flag == 0){  //gia tin 1h fora
               cv.addSection("ProfessionalExprerience");
                item = new BulletListItem();
                item.setCompanyName(C_CompanyNameTextField.getText());
                item.setJobTitle(C_JobTitleTextField.getText());
                                
                String Date23 =Chro_DateTextField.getText();
                try {
                    
                    DateProProf2=sdf.parse(Date23);
                } catch (ParseException ex) {
                    Logger.getLogger(cvTemplate.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                item.setDate(DateProProf);
                
                item.setResp(C_resposibilitiesTextfield.getText());
                BulletListItem item2 = new BulletListItem();
                item2.setAchievement(C_Achievement_X_TextField.getText());
                item.getAchievementList().add(item2);
                

               cv.addBulletListItem(item);
                flag++;
                
            }else{  //an yparxei hdh to section
            
            
                    String Date12 =Chro_DateTextField.getText();
                    try {

                        DateProProf = sdf.parse(Date12);
                    } catch (ParseException ex) {
                        Logger.getLogger(cvTemplate.class.getName()).log(Level.SEVERE, null, ex);
                    }
            
                    if(DateProProf.after(DateProProf2)){
                        System.out.println("mphka sto before" );

                        ErrorDateEducation.setText("dates should be from newest to latest");

                    }else{ 
                        try {
                            
                            for(int i=0; i<cv.getSections().size(); i++ ){
                                if(cv.getSections().get(i).getTitle().equals("ProfessionalExprerience")){
                                    for(int j=0; j<cv.getSections().get(i).getList().getItemList().size(); j++ ){
                                            if(cv.getSections().get(i).getList().getItemList().get(j).getCompanyName().equals(C_CompanyNameTextField.getText())){
                                                                           BulletListItem item2 = new BulletListItem();
                                                item2.setAchievement(C_Achievement_X_TextField.getText());
                                                 cv.getSections().get(i).getList().getItemList().get(j).getAchievementList().add(item2);
                                                 print();
                                                 return;
                                            }
                                    }

                                }
                            }                            
                            
                            item = new BulletListItem();
                            item.setCompanyName(C_CompanyNameTextField.getText());
                            item.setJobTitle(C_JobTitleTextField.getText());
                        
                            ErrorDateEducation.setText("");
                            DateProProf2=sdf.parse(Date12);
                            item.setDate(DateProProf);
                            
                            item.setResp(C_resposibilitiesTextfield.getText());
                            BulletListItem item2 = new BulletListItem();
                            item2.setAchievement(C_Achievement_X_TextField.getText());
                            item.getAchievementList().add(item2);
                        
                            
 
                       
                       }catch (ParseException ex) {
                           Logger.getLogger(cvTemplate.class.getName()).log(Level.SEVERE, null, ex);
                       }
                }

                for(int i=0; i<cv.getSections().size(); i++){
                    if(cv.getSections().get(i).getTitle().equals("ProfessionalExprerience")){
                        
                        cv.addBulletListItem(item);
                         
                    }
                }
            
                
        }
   
    }//GEN-LAST:event_chro_add_buutonActionPerformed
        public void print(){
            //test
            for(int i=0; i<cv.getSections().size(); i++ ){
                if(cv.getSections().get(i).getTitle().equals("ProfessionalExprerience")){
                        for(int j=0; j<cv.getSections().get(i).getList().getItemList().size(); j++ ){
                    System.out.println(j+"ProfessionalProfile:" + cv.getSections().get(i).getList().getItemList().get(j).getCompanyName() );
                    System.out.println(j+"ProfessionalProfile:" + cv.getSections().get(i).getList().getItemList().get(j).getJobTitle() );

                             for(int k=0; k<cv.getSections().get(i).getList().getItemList().get(j).getAchievementList().size(); k++ ){
                                System.out.println(k + "achievement" + cv.getSections().get(i).getList().getItemList().get(j).getAchievementList().get(k).getAchievement() );

                             }

                        }

                }


            }     
     
 }   
    
    
    private void C_CoreStrengthTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_C_CoreStrengthTextAreaFocusLost
      
        cv.addSection("CoreStrengths");
        cv.addParagraph(C_CoreStrengthTextArea.getText());
        System.out.println("test:"+ section.getParagraph().getContents());
        
        
        
    }//GEN-LAST:event_C_CoreStrengthTextAreaFocusLost

    private void C_resposibilitiesTextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_C_resposibilitiesTextfieldFocusLost
       
    }//GEN-LAST:event_C_resposibilitiesTextfieldFocusLost

    private void C_JobTitleTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_C_JobTitleTextFieldFocusLost
        try{
            C_JobTitleTextField.getText();
          
        }catch(ExceptionInInitializerError e){
            C_JobTitleTextField.setText("Error");
        }
    }//GEN-LAST:event_C_JobTitleTextFieldFocusLost

    private void C_CompanyNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_C_CompanyNameTextFieldFocusLost
      
        try{
            C_CompanyNameTextField.getText();
            
           
        }catch(ExceptionInInitializerError e){
            C_CompanyNameTextField.setText("Error");
        }
    }//GEN-LAST:event_C_CompanyNameTextFieldFocusLost

    private void Com_ResposibilitiesTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Com_ResposibilitiesTextFieldFocusLost
              try{
            Com_Paragraph_of_responsibilities=Com_ResposibilitiesTextField.getText();
            if(Com_Paragraph_of_responsibilities.length()==0)Com_ResposibilitiesTextField.setText("set job name");
          
        }catch(ExceptionInInitializerError e){
            Com_ResposibilitiesTextField.setText("Error");
        }
    }//GEN-LAST:event_Com_ResposibilitiesTextFieldFocusLost

    private void skillTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skillTextFieldActionPerformed
      
    }//GEN-LAST:event_skillTextFieldActionPerformed

    private void fun_upadate_skill_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fun_upadate_skill_buttonActionPerformed
       
    }//GEN-LAST:event_fun_upadate_skill_buttonActionPerformed

    private void fun_remove_skill_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fun_remove_skill_buttonActionPerformed
      
    }//GEN-LAST:event_fun_remove_skill_buttonActionPerformed

    private void Fun_add_skill_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fun_add_skill_buttonActionPerformed
     
        Section SubSection;
        if(flag3 == 0){  //gia tin 1h fora
               cv.addSection("Skills");
                item = new BulletListItem();
               // item.skillTextField.getText()
               
               SubSection = cv.addSubSection(skillTextField.getText());
               
               item.setExperience(experienceTextField.getText());

               SubSection.getExpList().addBulletListItem(item);
               
 
                flag3++;
    
        }else{
            item = new BulletListItem();
            item.setExperience(experienceTextField.getText());
            

                            
            
            for(int i=0; i<cv.getSections().size(); i++){  
                 if(cv.getSections().get(i).getTitle().equals("Skills")){  
                        for(int j=0; j<cv.getSections().get(i).getSkillsList().size(); j++){
                            if(cv.getSections().get(i).getSkillsList().get(j).getTitle().equals(skillTextField.getText())){
                                cv.getSections().get(i).getSkillsList().get(j).getExpList().getItemList().add(item);
                                printtest();
                                return;
                            }
                        }

                 }   
            }
            
               SubSection = cv.addSubSection(skillTextField.getText());
               SubSection.getExpList().addBulletListItem(item);
                                                printtest();
                                

        }
    }//GEN-LAST:event_Fun_add_skill_buttonActionPerformed

       public void printtest(){
                       for(int i=0; i<cv.getSections().size(); i++){
                            if(cv.getSections().get(i).getTitle().equals("Skills")){
                                for(int j=0; j<cv.getSections().get(i).getSkillsList().size(); j++){
                                    for(int k=0; k<cv.getSections().get(i).getSkillsList().get(j).getExpList().getItemList().size(); k++){
                                
                                    System.out.println(cv.getSections().get(i).getSkillsList().get(j).getTitle()+" exp: "+cv.getSections().get(i).getSkillsList().get(j).getExpList().getItemList().get(k).getExperience() );
                                }
                            }
                        }
                       }
    }  
    
    
    
    private void fun_add_career_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fun_add_career_buttonActionPerformed
            DefaultTableModel model = (DefaultTableModel) CareerTable.getModel();
            
        
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if(flag1 == 0){  //gia tin 1h fora
                 cv.addSection("Career");
                item = new BulletListItem();
                // ADD STO TABLE 
                model.addRow(new Object[]{F_CompanyNameTextField.getText(),F_JobTitleTextField.getText(),Fun_DateTextField.getText()});
                      item.setCompanyName(F_CompanyNameTextField.getText() );
                      item.setJobTitle(F_JobTitleTextField.getText() );
                      item.setDate(DateCareer);
                      
                 String Date =Fun_DateTextField.getText();
                try {
                    
                    DateCareer2=sdf.parse(Date);
                } catch (ParseException ex) {
                    Logger.getLogger(cvTemplate.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                 cv.addBulletListItem(item);
                flag1++;
                
                
            }else{   
            
                String Date1 =Fun_DateTextField.getText();
                    try {

                        DateCareer = sdf.parse(Date1);
                    } catch (ParseException ex) {
                        Logger.getLogger(cvTemplate.class.getName()).log(Level.SEVERE, null, ex);
                    }
            
                if(DateCareer.after(DateCareer2)){
                    System.out.println("mphka sto before" );
                    
                    ErrorDateCareer.setText("dates should be from newest to latest");
                }else{  
                    try { 
                        item = new BulletListItem();
                        //ADD STO TABLE
                        model.addRow(new Object[]{F_CompanyNameTextField.getText(),F_JobTitleTextField.getText(),Fun_DateTextField.getText()});
                        item.setCompanyName(F_CompanyNameTextField.getText() );
                        item.setJobTitle(F_JobTitleTextField.getText() );
                        item.setDate(DateCareer);
                        ErrorDateCareer.setText("");
                        DateCareer2=sdf.parse(Date1);
                    }catch (ParseException ex) {
                        Logger.getLogger(cvTemplate.class.getName()).log(Level.SEVERE, null, ex);
                    }

                      
                
                
                for(int i=0; i<cv.getSections().size(); i++){
                    if(cv.getSections().get(i).getTitle().equals("Career")){
                        
                        cv.addBulletListItem(item);
                         
                    }
                }
             }
          }
                
            

            
                  for(int j=0; j<section.getList().getItemList().size(); j++ ){
                      System.out.println(j+"career:" + section.getList().getItemList().get(j).getCompanyName());
                      System.out.println(j+"career:" + section.getList().getItemList().get(j).getJobTitle() );
                


            }    }//GEN-LAST:event_fun_add_career_buttonActionPerformed

    private void F_JobTitleTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_F_JobTitleTextFieldFocusLost
        try{
            F_JobTitleTextField.getText();

        }catch(ExceptionInInitializerError e){
            F_JobTitleTextField.setText("Job Error");
        }
    }//GEN-LAST:event_F_JobTitleTextFieldFocusLost

    private void F_CompanyNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_F_CompanyNameTextFieldFocusLost
        try{
            F_Company_name=F_CompanyNameTextField.getText();
            if(F_Company_name.length()==0)F_CompanyNameTextField.setText("Set company");

        }catch(ExceptionInInitializerError e){
            F_CompanyNameTextField.setText("Company Error");
        }
    }//GEN-LAST:event_F_CompanyNameTextFieldFocusLost

    private void add_Education_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_Education_ButtonActionPerformed

           DefaultTableModel model = (DefaultTableModel)EducationTable.getModel();
        if(flag == 0){  
                cv.addSection("Education");
                item = new BulletListItem();
                model.addRow(new Object[]{QuallificationTextField.getText(),LocationTextField5.getText(),EstablishmentTextField5.getText(),Education_Date_TextField.getText()});
                item.setQualification(QuallificationTextField.getText());
                item.setLocation(LocationTextField5.getText());
                item.setEshablishment(EstablishmentTextField5.getText());
                item.setDate(DateEducation);
                
                String Date23 =Education_Date_TextField.getText();
                try {
                    
                    DateEducation2=sdf.parse(Date23);
                } catch (ParseException ex) {
                    Logger.getLogger(cvTemplate.class.getName()).log(Level.SEVERE, null, ex);
                }

              
               cv.addBulletListItem(item);  
               flag++;
                
            }else{ 
            
            
                    String Date12 =Education_Date_TextField.getText();
                    try {

                        DateEducation = sdf.parse(Date12);
                    } catch (ParseException ex) {
                        Logger.getLogger(cvTemplate.class.getName()).log(Level.SEVERE, null, ex);
                    }
            
                    if(DateEducation.after(DateEducation2)){
                        System.out.println("mphka sto before" );

                        ErrorDateEducation.setText("dates should be from newest to latest");

                    }else{ 
                        try {
                           item = new BulletListItem();
                           model.addRow(new Object[]{QuallificationTextField.getText(),LocationTextField5.getText(),EstablishmentTextField5.getText(),Education_Date_TextField.getText()});
                          item.setQualification(QuallificationTextField.getText());
                          item.setLocation(LocationTextField5.getText());
                          item.setEshablishment(EstablishmentTextField5.getText());
                          
                          item.setDate(DateEducation);
                          ErrorDateEducation.setText("");
                          DateEducation2=sdf.parse(Date12);
                          
                       }catch (ParseException ex) {
                           Logger.getLogger(cvTemplate.class.getName()).log(Level.SEVERE, null, ex);
                       }


                for(int i=0; i<cv.getSections().size(); i++){
                    if(cv.getSections().get(i).getTitle().equals("Education")){
                        
                       cv.addBulletListItem(item);
                         
                    }
                }
             }
                
        }

         
            for(int i=0; i<section.getList().getItemList().size(); i++ ){
                System.out.println(i+"education:" + section.getList().getItemList().get(i).getQualification() );
                System.out.println(i+"education:" + section.getList().getItemList().get(i).getLocation() );
                System.out.println(i+"education:" + section.getList().getItemList().get(i).getEshablishment() );


            }
        
    }//GEN-LAST:event_add_Education_ButtonActionPerformed

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
       
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void Chro_DateTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Chro_DateTextFieldFocusLost
      
           try {
             Birthday=birth.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date =sdf.parse(Birthday);
            cv.setDate(date);
             System.out.println("Date is :"+ sdf.format(date));
         
        } catch (Exception e) {
            birth.setText("Enter a valid Date");
        }
    }//GEN-LAST:event_Chro_DateTextFieldFocusLost

    private void Chro_DateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chro_DateTextFieldActionPerformed
    
        
     
        try {
            Birthday=Chro_DateTextField.getText();
           
           
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date =sdf.parse(Birthday);
            System.out.println("Date is :"+ sdf.format(date));
              System.out.println(Birthday); //15/10/2013
       
        } catch (Exception e) {
            Chro_DateTextField.setText("Enter a valid Date");
        }
    }//GEN-LAST:event_Chro_DateTextFieldActionPerformed

    private void Com_DateTextFiledFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Com_DateTextFiledFocusLost
        try {
            Birthday=Com_DateTextFiled.getText();
            
     
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                DateProfesional =sdf.parse(Birthday);
         
        } catch (Exception e) {
            Com_DateTextFiled.setText("Enter a valid Date");
        }
    }//GEN-LAST:event_Com_DateTextFiledFocusLost

    private void Fun_DateTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Fun_DateTextFieldFocusLost
       
      try {
         
            
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           DateProProf=sdf.parse(Fun_DateTextField.getText());
        } catch (Exception e) {
           
        } 
     
    }//GEN-LAST:event_Fun_DateTextFieldFocusLost

    private void Education_Date_TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Education_Date_TextFieldFocusLost
      try {
         
            
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            DateEducation=sdf.parse(Education_Date_TextField.getText());
        } catch (Exception e) {
            Education_Date_TextField.setText("Enter a valid Date");
        }   
    }//GEN-LAST:event_Education_Date_TextFieldFocusLost

    private void Date_Course_TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Date_Course_TextFieldFocusLost
        // TODO add your handling code here:
     
        try {
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           DateCourse=sdf.parse(Date_Course_TextField.getText());
              System.out.println(Birthday); //15/10/2013
        } catch (Exception e) {
            Date_Course_TextField.setText("Enter a valid Date");
        }   
    }//GEN-LAST:event_Date_Course_TextFieldFocusLost

    private void CareerTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CareerTableAncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_CareerTableAncestorAdded

    private void CareerRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CareerRemoveActionPerformed
        DefaultTableModel model = (DefaultTableModel) CareerTable.getModel();
        int x=CareerTable.getSelectedRow();
        if(x==-1){
            if(x==0){
                CareerMessage.setText("table is empty");
            }else{
                    CareerMessage.setText("selecet a Row");
                }
        }else{
            System.out.println("bhka sto remove");
          
               model.removeRow(x);
                      
                     
                 for(int i=0; i<cv.getSections().size(); i++){
                    if(cv.getSections().get(i).getTitle().equals("Career")){
                               
                       cv.getSections().get(i).getList().getItemList().remove(x);                   
                      
                     }           
                 }   
            }      
    }//GEN-LAST:event_CareerRemoveActionPerformed

    private void EducationRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EducationRemoveActionPerformed
        
         DefaultTableModel model = (DefaultTableModel) EducationTable.getModel();
       int x=EducationTable.getSelectedRow();
         if(x==-1){
            if(x==0){
                EducationMessage.setText("table is empty");
            }else{
                     EducationMessage.setText("selecet a Row");
                }
        }else{
                model.removeRow(x);
                 for(int i=0; i<cv.getSections().size(); i++){
                    if(cv.getSections().get(i).getTitle().equals("Education")){
                        
                       cv.getSections().get(i).getList().getItemList().remove(x);
                      }           
                 }   
            }  
       
    }//GEN-LAST:event_EducationRemoveActionPerformed

    private void RemoveCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveCourseActionPerformed
        DefaultTableModel model = (DefaultTableModel) CourseTable.getModel();
       int x=CourseTable.getSelectedRow();
        if(x==-1){
            if(x==0){
                CourseMessage.setText("table is empty");
            }else{
                     CourseMessage.setText("selecet a Row");
                }
        }else{
                model.removeRow(x);
                 for(int i=0; i<cv.getSections().size(); i++){
                    if(cv.getSections().get(i).getTitle().equals("Courses")){
                        
                         cv.getSections().get(i).getList().getItemList().remove(x);
                      }           
                 }   
            } 
        

     
    }//GEN-LAST:event_RemoveCourseActionPerformed

    private void UpdateCareerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCareerActionPerformed
        DefaultTableModel model = (DefaultTableModel) CareerTable.getModel();
        if(CareerTable.getSelectedRow()==-1){
            if(CareerTable.getRowCount()==0){
                CareerMessage.setText("table is empty");
            }else{
                    CareerMessage.setText("selecet a Row");
                }
        }else{
            
            model.setValueAt(F_CompanyNameTextField.getText(), CareerTable.getSelectedRow(),0); 
            model.setValueAt(F_JobTitleTextField.getText(), CareerTable.getSelectedRow(),1);
            
             
                 for(int i=0; i<cv.getSections().size(); i++){
                    if(cv.getSections().get(i).getTitle().equals("Career")){
                        
                        section.getList().getItemList().get(CareerTable.getSelectedRow()).setCompanyName(F_CompanyNameTextField.getText());
                        section.getList().getItemList().get(CareerTable.getSelectedRow()).setJobTitle(F_JobTitleTextField.getText());
                        section.getList().getItemList().get(CareerTable.getSelectedRow()).setDate(DateCareer);
                      }           
                 }   
            }      
        
    }//GEN-LAST:event_UpdateCareerActionPerformed

    private void EducationUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EducationUpdateActionPerformed
       
          DefaultTableModel model = (DefaultTableModel) EducationTable.getModel();
        if(EducationTable.getSelectedRow()==-1){
            if(EducationTable.getRowCount()==0){
                EducationMessage.setText("table is empty");
            }else{
                    EducationMessage.setText("selecet a Row");
                }
        }else{
            
            model.setValueAt(QuallificationTextField.getText(), EducationTable.getSelectedRow(),0); 
            model.setValueAt(LocationTextField5.getText(), EducationTable.getSelectedRow(),1);
            model.setValueAt(EstablishmentTextField5.getText(), EducationTable.getSelectedRow(),2);
            // DATA  model.setValueAt(LocationTextField5.getText(), EducationTable.getSelectedRow(),1);
             
                 for(int i=0; i<cv.getSections().size(); i++){
                    if(cv.getSections().get(i).getTitle().equals("Education")){
                        
                        section.getList().getItemList().get(EducationTable.getSelectedRow()).setQualification(QuallificationTextField.getText());
                        section.getList().getItemList().get(EducationTable.getSelectedRow()).setLocation(LocationTextField5.getText());
                        section.getList().getItemList().get(EducationTable.getSelectedRow()).setEshablishment(EstablishmentTextField5.getText());
                        section.getList().getItemList().get(EducationTable.getSelectedRow()).setDate(DateEducation);
                      }           
                 }   
            }      
    }//GEN-LAST:event_EducationUpdateActionPerformed

    private void CourseUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseUpdateActionPerformed
       
           DefaultTableModel model = (DefaultTableModel) CourseTable.getModel();
        if(CourseTable.getSelectedRow()==-1){
            if(CourseTable.getRowCount()==0){
                CourseMessage.setText("table is empty");
            }else{
                    CourseMessage.setText("selecet a Row");
                }
        }else{
            
            model.setValueAt(CourseTextField.getText(), CourseTable.getSelectedRow(),0); 
            model.setValueAt(LocationTextField6.getText(), CourseTable.getSelectedRow(),1);
            model.setValueAt(EstablishmentTextField6.getText(), CourseTable.getSelectedRow(),2);
           
             
                 for(int i=0; i<cv.getSections().size(); i++){
                    if(cv.getSections().get(i).getTitle().equals("Course")){
                        
                        section.getList().getItemList().get(CourseTable.getSelectedRow()).setCourse(CourseTextField.getText());
                        section.getList().getItemList().get(CourseTable.getSelectedRow()).setLocation(LocationTextField6.getText());
                        section.getList().getItemList().get(CourseTable.getSelectedRow()).setEshablishment(EstablishmentTextField6.getText());
                         section.getList().getItemList().get(CourseTable.getSelectedRow()).setDate(DateCourse);
                      }           
                 }   
            }    
    }//GEN-LAST:event_CourseUpdateActionPerformed

    private void CourseTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseTextFieldActionPerformed
      
    }//GEN-LAST:event_CourseTextFieldActionPerformed

    private void exportTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportTxtActionPerformed
        ChooseFilleName FN = new ChooseFilleName( cv);
        FN.setVisible(true);
       
    }//GEN-LAST:event_exportTxtActionPerformed

  
    private void NumberTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NumberTextFieldFocusLost
      
          cv.setNumber( NumberTextField.getText());
    }//GEN-LAST:event_NumberTextFieldFocusLost

    private void birthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_birthFocusLost
       
        
        try {
             Birthday=birth.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date =sdf.parse(Birthday);
            cv.setDate(date);
             System.out.println("Date is :"+ sdf.format(date));
         
        } catch (Exception e) {
            birth.setText("Enter a valid Date");
        }
        
    }//GEN-LAST:event_birthFocusLost

    private void C_CompanyNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_CompanyNameTextFieldActionPerformed
      
    }//GEN-LAST:event_C_CompanyNameTextFieldActionPerformed

    
   
   
  public void setPanel(int x){
        if(x==1){
   
            jPanel4.removeAll();
            jPanel4.repaint();
            jPanel4.revalidate();
        
            jPanel4.add(Functional);
            jPanel4.repaint();
            jPanel4.revalidate();

    }else if(x ==2){
            jPanel4.removeAll();
            jPanel4.repaint();
            jPanel4.revalidate();
        
            jPanel4.add(Chronologikal);
            jPanel4.repaint();
            jPanel4.revalidate();

   
   }else if (x ==3){
            jPanel4.removeAll();
            jPanel4.repaint();
            jPanel4.revalidate();
        
            jPanel4.add(Combined);
            jPanel4.repaint();
            jPanel4.revalidate();

    }
   }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Additional_infoTextArea;
    private javax.swing.JTextField C_Achievement_X_TextField;
    private javax.swing.JTextField C_CompanyNameTextField;
    private javax.swing.JTextArea C_CoreStrengthTextArea;
    private javax.swing.JTextField C_JobTitleTextField;
    private javax.swing.JTextField C_resposibilitiesTextfield;
    private javax.swing.JLabel CareerMessage;
    private javax.swing.JButton CareerRemove;
    private javax.swing.JTable CareerTable;
    private javax.swing.JTextField Chro_DateTextField;
    private javax.swing.JPanel Chronologikal;
    private javax.swing.JTextField Com_Achievement_X_TextField;
    private javax.swing.JTextField Com_CompanyNameTextField;
    private javax.swing.JTextField Com_DateTextFiled;
    private javax.swing.JTextField Com_JobTitleTextField;
    private javax.swing.JTextField Com_ResposibilitiesTextField;
    private javax.swing.JPanel Combined;
    public javax.swing.JTextField CountryTextField;
    private javax.swing.JLabel CourseMessage;
    private javax.swing.JTable CourseTable;
    private javax.swing.JTextField CourseTextField;
    private javax.swing.JButton CourseUpdate;
    private javax.swing.JTextField Date_Course_TextField;
    private javax.swing.JLabel EducationMessage;
    private javax.swing.JButton EducationRemove;
    private javax.swing.JTable EducationTable;
    private javax.swing.JButton EducationUpdate;
    private javax.swing.JTextField Education_Date_TextField;
    private javax.swing.JLabel ErrorDateCareer;
    private javax.swing.JLabel ErrorDateCourse;
    private javax.swing.JLabel ErrorDateEducation;
    public javax.swing.JTextField EstablishmentTextField5;
    public javax.swing.JTextField EstablishmentTextField6;
    public javax.swing.JTextField F_CompanyNameTextField;
    public javax.swing.JTextField F_JobTitleTextField;
    private javax.swing.JRadioButton FemaleRadioButton;
    private javax.swing.JTextField Fun_DateTextField;
    private javax.swing.JButton Fun_add_skill_button;
    private javax.swing.JPanel Functional;
    private javax.swing.JTextArea InterestsTextArea;
    public javax.swing.JTextField LastNameTextField;
    public javax.swing.JTextField LocationTextField5;
    private javax.swing.JTextField LocationTextField6;
    public javax.swing.JTextField MailTextField;
    private javax.swing.JRadioButton MaleRadioButton;
    private javax.swing.JTextField NameTextField;
    public javax.swing.JTextField NumberTextField;
    private javax.swing.JTextArea ProfessionalProfTextArea;
    private javax.swing.JTextField QuallificationTextField;
    private javax.swing.JButton RemoveCourse;
    private javax.swing.JButton UpdateCareer;
    private javax.swing.JButton add_Course_Button;
    private javax.swing.JButton add_Education_Button;
    private javax.swing.JTextField birth;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton chro_add_buuton;
    private javax.swing.JButton chro_remove_button;
    private javax.swing.JButton chro_update_buuton;
    private javax.swing.JButton com_add_Experience_button;
    private javax.swing.JButton com_add_skill_Button1;
    private javax.swing.JTextField com_experience_button;
    private javax.swing.JButton com_remove_Experience_button;
    private javax.swing.JButton com_remove_skill_button;
    private javax.swing.JTextField com_skill_button;
    private javax.swing.JButton com_update_Experience_Button;
    private javax.swing.JButton com_update_skill_button;
    private javax.swing.JTextField experienceTextField;
    private javax.swing.JMenuItem exportTxt;
    private javax.swing.JButton fun_add_career_button;
    private javax.swing.JButton fun_remove_skill_button;
    private javax.swing.JButton fun_upadate_skill_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField skillTextField;
    // End of variables declaration//GEN-END:variables
}


