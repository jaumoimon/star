/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stars.classes;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JDesktopPane;

/**
 *
 * @author dai
 */

public class JDKPWithBackground extends JDesktopPane
{
    URL imagen1 = JDKPWithBackground.class.getResource("src/hotel/imatges/hotel.jpg");
    Image imagen=Toolkit.getDefaultToolkit().getImage(imagen1);

    @Override
    public void paint(Graphics g)
    {

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),  this);  //la imagen se redimensiona
            setOpaque(false);
            super.paint(g);
    }
}
