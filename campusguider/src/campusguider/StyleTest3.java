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
//import obj.Trans;
import obsolete.StyleTest;
import obj.TranslateService;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.text.*;

public class StyleTest3 {

    Style bold;
    Style justified;

    String whoami = "server";

    public void updateTextPane3(String str, String owner) {
        JTextPane textPane = Global.jf3.getJTextPane1();

        System.out.println(Global.msgs.size());

        String last = str;

        if (owner == Global.client && Global.clientLang != Global.serverLang) {
            TranslateService tls = new TranslateService();
            try {
                last = tls.translate(str, Global.clientLang, Global.serverLang) + "\n";
            } catch (IOException ex) {
                Logger.getLogger(StyleTest3.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            last = str + "\n";
        }
        //String[] initString = new String[Global.msgs.size()];

        /*
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
        //textPane.insertIcon(new ImageIcon("n_img.png"));
        textPane.setPreferredSize(new Dimension(270, 550));
        StyledDocument doc = textPane.getStyledDocument();
        addStylesToDocument(doc);

        try {
            int pos = doc.getLength();
            doc.insertString(pos, last,
                    doc.getStyle(owner));
            
            if (owner.equals(Global.server)) {
            
                Style logicalStyle = doc.getLogicalStyle(pos);
                doc.setParagraphAttributes(pos, last.length(),
                        justified, false);
                doc.setLogicalStyle(pos, logicalStyle);
            }
            
        } catch (Exception ble) {
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
        StyleConstants.setForeground(bold, new Color(90, 0, 90));
        StyleConstants.setAlignment(bold, StyleConstants.ALIGN_LEFT);
        justified = doc.addStyle("justified", regular);
        StyleConstants.setAlignment(justified, StyleConstants.ALIGN_RIGHT);
        StyleConstants.setForeground(justified, new Color(90, 0, 90));
    }

    public static void main(String[] args) {
        StyleTest test = new StyleTest();
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.getContentPane().add(new JScrollPane(test.getTextPane()));
        f.setSize(400, 400);
        f.setLocation(200, 200);
        f.setVisible(true);
    }

    private String[] translateStrings(ArrayList<String> ori, String whoami) throws Exception {
        TranslateService tls = new TranslateService();
        String[] re = new String[ori.size()];

        if (whoami == Global.client) {
            for (int i = 0; i < ori.size(); i++) {
                if (Global.owners.get(i) == Global.server) {
                    //re[i] = trans.translate(Global.msgs.get(i), Global.serverLang, Global.clientLang) + "\n";

                    re[i] = tls.translate(Global.msgs.get(i), Global.serverLang, Global.clientLang) + "\n";

                } else {
                    re[i] = Global.msgs.get(i) + "\n";
                }
            }
        } else //server
        {
            for (int i = 0; i < ori.size(); i++) {
                if (Global.owners.get(i) == Global.client) {
                    //re[i] = trans.translate(Global.msgs.get(i), Global.clientLang, Global.serverLang) + "\n";

                    re[i] = tls.translate(Global.msgs.get(i), Global.clientLang, Global.serverLang) + "\n";
                } else {
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
