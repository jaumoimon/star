/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars.modules.manageStart.view;

import javax.swing.text.MaskFormatter;

/**
 *
 * @author Gestor
 */
public class WndStart extends javax.swing.JFrame {

    /**
     * Creates new form finInici
     */
    public WndStart() {
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

        panTop = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblAvatar = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblSession = new javax.swing.JLabel();
        barMenuUser = new javax.swing.JToolBar();
        lblPos1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        lblPos2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        lblPos3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        lblPos4 = new javax.swing.JLabel();
        barMenuAdmin = new javax.swing.JToolBar();
        lblPos1A = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        lblPos2A = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        lblPos3A = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        lblPos4A = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        lblPos5A = new javax.swing.JLabel();
        iFrCentre = new javax.swing.JInternalFrame();
        panCont = new javax.swing.JPanel();
        pan1 = new javax.swing.JPanel();
        lblTitol = new javax.swing.JLabel();
        lblInUser = new javax.swing.JLabel();
        forTxtUser = new javax.swing.JFormattedTextField();
        lblPass = new javax.swing.JLabel();
        forTxtPass = new javax.swing.JFormattedTextField();
        lblImgSignUp = new javax.swing.JLabel();
        lblImgRecover = new javax.swing.JLabel();
        lblSignUp = new javax.swing.JLabel();
        lblRecovre = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        pan2 = new javax.swing.JPanel();
        lblPromo = new javax.swing.JLabel();
        panBottom = new javax.swing.JPanel();
        lblConf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panTop.setBackground(new java.awt.Color(0, 128, 128));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/images/app/logo.png"))); // NOI18N

        barMenuUser.setBackground(new java.awt.Color(0, 128, 128));
        barMenuUser.setBorder(null);
        barMenuUser.setRollover(true);

        lblPos1.setText("Inici");
        barMenuUser.add(lblPos1);
        barMenuUser.add(jSeparator1);

        lblPos2.setText("Habitacions");
        barMenuUser.add(lblPos2);
        barMenuUser.add(jSeparator2);

        lblPos3.setText("Reserves");
        barMenuUser.add(lblPos3);
        barMenuUser.add(jSeparator3);

        lblPos4.setText("Perfil");
        barMenuUser.add(lblPos4);

        barMenuAdmin.setBackground(new java.awt.Color(0, 128, 128));
        barMenuAdmin.setBorder(null);
        barMenuAdmin.setRollover(true);

        lblPos1A.setText("Inici");
        barMenuAdmin.add(lblPos1A);
        barMenuAdmin.add(jSeparator4);

        lblPos2A.setText("Usuaris");
        barMenuAdmin.add(lblPos2A);
        barMenuAdmin.add(jSeparator5);

        lblPos3A.setText("Habitacions");
        barMenuAdmin.add(lblPos3A);
        barMenuAdmin.add(jSeparator6);

        lblPos4A.setText("Reserves");
        barMenuAdmin.add(lblPos4A);
        barMenuAdmin.add(jSeparator7);

        lblPos5A.setText("Perfil");
        barMenuAdmin.add(lblPos5A);

        javax.swing.GroupLayout panTopLayout = new javax.swing.GroupLayout(panTop);
        panTop.setLayout(panTopLayout);
        panTopLayout.setHorizontalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barMenuUser, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barMenuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTopLayout.createSequentialGroup()
                        .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addComponent(lblSession, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panTopLayout.setVerticalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panTopLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(barMenuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barMenuUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblIcon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(lblAvatar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panTopLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSession, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );

        iFrCentre.setBackground(new java.awt.Color(255, 204, 0));
        iFrCentre.setBorder(null);
        iFrCentre.setVisible(true);

        panCont.setBackground(new java.awt.Color(255, 204, 0));
        panCont.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        pan1.setBackground(new java.awt.Color(255, 204, 0));

        forTxtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forTxtPassActionPerformed(evt);
            }
        });

