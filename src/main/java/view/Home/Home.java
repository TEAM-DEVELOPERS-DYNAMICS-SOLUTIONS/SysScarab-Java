package view.Home;

import static javax.swing.UIManager.get;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import model.DataStored;
import model.ModAdmin.ModAdmin;
import view.RenderImageTable;
import controller.db.StatementDbSQL;
import controller.user.authenticationUser.AuthenticationUser;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author RODX
 */

public final class Home extends javax.swing.JFrame {
    
    /**
     * variables declarated from the class - RODX
     */
    public boolean StatusMaximize = false;
    public Dimension screenSizeMaximize = Toolkit.getDefaultToolkit().getScreenSize(), screenSizeMinimize;
    public Toolkit tK = Toolkit.getDefaultToolkit();
    
    protected int AxisX, AxisY, AxisXScreen, AxisYScreen;
    protected DefaultTableModel modelTable = new DefaultTableModel();
    protected StatementDbSQL StatementSQL = new StatementDbSQL();
    protected ModAdmin ModAdminActived = new ModAdmin();
    protected ArrayList ArLst_Users = ModAdminActived.ModAdmin_GetUsers();
    protected boolean AuthUser = new AuthenticationUser().getAuthVerify();
    DataStored DS = new DataStored();
    
    public Home() {
        initComponents();
        this.screenSizeMinimize = PrimaryPanel_Home.getPreferredSize();
        jPanel_WorkSpaceAdmin.setVisible(false);
        writeUserConnect();
    }
    
    /**
     * methods custom
     */
    
    @Override // this method change default icon for Custom Icon
    public Image getIconImage (){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images\\Icons\\1x\\IsoT\\IconBase-Default.png"));
        return retValue;
    }
    
    public void generateModelTableUser() {
        jTable_TableAdminSQL.getModel();
        jTable_TableAdminSQL.setModel(modelTable);
        modelTable.addColumn("ID");
        modelTable.addColumn("Perfil");
        modelTable.addColumn("Nombre");
        modelTable.addColumn("Apellido");
        modelTable.addColumn("Correo");
        modelTable.addColumn("Contraseña");
        modelTable.addColumn("Direccion");
        modelTable.addColumn("Telefono");
        modelTable.addColumn("StC");
        modelTable.addColumn("StA");
        modelTable.addColumn("Genero");
        
        jTable_TableAdminSQL.setRowHeight(50);
    
        //jTable_TableAdminSQL.
    }
     
    public void writeUserConnect () {
        jLabel_NameUser.setText(StatementSQL.getMapRSSQL().get("NameUser") + " " + StatementSQL.getMapRSSQL().get("LastNameUser"));
        jLabel_LevelAdmin.setText("Empleado");   
    }
        
    public void writeEmployeesDB ()  {
        CleanTable();
        generateModelTableUser();
        jTable_TableAdminSQL.setDefaultRenderer(Object.class, new RenderImageTable());
        
        if (AuthUser) {
            Object EmployeesData[] = new Object[11];
            ArLst_Users = StatementSQL.GenerateStatement_GetUsers();
            
            if (ArLst_Users != null) {
                for (int i = 0; i < ArLst_Users.size(); i++) {
                    DS = (DataStored) ArLst_Users.get(i);
                    
                    EmployeesData[0] = String.valueOf(DS.getIdEmployees());
                    EmployeesData[2] = String.valueOf(DS.getNameEmployees());
                    EmployeesData[3] = String.valueOf(DS.getLastNameEmployees());
                    EmployeesData[4] = String.valueOf(DS.getEmailEmployees());
                    EmployeesData[5] = String.valueOf(DS.getAddressEmployees());
                    EmployeesData[6] = String.valueOf(DS.getPhoneEmployees());
                    EmployeesData[7] = String.valueOf(DS.getStatusConnectionEmployees());
                    EmployeesData[8] = String.valueOf(DS.getStatusAdminEmployees());
                    EmployeesData[9] = String.valueOf(DS.getGenderEmployees());
                    
                    try{
                        byte [] imageEmployee = DS.getImageEmployees();
                        BufferedImage BFImage = null;
                        InputStream IS = new ByteArrayInputStream(imageEmployee);
                        BFImage = ImageIO.read(IS);
                        ImageIcon Icon = new ImageIcon(BFImage.getScaledInstance(50, 50, 0));
                        
                        EmployeesData[1] = new JLabel(Icon);
                     }catch(Exception e){
                        EmployeesData[1] = new JLabel("No existe Imagen");
                    };
                    
                    modelTable.addColumn(EmployeesData);
                }
            
                jTable_TableAdminSQL.setModel(modelTable);
            }   
        }
    }
    
