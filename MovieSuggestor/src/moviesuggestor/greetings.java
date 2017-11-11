package moviesuggestor;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

//implementing the interface databaseconnection in the class

public class greetings extends javax.swing.JFrame implements databaseconnection {

    private static String username="root";
    private static String password="2541";
    private static final String connect_string = "jdbc:mysql://localhost:3306/moviestorage";
    
    //constructor for initialising
    public greetings() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        imdbRB = new javax.swing.JRadioButton();
        imdbanyRB = new javax.swing.JRadioButton();
        horrorRB = new javax.swing.JRadioButton();
        romanceRB = new javax.swing.JRadioButton();
        dramaRB = new javax.swing.JRadioButton();
        actionRB = new javax.swing.JRadioButton();
        categoryanyRB = new javax.swing.JRadioButton();
        resTA = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("<Html><b><u>Movie Suggestor</u></b></html>");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("<html><center>Select your choice:</center></html>");

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 51));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 0, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 51));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(imdbRB);
        imdbRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        imdbRB.setText("IMDB 8+");

        buttonGroup1.add(imdbanyRB);
        imdbanyRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        imdbanyRB.setText("Any");

        buttonGroup2.add(horrorRB);
        horrorRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        horrorRB.setText("Horror");

        buttonGroup2.add(romanceRB);
        romanceRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        romanceRB.setText("Romance");

        buttonGroup2.add(dramaRB);
        dramaRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dramaRB.setText("Drama");

        buttonGroup2.add(actionRB);
        actionRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actionRB.setText("Action");

        buttonGroup2.add(categoryanyRB);
        categoryanyRB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        categoryanyRB.setText("Any");

        resTA.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        resTA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resTA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Movie To Watch ??");

        jButton3.setBackground(new java.awt.Color(153, 0, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(imdbRB)
                                .addGap(163, 163, 163)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imdbanyRB)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(actionRB)
                                        .addGap(59, 59, 59)
                                        .addComponent(categoryanyRB)))))
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(horrorRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(romanceRB)
                                .addGap(70, 70, 70)
                                .addComponent(dramaRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(resTA, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imdbRB)
                    .addComponent(imdbanyRB))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horrorRB)
                    .addComponent(romanceRB)
                    .addComponent(dramaRB)
                    .addComponent(actionRB)
                    .addComponent(categoryanyRB))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resTA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con=null;

        try{
            //Using the method of interface to get connected to the database
            con = getconnected(connect_string,username,password);
            System.out.println("Database Connected");
            Statement stmt = con.createStatement();
            int choice1=-1;
            String choice2="";
            if(imdbRB.isSelected()==true)
                choice1=8;
            else if(imdbanyRB.isSelected()==true)
                choice1=0;
            
            if(horrorRB.isSelected()==true)
                choice2="horror";
            else if (dramaRB.isSelected()==true)
                choice2="drama";
            else if(actionRB.isSelected()==true)
                choice2="action";
            else if(romanceRB.isSelected()==true)
                choice2="romance";
            else if(categoryanyRB.isSelected()==true)
                choice2="any";
            
            String query;
            if(choice1!=-1 && choice2.length()!=0 )
            {if(choice2.equals("any")){
                query="Select moviename from movies where imdbratings>="+choice1+"";
                //System.out.print(query);
            }
            else{
                query="Select moviename from movies where imdbratings>="+choice1+" and category="+"'"+choice2+"'";
                System.out.println(query);
            }
            
            ResultSet rs=stmt.executeQuery(query);
            
            ArrayList<String> list = new ArrayList<String>();
            if(rs.next()){
                     do
                     {list.add(rs.getString(1));
                }while(rs.next());
            }
            int size=list.size();
            
            if(size!=0){
            Random random = new Random();
            int index=random.nextInt(size);
            resTA.setText(list.get(index));
            //System.out.println(list.get(index));
            }
            else
                resTA.setText("NO MATCH FOUND");
                //System.out.println("There are no such movies of selected choice");
            
            }
            else
                resTA.setText("select Choice");
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       //This will clear all the button groups and the textfield which is choosen
        buttonGroup1.clearSelection();
       buttonGroup2.clearSelection();
       resTA.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //This method is to go back to the homepage
        this.setVisible(false);
        openingpage form = new openingpage();
        form.setVisible(true);       
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
      
       //thread running using runnable method
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new greetings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton actionRB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton categoryanyRB;
    private javax.swing.JRadioButton dramaRB;
    private javax.swing.JRadioButton horrorRB;
    private javax.swing.JRadioButton imdbRB;
    private javax.swing.JRadioButton imdbanyRB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel resTA;
    private javax.swing.JRadioButton romanceRB;
    // End of variables declaration//GEN-END:variables

    
    //implementing the method of interface which is implemented 
    @Override
    public Connection getconnected(String path, String username, String password) {
        Connection x=null;
        //Using Exception handling in order we caught an exception while connecting to the database
        try{
            x = DriverManager.getConnection(path,username,password);
            return x;
        }catch(Exception e){
            System.out.println(e);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
