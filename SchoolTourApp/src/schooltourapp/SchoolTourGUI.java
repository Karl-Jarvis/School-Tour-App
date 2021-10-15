/**
 * @author Karl Jarvis 
 * X18381071
 * 12/08/2021
 */
package schooltourapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SchoolTourGUI extends javax.swing.JFrame {

    private String destination;
    private int year;
    private String tName;
    private String cGroup;
    private String tourId;
    private String pickUpPoint;
    private String dropOffPoint;
    private String busCompany;
    private String searchTerm;

    private ArrayList<Tours> tList = new ArrayList();
    
    Connection mycon;
    
    /**
     * Creates new form SchoolTourGUI
     */
    public SchoolTourGUI() {
        initComponents();
        getConnection();
    }
    private void getConnection() {
        try {
            //mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/KARLJ", "root","password");
            //Class.forName("com.mysql.jdbc.Driver");
            mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCHOOLAPP", "root", "Job10Gan");                
            //mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root");
        } catch (SQLException ex) {
            System.out.println("Error Connecting:" + ex.getMessage());
            } catch (Exception ex) {
            System.out.println(ex);
            }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        busTourRb = new javax.swing.JRadioButton();
        walkingTourRb = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTa = new javax.swing.JTextArea();
        pickUpPointTf = new javax.swing.JTextField();
        classGroupTf = new javax.swing.JTextField();
        teacherNameTf = new javax.swing.JTextField();
        yearTf = new javax.swing.JTextField();
        dropOffPointTf = new javax.swing.JTextField();
        busCompanyTf = new javax.swing.JTextField();
        tourIdTf = new javax.swing.JTextField();
        busCompanyLbl = new javax.swing.JLabel();
        tourIdLbl = new javax.swing.JLabel();
        yearLbl = new javax.swing.JLabel();
        teacherNameLbl = new javax.swing.JLabel();
        classGroupLbl = new javax.swing.JLabel();
        pickUpPointLbl = new javax.swing.JLabel();
        dropOffPointLbl = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();
        destinationLbl = new javax.swing.JLabel();
        destinationTf = new javax.swing.JTextField();
        displayFfBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();

        jLabel8.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel8.setText("Class Group");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jLabel2.setText("School Tour App");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel1.setText("Please select: Walking Tour OR Bus Tour");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        busTourRb.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        busTourRb.setText("Bus Tour");
        busTourRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busTourRbActionPerformed(evt);
            }
        });
        getContentPane().add(busTourRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, -1, -1));

        walkingTourRb.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        walkingTourRb.setText("Walking Tour");
        walkingTourRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walkingTourRbActionPerformed(evt);
            }
        });
        getContentPane().add(walkingTourRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, -1));

        displayTa.setColumns(20);
        displayTa.setRows(5);
        jScrollPane1.setViewportView(displayTa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 470, 390));

        pickUpPointTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickUpPointTfActionPerformed(evt);
            }
        });
        getContentPane().add(pickUpPointTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 190, -1));

        classGroupTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classGroupTfActionPerformed(evt);
            }
        });
        getContentPane().add(classGroupTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 190, -1));

        teacherNameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherNameTfActionPerformed(evt);
            }
        });
        getContentPane().add(teacherNameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 190, -1));

        yearTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTfActionPerformed(evt);
            }
        });
        yearTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yearTfKeyPressed(evt);
            }
        });
        getContentPane().add(yearTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 190, -1));

        dropOffPointTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropOffPointTfActionPerformed(evt);
            }
        });
        getContentPane().add(dropOffPointTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 190, -1));

        busCompanyTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busCompanyTfActionPerformed(evt);
            }
        });
        getContentPane().add(busCompanyTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 190, -1));

        tourIdTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tourIdTfActionPerformed(evt);
            }
        });
        tourIdTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tourIdTfKeyPressed(evt);
            }
        });
        getContentPane().add(tourIdTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 190, -1));

        busCompanyLbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        busCompanyLbl.setText("Bus Company");
        getContentPane().add(busCompanyLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, -1, -1));

        tourIdLbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        tourIdLbl.setText("Tour Id");
        getContentPane().add(tourIdLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        yearLbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        yearLbl.setText("Year");
        getContentPane().add(yearLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        teacherNameLbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        teacherNameLbl.setText("Teacher Name");
        getContentPane().add(teacherNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        classGroupLbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        classGroupLbl.setText("Class Group");
        getContentPane().add(classGroupLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        pickUpPointLbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        pickUpPointLbl.setText("Pick up point");
        getContentPane().add(pickUpPointLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        dropOffPointLbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        dropOffPointLbl.setText("Drop off point");
        getContentPane().add(dropOffPointLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        saveBtn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 90, 40));

        addBtn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, 40));

        deleteBtn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 90, 40));

        displayBtn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        displayBtn.setText("Display");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });
        getContentPane().add(displayBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 90, 40));

        destinationLbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        destinationLbl.setText("Destination");
        getContentPane().add(destinationLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        destinationTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationTfActionPerformed(evt);
            }
        });
        getContentPane().add(destinationTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 190, -1));

        displayFfBtn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        displayFfBtn.setText("Display from file");
        displayFfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayFfBtnActionPerformed(evt);
            }
        });
        getContentPane().add(displayFfBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 150, 40));

        clearBtn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        clearBtn.setText("Clear text");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busTourRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busTourRbActionPerformed
        // TODO add your handling code here:
        if (busTourRb.isSelected())
            walkingTourRb.setSelected(false);
            pickUpPointLbl.setVisible(true);
            dropOffPointLbl.setVisible(true);
            busCompanyLbl.setVisible(true);
            pickUpPointTf.setVisible(true);
            dropOffPointTf.setVisible(true);
            busCompanyTf.setVisible(true);
    }//GEN-LAST:event_busTourRbActionPerformed

    private void walkingTourRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walkingTourRbActionPerformed
        // TODO add your handling code here:
        if (walkingTourRb.isSelected())
            busTourRb.setSelected(false);
            pickUpPointLbl.setVisible(false);
            dropOffPointLbl.setVisible(false);
            busCompanyLbl.setVisible(false);
            pickUpPointTf.setVisible(false);
            dropOffPointTf.setVisible(false);
            busCompanyTf.setVisible(false);
    }//GEN-LAST:event_walkingTourRbActionPerformed

    private void pickUpPointTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickUpPointTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pickUpPointTfActionPerformed

    private void classGroupTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classGroupTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classGroupTfActionPerformed

    private void teacherNameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherNameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherNameTfActionPerformed

    private void yearTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTfActionPerformed

    private void dropOffPointTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropOffPointTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropOffPointTfActionPerformed

    private void busCompanyTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busCompanyTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busCompanyTfActionPerformed

    private void tourIdTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tourIdTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tourIdTfActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        try{
            Statement mys = mycon.createStatement();
            displayTa.setText("\n Your details have been saved \n");

               
            //myStatement.executeUpdate("INSERT INTO gifts_table (Recipient,gift,URL)" + "VALUES('" + recipientTF.getText() + "','" + giftTF.getText() + "','" + urlTF.getText() + "')");

            mys.executeUpdate("  INSERT INTO TOURDATA (TOURID, DESTINATION, SCHOOLYEAR, TEACHERNAME, CLASSGROUP, PICKUPPOINT, DROPOFFPOINT, BUSCOMPANY)"
                    + "VALUES ('" +tourIdTf.getText()+"', '"+destinationTf.getText()+"', '" +yearTf.getText()+"', '" +teacherNameTf.getText()+"', '" +classGroupTf.getText()+"', '" +pickUpPointTf.getText()+"', '" +dropOffPointTf.getText()+"', '"+busCompanyTf.getText()+"')");
        } catch(Exception e){
            System.out.println(e);
          
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        //1
        tourId = tourIdTf.getText();
        destination = destinationTf.getText();
        year = Integer.parseInt(yearTf.getText());
        tName = teacherNameTf.getText();
        cGroup = classGroupTf.getText();
        pickUpPoint = pickUpPointTf.getText();
        dropOffPoint = dropOffPointTf.getText();
        busCompany = busCompanyTf.getText();

        //2
        Tours temp = new Tours(destination, year, tName, cGroup, tourId);
       
        BusTours b = new BusTours(pickUpPoint, dropOffPoint, busCompany, destination, year, tName, cGroup, tourId);
       
        //3
        if (walkingTourRb.isSelected()){
            tList.add(temp);
            
        } else if(busTourRb.isSelected()){
             tList.add(b);
             
        } else {
            JOptionPane.showMessageDialog(null,"Please select a tour type");
        }        
       
        //4
        displayTa.setText("\n Your details have been added \n");
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        displayTa.append("\n Searching \n"); 
        searchTerm = JOptionPane.showInputDialog(null, "Please enter the unique tourId");

        for (int i = 0; i < tList.size(); i++) {
            Tours temp; //creating a temporay account obj named temp
            temp = tList.get(i); //the item at the current index (i) is being stored in temp

            if (searchTerm.equalsIgnoreCase(temp.getTourId())) { 
                tList.remove(i);
                displayTa.append("\n Record deleted! \n");
                break;
            }

        }
        
        /*
         // I was going to use this code to delete the last element added but I couldnt get it to stop looping through the entire arraylist 
         // starting from the last element and deleting the entire arraylist but i thought id leave it here anyways
        
        displayTa.append("\n Searching \n"); 
        //searchTerm = JOptionPane.showInputDialog(null, "please enter the year made");

        for (int i = tList.size()-1; i >= 0; i--) {
            
            Tours temp; //creating a temporay account obj named temp
            temp = tList.get(i); //the item at the current index (i) is being stored in temp
               tList.remove(i);
               displayTa.append("\nLast item was deleted \n");
            /*if (searchTerm.equalsIgnoreCase(temp.getYearMade())) { 
                tList.remove(i);
                displayTa.append("\n Record deleted! \n"); 
                break;
            }
            
        }*/
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        // TODO add your handling code here:
        
        if (walkingTourRb.isSelected()){
                for (int i = 0; i < tList.size(); i++) {
                     Tours temp; //creating a temporay account obj named temp
                     temp = tList.get(i); //the item at the current index (i) is being stored in temp
                     displayTa.append(temp.toString() + "\n"); //extractin the details in temp obj using the toSting method and displaying them in the text area
                }
                
            }else if(busTourRb.isSelected()){
                 for (int i = 0; i < tList.size(); i++) {
                    BusTours b; //creating a temporay account obj named temp
                    b = (BusTours) tList.get(i);
                    //b = tList.get(i); //the item at the current index (i) is being stored in temp
                    displayTa.append(b.toString() + "\n"); //extractin the details in temp obj using the toSting method and displaying them in the text area
                }
                 
                } else{
                
                      }
        
        
        
    }//GEN-LAST:event_displayBtnActionPerformed

    private void destinationTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationTfActionPerformed

    private void tourIdTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tourIdTfKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            tourIdTf.setEditable(false);
            JOptionPane.showMessageDialog(null,"Please enter a number");                      
        }else
        {
            tourIdTf.setEditable(true);
        }
    }//GEN-LAST:event_tourIdTfKeyPressed

    private void yearTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearTfKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            yearTf.setEditable(false);
            JOptionPane.showMessageDialog(null,"Please enter a number");                      
        }else
        {
            yearTf.setEditable(true);
        }
    }//GEN-LAST:event_yearTfKeyPressed

    private void displayFfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayFfBtnActionPerformed
        // TODO add your handling code here:
        try {
        //create a statement
        Statement myStatement = mycon.createStatement();
        //execute query and store data in resultSet
        ResultSet myRs = myStatement.executeQuery("SELECT * FROM TOURDATA");

        //process Rs
            while(myRs.next()){

                JOptionPane.showMessageDialog(null, myRs.getString("TOURID") + "," + myRs.getString("DESTINATION") + "," + myRs.getInt("SCHOOLYEAR") + myRs.getString("TEACHERNAME") + "," 
                        + myRs.getString("CLASSGROUP") + ","+ myRs.getString("PICKUPPOINT") + ","+ myRs.getString("DROPOFFPOINT") + ","+ myRs.getString("BUSCOMPANY"));
            }
        } catch (Exception e) {
        System.out.println(e);
        }
    }//GEN-LAST:event_displayFfBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        tourIdTf.setText("");
        destinationTf.setText("");
        yearTf.setText("");
        teacherNameTf.setText("");
        classGroupTf.setText("");
        pickUpPointTf.setText("");
        dropOffPointTf.setText("");
        busCompanyTf.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel busCompanyLbl;
    private javax.swing.JTextField busCompanyTf;
    private javax.swing.JRadioButton busTourRb;
    private javax.swing.JLabel classGroupLbl;
    private javax.swing.JTextField classGroupTf;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel destinationLbl;
    private javax.swing.JTextField destinationTf;
    private javax.swing.JButton displayBtn;
    private javax.swing.JButton displayFfBtn;
    private javax.swing.JTextArea displayTa;
    private javax.swing.JLabel dropOffPointLbl;
    private javax.swing.JTextField dropOffPointTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pickUpPointLbl;
    private javax.swing.JTextField pickUpPointTf;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel teacherNameLbl;
    private javax.swing.JTextField teacherNameTf;
    private javax.swing.JLabel tourIdLbl;
    private javax.swing.JTextField tourIdTf;
    private javax.swing.JRadioButton walkingTourRb;
    private javax.swing.JLabel yearLbl;
    private javax.swing.JTextField yearTf;
    // End of variables declaration//GEN-END:variables
}
