import java.util.ArrayList;
import java.util.Comparator;

public class reto {
    public static void main(String[] args) {
        ArrayList<String> arn = new ArrayList<String>();
        String ejemplo = "ACCAUGCCGCGAGUCUCCUGA", ejemplo2 = "ACCAUGCCGCGAGUCUCCUAG", ejemplo3 = "ACCAUGCCGCGAGUCUCCUAA";

        int arnInicio = ejemplo.indexOf("AUG");
        int arnFinal = ejemplo.indexOf("UGA");
        int arnLength = ejemplo.substring(arnInicio, arnFinal +3).length();
        
        if (arnInicio != -1 && arnFinal != -1 && arnLength % 3 ==0 && arnLength >= 18) {
            arn.add(ejemplo.substring(arnInicio, arnFinal +3));
        } else {
            System.out.println(ejemplo + " No es compatible");
        }
// segundo ARN

        int arnInicio2 = ejemplo2.indexOf("AUG");
        int arnFinal2 = ejemplo2.indexOf("UAG");
        int arnLength2 = ejemplo2.substring(arnInicio2, arnFinal2 +3).length();
        
        if (arnInicio2 != -1 && arnFinal2 != -1 && arnLength2 % 3 ==0 && arnLength2 >= 18) {
            arn.add(ejemplo2.substring(arnInicio2, arnFinal2 +3));
        } else {
            System.out.println(ejemplo + " No es compatible");
        }
// tercer ARN
        int arnInicio3 = ejemplo3.indexOf("AUG");
        int arnFinal3 = ejemplo3.indexOf("UAA");
        int arnLength3 = ejemplo3.substring(arnInicio3, arnFinal3 +3).length();
        
        if (arnInicio3 != -1 && arnFinal3 != -1 && arnLength3 % 3 ==0 && arnLength3 >= 18) {
            arn.add(ejemplo3.substring(arnInicio3, arnFinal3 +3));
        } else {
            System.out.println(ejemplo + " No es compatible");
        }
// ArrayList
        arn.sort(Comparator.comparing(String::length).reversed());
        System.out.println(arn);
    }
}