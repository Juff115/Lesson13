
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;


public class TaskMaster extends javax.swing.JFrame {
    ArrayList <Task> list;
    ListIterator <Task> li;
    int curtask, tottask;
    Task t;
    
    public TaskMaster() {
        initComponents();
        list= new ArrayList();
        li=list.listIterator();
        curtask=0;
        tottask=0;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdesc = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        lblctask = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbltottask = new javax.swing.JLabel();
        btnfirst = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnushowall = new javax.swing.JMenuItem();
        mnuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnureplacect = new javax.swing.JMenuItem();
        mnuremovect = new javax.swing.JMenuItem();
        mnurestorect = new javax.swing.JMenuItem();
        mnuclear = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnubeforect = new javax.swing.JMenuItem();
        mnuafterct = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Name:");

        txtname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Description:");

        txtdesc.setColumns(20);
        txtdesc.setRows(5);
        jScrollPane1.setViewportView(txtdesc);

        jLabel3.setText("Current Task");

        lblctask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Total Tasks");

        lbltottask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnfirst.setText("|<");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnprev.setText("<");
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnnext.setText(">");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        jMenu1.setText("Program");

        mnushowall.setText("Show All Tasks");
        mnushowall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnushowallActionPerformed(evt);
            }
        });
        jMenu1.add(mnushowall);

        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnureplacect.setText("Replace This as Current Task");
        mnureplacect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnureplacectActionPerformed(evt);
            }
        });
        jMenu2.add(mnureplacect);

        mnuremovect.setText("Remove Current Task");
        mnuremovect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuremovectActionPerformed(evt);
            }
        });
        jMenu2.add(mnuremovect);

        mnurestorect.setText("Restore Current Task to Screen");
        mnurestorect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnurestorectActionPerformed(evt);
            }
        });
        jMenu2.add(mnurestorect);

        mnuclear.setText("Clear Screen");
        mnuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuclear);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Insert");

        mnubeforect.setText("Before Current Task");
        mnubeforect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnubeforectActionPerformed(evt);
            }
        });
        jMenu3.add(mnubeforect);

        mnuafterct.setText("After Current Task");
        mnuafterct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuafterctActionPerformed(evt);
            }
        });
        jMenu3.add(mnuafterct);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblctask, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbltottask, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnfirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnprev, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnlast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblctask, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(lbltottask, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfirst)
                    .addComponent(btnprev)
                    .addComponent(btnnext)
                    .addComponent(btnlast))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuafterctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuafterctActionPerformed
        String nm=txtname.getText();
        String d=txtdesc.getText();
        Task t= new Task(nm,d);
        if(t.validate()==false){
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
            return;
        }
        if(tottask>0) li.next();
        li.add(t);
        li.previous();
        curtask++;
        tottask++;
        lbltottask.setText(""+tottask);
        lblctask.setText(""+curtask);
        JOptionPane.showMessageDialog(this, "Task Added");
        
    }//GEN-LAST:event_mnuafterctActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        if(curtask==tottask)return;
        while(li.hasNext())
            li.next();
        t=li.previous();
        curtask=tottask;
        //udate display
        lblctask.setText(""+curtask);
        txtname.setText(t.getName());
        txtdesc.setText(t.getDesc());
        
    }//GEN-LAST:event_btnlastActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        if(curtask==tottask) return;
        curtask++;
        lblctask.setText(""+curtask);
        li.next();//passes over cur task
        li.next();//passes over next task
        t=li.previous();
        txtname.setText(t.getName());
        txtdesc.setText(t.getDesc());
        
    }//GEN-LAST:event_btnnextActionPerformed

    private void mnureplacectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnureplacectActionPerformed
        if(tottask==0){
            JOptionPane.showMessageDialog(this, "No task to replace this with, use Insert instead");
            return;
        }
        String nm=txtname.getText();
        String d=txtdesc.getText();
        Task t= new Task(nm,d);
        if(t.validate()==false){
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
            return;
        }
        li.next();
        li.set(t);
        li.previous();
    }//GEN-LAST:event_mnureplacectActionPerformed

    private void mnuremovectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuremovectActionPerformed
        if(tottask==0)return;
        //go over current task 
        li.next();
        //remove it
        li.remove();
        tottask--;
        lbltottask.setText(""+tottask);
        //if we have zero now, blank screen
        if (tottask==0){
            txtname.setText("");
            txtdesc.setText("");
            curtask=0;
            lblctask.setText("n/a");
            return;
        }
        //or go to previous task to show it
        else{
            t=li.previous();
            curtask--;
            lblctask.setText(""+curtask);
        }
        
        txtname.setText(t.getName());
        txtdesc.setText(t.getDesc());
    }//GEN-LAST:event_mnuremovectActionPerformed

    private void mnushowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnushowallActionPerformed
        String result="";
        for (int x=0; x<list.size(); x++){
            t=list.get(x);
            result+="TASK "+(x+1) +":\n"+t.toString()+"\n";
        }
            JOptionPane.showMessageDialog(this, result);
    }//GEN-LAST:event_mnushowallActionPerformed

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(1);
    }//GEN-LAST:event_mnuexitActionPerformed

    private void mnurestorectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnurestorectActionPerformed
       lblctask.setText(""+curtask);
       txtname.setText(t.getName());
       txtdesc.setText(t.getDesc());
       
    }//GEN-LAST:event_mnurestorectActionPerformed

    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        txtname.setText("");
        txtdesc.setText("");
        
    }//GEN-LAST:event_mnuclearActionPerformed

    private void mnubeforectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnubeforectActionPerformed
        String nm=txtname.getText();
        String d=txtdesc.getText();
        Task t= new Task(nm,d);
        if(t.validate()==false){
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
            return;
        }
        if(tottask==0){
            JOptionPane.showMessageDialog(this, "Error - Nothing to add it before");
            return;
        }
        li.add(t);
        li.previous();
        tottask++;
        lbltottask.setText(""+tottask);
        lblctask.setText(""+curtask);
        JOptionPane.showMessageDialog(this, "Task Added");
        
    }//GEN-LAST:event_mnubeforectActionPerformed
  
    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        
        //does not work
        if(curtask==1) return;
        curtask--;
        lblctask.setText(""+curtask);
        t=li.previous();
        txtname.setText(t.getName());
        txtdesc.setText(t.getDesc());
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        //Does not worl
        if(curtask==1)return;
        while(li.hasPrevious())
                t=li.previous();
         curtask=1;
        //udate display
        lblctask.setText(""+curtask);
        txtname.setText(t.getName());
        txtdesc.setText(t.getDesc());
    }//GEN-LAST:event_btnfirstActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblctask;
    private javax.swing.JLabel lbltottask;
    private javax.swing.JMenuItem mnuafterct;
    private javax.swing.JMenuItem mnubeforect;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnuremovect;
    private javax.swing.JMenuItem mnureplacect;
    private javax.swing.JMenuItem mnurestorect;
    private javax.swing.JMenuItem mnushowall;
    private javax.swing.JTextArea txtdesc;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
