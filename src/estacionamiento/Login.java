package estacionamiento;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Dilan Grajales
 */
public class Login extends javax.swing.JFrame implements ActionListener{
    conexion conecc =new conexion();
    administrador admin=new administrador();
    registro regis = new registro();
    espacios esp=new espacios();
    
    String user1;
    String pass1;
    String user3;
    String pass3;
    int nivel = 0;
        
    public Login() {
        initComponents();
        this.setTitle("Login");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        entrarBtn.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        userEtq = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        passwordEtq = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        entrarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOGO.png"))); // NOI18N

        userEtq.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userEtq.setText("USER");

        userTxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });

        passwordEtq.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        passwordEtq.setText("PASSWORD");

        passwordTxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        passwordTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        entrarBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        entrarBtn.setText("ENTRAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(passwordEtq))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(userTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(entrarBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(userEtq))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(icon)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(icon)
                .addGap(18, 18, 18)
                .addComponent(userEtq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(passwordEtq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(entrarBtn)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Listener
        JButton presionBoton = (JButton) e.getSource();
        
        if (presionBoton == entrarBtn) {
            String texto1 = userTxt.getText();
            String texto2 = passwordTxt.getText();
            userTxt.setText(null);
            passwordTxt.setText(null);
            this.setVisible(false);
            
            try {
                consulta(texto1, texto2);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    
    }
    
    public void consulta(String x, String y) throws SQLException{
            switch(Autenticacion1(x, y))
            {
                case 1:
                    admin.setVisible(true);
                    this.setVisible(false);
                break;
                case 2:
                    esp.setVisible(true);
                    this.setVisible(false);
                break;
                case 3:
                    System.out.println("nivel 3");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS", "IMPORTANTE", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(true);
                break;
            }
    }
    
    public int Autenticacion1(String user2, String pass2) throws SQLException {
        try {
            conecc.conexion();
            Statement stmt = conecc.con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from usuarios");
            while (rs.next()) {
                if (user2.equals(rs.getString("usuario")) && pass2.equals(rs.getString("pass"))) {
                    nivel = rs.getInt("nivel");
                }
            }
            stmt.close();
            rs.close();
            conecc.con.close();
        } catch (Exception e) { System.out.println(e); }
        return nivel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrarBtn;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel passwordEtq;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JLabel userEtq;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}