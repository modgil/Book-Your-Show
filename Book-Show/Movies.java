
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Movies extends javax.swing.JInternalFrame {
     
              
    

    /**
     * Creates new form Movies
     */
    String MovieID="";
    public Movies() {
        initComponents();
        filltable();
    }
     void filltable()
    {
        Vector headings=new Vector();
        headings.add("MovieID");
        headings.add("MovieName");
        headings.add("Actor");
        headings.add("Actress");
        headings.add("Director");
        headings.add("Musicby");
        headings.add("ReleasingDate");
        headings.add("RunningTime");
        Vector data=new Vector();
         try{  
          Class.forName("oracle.jdbc.OracleDriver");
          String s1="jdbc:oracle:thin:@localhost:1522:";
          
          Connection con = DriverManager.getConnection(s1,"aditi","modgil");
          
          
          String query="select * from Movies";
          PreparedStatement p=con.prepareStatement(query);
          ResultSet rs=p.executeQuery();
          String MovieID,MovieName,Actor,Actress,Director,Musicby,ReleasingDate,RunningTime;
          while(rs.next())
          {
              MovieID=rs.getString("Movie_ID");
              MovieName=rs.getString("Movie_Name");
              Actor=rs.getString("Actor");
              Actress=rs.getString("Actress");
              Director=rs.getString("Director");
              Musicby=rs.getString("Music_by");
              ReleasingDate=rs.getString("Releasing_Date");
              RunningTime=rs.getString("Running_Time");
              Vector row=new Vector();
              row.add(MovieID);
              row.add(MovieName);
              row.add(Actor);
              row.add(Actress);
              row.add(Director);
              row.add(Musicby);
              row.add(ReleasingDate);
              row.add(RunningTime);
              data.add(row);
     
          } 
          DefaultTableModel t = new DefaultTableModel(data,headings);
           jTable1.getModel();
           jTable1.setModel(t);
           con.close();
      }
      catch(Exception ex)
      {
          ex.printStackTrace();
          
          
      }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mt2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mt3 = new javax.swing.JTextField();
        mt4 = new javax.swing.JTextField();
        mt5 = new javax.swing.JTextField();
        mt6 = new javax.swing.JTextField();
        mt7 = new javax.swing.JTextField();
        mt8 = new javax.swing.JTextField();
        mt1 = new javax.swing.JTextField();
        mb1 = new javax.swing.JButton();
        mb2 = new javax.swing.JButton();
        mb3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MOVIES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Movie ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Movie Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Actor");

        mt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mt2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Actress");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Director");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Music by");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Releasing date");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Running time");

        mt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mt4ActionPerformed(evt);
            }
        });

        mt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mt8ActionPerformed(evt);
            }
        });

        mt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mt1ActionPerformed(evt);
            }
        });

        mb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mb1.setText("SAVE");
        mb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mb1ActionPerformed(evt);
            }
        });

        mb2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mb2.setText("MODIFY");
        mb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mb2ActionPerformed(evt);
            }
        });

        mb3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mb3.setText("DELETE");
        mb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mb3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mb1)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(mb2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mb3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mt7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(mt6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mt5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mt4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mt3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mt2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mt1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mt8))))
                        .addGap(4, 4, 4)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(mt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mt5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mt6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mt7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mt8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(mb1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mb2)
                    .addComponent(mb3))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mt8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mt8ActionPerformed

    private void mt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mt2ActionPerformed

    private void mt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mt1ActionPerformed

    private void mb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mb2ActionPerformed
        try{  
          Class.forName("oracle.jdbc.OracleDriver");
          String s1="jdbc:oracle:thin:@localhost:1522:";
           String MovieID=mt1.getText();
          String MovieName=mt2.getText();
          String Actor=mt3.getText();
          String Actress=mt4.getText();
          String Director=mt5.getText();
          String MusicBy=mt6.getText();
          String ReleasingDate=mt7.getText();
          String RunningTime=mt8.getText();
           Connection con = DriverManager.getConnection(s1,"aditi","modgil");
          String query = "update Movies set Movie_Name=?,Actor=?,Actress=?,Director=?,Music_By=?,Releasing_Date=?,Running_Time=? where Movie_ID=?";
          
          PreparedStatement p=con.prepareStatement(query);
           p.setString(1,MovieName);
          p.setString(2,Actor);
          p.setString(3,Actress);
          p.setString(4,Director);
          p.setString(5,MusicBy);
          p.setString(6,ReleasingDate);
          p.setString(7,RunningTime);
          p.setString(8,MovieID);
          p.executeUpdate();
          System.out.println("Data Modified");
          JOptionPane.showMessageDialog(this,"Data Modified");
         filltable();
          con.close();
      }
      
      catch(Exception ex)
      {
          ex.printStackTrace();
          
          
      }
    }//GEN-LAST:event_mb2ActionPerformed

    private void mb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mb1ActionPerformed
           try{  
          Class.forName("oracle.jdbc.OracleDriver");
          String s1="jdbc:oracle:thin:@localhost:1522:";
          String MovieID=mt1.getText();
          String MovieName=mt2.getText();
          String Actor=mt3.getText();
          String Actress=mt4.getText();
          String Director=mt5.getText();
          String MusicBy=mt6.getText();
          String ReleasingDate=mt7.getText();
          String RunningTime=mt8.getText();
          Connection con = DriverManager.getConnection(s1,"system","manpriya");
          String query="insert into Movies values(?,?,?,?,?,?,?,?)";
          PreparedStatement p=con.prepareStatement(query);
          p.setString(1,MovieID);
          p.setString(2,MovieName);
          p.setString(3,Actor);
          p.setString(4,Actress);
          p.setString(5,Director);
          p.setString(6,MusicBy);
          p.setString(7,ReleasingDate);
          p.setString(8,RunningTime);
          p.executeUpdate();
          System.out.println("Data Saved");
          JOptionPane.showMessageDialog(this,"Data Saved");
          filltable();
          
          con.close();
      }
      catch(Exception ex)
      {
          ex.printStackTrace();
          
          
      }
                                      

    }//GEN-LAST:event_mb1ActionPerformed

    private void mb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mb3ActionPerformed
        try{  
          Class.forName("oracle.jdbc.OracleDriver");
          String s1="jdbc:oracle:thin:@localhost:1522:";
           String MovieID=mt1.getText();
          String MovieName=mt2.getText();
          String Actor=mt3.getText();
          String Actress=mt4.getText();
          String Director=mt5.getText();
          String MusicBy=mt6.getText();
          String ReleasingDate=mt7.getText();
          String RunningTime=mt8.getText();
           Connection con = DriverManager.getConnection(s1,"aditi","modgil");
            String query = "delete Movies where Movie_ID=?";
          
          
          PreparedStatement p=con.prepareStatement(query);
          p.setString(1,MovieID);
         // p.setString(1,HallName);
         // p.setString(2,NoofSeats);
          p.executeUpdate();
          System.out.println("Data Deleted");
          JOptionPane.showMessageDialog(this,"Data Deleted");
         filltable();
          con.close();
      }
      catch(Exception ex)
      {
          ex.printStackTrace();
          
          
      }
                               
    }//GEN-LAST:event_mb3ActionPerformed

    private void mt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mt4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    int a=jTable1.getSelectedRow();
TableModel m1=jTable1.getModel();
String movieid=(String)m1.getValueAt(a,0);
mt1.setText(movieid);

String name=(String)m1.getValueAt(a,1);
mt2.setText(name);

String actor=(String)m1.getValueAt(a,2);
mt3.setText(actor);

String actress=(String)m1.getValueAt(a,3);
mt4.setText(actress);

String director=(String)m1.getValueAt(a,4);
mt5.setText(director);

String musicby=(String)m1.getValueAt(a,5);
mt6.setText(musicby);

String releasing=(String)m1.getValueAt(a,6);
mt7.setText(releasing);

String running=(String)m1.getValueAt(a,7);
mt8.setText(running);






    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton mb1;
    private javax.swing.JButton mb2;
    private javax.swing.JButton mb3;
    private javax.swing.JTextField mt1;
    private javax.swing.JTextField mt2;
    private javax.swing.JTextField mt3;
    private javax.swing.JTextField mt4;
    private javax.swing.JTextField mt5;
    private javax.swing.JTextField mt6;
    private javax.swing.JTextField mt7;
    private javax.swing.JTextField mt8;
    // End of variables declaration//GEN-END:variables
}
