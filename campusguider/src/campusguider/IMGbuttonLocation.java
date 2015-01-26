/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campusguider;


/**
 *
 * @author danny
 */
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class IMGbuttonLocation extends JButton {
    public IMGbuttonLocation ()
    {
        try
        {
            this.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("loc.png"))));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }       
}
