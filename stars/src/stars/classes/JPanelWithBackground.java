/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stars.classes;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JPanel;

/**
 *
 * @author dai
 */

public class JPanelWithBackground extends JPanel
{
    URL imagen1 = JPanelWithBackground.class.getResource("src/hotel/imatges/hotel.jpg");
    Image imagen=Toolkit.getDefaultToolkit().getImage(imagen1);
    public void paint(Graphics g)
    {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
    }
}
