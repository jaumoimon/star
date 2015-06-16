/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stars.modules.manageStart.controller;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
    public static WndStart Start = new WndStart();
    public static FrmSignUp SignUp = new FrmSignUp();
    public static FrmSignUp Perfil = new FrmSignUp();
    public static FrmRecover Recover = new FrmRecover();
    public static FrmUsersAdmin Pager = new FrmUsersAdmin();
    public static FrmRoomsUser HabUsers = new FrmRoomsUser();
    
    public static ImageIcon avatar = null;
    
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
                this.Start = (WndStart) finestra;
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
                
                ((BasicInternalFrameUI)this.Start.iFrCentre.getUI()).setNorthPane(null);
                //Configuració de la finestra
                this.Start.setLocationRelativeTo(null);
                this.Start.setResizable(false);
                this.Start.setTitle("manage STARS");
                this.Start.setIconImage(AppImages.icona  );
                //this.Start.setExtendedState(JFrame.MAXIMIZED_BOTH);
                this.Start.setSize(800, 600);
                              
                //Insertar text +  format + imatges
                
                //Barres menus
                this.Start.lblPos1.setText(Texts_WndStart.writeInci());
                this.Start.lblPos1.setFont(ColorsAndFonts.barMenu);
                this.Start.lblPos1.setForeground(ColorsAndFonts.YellowApp);
                this.Start.lblPos2.setText(Texts_WndStart.writeHabitacions());
                this.Start.lblPos2.setFont(ColorsAndFonts.barMenu);
                this.Start.lblPos2.setForeground(ColorsAndFonts.YellowApp);
                this.Start.lblPos3.setText(Texts_WndStart.writeReserves());
                this.Start.lblPos3.setFont(ColorsAndFonts.barMenu);
                this.Start.lblPos3.setForeground(ColorsAndFonts.YellowApp);
                this.Start.lblPos4.setText(Texts_WndStart.writePerfil());
                this.Start.lblPos4.setFont(ColorsAndFonts.barMenu);
                this.Start.lblPos4.setForeground(ColorsAndFonts.YellowApp);
                
                this.Start.lblPos1A.setText(Texts_WndStart.writeInci());
                this.Start.lblPos1A.setFont(ColorsAndFonts.barMenu);
                this.Start.lblPos1A.setForeground(ColorsAndFonts.YellowApp);
                this.Start.lblPos2A.setText(Texts_WndStart.writeUsuaris());
                this.Start.lblPos2A.setFont(ColorsAndFonts.barMenu);
                this.Start.lblPos2A.setForeground(ColorsAndFonts.YellowApp);
                this.Start.lblPos3A.setText(Texts_WndStart.writeHabitacions());
                this.Start.lblPos3A.setFont(ColorsAndFonts.barMenu);
                this.Start.lblPos3A.setForeground(ColorsAndFonts.YellowApp);
                this.Start.lblPos4A.setText(Texts_WndStart.writeReserves());
                this.Start.lblPos4A.setFont(ColorsAndFonts.barMenu);
                this.Start.lblPos4A.setForeground(ColorsAndFonts.YellowApp);
                this.Start.lblPos5A.setText(Texts_WndStart.writePerfil());
                this.Start.lblPos5A.setFont(ColorsAndFonts.barMenu);
                this.Start.lblPos5A.setForeground(ColorsAndFonts.YellowApp);
                        
                //Panel
                this.Start.lblTitol.setText(Texts_WndStart.writeTitol());
                this.Start.lblTitol.setFont(ColorsAndFonts.h1);
                this.Start.lblInUser.setText(Texts_WndStart.writeIntroUser());
                this.Start.lblInUser.setFont(ColorsAndFonts.pB);
                this.Start.lblPass.setText(Texts_WndStart.writePass());
                this.Start.lblPass.setFont(ColorsAndFonts.pB);
                this.Start.btnAccept.setText(Texts_WndStart.writeAccept());
                this.Start.btnAccept.setFont(ColorsAndFonts.pB);
                this.Start.btnCancel.setText(Texts_WndStart.writeCancel());
                this.Start.btnCancel.setFont(ColorsAndFonts.pB);         
                this.Start.lblImgSignUp.setIcon(AppImages.iconInfo);
                this.Start.lblSignUp.setText(Texts_WndStart.writeSignUp());
                this.Start.lblSignUp.setFont(ColorsAndFonts.pK); 
                this.Start.lblImgRecover.setIcon(AppImages.iconWarning);
                this.Start.lblRecovre.setText(Texts_WndStart.writeForget());
                this.Start.lblRecovre.setFont(ColorsAndFonts.pK); 
                
                //Usuari
                this.Start.lblAvatar.setSize(78, 78);
                avatar = new ImageIcon ( Principal.usuari.getAvatar() );
                avatar.getImage().getScaledInstance(this.Start.lblAvatar.getWidth(), this.Start.lblAvatar.getHeight(), Image.SCALE_DEFAULT);
                this.Start.lblAvatar.setIcon(avatar);
                this.Start.lblAvatar.setVisible(true);
                this.Start.lblUser.setText("Iniciar");
                this.Start.lblSession.setText("Vols registrar-te?");

                //Visibilitat  
                if (Principal.usuari.getTipus()== "user"){
                    this.Start.barMenuAdmin.setVisible(false);
                    this.Start.barMenuUser.setVisible(true);
                } else if (Principal.usuari.getTipus()== "admin") {
                    this.Start.barMenuUser.setVisible(false);
                    this.Start.barMenuAdmin.setVisible(true);
                }
                this.Start.barMenuAdmin.setVisible(false);
                this.Start.barMenuUser.setVisible(true);
                this.Start.setVisible(true);
                
                //Tancar finestra
                this.Start.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        JOptionPane.showMessageDialog(null,"Eixint de l'App", "Eixint",JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                    });
                
                //Activar control                
                this.Start.txtUsuari.setName("_INTROUSER");
                this.Start.txtUsuari.addMouseListener(this);
                this.Start.txtUsuari.addKeyListener(this);
                
                this.Start.txtUsuari.setName("_INTROCLAU");
                this.Start.txtUsuari.addMouseListener(this);
                this.Start.txtUsuari.addKeyListener(this);
                
                this.Start.btnAccept.setActionCommand("_ACCEPT");
                this.Start.btnAccept.setName("_ACCEPT");
                this.Start.btnAccept.addMouseListener(this);
                this.Start.btnAccept.addActionListener(this);
                
                
                this.Start.btnCancel.setName("_CANCEL");
                this.Start.btnCancel.addMouseListener(this);
                
                this.Start.lblSignUp.setName("_SIGNUP");
                this.Start.lblSignUp.addMouseListener(this);
                
                this.Start.lblRecovre.setName("_RECOVER");
                this.Start.lblRecovre.addMouseListener(this);
                
                this.Start.lblConf.setName("_CONF");
                this.Start.lblConf.addMouseListener(this);
                this.Start.lblConf.setForeground(Color.white);
                
                this.Start.lblPos3.setName("_BARUSERS_RESERVES");
                this.Start.lblPos3.addMouseListener(this);
                
        
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
                String usuari = this.Start.txtUsuari.getText();
                String clau = this.Start.pasClau.getText();
                boolean login = false;
                
                BLLStart _login = new BLLStart();
                login = _login.loginUsuarioBLL(usuari, clau);
                if(login==true){
                    conectat = true;
                    
                    //WndStart.lblTitol.setText("Correcta");
                    
                    JPanel panHab = new JPanel();
                    panHab.add(this.HabUsers.panCont);
                    this.Start.iFrCentre.setVisible(false);
                    this.Start.iFrCentre.setContentPane(panHab);
                    this.Start.iFrCentre.setVisible(true);
                    
                    
                    
                } else {
                    WndStart.txtUsuari.setForeground(Color.red);
                    WndStart.txtUsuari.setText("Usuari incorrecte");
                    WndStart.pasClau.setForeground(Color.red);
                    WndStart.pasClau.setText("Usuari incorrecte");
                    WndStart.pasClau.requestFocus();
                    return;
                }
                break;
            /*case _CANCEL:
                
                break;*/            /*case _CANCEL:
                
                break;*/            /*case _CANCEL:
                
                break;*/            /*case _CANCEL:
                
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
                this.Start.iFrCentre.setVisible(false);
                this.Start.iFrCentre.setContentPane(pan01);
                this.Start.iFrCentre.setVisible(true);
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
