/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campusguider;

import java.util.*;
import org.google.translate.api.v2.core.Translator;
/**
 *
 * @author danny
 */
public class Global {
    
    public static int wid = 350;
    public static int hig = 475;
    
    public static String client = "client";
    public static String server = "server";
    
    String whoami = "";
    public static boolean clientExists = false;
    public static boolean serverExists = false;
    
    public static String clientLang = "af";
    public static String serverLang = "af";
    
    public static ArrayList<String> msgs = new ArrayList<String>();
    public static ArrayList<String> owners = new ArrayList<String>();
    
    public static NewJFrame1 jf1 = null;
    public static NewJFrame3 jf3 = null;
    //static Translator translator = new Translator("AIzaSyAQzdysXhF1W8j2n0I75lddEFQ-NGw44iY");
}
