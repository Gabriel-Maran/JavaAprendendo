package aprendendoClassesUtilitarias.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("good.morning"));
        resourceBundle = ResourceBundle.getBundle("message", new Locale("en", "US"));
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("good.morning"));
        System.out.println(resourceBundle.getString("hi"));
        //Locale("fr", "CA")
        //Ordem de procura:
        //message_fr_CA.proprities
        //message_fr.proprities
        //message_pt_BR.proprities
        //message_pt.proprities
        //message.proprities
    }
}
