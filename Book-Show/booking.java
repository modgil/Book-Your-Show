
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class booking extends javax.swing.JInternalFrame implements ActionListener{
Connection con;
int count=0;
panel p1;
ArrayList movies=new ArrayList();
ArrayList shows=new ArrayList();
ArrayList hall=new ArrayList();
JButton b1[];
GridLayout g1;
    public booking() {
        initComponents();
      
        connection();
        fillmovie();
        fillshow();
        fillhall();
    }
    void connection()
    {
        try
        {
         Class.forName("oracle.jdbc.OracleDriver");
          String s1="jdbc:oracle:thin:@localhost:1522:";
          
           con = DriverManager.getConnection(s1,"aditi","modgil");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
          
    }
void fillmovie()
{
    try
    {
    String query="Select * from movies ";
    PreparedStatement ps=con.prepareStatement(query);
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
        String movie[]=new String[2];
     movie[0]=String.valueOf(rs.getInt("movie_id"))  ;
      movie[1]=  rs.getString("movie_name");
      cmbmovies.addItem(movie[1]);
      movies.add(movie);
    }
 }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
  void fillshow()
{
    try
    {
    String query="Select * from shows ";
    PreparedStatement ps=con.prepareStatement(query);
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
        String show[]=new String[3];
     show[0]=String.valueOf(rs.getInt("show_id"))  ;
      show[1]=rs.getString("start_time");
      show[2]=rs.getString("end_time");
      
      
      cmbshows.addItem(show[1]+"-"+show[2]);
      shows.add(show);
    }
 }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
   void fillhall()
{
    try
    {
    String query="Select * from hall ";
    PreparedStatement ps=con.prepareStatement(query);
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
        count++;
        String halls[]=new String[3];
     halls[0]=String.valueOf(rs.getInt("hall_id"))  ;
      halls[1]=  rs.getString("hall_name");
      halls[2]=rs.getString("no_of_seats");
      
      cmbhalls.addItem(halls[1]);
      hall.add(halls);
    }
 }
    
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
   
   
   
   
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbmovies = new javax.swing.JComboBox();
        cmbshows = new javax.swing.JComboBox();
        cmbhalls = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("Movies");

        jLabel2.setText("Show");

        jLabel4.setText("Hall");

        cmbmovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmoviesActionPerformed(evt);
            }
        });

        cmbshows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbshowsActionPerformed(evt);
            }
        });

        jButton1.setText("Seats");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jButton1)
                        .addGap(79, 79, 79)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbshows, 0, 109, Short.MAX_VALUE)
                            .addComponent(cmbmovies, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbhalls, 0, 109, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbmovies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbshows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbhalls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbshowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbshowsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbshowsActionPerformed

    private void cmbmoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmoviesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbmoviesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   int x=10;
   b1=new JButton[hall.size()];
   int y=10;
   
   for(int i=0;i<hall.size();i++)
    {
    String g[]=(String[])    hall.get(i);
    System.out.println("seats ="+g[2]+"no of seats "+count);


    if(x<=410)
    {
   b1[i]=new JButton();
  b1[i].addActionListener(this);
    b1[i].setBounds(x,y,50,50);
    jPanel1.add(b1[i]);
    x+=100;
    y+=1;
    b1[i].setText(g[2]);
   
    }
    if(x==410)
    {
        x=10;
        y=y+37;
    }
}
 
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbhalls;
    private javax.swing.JComboBox cmbmovies;
    private javax.swing.JComboBox cmbshows;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
 
        
    }
}
