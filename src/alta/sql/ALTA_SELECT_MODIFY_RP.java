  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package alta.sql;

import alta.sql.CP_GENERAL.ALTASQL;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LCE X - XX
 */
public class ALTA_SELECT_MODIFY_RP extends javax.swing.JFrame {
  public static String usuario;

    public ALTA_SELECT_MODIFY_RP(String usuario) {
        ALTA_SELECT_MODIFY_RP.usuario = usuario; 
        initComponents();
    }
    /**
     * Creates new form ObjetosANDreportes
     */
    
    //"INSERT INTO op (ID_OP, NAME_OP, DESC_OP, LUGAR_OP, EST_OP) VALUES (?, ?, ?, ?, ?)";
    public ALTA_SELECT_MODIFY_RP() {
        initComponents();
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
////    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        NOM1 = new javax.swing.JTextField();
        DES1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        login = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        CB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Reporte perdida");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 160, 50));

        ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IDMouseExited(evt);
            }
        });
        ID.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                IDInputMethodTextChanged(evt);
            }
        });
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDKeyTyped(evt);
            }
        });
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 180, -1));

        NOM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOM1ActionPerformed(evt);
            }
        });
        getContentPane().add(NOM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 180, -1));

        DES1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DES1ActionPerformed(evt);
            }
        });
        getContentPane().add(DES1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 180, 50));

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 90, -1));

        jLabel5.setText("USERNAME PUBLICANTE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, 20));

        jLabel6.setText("Descripcion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 70, 20));

        jLabel9.setText("ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("X");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(612, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 60));

        jButton3.setText("ENVIAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 79, -1));

        jLabel1.setText("INICIAR SESION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, 30));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 290, 40));

        jButton2.setText("INICIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 290, 40));

        jButton4.setText("REGISTRARTE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        jButton5.setText("VER DATOS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Encontrado", "Perdido" }));
        CB.setSelectedIndex(1);
        getContentPane().add(CB, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DES1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DES1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DES1ActionPerformed

private void select2(){
     ResultSet rs = null;
    PreparedStatement ps = null;  
    Connection cn = null;
 try {
        String where = NOM1.getText();
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/cosasperdidas", "root", "");

        String sql = "SELECT ID_RP, USER_ID_RP, DESC_RP, FOUND FROM rp WHERE USER_ID_RP = ?";
        
        ps = cn.prepareStatement(sql);
        ps.setString(1, where);  
        
        rs = ps.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("ID_RP");
            String Nombre = rs.getString("USER_ID_RP");
            String Descripcion = rs.getString("DESC_RP");
            String state= rs.getString("FOUND");
             
              ID.setText(String.valueOf(id));
              DES1.setText(Descripcion);
               if (state != null) {
    CB.setSelectedItem(state);  
}
        }
        

      

    } catch (SQLException | ClassNotFoundException ex) {
     System.out.println(ex.getMessage());
        ex.printStackTrace();
    } catch (NumberFormatException ex) {
      
        ex.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (cn != null) cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
private void select(){
     ResultSet rs = null;
    PreparedStatement ps = null;  
    Connection cn = null;
 try {
        int where = Integer.parseInt(ID.getText()); 
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/cosasperdidas", "root", "");

        String sql = "SELECT ID_RP, USER_ID_RP, DESC_RP, FOUND FROM rp WHERE ID_RP=?";
        
        ps = cn.prepareStatement(sql);
        ps.setInt(1, where);  
        
        rs = ps.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("ID_RP");
            String Nombre = rs.getString("USER_ID_RP");
            String Descripcion = rs.getString("DESC_RP");
            String state= rs.getString("FOUND");
            
              NOM1.setText(Nombre);
              DES1.setText(Descripcion);
              if (state != null) {
    CB.setSelectedItem(state);  
}
        }
        

      

    } catch (SQLException | ClassNotFoundException ex) {
     System.out.println(ex.getMessage());
        ex.printStackTrace();
    } catch (NumberFormatException ex) {
      
        ex.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (cn != null) cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
private void checko(){
    String VopNM = NOM1.getText();
    String VopDC = DES1.getText();
    
     if (VopNM.isEmpty() || VopDC.isEmpty() ) {
        JOptionPane.showMessageDialog(null,"Por favor, completa todos los campos.");
    } else {
        update();
    }
}
private void checki(){
    String VopNM = NOM1.getText();
    String VopDC = DES1.getText();
    
     if (VopDC.isEmpty() ) {
        JOptionPane.showMessageDialog(null,"Por favor, completa todos los campos.");
    } else {
        guardar();
    }
}
private void update() {
    ResultSet rs = null;
    PreparedStatement ps = null;  
    Connection cn = null;
   String VopST = CB.getSelectedItem().toString();
    String VopNM = NOM1.getText();  
    String VopDC = DES1.getText();
   
    try {
       
        int where = Integer.parseInt(ID.getText());  
        
       
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/cosasperdidas", "root", "");

        String sql = "UPDATE rp SET DESC_RP = ?, FOUND = ? WHERE ID_RP = ?";
        
        
        ps = cn.prepareStatement(sql);   
        ps.setString(1, VopDC);   
        ps.setString(2, VopST);  
        ps.setInt(3, where);       
        
        int rowsUpdated = ps.executeUpdate();
        
        if (rowsUpdated > 0) {
            System.out.println("Actualizado con éxito");
        }
    } catch (SQLException | ClassNotFoundException ex) {
        System.out.println(ex.getMessage());
        ex.printStackTrace();
    } catch (NumberFormatException ex) {
        ex.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (cn != null) cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}



    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
        select();
      
    }//GEN-LAST:event_IDActionPerformed
 private void guardar() {
    String VopNM = usuario; 
    System.out.println(VopNM);
    String VopDC = DES1.getText(); 
    System.out.println(VopDC);
    String VopST = CB.getSelectedItem().toString();
   

    Connection cn = null;
    PreparedStatement pst = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/cosasperdidas", "root", "");
        System.out.println("Conectado");

        String query = "INSERT INTO rp (USER_ID_RP, DESC_RP, FOUND) VALUES  (?, ?, ?)";
        pst = cn.prepareStatement(query);

        pst.setString(1,VopNM); 
        pst.setString(2, VopDC);   
        pst.setString(3, VopST);  

        System.out.println(pst);
        pst.executeUpdate();
JOptionPane.showMessageDialog(null, "GUARDADO CON EL USERNAME DE: "+ usuario);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ALTASQL.class.getName()).log(Level.SEVERE, "Error al cargar el driver", ex);
    } catch (SQLException ex) {
        Logger.getLogger(ALTASQL.class.getName()).log(Level.SEVERE, "Error en la base de datos", ex);
    } finally {
        try {
            if (pst != null) pst.close();
            if (cn != null) cn.close();
        } catch (SQLException e) {
            Logger.getLogger(ALTASQL.class.getName()).log(Level.SEVERE, "Error al cerrar recursos", e);
        }
    }
}

  

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      
      checko();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NOM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOM1ActionPerformed
        // TODO add your handling code here:
        select2();
    }//GEN-LAST:event_NOM1ActionPerformed

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
checki();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void IDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDMouseExited
    

    }//GEN-LAST:event_IDMouseExited

    private void IDInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_IDInputMethodTextChanged
        // TODO add your handling code here:
    select();
    }//GEN-LAST:event_IDInputMethodTextChanged

    private void IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDKeyTyped
        // TODO add your handling code here:
   
    }//GEN-LAST:event_IDKeyTyped
private boolean autenticarUsuario(String usuario, String contrasena) {
    Connection cn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        cn = DriverManager.getConnection("jdbc:mysql://localhost/cosasperdidas", "root", "");
        System.out.println("Conectado");

        String query = "SELECT * FROM us WHERE nom_us = ? AND pass_us = ?";
        pst = cn.prepareStatement(query);

        pst.setString(1, usuario);
        pst.setString(2, contrasena);

        rs = pst.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(null,"Autenticación exitosa");
            return true; 
        } else {
            JOptionPane.showMessageDialog(null,"Datos incorrectos");
            return false; 
        }

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ALTA_SELECT_MODIFY_RP.class.getName()).log(Level.SEVERE, "Error al cargar el driver", ex);
        return false;
    } catch (SQLException ex) {
        Logger.getLogger(ALTA_SELECT_MODIFY_RP.class.getName()).log(Level.SEVERE, "Error en la base de datos", ex);
        return false;
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (cn != null) cn.close();
        } catch (SQLException e) {
            Logger.getLogger(ALTA_SELECT_MODIFY_RP.class.getName()).log(Level.SEVERE, "Error al cerrar recursos", e);
        }
    }
}
 
      REGISTER reg = new REGISTER();
