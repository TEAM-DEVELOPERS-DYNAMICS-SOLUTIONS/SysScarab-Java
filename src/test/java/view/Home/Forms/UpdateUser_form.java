/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.Home.Forms;

import controller.db.StatementDbSQL;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import view.textPrompt.TextPrompt;

/**
 *
 * @author RODX
 */
public class UpdateUser_form extends javax.swing.JFrame {
    
    //<editor-fold defaultstate="colapsed" desc="* Variables">
    protected StatementDbSQL newStatement = new StatementDbSQL();
    protected String ruta;
    protected boolean AuthVerify = newStatement.getAuthVerify();
    //</editor-fold>

    //<editor-fold defaultstate="colapsed" desc="** Methods">
    public UpdateUser_form() {
        if (AuthVerify) {
            initComponents();
            this.setLocationRelativeTo(null);

            //PlaceHolders
            TextPrompt PlaceholderId = new TextPrompt("Id/Identidicacion", jTextField_IdEmployees);
            TextPrompt PlaceholderName = new TextPrompt("Nombres Completos", jTextField_nameEmployees);
            TextPrompt PlaceholderLastName = new TextPrompt("Apellidos Completos", jTextField_LastNameEmployees);
            TextPrompt PlaceholderEmail = new TextPrompt("correo@dominio.com", jTextField_EmailEmployees);
            TextPrompt PlaceholderPassword = new TextPrompt("contraseña", jTextField_PassEmployees);
            TextPrompt PlaceholderAddress = new TextPrompt("cra 0 # 0 - null Complemento, Departamento, Ciudad", jTextField_AddressEmployees);
            TextPrompt PlaceholderPhone = new TextPrompt("3103103131", jTextField_PhoneEmployees);

            //Items ComboBoxs
            //Gender
            jComboBox_GenderEmployees.removeAllItems();
            jComboBox_GenderEmployees.addItem("M");
            jComboBox_GenderEmployees.addItem("F");
            jComboBox_GenderEmployees.addItem("I");
        } else {
            JOptionPane.showMessageDialog(null, "Accion no permitida: Usuario no loggeado");
            System.exit(0);
        }
    }

