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

public class StyleTest1 {

    Style bold;
    Style justified;

    String whoami = "client";

    public void updateTextPane1(String str, String owner) {

        JTextPane textPane = Global.jf1.getJTextPane1();
        String last = str;

        if (owner == Global.server && Global.clientLang != Global.serverLang) {
            TranslateService tls = new TranslateService();
            try {
                last = tls.translate(str, Global.serverLang, Global.clientLang) + "\n";
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            last = str + "\n";
        }

        //textPane.insertIcon(new ImageIcon("n_img.png"));
        textPane.setPreferredSize(new Dimension(270, 550));

        StyledDocument doc = textPane.getStyledDocument();
        //textPane.setText("");

        addStylesToDocument(doc);

        try {

            //int i = initString.length -1;
            //for (int i = 0; i < initString.length; i++ ) {
            int pos = doc.getLength();
                //int pos = 0;

            //if (initStyles[i].equals(Global.client)) {
            doc.insertString(pos, last,
                    doc.getStyle(owner));
                //}

            if (owner.equals(Global.client)) {
                    //doc.insertString(pos,  initString[i],   
                //             doc.getStyle(initStyles[i]));

                Style logicalStyle = doc.getLogicalStyle(pos);
                doc.setParagraphAttributes(pos, last.length(),
                        justified, false);
                doc.setLogicalStyle(pos, logicalStyle);
            }
            //}
        } catch (Exception ble) {
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

        //Trans trans = new Trans();
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
