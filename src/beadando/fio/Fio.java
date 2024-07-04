/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beadando.fio;

import beadando.business.GetterFunctionName;
import beadando.business.os.Iroeszkoz;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author serto
 */
public class Fio <T>{
    
    
    public void mentes(T entity){
        Class clazz = entity.getClass();
        Class superclazz = clazz.getSuperclass();
        //Field[] tuls = clazz.getDeclaredFields();
        try{
            File f = new File(Iroeszkoz.fajlnev);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document xml = db.parse(f);
            Element iroeszkoz = xml.createElement("iroeszkoz");
            Field[] tuls = clazz.getDeclaredFields();
            System.out.println(Arrays.toString(tuls));
        for(Field tul : tuls){
            if(tul.getAnnotation(GetterFunctionName.class) != null){
            String gfn = tul.getAnnotation(GetterFunctionName.class).name();
            //előállítani a getter metódust
            Method gm = clazz.getMethod(gfn);
            //Meghívni az entityre a method-ot:
            String ertek = gm.invoke(entity).toString();
            String valtozoNev = tul.getName();
            Element elem = xml.createElement("valtozoNev");
            elem.setTextContent(ertek);
            iroeszkoz.appendChild(elem);
            }
        }
        Field[] tuls2 = superclazz.getDeclaredFields();
        for(Field tul2 : tuls2){
            if(tul2.getAnnotation(GetterFunctionName.class) != null){
            String gfn = tul2.getAnnotation(GetterFunctionName.class).name();
            //előállítani a getter metódust
            Method gm = clazz.getMethod(gfn);
            //Meghívni az entityre a method-ot:
            String ertek = gm.invoke(entity).toString();
            String valtozoNev = tul2.getName();
            Element elem = xml.createElement("valtozoNev");
            elem.setTextContent(ertek);
            iroeszkoz.appendChild(elem);
            }
        }
        iroeszkoz.setAttribute("name", clazz.getSimpleName());
        xml.getFirstChild().appendChild(iroeszkoz);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = tf.newTransformer();
        DOMSource s = new DOMSource(xml);
        StreamResult r = new StreamResult(f);
        t.transform(s, r);
        }
        catch(Exception ex){
            System.out.println("Hiba: " + ex.toString());
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
        
        try {
            //Ugyanaz a superclazzel
            //xml file beolvasás:
            File f = new File(superclazz.getField("fajlnev").get(entity).toString());
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(Fio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Fio.class.getName()).log(Level.SEVERE, null, ex);
        }
        //xml-t kell írni:
        //dbf
        //db
        //
        
    }
}
