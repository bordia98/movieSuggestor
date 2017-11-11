package moviesuggestor;

import java.sql.*;
import java.lang.*;

//implementing the interface checkempty which is extending from the interface databaseconnection

public class insert extends javax.swing.JFrame implements checkempty {
      private static String username="root";
    private static String password="2541";
    private static final String connect_string = "jdbc:mysql://localhost:3306/moviestorage";
    

   //Constructor to display frame
    public insert() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ratingsTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        horrorRB = new javax.swing.JRadioButton();
        romanceRB = new javax.swing.JRadioButton();
        dramaRB = new javax.swing.JRadioButton();
        actionRB = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        resTF = new javax.swing.JLabel();
        comedyRB = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("<html><center>Insert movies</center></html>");

        jLabel2.setText("Name of the movie");

        jLabel3.setText("Imdb Ratings");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("category");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ratingsTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingsTFActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(horrorRB);
        horrorRB.setText("Horror");
        horrorRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horrorRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(romanceRB);
        romanceRB.setText("Romance");
        romanceRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanceRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(dramaRB);
        dramaRB.setText("Drama");

        buttonGroup1.add(actionRB);
        actionRB.setText("Action");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        resTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        buttonGroup1.add(comedyRB);
        comedyRB.setText("comedy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ratingsTF, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resTF, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(horrorRB)
                                .addGap(43, 43, 43)
                                .addComponent(romanceRB)
                                .addGap(36, 36, 36)
                                .addComponent(dramaRB)
                                .addGap(33, 33, 33)
                                .addComponent(actionRB)
                                .addGap(18, 18, 18)
                                .addComponent(comedyRB)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ratingsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(horrorRB)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actionRB)
                            .addComponent(romanceRB)
                            .addComponent(comedyRB)))
                    .addComponent(dramaRB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(resTF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ratingsTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingsTFActionPerformed
    }//GEN-LAST:event_ratingsTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        String name = nameTF.getText();
        float ratings = -1;
        System.out.println(name +"   "+ name.length() );
        String category="";
        if(ratingsTF.getText()==null || ratingsTF.getText().trim().isEmpty()){
        }
        else{
            ratings=Float.parseFloat(ratingsTF.getText());
        }
        //using the method of interface checkempty
        int namelen=checkstringempty(name);
        if(namelen!=-1 && ratings!=-1){
            
        
        Connection con=null;
        try{
            //using the method of the interface databaseconnection which the checkempty interface is extending
            
            con = getconnected(connect_string,username,password);
            System.out.println("Database connected");
            
            Statement stmt;
            stmt = con.createStatement();
            
            String query="Select count(*) from movies";
            ResultSet rs=stmt.executeQuery(query);
            int sno = 0;
            while(rs.next())
                sno=rs.getInt(1)+1;
            
            if(horrorRB.isSelected()==true)
                category=horrorRB.getText();
            else if(romanceRB.isSelected()==true)
                   category=romanceRB.getText();
            else if (actionRB.isSelected()==true)
                    category=actionRB.getText();
            else if (comedyRB.isSelected()==true)
                    category="comedy";
            else if(dramaRB.isSelected()==true)
                category=dramaRB.getText();

            //using the method of interface checkempty

            int catlen=checkstringempty(category);
            if(catlen!=-1){
            String insert="INSERT INTO movies VALUES('"+sno+"','"+name+"','"+ratings+"','"+category+"');";
            stmt.executeUpdate(insert);
            System.out.println("Successfully Inserted in database");
            resTF.setText( name + " movie is inserted into the database");}
            else{
                resTF.setText("please Select category");
            }
        }catch(SQLException e){
            resTF.setText(e+"");
         }
        }
        else{
            resTF.setText("Please enter the data ");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //This will clear all the thing in the frame
        resTF.setText("");
        nameTF.setText("");
        ratingsTF.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void romanceRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanceRBActionPerformed
    }//GEN-LAST:event_romanceRBActionPerformed

    private void horrorRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horrorRBActionPerformed
    }//GEN-LAST:event_horrorRBActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Method  to go back to the opening page
        this.setVisible(false);
        openingpage form = new openingpage();
        form.setVisible(true);        
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
     
        //running thread using runnable method
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton actionRB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton comedyRB;
    private javax.swing.JRadioButton dramaRB;
    private javax.swing.JRadioButton horrorRB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField ratingsTF;
    private javax.swing.JLabel resTF;
    private javax.swing.JRadioButton romanceRB;
    // End of variables declaration//GEN-END:variables

    //implementing the method of the interface checkempty
    @Override
    public int checkstringempty(String x) {
        if (x.length()==0)
            return -1;
        else
            return 0;
     
    }

    //implementing the method of the interface database connection which the checkempty is implementing
    @Override
    public Connection getconnected(String path, String username, String password) {
        Connection x=null;
        try{
            x = DriverManager.getConnection(path,username,password);
            return x;
        }catch(Exception e){
            System.out.println(e);
        }
          return null;
    }
}
