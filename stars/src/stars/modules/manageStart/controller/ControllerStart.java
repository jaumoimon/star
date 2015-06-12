/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars.modules.manageStart.controller;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.apache.batik.apps.svgbrowser.DOMViewer;
import org.apache.batik.apps.svgbrowser.JPEGOptionPanel;
import stars.Principal;
import stars.librariesInt.AppImages;
import stars.librariesInt.Texts_SignUp;
import stars.tools.ColorsAndFonts;
import stars.modules.manageStart.view.FrmRecover;
import stars.modules.manageStart.view.FrmSignUp;
import stars.modules.manageStart.view.WndStart;
import stars.librariesInt.Texts_WndStart;
import stars.modules.manageRooms.view.FrmRoomsUser;
import stars.modules.manageStart.model.bll.BLLStart;
import stars.modules.manageStart.view.FrmUsersAdmin;

/**
 *
 * @author Gestor
 */
public class ControllerStart implements ActionListener, KeyListener, MouseListener{
    
    public static boolean conectat = false;
    public static WndStart Inici = new WndStart();
    public static FrmSignUp SignUp = new FrmSignUp();
    public static FrmSignUp Perfil = new FrmSignUp();
    public static FrmRecover Recover = new FrmRecover();
    public static FrmUsersAdmin Pager = new FrmUsersAdmin();
    public static FrmRoomsUser HabUsers = new FrmRoomsUser();

     
    
    public enum Accio {
        
        _ICONA,
        //Accions del top - Barres de menu      
        _BARUSER_INICI,
        _BARUSER_HABITACIONS,
        _BARUSER_RESERVES,
        _BARUSER_PERFIL,
        _BARADMIN_INICI,
        _BARADMIN_USUARIS,
        _BARADMIN_HABITACIONS,
        _BARADMIN_RESERVES,
        
        //Accions del Panel
        _INTROUSER,
        _INTROCLAU,
        _ACCEPT,
        _CANCEL,
        _SIGNUP,
        _RECOVER,       
        
        //Accions del top - zona usuari
        _AVATAR,
        _USER,
        _SESSION,
        
        //Accions del bottom
        _CONF,
        
        //ACCIONS SIGNUO
        _REG_DNI,
        _REG_NOM,
        _REG_COGNOM,
        _REG_DIRECCIO,
        
        
        
    }
    
    public ControllerStart (JFrame finestra, int i) {
        
        switch (i){
            case 0: //Inici + login
                this.Inici = (WndStart) finestra;
                break;
            case 1: //Alta
                this.SignUp = (FrmSignUp) finestra;
                break;
            case 2: //Perfil
                this.Pager= (FrmUsersAdmin) finestra;
                break;
            default:
                break;

        }
        
        
    }
    
