/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Islam
 */
public class Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> site = new ArrayList<String>();
        try {
                BufferedReader br;
                br = new BufferedReader(new FileReader("F:\\ITI\\11 - Java\\Day 1\\pyramids.csv"));

                String line = br.readLine();

                do{
                    line = br.readLine();
                    if(line != null){
                        String[] atrs = line.split(",");
                        site.add(atrs[4]);
                    }
                }while(line != null);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
       System.out.println();
        
        
        
        

    }
    
}
