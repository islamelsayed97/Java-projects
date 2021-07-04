/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betterstring;

//import com.sun.xml.internal.ws.util.StringUtils;

//import com.sun.xml.internal.ws.util.StringUtils;
import java.util.function.BiPredicate;


/**
 *
 * @author Islam
 */
public class BetterString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String string1 = "abc";
        String string2 = "abcd";
        String longer = NewInterface.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        String first = NewInterface.betterString(string1, string2, (s1, s2) -> true);

        System.out.println(longer);
       
    }
    
}
