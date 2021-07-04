/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkstring;

/**
 *
 * @author Islam
 */
public class CheckString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc123";

        boolean isAlhpa1 = s1.chars().allMatch(Character::isLetter);
        boolean isAlhpa2 = s2.chars().allMatch(Character::isLetter);
        
        System.out.println(isAlhpa1);
        System.out.println(isAlhpa2);
        
    }
    
}
