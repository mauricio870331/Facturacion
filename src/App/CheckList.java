/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

/**
 *
 * @author Innova
 */
public class CheckList extends javax.swing.JFrame {

    /**
     * Creates new form CheckList
     */
    public CheckList() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnWelcome = new javax.swing.JPanel();
        lblIp = new javax.swing.JLabel();
        lblMac = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        pnCheck = new javax.swing.JPanel();
        lblLicencia = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblModConexion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblConexion = new javax.swing.JLabel();
        txtlicence = new javax.swing.JTextField();
        lblRes = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnAddLicense = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(415, 290));
        setResizable(false);
        setSize(new java.awt.Dimension(379, 290));

        pnWelcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblIp.setText("IP PUBLICA:");
        pnWelcome.add(lblIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 300, -1));

        lblMac.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMac.setText("MAC ADDRESS:");
        pnWelcome.add(lblMac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 300, -1));

        btnNext.setText("Siguiente");
        pnWelcome.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        pnCheck.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLicencia.setBackground(new java.awt.Color(255, 255, 255));
        lblLicencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLicencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/preloader.gif"))); // NOI18N
        lblLicencia.setText("Verificando");
        lblLicencia.setOpaque(true);
        pnCheck.add(lblLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 87, 151, 14));

        jButton1.setText("Iniciar Sesión");
        pnCheck.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        lblModConexion.setBackground(new java.awt.Color(255, 255, 255));
        lblModConexion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblModConexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/preloader.gif"))); // NOI18N
        lblModConexion.setText("Verificando");
        lblModConexion.setOpaque(true);
        pnCheck.add(lblModConexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 57, 151, 14));

        jLabel2.setText("Modo de Conexión:");
        pnCheck.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 57, -1, -1));

        jLabel3.setText("Resolución de Facturación:");
        pnCheck.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 120, -1, -1));

        lblConexion.setBackground(new java.awt.Color(255, 255, 255));
        lblConexion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblConexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/preloader.gif"))); // NOI18N
        lblConexion.setText("Verificando");
        lblConexion.setOpaque(true);
        pnCheck.add(lblConexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 32, 151, 14));
        pnCheck.add(txtlicence, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 87, 151, 14));

        lblRes.setBackground(new java.awt.Color(255, 255, 255));
        lblRes.setOpaque(true);
        pnCheck.add(lblRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 120, 151, 14));

        jButton2.setText("?");
        pnCheck.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 32, 40, 14));

        jLabel4.setText("Estado Licencia:");
        pnCheck.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 87, -1, -1));

        jLabel1.setText("Conexión al servidor Remoto");
        pnCheck.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 32, -1, -1));

        jButton3.setText("?");
        pnCheck.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 57, 40, 14));

        btnAddLicense.setText("?");
        pnCheck.add(btnAddLicense, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 87, 40, 14));

        jLayeredPane1.setLayer(pnWelcome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pnCheck, javax.swing.JLayeredPane.PALETTE_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnCheck, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CheckList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddLicense;
    public javax.swing.JButton btnNext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    public static javax.swing.JLabel lblConexion;
    public static javax.swing.JLabel lblIp;
    public static javax.swing.JLabel lblLicencia;
    public static javax.swing.JLabel lblMac;
    public static javax.swing.JLabel lblModConexion;
    private javax.swing.JLabel lblRes;
    public static javax.swing.JPanel pnCheck;
    public static javax.swing.JPanel pnWelcome;
    public static javax.swing.JTextField txtlicence;
    // End of variables declaration//GEN-END:variables
}