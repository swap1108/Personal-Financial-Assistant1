/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log;
import log.login;
import java.util.Random;
import java.io.*;
import javax.swing.*;
import java.awt.event.WindowEvent;
/**
 *
 * @author Asus
 */
public class portfolio extends javax.swing.JFrame {
    String s;int a;char[] password;
    /**
     * Creates new form portfolio
     */
    public portfolio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inc = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        premium = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        netprop = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        corporate = new javax.swing.JLabel();
        label_icon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inc1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        corporate1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        turnover = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        surcharg = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 1000));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("We're pleased to help you!!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 120, 410, 54);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Re-confirm password:");
        JPasswordField pass = new JPasswordField(10);
        panel.add(label);
        panel.add(pass);
        String[] options = new String[]{"OK"};
        int option = JOptionPane.showOptionDialog(null, panel, "We count for your saftey!!",
            JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
            null, options, options[0]);
        if(option == 0) // pressing OK button
        {
            password = pass.getPassword();

        }
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText(" Welcome ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(345, 75, 132, 47);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log/exit.png"))); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(660, 770, 120, 47);

        jButton2.setText("Edit/Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(269, 774, 110, 40);

        int k=0;
        a=password.length;
        s=String.valueOf(password,0,a);
        try {
            FileReader reader = new FileReader("text1.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line,line1;

            while ((line=bufferedReader.readLine())!= null) {
                if(line.equals(s))
                {k=1;break;}}
            if(k==0)
            JOptionPane.showMessageDialog(null,"Password do not match. Login agian","We could not risk your privacy!!",JOptionPane.ERROR_MESSAGE);
            line1=bufferedReader.readLine();
            int wh=line1.indexOf(" ");
            line1=line1.substring(0,wh);
            jLabel4.setText(line1);
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(495, 75, 176, 47);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Your  corporate turnover");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 700, 190, 30);

        a=password.length;
        s=String.valueOf(password,0,a);
        try {
            FileReader reader = new FileReader("text1.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line,line1;

            while ((line=bufferedReader.readLine())!= null) {
                if(line.equals(s))
                {break;}}
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            inc.setText(line1);
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        inc.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        inc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(inc);
        inc.setBounds(280, 290, 200, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Annual Premium to pay");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 340, 177, 40);

        a=password.length;
        s=String.valueOf(password,0,a);
        try {
            FileReader reader = new FileReader("text1.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line,line1;

            while ((line=bufferedReader.readLine())!= null) {
                if(line.equals(s))
                {break;}}
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();

            premium.setText(line1);
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        premium.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        premium.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        premium.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(premium);
        premium.setBounds(280, 350, 200, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Properties you own");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 410, 177, 29);

        jScrollPane1.setFocusable(false);

        a=password.length;
        s=String.valueOf(password,0,a);
        try {
            FileReader reader = new FileReader("text1.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line,line1;

            while ((line=bufferedReader.readLine())!= null) {
                if(line.equals(s))
                {break;}}
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();jTextArea1.append(line1);
            while ((line=bufferedReader.readLine()).equals("endofproperty")==false) {
                jTextArea1.append("\n"+line);}
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 420, 390, 100);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Your Annual Income");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 285, 180, 30);

        a=password.length;
        s=String.valueOf(password,0,a);
        try {
            FileReader reader = new FileReader("text1.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line,line1;

            while ((line=bufferedReader.readLine())!= null) {
                if(line.equals(s))
                {break;}}
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            while ((line=bufferedReader.readLine()).equals("endofproperty")==false) {
            }line1=bufferedReader.readLine();
            netprop.setText(line1);
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        netprop.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        netprop.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        netprop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(netprop);
        netprop.setBounds(280, 560, 200, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Your net property worth");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 560, 190, 30);

        a=password.length;
        s=String.valueOf(password,0,a);
        try {
            FileReader reader = new FileReader("text1.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line,line1;

            while ((line=bufferedReader.readLine())!= null) {
                if(line.equals(s))
                {break;}}
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            while ((line=bufferedReader.readLine()).equals("endofproperty")==false) {
            }line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            corporate.setText(line1);
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        corporate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        corporate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        corporate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(corporate);
        corporate.setBounds(280, 630, 200, 30);

        label_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log/pa 1 - Copy.png"))); // NOI18N
        getContentPane().add(label_icon);
        label_icon.setBounds(70, 30, 204, 207);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log/imp.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(940, 250, 100, 100);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Turnover Sucharge*");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(790, 510, 140, 30);

        a=password.length;
        s=String.valueOf(password,0,a);
        try {
            FileReader reader = new FileReader("text1.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line,line1;double it;

            while ((line=bufferedReader.readLine())!= null) {
                if(line.equals(s))
                {break;}}
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            int inc=Integer.parseInt(line1);
            if(inc<=250000)
            it=0;
            else if(inc<=500000)
            it=(inc-250000)*0.05;
            else if(inc<=1000000)
            it=(inc-500000)*.20 +(250000*.05);
            else 
            it=((inc-1000000)*0.30)+(500000*.20)+(250000*.05);
            inc1.setText(String.valueOf(it));
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        inc1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        inc1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inc1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(inc1);
        inc1.setBounds(950, 380, 190, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Annual Income Tax ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(780, 380, 150, 30);

        a=password.length;
        s=String.valueOf(password,0,a);
        try {
            FileReader reader = new FileReader("text1.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line,line1;double ct,surcharge;

            while ((line=bufferedReader.readLine())!= null) {
                if(line.equals(s))
                {break;}}
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            while ((line=bufferedReader.readLine()).equals("endofproperty")==false) {
            }line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();int inc=Integer.parseInt(line1);
            line1=bufferedReader.readLine();int to=Integer.parseInt(line1);
            ct=0.25*inc;
            corporate1.setText(String.valueOf(ct));
            if(to>=10000000)              
            surcharge=.05*to;
            else
            surcharge=0;
            surcharg.setText(String.valueOf(surcharge));

            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        corporate1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        corporate1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        corporate1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(corporate1);
        corporate1.setBounds(950, 450, 190, 30);

        a=password.length;
        s=String.valueOf(password,0,a);
        try {
            FileReader reader = new FileReader("text1.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line,line1;

            while ((line=bufferedReader.readLine())!= null) {
                if(line.equals(s))
                {break;}}
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine(); 
            jLabel13.setText(line1);
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(1000, 40, 210, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Your  corporate income");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 630, 190, 30);

        a=password.length;
        s=String.valueOf(password,0,a);
        try {
            FileReader reader = new FileReader("text1.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line,line1;

            while ((line=bufferedReader.readLine())!= null) {
                if(line.equals(s))
                {break;}}
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            while ((line=bufferedReader.readLine()).equals("endofproperty")==false) {
            }line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            line1=bufferedReader.readLine();
            turnover.setText(line1);
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        turnover.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        turnover.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        turnover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(turnover);
        turnover.setBounds(280, 700, 200, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setText("Corporate Tax*");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(790, 450, 140, 30);

        surcharg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        surcharg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(surcharg);
        surcharg.setBounds(950, 510, 190, 30);

        jLabel15.setText("* accordance with corporate tax in india @www.bankbaazar.com");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(830, 710, 390, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        {this.setVisible(false);
            login s=new login();
            s.setVisible(true);}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        update s2=new update();
        s2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(portfolio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(portfolio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(portfolio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(portfolio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new portfolio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel corporate;
    private javax.swing.JLabel corporate1;
    private javax.swing.JLabel inc;
    private javax.swing.JLabel inc1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel label_icon;
    private javax.swing.JLabel netprop;
    private javax.swing.JLabel premium;
    private javax.swing.JLabel surcharg;
    private javax.swing.JLabel turnover;
    // End of variables declaration//GEN-END:variables
}
