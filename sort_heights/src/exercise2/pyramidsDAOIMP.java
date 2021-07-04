/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Islam
 */
public class pyramidsDAOIMP implements PyramidsDAO {
    
    
    public List<Pyramid> ReadPyramidsFromCSV(String filename){
        List<Pyramid> pyrd = new ArrayList<Pyramid>();
        try {
                BufferedReader br;
                br = new BufferedReader(new FileReader(filename));

                String line = br.readLine();

                do{
                    line = br.readLine();
                    if(line != null){
                        String[] atrs = line.split(",");
                        
                        pyrd.add(create_pyramid(atrs));
                    }
                }while(line != null);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
            }
        return pyrd;
       }
    
    
    public Pyramid create_pyramid(String[] metadata){
        
        Pyramid p = new Pyramid(metadata[4], metadata[8], metadata[10]);
        return p;
    }
    
    public Map<String, Integer> Map_site(List<Pyramid> prmd){
        Map<String, Integer> map = new HashMap<>();
        for(Pyramid p:prmd){
            if(!map.containsKey(p.getSite())){
                map.put(p.getSite(), 1);
            }else{
                map.put(p.getSite(), map.get(p.getSite())+1);
            }
        }
        
        return map;
    }
}
    

