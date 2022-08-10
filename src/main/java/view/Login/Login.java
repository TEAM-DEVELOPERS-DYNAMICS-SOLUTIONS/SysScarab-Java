package view.Login;

import controller.user.authenticationUser.AuthenticationUser;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import view.Home.Home;
import view.textPrompt.TextPrompt;

/**
 *
 * @author RODX
 */
public class Login extends javax.swing.JFrame {

    protected int AxisX, AxisY, AxisXScreen, AxisYScreen;
    protected static String Pass, Email;
    protected boolean AuthVerify;
    AuthenticationUser newAuthentication = new AuthenticationUser();

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextPrompt Placeholder = new TextPrompt("correo@dominio.com", jTextField_User);
        setShape(new RoundRectangle2D.Double(0, 0, getBounds().width, getBounds().height, 27, 27));
    }

    public String getPass() {
        String Password = "";
        if (AuthVerify) {
            Password = Login.Pass;
        }
        return Password;
    }

    public String getEmail() {
        String Email = "";
        if (AuthVerify) {
            Email = Login.Pass;
        }
        return Email;
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images\\Icons\\1x\\IsoT\\IconBase-Default.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrimaryPanel_login = new javax.swing.JPanel();
        jLabel_AlertErrAuth = new javax.swing.JLabel();
        jLabel_DragArea = new javax.swing.JLabel();
        jLabel_Minimize = new javax.swing.JLabel();
        jLabel_Close = new javax.swing.JLabel();
        JLabel_BackgroudImage = new javax.swing.JLabel();
        jLabel_Description = new javax.swing.JLabel();
        JLabel_TitleWindow = new javax.swing.JLabel();
        JLabel_User = new javax.swing.JLabel();
        jTextField_User = new javax.swing.JTextField();
        jSeparator_User = new javax.swing.JSeparator();
        JLabel_Password = new javax.swing.JLabel();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jSeparator_Password = new javax.swing.JSeparator();
        jButton_SignIn = new javax.swing.JButton();
        jLabel_BackgorundPrimary = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        PrimaryPanel_login.setBackground(new java.awt.Color(102, 102, 102));
        PrimaryPanel_login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PrimaryPanel_login.setDoubleBuffered(false);
        PrimaryPanel_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_AlertErrAuth.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel_AlertErrAuth.setForeground(new java.awt.Color(255, 255, 255));
        PrimaryPanel_login.add(jLabel_AlertErrAuth, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        jLabel_DragArea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel_DragAreaMouseDragged(evt);
            }
        });
        jLabel_DragArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_DragAreaMousePressed(evt);
            }
        });
        PrimaryPanel_login.add(jLabel_DragArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 20));

        jLabel_Minimize.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_Minimize.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Minimize.setText("-");
        jLabel_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseClicked(evt);
            }
        });
        PrimaryPanel_login.add(jLabel_Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 10, 20));

        jLabel_Close.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Close.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Close.setText("X");
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseExited(evt);
            }
        });
        PrimaryPanel_login.add(jLabel_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, -1, 20));

        JLabel_BackgroudImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel_BackgroudImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background/pexels-thisisengineering-3861976 (Medium).png"))); // NOI18N
        PrimaryPanel_login.add(JLabel_BackgroudImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 380, 500));

        jLabel_Description.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel_Description.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_Description.setText("SCARAB System Management");
        PrimaryPanel_login.add(jLabel_Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 200, 20));

        JLabel_TitleWindow.setFont(new java.awt.Font("Bebas Neue Book", 1, 36)); // NOI18N
        JLabel_TitleWindow.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_TitleWindow.setText("Inicia Sesión");
        PrimaryPanel_login.add(JLabel_TitleWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, 60));

        JLabel_User.setFont(new java.awt.Font("Roboto Light", 2, 14)); // NOI18N
        JLabel_User.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_User.setLabelFor(jTextField_User);
        JLabel_User.setText("Usuario");
        PrimaryPanel_login.add(JLabel_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 20));

        jTextField_User.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_User.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_User.setToolTipText("");
        jTextField_User.setBorder(null);
        jTextField_User.setOpaque(true);
        PrimaryPanel_login.add(jTextField_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 340, -1));

        jSeparator_User.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator_User.setForeground(new java.awt.Color(204, 204, 204));
        PrimaryPanel_login.add(jSeparator_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 340, 10));

        JLabel_Password.setFont(new java.awt.Font("Roboto Light", 2, 14)); // NOI18N
        JLabel_Password.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_Password.setLabelFor(jPasswordField_Password);
        JLabel_Password.setText("Contraseña");
        JLabel_Password.setToolTipText("");
        PrimaryPanel_login.add(JLabel_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 20));

        jPasswordField_Password.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordField_Password.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField_Password.setBorder(null);
        jPasswordField_Password.setOpaque(true);
        PrimaryPanel_login.add(jPasswordField_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 340, -1));

        jSeparator_Password.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator_Password.setForeground(new java.awt.Color(204, 204, 204));
        PrimaryPanel_login.add(jSeparator_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 340, 10));

        jButton_SignIn.setBackground(new java.awt.Color(51, 51, 51));
        jButton_SignIn.setFont(new java.awt.Font("Bebas Neue Book", 0, 18)); // NOI18N
        jButton_SignIn.setForeground(new java.awt.Color(255, 255, 255));
        jButton_SignIn.setText("Iniciar");
        jButton_SignIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SignInActionPerformed(evt);
            }
        });
        PrimaryPanel_login.add(jButton_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, 30));

        jLabel_BackgorundPrimary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background/1x/BackgrondLogin.png"))); // NOI18N
        PrimaryPanel_login.add(jLabel_BackgorundPrimary, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrimaryPanel_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PrimaryPanel_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SignInActionPerformed
        Email = jTextField_User.getText();
        newAuthentication.setEmail(Email);

        Pass = jPasswordField_Password.getText();
        newAuthentication.setPass(Pass);
        newAuthentication.GetDataUser();

        AuthVerify = newAuthentication.GetAuthVerify();

        if (!AuthVerify) {
            jLabel_AlertErrAuth.setText("El Usuario y/o Contraseña son erroneos");
        } else {
            jLabel_AlertErrAuth.setText("");
            Home Home = new Home();
            Home.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton_SignInActionPerformed

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jLabel_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel_MinimizeMouseClicked

    private void jLabel_DragAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DragAreaMousePressed
        AxisY = evt.getY();
        AxisX = evt.getX();
    }//GEN-LAST:event_jLabel_DragAreaMousePressed

    private void jLabel_DragAreaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DragAreaMouseDragged
        AxisXScreen = evt.getXOnScreen();
        AxisYScreen = evt.getYOnScreen();
        this.setLocation(AxisXScreen - AxisX, AxisYScreen - AxisY);
    }//GEN-LAST:event_jLabel_DragAreaMouseDragged

    private void jLabel_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseEntered
        // TODO add your handling code here:
        jLabel_Close.setForeground(new java.awt.Color(235, 0, 0));
    }//GEN-LAST:event_jLabel_CloseMouseEntered

    private void jLabel_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseExited
        // TODO add your handling code here:
        jLabel_Close.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel_CloseMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel_BackgroudImage;
    private javax.swing.JLabel JLabel_Password;
    private javax.swing.JLabel JLabel_TitleWindow;
    private javax.swing.JLabel JLabel_User;
    private javax.swing.JPanel PrimaryPanel_login;
    private javax.swing.JButton jButton_SignIn;
    private javax.swing.JLabel jLabel_AlertErrAuth;
    private javax.swing.JLabel jLabel_BackgorundPrimary;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_Description;
    private javax.swing.JLabel jLabel_DragArea;
    private javax.swing.JLabel jLabel_Minimize;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JSeparator jSeparator_Password;
    private javax.swing.JSeparator jSeparator_User;
    private javax.swing.JTextField jTextField_User;
    // End of variables declaration//GEN-END:variables
}
