/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

import java.util.*;
import org.google.translate.api.v2.core.model.*;
/**
 * List of all the languages accepted by the Google Translate API and the 
 * respective string used to access the web service.
 * @author Diego
 */
public class Mapping {
   public static final String Afrikaans = "af";
    public static final String Albanian = "sq";
    public static final String Arabic = "ar";
    public static final String Azerbaijani = "az";
    public static final String Basque = "eu";
    public static final String Bengali = "bn";
    public static final String Belarusian = "be";
    public static final String Bulgarian = "bg";
    public static final String Catalan = "ca";
    public static final String ChineseSimplified = "zh-CN";
    public static final String ChineseTraditional = "zh-TW";
    public static final String Croatian = "hr";
    public static final String Czech = "cs";
    public static final String Danish = "da";
    public static final String Dutch = "nl";
    public static final String English = "en";
    public static final String Esperanto = "eo";
    public static final String Estonian = "et";
    public static final String Filipino = "tl";
    public static final String Finnish = "fi";
    public static final String French = "fr";
    public static final String Galician = "gl";
    public static final String Georgian = "ka";
    public static final String German = "de";
    public static final String Greek = "el";
    public static final String Gujarati = "gu";
    public static final String HaitianCreole = "ht";
    public static final String Hebrew = "iw";
    public static final String Hindi = "hi";
    public static final String Hungarian = "hu";
    public static final String Icelandic = "is";
    public static final String Indonesian = "id";
    public static final String Irish = "ga";
    public static final String Italian = "it";
    public static final String Japanese = "ja";
    public static final String Kannada = "kn";
    public static final String Korean = "ko";
    public static final String Latin = "la";
    public static final String Latvian = "lv";
    public static final String Lithuanian = "lt";
    public static final String Macedonian = "mk";
    public static final String Malay = "ms";
    public static final String Maltese = "mt";
    public static final String Norwegian = "no";
    public static final String Persian = "fa";
    public static final String Polish = "pl";
    public static final String Portuguese = "pt";
    public static final String Romanian = "ro";
    public static final String Russian = "ru";
    public static final String Serbian = "sr";
    public static final String Slovak = "sk";
    public static final String Slovenian = "sl";
    public static final String Spanish = "es";
    public static final String Swahili = "sw";
    public static final String Swedish = "sv";
    public static final String Tamil = "ta";
    public static final String Telugu = "te";
    public static final String Thai = "th";
    public static final String Turkish = "tr";
    public static final String Ukrainian = "uk";
    public static final String Urdu = "ur";
    public static final String Vietnamese = "vi";
    public static final String Welsh = "cy";
    public static final String Yiddish = "yi";
 
    public static final HashMap<String, String> langMap;
 
    static{
        langMap = new HashMap<String, String>();
        langMap.put("Afrikaans", Mapping.Afrikaans);
        langMap.put("Albanian", Mapping.Albanian);
        langMap.put("Arabic", Mapping.Arabic);
        langMap.put("Azerbaijani", Mapping.Azerbaijani);
        langMap.put("Basque", Mapping.Basque);
        langMap.put("Bengali", Mapping.Bengali);
        langMap.put("Belarusian", Mapping.Belarusian);
        langMap.put("Bulgarian", Mapping.Bulgarian);
        langMap.put("Catalan", Mapping.Catalan);
        langMap.put("ChineseSimplified", Mapping.ChineseSimplified);
        langMap.put("ChineseTraditional", Mapping.ChineseTraditional);
        langMap.put("Croatian", Mapping.Croatian);
        langMap.put("Czech", Mapping.Czech);
        langMap.put("Danish", Mapping.Danish);
        langMap.put("Dutch", Mapping.Dutch);
        langMap.put("English", Mapping.English);
        langMap.put("Esperanto", Mapping.Esperanto);
        langMap.put("Estonian", Mapping.Estonian);
        langMap.put("Filipino", Mapping.Filipino);
        langMap.put("Finnish", Mapping.Finnish);
        langMap.put("French", Mapping.French);
        langMap.put("Galician", Mapping.Galician);
        langMap.put("Georgian", Mapping.Georgian);
        langMap.put("German", Mapping.German);
        langMap.put("Greek", Mapping.Greek);
        langMap.put("Gujarati", Mapping.Gujarati);
        langMap.put("HaitianCreole", Mapping.HaitianCreole);
        langMap.put("Hebrew", Mapping.Hebrew);
        langMap.put("Hindi", Mapping.Hindi);
        langMap.put("Hungarian", Mapping.Hungarian);
        langMap.put("Icelandic", Mapping.Icelandic);
        langMap.put("Indonesian", Mapping.Indonesian);
        langMap.put("Irish", Mapping.Irish);
        langMap.put("Italian", Mapping.Italian);
        langMap.put("Japanese", Mapping.Japanese);
        langMap.put("Kannada", Mapping.Kannada);
        langMap.put("Korean", Mapping.Korean);
        langMap.put("Latin", Mapping.Latin);
        langMap.put("Latvian", Mapping.Latvian);
        langMap.put("Lithuanian", Mapping.Lithuanian);
        langMap.put("Macedonian", Mapping.Macedonian);
        langMap.put("Malay", Mapping.Malay);
        langMap.put("Maltese", Mapping.Maltese);
        langMap.put("Norwegian", Mapping.Norwegian);
        langMap.put("Persian", Mapping.Persian);
        langMap.put("Polish", Mapping.Polish);
        langMap.put("Portuguese", Mapping.Portuguese);
        langMap.put("Romanian", Mapping.Romanian);
        langMap.put("Russian", Mapping.Russian);
        langMap.put("Serbian", Mapping.Serbian);
        langMap.put("Slovak", Mapping.Slovak);
        langMap.put("Slovenian", Mapping.Slovenian);
        langMap.put("Spanish", Mapping.Spanish);
        langMap.put("Swahili", Mapping.Swahili);
        langMap.put("Swedish", Mapping.Swedish);
        langMap.put("Tamil", Mapping.Tamil);
        langMap.put("Telugu", Mapping.Telugu);
        langMap.put("Thai", Mapping.Thai);
        langMap.put("Turkish", Mapping.Turkish);
        langMap.put("Ukrainian", Mapping.Ukrainian);
        langMap.put("Urdu", Mapping.Urdu);
        langMap.put("Vietnamese", Mapping.Vietnamese);
        langMap.put("Welsh", Mapping.Welsh);
        langMap.put("Yiddish", Mapping.Yiddish);     
    }
     
     
}