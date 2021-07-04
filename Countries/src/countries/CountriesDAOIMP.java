/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countries;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Islam
 */
public class CountriesDAOIMP implements CountriesDAO{
    @Override
    public List<Country> ReadCountryFromCSV(String filename){
        List<Country> cnty = new ArrayList<Country>();
        try {
                BufferedReader br;
                br = new BufferedReader(new FileReader(filename));
                String line;
                do{
                    line = br.readLine();
                    if(line != null){
                        String[] atrs = line.split(",");
                        Country c = new Country(atrs[0], atrs[1], atrs[2], atrs[3], atrs[4], atrs[6]);
                        cnty.add(c);
                    }
                }while(line != null);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Countries.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Countries.class.getName()).log(Level.SEVERE, null, ex);
            }
        return cnty;
    }
    public List<City> ReadCityFromCSV(String filename){
        List<City> cty = new ArrayList<City>();
        try {
                BufferedReader br;
                br = new BufferedReader(new FileReader(filename));
                String line=null;
                do{
                    line = br.readLine();
                    if(line != null){
                        String[] atrs = line.split(",");
                        City c = new City(atrs[0], atrs[1], atrs[2], atrs[3]);
                        cty.add(c);
                    }
                }while(line != null);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Countries.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Countries.class.getName()).log(Level.SEVERE, null, ex);
            }
        return cty;
    }
}