    public void CleanTable () {
        for (int i = 0 ; i < jTable_TableAdminSQL.getRowCount(); i++) {
            modelTable.removeRow(i);
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

        jSeparator14 = new javax.swing.JSeparator();
        PrimaryPanel_Home = new javax.swing.JPanel();
        jLabel_resizeRight = new javax.swing.JLabel();
        jLabel_resizeLeft = new javax.swing.JLabel();
        jLabel_resizeBottom = new javax.swing.JLabel();
        jLabel_resizeRightBottom = new javax.swing.JLabel();
        jLabel_resizeLeftBottom = new javax.swing.JLabel();
        jPanel_Welcome = new javax.swing.JPanel();
        jLabel_LogoWelcome = new javax.swing.JLabel();
        jLabel_TitleWelcome = new javax.swing.JLabel();
        jLabel_SubtitleWelcome = new javax.swing.JLabel();
        jPanel_BarTop = new javax.swing.JPanel();
        jLabel_ExitButton = new javax.swing.JLabel();
        jLabel_MaxRestore = new javax.swing.JLabel();
        jLabel_Minimize = new javax.swing.JLabel();
        jLabel_DragArea = new javax.swing.JLabel();
        jLabel_LogoScarab = new javax.swing.JLabel();
        jPanel_LeftBar = new javax.swing.JPanel();
        jLabel_NameUser = new javax.swing.JLabel();
        jSeparator_UserLeverRootDiv = new javax.swing.JSeparator();
        jLabel_LevelAdmin = new javax.swing.JLabel();
        jLabel_AccountingMod = new javax.swing.JLabel();
        jLabel_InventoryMod = new javax.swing.JLabel();
        jLabel_AdminMod = new javax.swing.JLabel();
        jLabel_AcconuntingModLabel = new javax.swing.JLabel();
        jLabel_InvetoryModLabel = new javax.swing.JLabel();
        jLabel_AdminModLabel = new javax.swing.JLabel();
        jPanel_WorkSpaceAdmin = new javax.swing.JPanel();
        jPanel_BarToolAdmin = new javax.swing.JPanel();
        jLabel_ButtonQueryUser = new javax.swing.JLabel();
        jPanel_SpaceAdmin = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_TableAdminSQL = new javax.swing.JTable();
        jPanel_registerEmployees = new javax.swing.JPanel();
        jLabel_TitlePanelRE = new javax.swing.JLabel();
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
        jLabel_TFSAEmployees = new javax.swing.JLabel();
        jTextField_SAEmployees = new javax.swing.JTextField();
        jLabel_TFIdEmployees1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel_TFSAEmployees1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel_registerEmployees1 = new javax.swing.JPanel();
        jLabel_TitlePanelRE1 = new javax.swing.JLabel();
        jLabel_TFIdEmployees2 = new javax.swing.JLabel();
        jTextField_IdEmployees1 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel_TFNameEmployees1 = new javax.swing.JLabel();
        jTextField_nameEmployees1 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel_TFLastNameEmployees1 = new javax.swing.JLabel();
        jTextField_LastNameEmployees1 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel_TFEmailEmployees1 = new javax.swing.JLabel();
        jTextField_EmailEmployees1 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel_TFPassEmployees1 = new javax.swing.JLabel();
        jTextField_PassEmployees1 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel_TFAddressEmployees1 = new javax.swing.JLabel();
        jTextField_AddressEmployees1 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel_TFPhoneEmployees1 = new javax.swing.JLabel();
        jTextField_PhoneEmployees1 = new javax.swing.JTextField();
        jLabel_TFIdEmployees3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_TFSAEmployees2 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scarab - Home");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(1980, 1080));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("Home"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PrimaryPanel_Home.setBackground(new java.awt.Color(51, 51, 51));
        PrimaryPanel_Home.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(102, 102, 102)));
        PrimaryPanel_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PrimaryPanel_Home.setMaximumSize(new java.awt.Dimension(1920, 1080));
        PrimaryPanel_Home.setMinimumSize(new java.awt.Dimension(800, 600));
        PrimaryPanel_Home.setName("Home"); // NOI18N
        PrimaryPanel_Home.setPreferredSize(new java.awt.Dimension(1100, 728));

        jLabel_resizeRight.setBackground(new java.awt.Color(102, 255, 255));
        jLabel_resizeRight.setCursor(new java.awt.Cursor(java.awt.Cursor.E_RESIZE_CURSOR));

        jLabel_resizeLeft.setBackground(new java.awt.Color(153, 255, 255));
        jLabel_resizeLeft.setCursor(new java.awt.Cursor(java.awt.Cursor.W_RESIZE_CURSOR));

