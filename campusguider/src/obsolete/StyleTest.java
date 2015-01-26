/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obsolete;

/**
 *
 * @author danny
 */
//import obj.Trans;
import campusguider.Global;
import obj.TranslateService;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.text.*;
  
public class StyleTest {
    Style bold;
    Style justified;

    public void updateTextPane(JTextPane jtp, String whoami) {
        
        System.out.println(Global.msgs.size());
        
        //String[] initString = new String[Global.msgs.size()];
        
        String[] initString = null;
        String[] initStyles = new String[Global.msgs.size()]; 
        
        try
        {
            initString = this.translateStrings(Global.msgs, whoami);
            initStyles =  Global.owners.toArray(initStyles); //new String[Global.owners.size()];$
        }
        catch (Exception e)
        {
               e.printStackTrace();
        }
        /*
        for (int i = 0; i < Global.msgs.size(); i++)
        {
            initString[i] = Global.msgs.get(i) + "\n";
            initStyles[i] = Global.owners.get(i);
        }
        */
        JTextPane textPane =  jtp;
        
        //textPane.insertIcon(new ImageIcon("n_img.png"));
        textPane.setPreferredSize(new Dimension(270,550));
        
        StyledDocument doc = textPane.getStyledDocument();
        textPane.setText("");
        
        //Trans trans = new Trans();
        addStylesToDocument(doc);
        
        //textPane.insertIcon(new ImageIcon(file.getPath())
        //StyleConstants.setIcon(justified, new ImageIcon("n_img.png"));
        
        
        try {
            
            //int i = initString.length -1;
            for (int i = 0; i < initString.length; i++ ) {
                int pos = doc.getLength();
                //int pos = 0;
                
                //if (initStyles[i].equals(Global.client)) {
                doc.insertString(pos, initString[i], 
                                 doc.getStyle(initStyles[i]));
                //}
                
                if(initStyles[i].equals(Global.server)) {
                    //doc.insertString(pos,  initString[i],   
                    //             doc.getStyle(initStyles[i]));
                    
                    Style logicalStyle = doc.getLogicalStyle(pos);
                    doc.setParagraphAttributes(pos, initString[i].length(),
                                               justified, false);
                    doc.setLogicalStyle(pos, logicalStyle);
                }
            }
        } catch(Exception ble) {
            //System.out.println("bad location: " + ble.getMessage());
            ble.printStackTrace();
        }
        //return textPane;
    }
  
    public void addStylesToDocument(StyledDocument doc) {
        Style def = StyleContext.getDefaultStyleContext()
                            .getStyle(StyleContext.DEFAULT_STYLE);
        Style regular = doc.addStyle("regular", def);
        StyleConstants.setFontFamily(def, "Serif");
        StyleConstants.setFontSize(regular, 12);
        bold = doc.addStyle("bold", regular);
        StyleConstants.setBold(bold, true);
        StyleConstants.setForeground(bold, new Color(90,0,90));
        StyleConstants.setAlignment(bold, StyleConstants.ALIGN_LEFT);
        justified = doc.addStyle("justified", regular);
        StyleConstants.setAlignment(justified, StyleConstants.ALIGN_RIGHT);
        StyleConstants.setForeground(justified, new Color(90,0,90));
    }
  
    public static void main(String[] args) {
        StyleTest test = new StyleTest();
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.getContentPane().add(new JScrollPane(test.getTextPane()));
        f.setSize(400,400);
        f.setLocation(200,200);
        f.setVisible(true);
    }
    
    
    private String[] translateStrings (ArrayList<String> ori, String whoami) throws Exception 
    {
        TranslateService tls = new TranslateService();
        
        
        //Trans trans = new Trans();
        
        
        String[] re = new String[ori.size()];
        
        if (whoami == Global.client)
        {
            for (int i = 0; i < ori.size(); i++)
            {
                if (Global.owners.get(i) == Global.server)
                {
                    //re[i] = trans.translate(Global.msgs.get(i), Global.serverLang, Global.clientLang) + "\n";
                    
                    re[i] = tls.translate(Global.msgs.get(i), Global.serverLang, Global.clientLang) + "\n";
                    
                }
                else
                {
                    re[i] = Global.msgs.get(i) + "\n";
                }
            }
        }
        
        else  //server
        {
            for (int i = 0; i < ori.size(); i++)
            {
                if (Global.owners.get(i) == Global.client)
                {
                    //re[i] = trans.translate(Global.msgs.get(i), Global.clientLang, Global.serverLang) + "\n";
                    
                    re[i] = tls.translate(Global.msgs.get(i), Global.clientLang, Global.serverLang) + "\n";
                }
                else
                {
                    re[i] = Global.msgs.get(i) + "\n";
                }
            }
        }
        
        return re;
    }
    
    /*
    public static JTextPane getPane()
    {
        if (StyleTest.jTextPane1 == null)
        {
            return new JTextPane();
        }
        else
        {
            return new JTextPane();
            //return StyleTest.jTextPane1;
        }
    }
    
    private static JTextPane jTextPane1 = null;
    */
}