    private byte[] convertImage() {
        File image = new File(ruta);

        try {
            byte[] icon = new byte[(int) image.length()];
            InputStream input = new FileInputStream(image);
            input.read(icon);
            return icon;
        } catch (Exception e) {
            return null;
        }
    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrimaryPanel_FormRegisterUser = new javax.swing.JPanel();
        jPanel_registerEmployees = new javax.swing.JPanel();
        jLabel_Exit = new javax.swing.JLabel();
        jLabel_TitlePanelRE = new javax.swing.JLabel();
        jPanel_TextFieldsForm = new javax.swing.JPanel();
        jLabel_TFIdEmployees = new javax.swing.JLabel();
        jTextField_IdEmployees = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_TFNameEmployees = new javax.swing.JLabel();
        jTextField_nameEmployees = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel_TFLastNameEmployees = new javax.swing.JLabel();
        jTextField_LastNameEmployees = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel_TFEmailEmployees = new javax.swing.JLabel();
        jTextField_EmailEmployees = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel_TFPassEmployees = new javax.swing.JLabel();
        jTextField_PassEmployees = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel_TFAddressEmployees = new javax.swing.JLabel();
        jTextField_AddressEmployees = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel_TFPhoneEmployees = new javax.swing.JLabel();
        jTextField_PhoneEmployees = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel_TFSAEmployees1 = new javax.swing.JLabel();
        jComboBox_GenderEmployees = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel_PerfilEmployees = new javax.swing.JLabel();
        jLabel_ButtonSelectImageEmployees = new javax.swing.JLabel();
        jLabel_imageLoadEmployees = new javax.swing.JLabel();
        jLabel_ButtonSaveDataEmployees = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setUndecorated(true);

        jPanel_registerEmployees.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_registerEmployees.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel_registerEmployees.setForeground(java.awt.Color.darkGray);

        jLabel_Exit.setText("X");
        jLabel_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ExitMouseClicked(evt);
            }
        });

        jLabel_TitlePanelRE.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel_TitlePanelRE.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_TitlePanelRE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TitlePanelRE.setText("Actualizacion Empleados");

        jPanel_TextFieldsForm.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_TFIdEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFIdEmployees.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFIdEmployees.setText("Id");

        jTextField_IdEmployees.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_IdEmployees.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFNameEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFNameEmployees.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFNameEmployees.setText("Nombre");

        jTextField_nameEmployees.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_nameEmployees.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFLastNameEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFLastNameEmployees.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFLastNameEmployees.setText("Apellidos");

        jTextField_LastNameEmployees.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_LastNameEmployees.setBorder(null);

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFEmailEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFEmailEmployees.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFEmailEmployees.setText("Correo");

        jTextField_EmailEmployees.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_EmailEmployees.setBorder(null);

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFPassEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFPassEmployees.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFPassEmployees.setText("Contraseña");

        jTextField_PassEmployees.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_PassEmployees.setBorder(null);

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFAddressEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFAddressEmployees.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFAddressEmployees.setText("Direccion");

        jTextField_AddressEmployees.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_AddressEmployees.setBorder(null);

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFPhoneEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFPhoneEmployees.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFPhoneEmployees.setText("Telefono");

        jTextField_PhoneEmployees.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_PhoneEmployees.setBorder(null);

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFSAEmployees1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFSAEmployees1.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFSAEmployees1.setText("Genero");

        jComboBox_GenderEmployees.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel_TextFieldsFormLayout = new javax.swing.GroupLayout(jPanel_TextFieldsForm);
        jPanel_TextFieldsForm.setLayout(jPanel_TextFieldsFormLayout);
        jPanel_TextFieldsFormLayout.setHorizontalGroup(
            jPanel_TextFieldsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TextFieldsFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TextFieldsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_TextFieldsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TextFieldsFormLayout.createSequentialGroup()
                            .addGroup(jPanel_TextFieldsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_TextFieldsFormLayout.createSequentialGroup()
                                    .addComponent(jLabel_TFEmailEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_EmailEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_TextFieldsFormLayout.createSequentialGroup()
                                    .addGroup(jPanel_TextFieldsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_TFNameEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_TFIdEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel_TextFieldsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_IdEmployees, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_nameEmployees, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel_TextFieldsFormLayout.createSequentialGroup()
                                    .addComponent(jLabel_TFPassEmployees)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_PassEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_TextFieldsFormLayout.createSequentialGroup()
                                    .addComponent(jLabel_TFPhoneEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_PhoneEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_TextFieldsFormLayout.createSequentialGroup()
                                    .addComponent(jLabel_TFAddressEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_AddressEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_TextFieldsFormLayout.createSequentialGroup()
                                    .addComponent(jLabel_TFLastNameEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_LastNameEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator2)
                                .addComponent(jSeparator3)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(1, 1, 1)))
                    .addGroup(jPanel_TextFieldsFormLayout.createSequentialGroup()
                        .addComponent(jLabel_TFSAEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_GenderEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel_TextFieldsFormLayout.setVerticalGroup(
            jPanel_TextFieldsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TextFieldsFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TextFieldsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_IdEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TFIdEmployees))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel_TextFieldsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nameEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TFNameEmployees))
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel_TextFieldsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_LastNameEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TFLastNameEmployees))
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel_TextFieldsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_EmailEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TFEmailEmployees))
                .addGap(1, 1, 1)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel_TextFieldsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_PassEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TFPassEmployees))
                .addGap(1, 1, 1)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel_TextFieldsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_AddressEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TFAddressEmployees))
                .addGap(1, 1, 1)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel_TextFieldsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_PhoneEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TFPhoneEmployees))
                .addGap(1, 1, 1)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel_TextFieldsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_TFSAEmployees1)
                    .addComponent(jComboBox_GenderEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_PerfilEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_PerfilEmployees.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_PerfilEmployees.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_PerfilEmployees.setText("Perfil");

        jLabel_ButtonSelectImageEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_ButtonSelectImageEmployees.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_ButtonSelectImageEmployees.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ButtonSelectImageEmployees.setText("seleccionar");
        jLabel_ButtonSelectImageEmployees.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel_ButtonSelectImageEmployees.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ButtonSelectImageEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ButtonSelectImageEmployeesMouseClicked(evt);
            }
        });

        jLabel_imageLoadEmployees.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_imageLoadEmployees.setText("No Image");
        jLabel_imageLoadEmployees.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_imageLoadEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_PerfilEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel_ButtonSelectImageEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_PerfilEmployees)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_ButtonSelectImageEmployees)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_imageLoadEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jLabel_ButtonSaveDataEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_ButtonSaveDataEmployees.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_ButtonSaveDataEmployees.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ButtonSaveDataEmployees.setText("Registrar");
        jLabel_ButtonSaveDataEmployees.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel_ButtonSaveDataEmployees.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ButtonSaveDataEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ButtonSaveDataEmployeesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_registerEmployeesLayout = new javax.swing.GroupLayout(jPanel_registerEmployees);
        jPanel_registerEmployees.setLayout(jPanel_registerEmployeesLayout);
        jPanel_registerEmployeesLayout.setHorizontalGroup(
            jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registerEmployeesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_TitlePanelRE, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel_Exit)
                .addContainerGap())
            .addGroup(jPanel_registerEmployeesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_TextFieldsForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_registerEmployeesLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel_ButtonSaveDataEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_registerEmployeesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel_registerEmployeesLayout.setVerticalGroup(
            jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_registerEmployeesLayout.createSequentialGroup()
                .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_registerEmployeesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel_TitlePanelRE))
                    .addGroup(jPanel_registerEmployeesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_Exit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registerEmployeesLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_ButtonSaveDataEmployees)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel_registerEmployeesLayout.createSequentialGroup()
                        .addComponent(jPanel_TextFieldsForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );

        javax.swing.GroupLayout PrimaryPanel_FormRegisterUserLayout = new javax.swing.GroupLayout(PrimaryPanel_FormRegisterUser);
        PrimaryPanel_FormRegisterUser.setLayout(PrimaryPanel_FormRegisterUserLayout);
        PrimaryPanel_FormRegisterUserLayout.setHorizontalGroup(
            PrimaryPanel_FormRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrimaryPanel_FormRegisterUserLayout.createSequentialGroup()
                .addComponent(jPanel_registerEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PrimaryPanel_FormRegisterUserLayout.setVerticalGroup(
            PrimaryPanel_FormRegisterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_registerEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrimaryPanel_FormRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrimaryPanel_FormRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="colapsed" desc="Event">
    private void jLabel_ButtonSelectImageEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ButtonSelectImageEmployeesMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("jpg, png & gif", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(extensionFilter);
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            ruta = fileChooser.getSelectedFile().getAbsolutePath();
            Image fcImages = new ImageIcon(ruta).getImage();
            ImageIcon iIcFCImage = new ImageIcon(fcImages.getScaledInstance(jLabel_imageLoadEmployees.getWidth(), jLabel_imageLoadEmployees.getHeight(), 0));
            jLabel_imageLoadEmployees.setIcon(iIcFCImage);
            jLabel_imageLoadEmployees.setText("");
        }
    }//GEN-LAST:event_jLabel_ButtonSelectImageEmployeesMouseClicked

    private void jLabel_ButtonSaveDataEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ButtonSaveDataEmployeesMouseClicked
        String Id = jTextField_IdEmployees.getText(), Name = jTextField_nameEmployees.getText(), LastName = jTextField_LastNameEmployees.getText(), Email = jTextField_EmailEmployees.getText(), Password = jTextField_PassEmployees.getText(), Phone = jTextField_PhoneEmployees.getText(), Address = jTextField_AddressEmployees.getText();
        
        String sha1 = "";
        
	try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
	    digest.reset();
	    digest.update(Password.getBytes("utf8"));
	    sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
	} catch (Exception e){
	    e.printStackTrace();
	}
        
        Password = sha1;
        
        byte[] image = convertImage();
        
        Object Gender = (String) jComboBox_GenderEmployees.getSelectedItem();
        
        newStatement.GenerateStatement_UpdateEmployees(image, Name, LastName, Email, Password, Address, Phone, Gender, Integer.parseInt(Id));
        JOptionPane.showMessageDialog(null, "Usuario Actualiazdo");
        setVisible(false);
    }//GEN-LAST:event_jLabel_ButtonSaveDataEmployeesMouseClicked

    private void jLabel_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ExitMouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel_ExitMouseClicked

    //</editor-fold>
    
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
            java.util.logging.Logger.getLogger(UpdateUser_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUser_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUser_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUser_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUser_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PrimaryPanel_FormRegisterUser;
    private javax.swing.JComboBox<String> jComboBox_GenderEmployees;
    private javax.swing.JLabel jLabel_ButtonSaveDataEmployees;
    private javax.swing.JLabel jLabel_ButtonSelectImageEmployees;
    private javax.swing.JLabel jLabel_Exit;
    private javax.swing.JLabel jLabel_PerfilEmployees;
    private javax.swing.JLabel jLabel_TFAddressEmployees;
    private javax.swing.JLabel jLabel_TFEmailEmployees;
    private javax.swing.JLabel jLabel_TFIdEmployees;
    private javax.swing.JLabel jLabel_TFLastNameEmployees;
    private javax.swing.JLabel jLabel_TFNameEmployees;
    private javax.swing.JLabel jLabel_TFPassEmployees;
    private javax.swing.JLabel jLabel_TFPhoneEmployees;
    private javax.swing.JLabel jLabel_TFSAEmployees1;
    private javax.swing.JLabel jLabel_TitlePanelRE;
    private javax.swing.JLabel jLabel_imageLoadEmployees;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_TextFieldsForm;
    private javax.swing.JPanel jPanel_registerEmployees;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField_AddressEmployees;
    private javax.swing.JTextField jTextField_EmailEmployees;
    private javax.swing.JTextField jTextField_IdEmployees;
    private javax.swing.JTextField jTextField_LastNameEmployees;
    private javax.swing.JTextField jTextField_PassEmployees;
    private javax.swing.JTextField jTextField_PhoneEmployees;
    private javax.swing.JTextField jTextField_nameEmployees;
    // End of variables declaration//GEN-END:variables
}
