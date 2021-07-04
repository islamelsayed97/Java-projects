/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.groupingBy;

/**
 *
 * @author Islam
 */
public class Countries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        CountriesDAO cnty = new CountriesDAOIMP();
        System.out.println(cnty.ReadCountryFromCSV("F:\\ITI\\11 - Java\\Day 2\\Countries.csv"));
        
        System.out.println("######################################################");
        
        // Map
        CountriesDAO city = new CountriesDAOIMP();
        List<City> cities = cnty.ReadCityFromCSV("F:\\ITI\\11 - Java\\Day 2\\Cities.csv");
        
        Map<String, List<City>> map = cities.stream().collect(groupingBy(City::getCountry));
        
        
        for (Map.Entry<String, List<City>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
        System.out.println("######################################################");
        
        // Sorting
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter country code");
        String data = br.readLine();
        
        List<City> in_cities =  map.get(" "+data);
        in_cities.sort(Comparator.comparing(City::getPop));
        System.out.println(in_cities);
        
        System.out.println("######################################################");
        
        Statistics s = new Statistics();
        List<Country> countries = cnty.ReadCountryFromCSV("F:\\ITI\\11 - Java\\Day 2\\Countries.csv");
        
        System.out.println("list of population " + s.getListPop(countries));
        
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("The average of countries population = "+s.getAvgPop(countries));
        
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("The max of countries population = "+s.getMaxPop(countries));
        
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("The Highest population city of each country "+s.gethighestPopcity(cities));
        
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("The Highest population capital is "+s.getHighestPopCapital(countries, cities));
        
    }
    
}