        jLabel_resizeBottom.setBackground(new java.awt.Color(153, 255, 255));
        jLabel_resizeBottom.setCursor(new java.awt.Cursor(java.awt.Cursor.S_RESIZE_CURSOR));

        jLabel_resizeRightBottom.setBackground(new java.awt.Color(0, 153, 153));
        jLabel_resizeRightBottom.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));

        jLabel_resizeLeftBottom.setBackground(new java.awt.Color(0, 153, 153));
        jLabel_resizeLeftBottom.setCursor(new java.awt.Cursor(java.awt.Cursor.SW_RESIZE_CURSOR));

        jPanel_Welcome.setBackground(new java.awt.Color(51, 51, 51));

        jLabel_LogoWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconBase-Default.png"))); // NOI18N

        jLabel_TitleWelcome.setFont(new java.awt.Font("Bebas Neue", 1, 48)); // NOI18N
        jLabel_TitleWelcome.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TitleWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TitleWelcome.setText("Bienvenido a Scarab");
        jLabel_TitleWelcome.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel_SubtitleWelcome.setFont(new java.awt.Font("Bebas Neue Light", 0, 24)); // NOI18N
        jLabel_SubtitleWelcome.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SubtitleWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_SubtitleWelcome.setText("Sistema Contable y Administrativo");
        jLabel_SubtitleWelcome.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel_WelcomeLayout = new javax.swing.GroupLayout(jPanel_Welcome);
        jPanel_Welcome.setLayout(jPanel_WelcomeLayout);
        jPanel_WelcomeLayout.setHorizontalGroup(
            jPanel_WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_WelcomeLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jLabel_LogoWelcome)
                .addGap(1, 1, 1)
                .addGroup(jPanel_WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_TitleWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(jLabel_SubtitleWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel_WelcomeLayout.setVerticalGroup(
            jPanel_WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_WelcomeLayout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(jPanel_WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel_WelcomeLayout.createSequentialGroup()
                        .addComponent(jLabel_TitleWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_SubtitleWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_LogoWelcome))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jPanel_BarTop.setBackground(new java.awt.Color(38, 38, 38));
        jPanel_BarTop.setAutoscrolls(true);
        jPanel_BarTop.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel_ExitButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ExitButton.setText("X");
        jLabel_ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ExitButtonMouseClicked(evt);
            }
        });

        jLabel_MaxRestore.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_MaxRestore.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MaxRestore.setText("❐");
        jLabel_MaxRestore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MaxRestoreMouseClicked(evt);
            }
        });

        jLabel_Minimize.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Minimize.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Minimize.setText("-");
        jLabel_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseClicked(evt);
            }
        });

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

        jLabel_LogoScarab.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel_LogoScarab.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_LogoScarab.setIcon(new javax.swing.ImageIcon("E:\\Programacion\\JavaProjets\\SysScarab\\src\\main\\resources\\images\\Icons\\1x\\IsoT\\Icon-20px.png")); // NOI18N
        jLabel_LogoScarab.setText("SCARAB");
        jLabel_LogoScarab.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);

        javax.swing.GroupLayout jPanel_BarTopLayout = new javax.swing.GroupLayout(jPanel_BarTop);
        jPanel_BarTop.setLayout(jPanel_BarTopLayout);
        jPanel_BarTopLayout.setHorizontalGroup(
            jPanel_BarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BarTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_LogoScarab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_DragArea, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Minimize)
                .addGap(18, 18, 18)
                .addComponent(jLabel_MaxRestore)
                .addGap(18, 18, 18)
                .addComponent(jLabel_ExitButton)
                .addGap(18, 18, 18))
        );
        jPanel_BarTopLayout.setVerticalGroup(
            jPanel_BarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BarTopLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_LogoScarab)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BarTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_BarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_MaxRestore)
                        .addComponent(jLabel_ExitButton)
                        .addComponent(jLabel_Minimize))
                    .addComponent(jLabel_DragArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel_LeftBar.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_LeftBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel_NameUser.setBackground(new java.awt.Color(51, 51, 51));
        jLabel_NameUser.setFont(new java.awt.Font("Roboto Thin", 0, 12)); // NOI18N
        jLabel_NameUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NameUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_NameUser.setText("User");

        jSeparator_UserLeverRootDiv.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_LevelAdmin.setFont(new java.awt.Font("Roboto Mono Thin", 2, 12)); // NOI18N
        jLabel_LevelAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_LevelAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_LevelAdmin.setText("StatusAdmim");

        jLabel_AccountingMod.setBackground(new java.awt.Color(51, 51, 51));
        jLabel_AccountingMod.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_AccountingMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_AccountingMod.setIcon(new javax.swing.ImageIcon("E:\\Programacion\\JavaProjets\\SysScarab\\src\\main\\resources\\images\\Icons\\1x\\IconAccounting.png")); // NOI18N

        jLabel_InventoryMod.setBackground(new java.awt.Color(51, 51, 51));
        jLabel_InventoryMod.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_InventoryMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InventoryMod.setIcon(new javax.swing.ImageIcon("E:\\Programacion\\JavaProjets\\SysScarab\\src\\main\\resources\\images\\Icons\\1x\\IconInventoy.png")); // NOI18N

        jLabel_AdminMod.setBackground(new java.awt.Color(51, 51, 51));
        jLabel_AdminMod.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_AdminMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_AdminMod.setIcon(new javax.swing.ImageIcon("E:\\Programacion\\JavaProjets\\SysScarab\\src\\main\\resources\\images\\Icons\\1x\\IconManagement.png")); // NOI18N
        jLabel_AdminMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AdminModMouseClicked(evt);
            }
        });

        jLabel_AcconuntingModLabel.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_AcconuntingModLabel.setForeground(new java.awt.Color(153, 255, 153));
        jLabel_AcconuntingModLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_AcconuntingModLabel.setText("Contabilidad");

        jLabel_InvetoryModLabel.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_InvetoryModLabel.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_InvetoryModLabel.setForeground(new java.awt.Color(204, 153, 255));
        jLabel_InvetoryModLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_InvetoryModLabel.setText("Inventario");

        jLabel_AdminModLabel.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_AdminModLabel.setForeground(new java.awt.Color(255, 153, 153));
        jLabel_AdminModLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_AdminModLabel.setText("Administracion");

        javax.swing.GroupLayout jPanel_LeftBarLayout = new javax.swing.GroupLayout(jPanel_LeftBar);
        jPanel_LeftBar.setLayout(jPanel_LeftBarLayout);
        jPanel_LeftBarLayout.setHorizontalGroup(
            jPanel_LeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LeftBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_LeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_InvetoryModLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_AdminMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_AdminModLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_LeftBarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel_LeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_AccountingMod, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel_AcconuntingModLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_InventoryMod, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LeftBarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel_LeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_NameUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator_UserLeverRootDiv)
                    .addComponent(jLabel_LevelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel_LeftBarLayout.setVerticalGroup(
            jPanel_LeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LeftBarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel_NameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator_UserLeverRootDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_LevelAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_AccountingMod, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_AcconuntingModLabel)
                .addGap(27, 27, 27)
                .addComponent(jLabel_InventoryMod, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_InvetoryModLabel)
                .addGap(27, 27, 27)
                .addComponent(jLabel_AdminMod, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_AdminModLabel)
                .addContainerGap())
        );

        jPanel_WorkSpaceAdmin.setBackground(new java.awt.Color(51, 51, 51));

        jPanel_BarToolAdmin.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_BarToolAdmin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel_ButtonQueryUser.setBackground(new java.awt.Color(51, 51, 51));
        jLabel_ButtonQueryUser.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel_ButtonQueryUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ButtonQueryUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ButtonQueryUser.setText(" Consultar Usuarios ");
        jLabel_ButtonQueryUser.setToolTipText("");
        jLabel_ButtonQueryUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_ButtonQueryUser.setOpaque(true);
        jLabel_ButtonQueryUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ButtonQueryUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_BarToolAdminLayout = new javax.swing.GroupLayout(jPanel_BarToolAdmin);
        jPanel_BarToolAdmin.setLayout(jPanel_BarToolAdminLayout);
        jPanel_BarToolAdminLayout.setHorizontalGroup(
            jPanel_BarToolAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BarToolAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_ButtonQueryUser, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_BarToolAdminLayout.setVerticalGroup(
            jPanel_BarToolAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BarToolAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_ButtonQueryUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jPanel_SpaceAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_SpaceAdmin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable_TableAdminSQL.setBackground(new java.awt.Color(255, 255, 255));
        jTable_TableAdminSQL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTable_TableAdminSQL.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jTable_TableAdminSQL.setModel(jTable_TableAdminSQL.getModel());
        jScrollPane1.setViewportView(jTable_TableAdminSQL);

        jPanel_registerEmployees.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_registerEmployees.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel_registerEmployees.setForeground(java.awt.Color.darkGray);

        jLabel_TitlePanelRE.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel_TitlePanelRE.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_TitlePanelRE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TitlePanelRE.setText("Registro Empleados");

        jLabel_TFIdEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFIdEmployees.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFIdEmployees.setText("Id");

        jTextField_IdEmployees.setText("jTextField1");
        jTextField_IdEmployees.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFNameEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFNameEmployees.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFNameEmployees.setText("Nombre");

        jTextField_nameEmployees.setText("jTextField1");
        jTextField_nameEmployees.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFLastNameEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFLastNameEmployees.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFLastNameEmployees.setText("Apellidos");

        jTextField_LastNameEmployees.setText("jTextField1");
        jTextField_LastNameEmployees.setBorder(null);
        jTextField_LastNameEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LastNameEmployeesActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFEmailEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFEmailEmployees.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFEmailEmployees.setText("Correo");

        jTextField_EmailEmployees.setText("jTextField1");
        jTextField_EmailEmployees.setBorder(null);

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFPassEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFPassEmployees.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFPassEmployees.setText("Contraseña");

        jTextField_PassEmployees.setText("jTextField1");
        jTextField_PassEmployees.setBorder(null);

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFAddressEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFAddressEmployees.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFAddressEmployees.setText("Direccion");

        jTextField_AddressEmployees.setText("jTextField1");
        jTextField_AddressEmployees.setBorder(null);

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFPhoneEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFPhoneEmployees.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFPhoneEmployees.setText("Telefono");

        jTextField_PhoneEmployees.setText("jTextField1");
        jTextField_PhoneEmployees.setBorder(null);

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFSAEmployees.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFSAEmployees.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFSAEmployees.setText("Cargo");

        jTextField_SAEmployees.setText("jTextField1");
        jTextField_SAEmployees.setBorder(null);
        jTextField_SAEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SAEmployeesActionPerformed(evt);
            }
        });

        jLabel_TFIdEmployees1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFIdEmployees1.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFIdEmployees1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TFIdEmployees1.setText("Perfil");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("No Image");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("seleccionar");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registrar");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_TFSAEmployees1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFSAEmployees1.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFSAEmployees1.setText("Genero");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_registerEmployeesLayout = new javax.swing.GroupLayout(jPanel_registerEmployees);
        jPanel_registerEmployees.setLayout(jPanel_registerEmployeesLayout);
        jPanel_registerEmployeesLayout.setHorizontalGroup(
            jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registerEmployeesLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registerEmployeesLayout.createSequentialGroup()
                        .addComponent(jLabel_TFSAEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel_registerEmployeesLayout.createSequentialGroup()
                            .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registerEmployeesLayout.createSequentialGroup()
                                    .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_TFNameEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_TFIdEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_IdEmployees, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_nameEmployees, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registerEmployeesLayout.createSequentialGroup()
                                    .addComponent(jLabel_TFPassEmployees)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_PassEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_registerEmployeesLayout.createSequentialGroup()
                                    .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_TFPhoneEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_TFSAEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_SAEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_PhoneEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel_registerEmployeesLayout.createSequentialGroup()
                                    .addComponent(jLabel_TFAddressEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_AddressEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_registerEmployeesLayout.createSequentialGroup()
                                    .addComponent(jLabel_TFLastNameEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_LastNameEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator4)
                                .addComponent(jSeparator5)
                                .addComponent(jSeparator7)
                                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(1, 1, 1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_registerEmployeesLayout.createSequentialGroup()
                            .addComponent(jLabel_TFEmailEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_EmailEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_registerEmployeesLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_TFIdEmployees1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registerEmployeesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registerEmployeesLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registerEmployeesLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))))))
            .addComponent(jLabel_TitlePanelRE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_registerEmployeesLayout.setVerticalGroup(
            jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_registerEmployeesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel_TitlePanelRE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_IdEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TFIdEmployees)
                    .addComponent(jLabel_TFIdEmployees1))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nameEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TFNameEmployees)
                    .addComponent(jLabel2))
                .addGap(1, 1, 1)
                .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_registerEmployeesLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel_registerEmployeesLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_LastNameEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_TFLastNameEmployees))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_EmailEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_TFEmailEmployees))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_PassEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_TFPassEmployees))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_AddressEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_TFAddressEmployees))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_PhoneEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_TFPhoneEmployees))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_SAEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_TFSAEmployees))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel_registerEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_TFSAEmployees1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );

        jPanel_registerEmployees1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_registerEmployees1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel_registerEmployees1.setForeground(java.awt.Color.darkGray);

        jLabel_TitlePanelRE1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel_TitlePanelRE1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_TitlePanelRE1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TitlePanelRE1.setText("Registro Clientes");

        jLabel_TFIdEmployees2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFIdEmployees2.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFIdEmployees2.setText("Id");

        jTextField_IdEmployees1.setText("jTextField1");
        jTextField_IdEmployees1.setBorder(null);

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFNameEmployees1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFNameEmployees1.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFNameEmployees1.setText("Nombre");

        jTextField_nameEmployees1.setText("jTextField1");
        jTextField_nameEmployees1.setBorder(null);

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator9.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFLastNameEmployees1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFLastNameEmployees1.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFLastNameEmployees1.setText("Apellidos");

        jTextField_LastNameEmployees1.setText("jTextField1");
        jTextField_LastNameEmployees1.setBorder(null);
        jTextField_LastNameEmployees1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LastNameEmployees1ActionPerformed(evt);
            }
        });

        jSeparator10.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator10.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFEmailEmployees1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFEmailEmployees1.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFEmailEmployees1.setText("Correo");

        jTextField_EmailEmployees1.setText("jTextField1");
        jTextField_EmailEmployees1.setBorder(null);

        jSeparator11.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator11.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFPassEmployees1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFPassEmployees1.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFPassEmployees1.setText("Contraseña");

        jTextField_PassEmployees1.setText("jTextField1");
        jTextField_PassEmployees1.setBorder(null);

        jSeparator12.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator12.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFAddressEmployees1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFAddressEmployees1.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFAddressEmployees1.setText("Direccion");

        jTextField_AddressEmployees1.setText("jTextField1");
        jTextField_AddressEmployees1.setBorder(null);

        jSeparator13.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator13.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_TFPhoneEmployees1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFPhoneEmployees1.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFPhoneEmployees1.setText("Telefono");

        jTextField_PhoneEmployees1.setText("jTextField1");
        jTextField_PhoneEmployees1.setBorder(null);

        jLabel_TFIdEmployees3.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFIdEmployees3.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFIdEmployees3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TFIdEmployees3.setText("Perfil");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("No Image");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("seleccionar");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Registrar");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_TFSAEmployees2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_TFSAEmployees2.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_TFSAEmployees2.setText("Genero");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_registerEmployees1Layout = new javax.swing.GroupLayout(jPanel_registerEmployees1);
        jPanel_registerEmployees1.setLayout(jPanel_registerEmployees1Layout);
        jPanel_registerEmployees1Layout.setHorizontalGroup(
            jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registerEmployees1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_registerEmployees1Layout.createSequentialGroup()
                                .addComponent(jLabel_TFSAEmployees2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registerEmployees1Layout.createSequentialGroup()
                                    .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_TFNameEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_TFIdEmployees2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_IdEmployees1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_nameEmployees1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registerEmployees1Layout.createSequentialGroup()
                                    .addComponent(jLabel_TFPassEmployees1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_PassEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_registerEmployees1Layout.createSequentialGroup()
                                    .addComponent(jLabel_TFPhoneEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_PhoneEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_registerEmployees1Layout.createSequentialGroup()
                                    .addComponent(jLabel_TFAddressEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_AddressEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_registerEmployees1Layout.createSequentialGroup()
                                    .addComponent(jLabel_TFLastNameEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_LastNameEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator11)
                                .addComponent(jSeparator12))))
                    .addGroup(jPanel_registerEmployees1Layout.createSequentialGroup()
                        .addComponent(jLabel_TFEmailEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_EmailEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_registerEmployees1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_TFIdEmployees3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registerEmployees1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registerEmployees1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registerEmployees1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))))))
            .addComponent(jLabel_TitlePanelRE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_registerEmployees1Layout.setVerticalGroup(
            jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_registerEmployees1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel_TitlePanelRE1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_IdEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TFIdEmployees2)
                    .addComponent(jLabel_TFIdEmployees3))
                .addGap(1, 1, 1)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nameEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TFNameEmployees1)
                    .addComponent(jLabel5))
                .addGap(1, 1, 1)
                .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_registerEmployees1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel_registerEmployees1Layout.createSequentialGroup()
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_LastNameEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_TFLastNameEmployees1))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_EmailEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_TFEmailEmployees1))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_PassEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_TFPassEmployees1))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_AddressEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_TFAddressEmployees1))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_PhoneEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_TFPhoneEmployees1))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel_registerEmployees1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_TFSAEmployees2)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Limpiar");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Reporte");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel_SpaceAdminLayout = new javax.swing.GroupLayout(jPanel_SpaceAdmin);
        jPanel_SpaceAdmin.setLayout(jPanel_SpaceAdminLayout);
        jPanel_SpaceAdminLayout.setHorizontalGroup(
            jPanel_SpaceAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SpaceAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_SpaceAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel_SpaceAdminLayout.createSequentialGroup()
                        .addComponent(jPanel_registerEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_registerEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_SpaceAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_SpaceAdminLayout.setVerticalGroup(
            jPanel_SpaceAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SpaceAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_SpaceAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_SpaceAdminLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_SpaceAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel_registerEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel_registerEmployees1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_WorkSpaceAdminLayout = new javax.swing.GroupLayout(jPanel_WorkSpaceAdmin);
        jPanel_WorkSpaceAdmin.setLayout(jPanel_WorkSpaceAdminLayout);
        jPanel_WorkSpaceAdminLayout.setHorizontalGroup(
            jPanel_WorkSpaceAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_BarToolAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_SpaceAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_WorkSpaceAdminLayout.setVerticalGroup(
            jPanel_WorkSpaceAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_WorkSpaceAdminLayout.createSequentialGroup()
                .addComponent(jPanel_BarToolAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_SpaceAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PrimaryPanel_HomeLayout = new javax.swing.GroupLayout(PrimaryPanel_Home);
        PrimaryPanel_Home.setLayout(PrimaryPanel_HomeLayout);
        PrimaryPanel_HomeLayout.setHorizontalGroup(
            PrimaryPanel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrimaryPanel_HomeLayout.createSequentialGroup()
                .addGroup(PrimaryPanel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_resizeLeft, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                    .addComponent(jLabel_resizeLeftBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(PrimaryPanel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrimaryPanel_HomeLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel_LeftBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_WorkSpaceAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PrimaryPanel_HomeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_resizeBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrimaryPanel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_resizeRight, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_resizeRightBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jPanel_BarTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PrimaryPanel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PrimaryPanel_HomeLayout.createSequentialGroup()
                    .addGap(166, 166, 166)
                    .addComponent(jPanel_Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(15, 15, 15)))
        );
        PrimaryPanel_HomeLayout.setVerticalGroup(
            PrimaryPanel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrimaryPanel_HomeLayout.createSequentialGroup()
                .addComponent(jPanel_BarTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrimaryPanel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_resizeLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_resizeRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_WorkSpaceAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_LeftBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrimaryPanel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel_resizeRightBottom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                    .addComponent(jLabel_resizeLeftBottom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                    .addComponent(jLabel_resizeBottom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(PrimaryPanel_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PrimaryPanel_HomeLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jPanel_Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        getContentPane().add(PrimaryPanel_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_DragAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DragAreaMousePressed
        // TODO add your handling code here:
        AxisY = evt.getY();
        AxisX = evt.getX();
    }//GEN-LAST:event_jLabel_DragAreaMousePressed

    private void jLabel_DragAreaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DragAreaMouseDragged
        // TODO add your handling code here:
        AxisXScreen = evt.getXOnScreen();
        AxisYScreen = evt.getYOnScreen();
        this.setLocation(AxisXScreen - AxisX, AxisYScreen - AxisY);
    }//GEN-LAST:event_jLabel_DragAreaMouseDragged

    private void jLabel_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(1);
        
        if(!StatusMaximize){
            PrimaryPanel_Home.setPreferredSize(screenSizeMaximize);
        }
        else{
            PrimaryPanel_Home.setPreferredSize(screenSizeMinimize);
        }
    }//GEN-LAST:event_jLabel_MinimizeMouseClicked

    private void jLabel_MaxRestoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MaxRestoreMouseClicked
        // TODO add your handling code here:
        if(!StatusMaximize){
            this.setExtendedState(this.MAXIMIZED_BOTH);
            PrimaryPanel_Home.setPreferredSize(screenSizeMaximize);
            StatusMaximize = true;
        }
        else{
            this.setExtendedState(this.NORMAL);
            PrimaryPanel_Home.setPreferredSize(screenSizeMinimize);
            StatusMaximize = false;
        }
    }//GEN-LAST:event_jLabel_MaxRestoreMouseClicked

    private void jLabel_ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ExitButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel_ExitButtonMouseClicked

    private void jLabel_AdminModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AdminModMouseClicked
        // TODO add your handling code here:
        jPanel_WorkSpaceAdmin.setVisible(true);
        jPanel_Welcome.setVisible(false);
    }//GEN-LAST:event_jLabel_AdminModMouseClicked

    private void jLabel_ButtonQueryUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ButtonQueryUserMouseClicked
        // TODO add your handling code here:
        writeEmployeesDB();
    }//GEN-LAST:event_jLabel_ButtonQueryUserMouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField_LastNameEmployees1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LastNameEmployees1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LastNameEmployees1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField_SAEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SAEmployeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SAEmployeesActionPerformed

    private void jTextField_LastNameEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LastNameEmployeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LastNameEmployeesActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PrimaryPanel_Home;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_AcconuntingModLabel;
    private javax.swing.JLabel jLabel_AccountingMod;
    private javax.swing.JLabel jLabel_AdminMod;
    private javax.swing.JLabel jLabel_AdminModLabel;
    private javax.swing.JLabel jLabel_ButtonQueryUser;
    private javax.swing.JLabel jLabel_DragArea;
    private javax.swing.JLabel jLabel_ExitButton;
    private javax.swing.JLabel jLabel_InventoryMod;
    private javax.swing.JLabel jLabel_InvetoryModLabel;
    private javax.swing.JLabel jLabel_LevelAdmin;
    private javax.swing.JLabel jLabel_LogoScarab;
    private javax.swing.JLabel jLabel_LogoWelcome;
    private javax.swing.JLabel jLabel_MaxRestore;
    private javax.swing.JLabel jLabel_Minimize;
    private javax.swing.JLabel jLabel_NameUser;
    private javax.swing.JLabel jLabel_SubtitleWelcome;
    private javax.swing.JLabel jLabel_TFAddressEmployees;
    private javax.swing.JLabel jLabel_TFAddressEmployees1;
    private javax.swing.JLabel jLabel_TFEmailEmployees;
    private javax.swing.JLabel jLabel_TFEmailEmployees1;
    private javax.swing.JLabel jLabel_TFIdEmployees;
    private javax.swing.JLabel jLabel_TFIdEmployees1;
    private javax.swing.JLabel jLabel_TFIdEmployees2;
    private javax.swing.JLabel jLabel_TFIdEmployees3;
    private javax.swing.JLabel jLabel_TFLastNameEmployees;
    private javax.swing.JLabel jLabel_TFLastNameEmployees1;
    private javax.swing.JLabel jLabel_TFNameEmployees;
    private javax.swing.JLabel jLabel_TFNameEmployees1;
    private javax.swing.JLabel jLabel_TFPassEmployees;
    private javax.swing.JLabel jLabel_TFPassEmployees1;
    private javax.swing.JLabel jLabel_TFPhoneEmployees;
    private javax.swing.JLabel jLabel_TFPhoneEmployees1;
    private javax.swing.JLabel jLabel_TFSAEmployees;
    private javax.swing.JLabel jLabel_TFSAEmployees1;
    private javax.swing.JLabel jLabel_TFSAEmployees2;
    private javax.swing.JLabel jLabel_TitlePanelRE;
    private javax.swing.JLabel jLabel_TitlePanelRE1;
    private javax.swing.JLabel jLabel_TitleWelcome;
    private javax.swing.JLabel jLabel_resizeBottom;
    private javax.swing.JLabel jLabel_resizeLeft;
    private javax.swing.JLabel jLabel_resizeLeftBottom;
    private javax.swing.JLabel jLabel_resizeRight;
    private javax.swing.JLabel jLabel_resizeRightBottom;
    private javax.swing.JPanel jPanel_BarToolAdmin;
    private javax.swing.JPanel jPanel_BarTop;
    private javax.swing.JPanel jPanel_LeftBar;
    private javax.swing.JPanel jPanel_SpaceAdmin;
    private javax.swing.JPanel jPanel_Welcome;
    private javax.swing.JPanel jPanel_WorkSpaceAdmin;
    private javax.swing.JPanel jPanel_registerEmployees;
    private javax.swing.JPanel jPanel_registerEmployees1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSeparator jSeparator_UserLeverRootDiv;
    private javax.swing.JTable jTable_TableAdminSQL;
    private javax.swing.JTextField jTextField_AddressEmployees;
    private javax.swing.JTextField jTextField_AddressEmployees1;
    private javax.swing.JTextField jTextField_EmailEmployees;
    private javax.swing.JTextField jTextField_EmailEmployees1;
    private javax.swing.JTextField jTextField_IdEmployees;
    private javax.swing.JTextField jTextField_IdEmployees1;
    private javax.swing.JTextField jTextField_LastNameEmployees;
    private javax.swing.JTextField jTextField_LastNameEmployees1;
    private javax.swing.JTextField jTextField_PassEmployees;
    private javax.swing.JTextField jTextField_PassEmployees1;
    private javax.swing.JTextField jTextField_PhoneEmployees;
    private javax.swing.JTextField jTextField_PhoneEmployees1;
    private javax.swing.JTextField jTextField_SAEmployees;
    private javax.swing.JTextField jTextField_nameEmployees;
    private javax.swing.JTextField jTextField_nameEmployees1;
    // End of variables declaration//GEN-END:variables
}