        btnAccept.setText("SignIn");

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan1Layout = new javax.swing.GroupLayout(pan1);
        pan1.setLayout(pan1Layout);
        pan1Layout.setHorizontalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan1Layout.createSequentialGroup()
                        .addComponent(lblPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pan1Layout.createSequentialGroup()
                        .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblInUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(forTxtUser))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan1Layout.createSequentialGroup()
                        .addComponent(forTxtPass)
                        .addContainerGap())
                    .addGroup(pan1Layout.createSequentialGroup()
                        .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImgRecover, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImgSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pan1Layout.createSequentialGroup()
                                .addComponent(btnAccept)
                                .addGap(29, 29, 29)
                                .addComponent(btnCancel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(lblRecovre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        pan1Layout.setVerticalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitol, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(forTxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(forTxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pan1Layout.createSequentialGroup()
                        .addComponent(lblImgSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblImgRecover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRecovre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pan2.setBackground(new java.awt.Color(0, 128, 128));

        lblPromo.setBackground(new java.awt.Color(0, 128, 128));
        lblPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stars/images/app/promo.png"))); // NOI18N

        javax.swing.GroupLayout pan2Layout = new javax.swing.GroupLayout(pan2);
        pan2.setLayout(pan2Layout);
        pan2Layout.setHorizontalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPromo, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );
        pan2Layout.setVerticalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPromo, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panContLayout = new javax.swing.GroupLayout(panCont);
        panCont.setLayout(panContLayout);
        panContLayout.setHorizontalGroup(
            panContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panContLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)
                    .addComponent(pan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 20, Short.MAX_VALUE)))
        );
        panContLayout.setVerticalGroup(
            panContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
            .addGroup(panContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panContLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(panContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout iFrCentreLayout = new javax.swing.GroupLayout(iFrCentre.getContentPane());
        iFrCentre.getContentPane().setLayout(iFrCentreLayout);
        iFrCentreLayout.setHorizontalGroup(
            iFrCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        iFrCentreLayout.setVerticalGroup(
            iFrCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iFrCentreLayout.createSequentialGroup()
                .addComponent(panCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        panBottom.setBackground(new java.awt.Color(0, 128, 128));

        lblConf.setText("Conf");

        javax.swing.GroupLayout panBottomLayout = new javax.swing.GroupLayout(panBottom);
        panBottom.setLayout(panBottomLayout);
        panBottomLayout.setHorizontalGroup(
            panBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBottomLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblConf)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panBottomLayout.setVerticalGroup(
            panBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConf)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(iFrCentre, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iFrCentre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        iFrCentre.getAccessibleContext().setAccessibleParent(iFrCentre);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void forTxtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forTxtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forTxtPassActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JToolBar barMenuAdmin;
    public static javax.swing.JToolBar barMenuUser;
    public static javax.swing.JButton btnAccept;
    public static javax.swing.JButton btnCancel;
    public static javax.swing.JFormattedTextField forTxtPass;
    public static javax.swing.JFormattedTextField forTxtUser;
    public static javax.swing.JInternalFrame iFrCentre;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    public static javax.swing.JLabel lblAvatar;
    public static javax.swing.JLabel lblConf;
    public static javax.swing.JLabel lblIcon;
    public static javax.swing.JLabel lblImgRecover;
    public static javax.swing.JLabel lblImgSignUp;
    public static javax.swing.JLabel lblInUser;
    public static javax.swing.JLabel lblPass;
    public static javax.swing.JLabel lblPos1;
    public static javax.swing.JLabel lblPos1A;
    public static javax.swing.JLabel lblPos2;
    public static javax.swing.JLabel lblPos2A;
    public static javax.swing.JLabel lblPos3;
    public static javax.swing.JLabel lblPos3A;
    public static javax.swing.JLabel lblPos4;
    public static javax.swing.JLabel lblPos4A;
    public static javax.swing.JLabel lblPos5A;
    public static javax.swing.JLabel lblPromo;
    public static javax.swing.JLabel lblRecovre;
    public static javax.swing.JLabel lblSession;
    public static javax.swing.JLabel lblSignUp;
    public static javax.swing.JLabel lblTitol;
    public static javax.swing.JLabel lblUser;
    public static javax.swing.JPanel pan1;
    public static javax.swing.JPanel pan2;
    public static javax.swing.JPanel panBottom;
    public static javax.swing.JPanel panCont;
    public static javax.swing.JPanel panTop;
    // End of variables declaration//GEN-END:variables
}