    public void iniciar (int i) {
        
        switch (i) {
            case 0: //Inici
                
                ((BasicInternalFrameUI)this.Inici.iFrCentre.getUI()).setNorthPane(null);
                //Configuració de la finestra
                this.Inici.setLocationRelativeTo(null);
                this.Inici.setResizable(false);
                this.Inici.setTitle("manage STARS");
                this.Inici.setIconImage(AppImages.icona  );
                //this.Inici.setExtendedState(JFrame.MAXIMIZED_BOTH);
                this.Inici.setSize(800, 600);
                              
                //Insertar text +  format + imatges
                
                //Barres menus
                this.Inici.lblPos1.setText(Texts_WndStart.writeInci());
                this.Inici.lblPos1.setFont(ColorsAndFonts.barMenu);
                this.Inici.lblPos1.setForeground(ColorsAndFonts.YellowApp);
                this.Inici.lblPos2.setText(Texts_WndStart.writeHabitacions());
                this.Inici.lblPos2.setFont(ColorsAndFonts.barMenu);
                this.Inici.lblPos2.setForeground(ColorsAndFonts.YellowApp);
                this.Inici.lblPos3.setText(Texts_WndStart.writeReserves());
                this.Inici.lblPos3.setFont(ColorsAndFonts.barMenu);
                this.Inici.lblPos3.setForeground(ColorsAndFonts.YellowApp);
                this.Inici.lblPos4.setText(Texts_WndStart.writePerfil());
                this.Inici.lblPos4.setFont(ColorsAndFonts.barMenu);
                this.Inici.lblPos4.setForeground(ColorsAndFonts.YellowApp);
                
                this.Inici.lblPos1A.setText(Texts_WndStart.writeInci());
                this.Inici.lblPos1A.setFont(ColorsAndFonts.barMenu);
                this.Inici.lblPos1A.setForeground(ColorsAndFonts.YellowApp);
                this.Inici.lblPos2A.setText(Texts_WndStart.writeUsuaris());
                this.Inici.lblPos2A.setFont(ColorsAndFonts.barMenu);
                this.Inici.lblPos2A.setForeground(ColorsAndFonts.YellowApp);
                this.Inici.lblPos3A.setText(Texts_WndStart.writeHabitacions());
                this.Inici.lblPos3A.setFont(ColorsAndFonts.barMenu);
                this.Inici.lblPos3A.setForeground(ColorsAndFonts.YellowApp);
                this.Inici.lblPos4A.setText(Texts_WndStart.writeReserves());
                this.Inici.lblPos4A.setFont(ColorsAndFonts.barMenu);
                this.Inici.lblPos4A.setForeground(ColorsAndFonts.YellowApp);
                this.Inici.lblPos5A.setText(Texts_WndStart.writePerfil());
                this.Inici.lblPos5A.setFont(ColorsAndFonts.barMenu);
                this.Inici.lblPos5A.setForeground(ColorsAndFonts.YellowApp);
                        
                //Panel
                this.Inici.lblTitol.setText(Texts_WndStart.writeTitol());
                this.Inici.lblTitol.setFont(ColorsAndFonts.h1);
                this.Inici.lblInUser.setText(Texts_WndStart.writeIntroUser());
                this.Inici.lblInUser.setFont(ColorsAndFonts.pB);
                this.Inici.lblPass.setText(Texts_WndStart.writePass());
                this.Inici.lblPass.setFont(ColorsAndFonts.pB);
                this.Inici.btnAccept.setText(Texts_WndStart.writeAccept());
                this.Inici.btnAccept.setFont(ColorsAndFonts.pB);
                this.Inici.btnCancel.setText(Texts_WndStart.writeCancel());
                this.Inici.btnCancel.setFont(ColorsAndFonts.pB);         
                this.Inici.lblImgSignUp.setIcon(AppImages.iconInfo);
                this.Inici.lblSignUp.setText(Texts_WndStart.writeSignUp());
                this.Inici.lblSignUp.setFont(ColorsAndFonts.pK); 
                this.Inici.lblImgRecover.setIcon(AppImages.iconWarning);
                this.Inici.lblRecovre.setText(Texts_WndStart.writeForget());
                this.Inici.lblRecovre.setFont(ColorsAndFonts.pK); 
                          
                //Visibilitat 
                
                /*
                if (Principal.usuari.getTipus()== "user"){
                    this.Inici.barMenuAdmin.setVisible(false);
                    this.Inici.barMenuUser.setVisible(true);
                } else if (Principal.usuari.getTipus()== "admin") {
                    this.Inici.barMenuUser.setVisible(false);
                    this.Inici.barMenuAdmin.setVisible(true);
                }
                */
                this.Inici.barMenuAdmin.setVisible(false);
                this.Inici.barMenuUser.setVisible(true);
                this.Inici.setVisible(true);
                
                //Tancar finestra
                this.Inici.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        JOptionPane.showMessageDialog(null,"Eixint de l'App", "Eixint",JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                    });
                
                //Activar control                
                this.Inici.forTxtUser.setName("_INTROUSER");
                this.Inici.forTxtUser.addMouseListener(this);
                this.Inici.forTxtUser.addKeyListener(this);
                
                this.Inici.forTxtPass.setName("_INTROCLAU");
                this.Inici.forTxtPass.addMouseListener(this);
                this.Inici.forTxtPass.addKeyListener(this);
                
                this.Inici.btnAccept.setActionCommand("_ACCEPT");
                this.Inici.btnAccept.setName("_ACCEPT");
                this.Inici.btnAccept.addMouseListener(this);
                this.Inici.btnAccept.addActionListener(this);
                
                
                this.Inici.btnCancel.setName("_CANCEL");
                this.Inici.btnCancel.addMouseListener(this);
                
                this.Inici.lblSignUp.setName("_SIGNUP");
                this.Inici.lblSignUp.addMouseListener(this);
                
                this.Inici.lblRecovre.setName("_RECOVER");
                this.Inici.lblRecovre.addMouseListener(this);
                
                this.Inici.lblConf.setName("_CONF");
                this.Inici.lblConf.addMouseListener(this);
                this.Inici.lblConf.setForeground(Color.white);
                
                this.Inici.lblPos3.setName("_BARUSERS_RESERVES");
                this.Inici.lblPos3.addMouseListener(this);
                
        
                break;
            case 1: //SignUp
                
                this.SignUp.lblTitol.setText(Texts_SignUp.writeTitol());
                this.SignUp.lblTitol.setFont(ColorsAndFonts.h1);
                
                
                this.SignUp.frmTxtDni.setName(null);
                
                
                break;
                
            
            case 2:
                
            
        }
        
 
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {  
        switch (Accio.valueOf(e.getActionCommand())){
            case _ACCEPT:
                String usuari = this.Inici.forTxtUser.getText();
                String clau = this.Inici.forTxtPass.getText();
                boolean login = false;
                
                BLLStart _login = new BLLStart();
                login = _login.loginUsuarioBLL(usuari, clau);
                if(login==true){
                    conectat = true;
                    
                    //WndStart.lblTitol.setText("Correcta");
                    
                    JPanel panHab = new JPanel();
                    panHab.add(this.HabUsers.panCont);
                    this.Inici.iFrCentre.setVisible(false);
                    this.Inici.iFrCentre.setContentPane(panHab);
                    this.Inici.iFrCentre.setVisible(true);
                    
                    
                    
                } else {
                    WndStart.forTxtUser.setForeground(Color.red);
                    WndStart.forTxtUser.setText("Usuari incorrecte");
                    WndStart.forTxtPass.setForeground(Color.red);
                    WndStart.forTxtPass.setText("Usuari incorrecte");
                    WndStart.forTxtUser.requestFocus();
                    return;
                }
                break;
            /*case _CANCEL:
                
                break;*/
        }      
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        switch (Accio.valueOf(e.getComponent().getName())){
            /*case _ACCEPT:
                JOptionPane.showMessageDialog(null, "Provant controlador");
                break;*/
            case _SIGNUP:
                new ControllerStart(new FrmSignUp(),1).iniciar(1);
                JPanel pan01 = new JPanel();
                pan01.add(this.SignUp.panCont);
                this.Inici.iFrCentre.setVisible(false);
                this.Inici.iFrCentre.setContentPane(pan01);
                this.Inici.iFrCentre.setVisible(true);
                break;
                
            
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    
   
}