private String obtenerUsuarioAutenticado(String usuario, String contrasena) {
    Connection cn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/cosasperdidas", "root", "");
        System.out.println("Conectado");
        String query = "SELECT nom_us FROM us WHERE nom_us = ? AND pass_us = ?";
        pst = cn.prepareStatement(query);
        pst.setString(1, usuario);
        pst.setString(2, contrasena);

        rs = pst.executeQuery();
        if (rs.next()) {
            return rs.getString("nom_us"); 
        } else {
            return null; 
        }

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ALTA_SELECT_MODIFY_RP.class.getName()).log(Level.SEVERE, "Error al cargar el driver", ex);
        return null;
    } catch (SQLException ex) {
        Logger.getLogger(ALTA_SELECT_MODIFY_RP.class.getName()).log(Level.SEVERE, "Error en la base de datos", ex);
        return null;
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (cn != null) cn.close();
        } catch (SQLException e) {
            Logger.getLogger(ALTA_SELECT_MODIFY_RP.class.getName()).log(Level.SEVERE, "Error al cerrar recursos", e);
        }
    }
}
private void yainicio(){
if (usuario == null || usuario.trim().isEmpty()) {
        cachito();
    }else{
JOptionPane.showMessageDialog(null, "Ya ha iniciado sesion");
}
}
private void cachito(){
  String VusUSER = username.getText();              
    String VusPASS = String.valueOf(login.getPassword());  
    if (autenticarUsuario(VusUSER, VusPASS)) {
         usuario = obtenerUsuarioAutenticado(VusUSER, VusPASS);
        if (usuario != null) {
            JOptionPane.showMessageDialog(null,"Bienvenido, " + usuario);
        }
    } else {
        JOptionPane.showMessageDialog(null,"Error: Usuario o contraseña incorrectos");
    
}
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       yainicio();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        reg.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
CONSULTA_REPORTEPERDIDA cons = new CONSULTA_REPORTEPERDIDA();
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          CONSULTA_REPORTEPERDIDA cons = new CONSULTA_REPORTEPERDIDA();  
        cons.setVisible(true);  
        cons.mostrarUsuarioAutenticado(usuario);
    }//GEN-LAST:event_jButton5ActionPerformed
int xMouse, yMouse;
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
            java.util.logging.Logger.getLogger(ALTA_SELECT_MODIFY_RP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ALTA_SELECT_MODIFY_RP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ALTA_SELECT_MODIFY_RP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ALTA_SELECT_MODIFY_RP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ALTA_SELECT_MODIFY_RP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB;
    private javax.swing.JTextField DES1;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField NOM1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField login;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
