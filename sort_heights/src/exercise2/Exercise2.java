/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 *
 * @author Islam
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "F:\\ITI\\11 - Java\\Day 1\\pyramids.csv";
        PyramidsDAO pDAO = new pyramidsDAOIMP();
        List<Pyramid> pyramids = pDAO.ReadPyramidsFromCSV(path);
        
        // Sort
        pyramids.sort(Comparator.comparingDouble(Pyramid::getHieght));
        
        for(Pyramid p:pyramids){
            System.out.println(p);
        }
        
        
        System.out.println(new pyramidsDAOIMP().Map_site(pyramids));
    }
    
}
