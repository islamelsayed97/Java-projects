/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countries;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;

/**
 *
 * @author Islam
 */
public class Statistics {
    
    public List<Double> getListPop(List<Country> L){
        return L.stream().map(Country::getPop).collect(Collectors.toList());
    }
    
    public OptionalDouble getAvgPop(List<Country> Countries){
        return Countries.stream()
                        .mapToDouble(Country::getPop)
                        .average();

    }
    
    public OptionalDouble getMaxPop(List<Country> Countries){
        return Countries.stream()
                        .mapToDouble(Country::getPop)
                        .max();

    }
    
    public Map<String, Optional<City>> gethighestPopcity(List <City> cities){
    Map<String, Optional<City>> highestPop = cities.stream()
                .collect(groupingBy(City::getCountry,Collectors.maxBy(Comparator.comparing(City::getPop))));
        return highestPop;
    
}
    public Optional<City> getHighestPopCapital(List<Country> countires, List<City> cities){
        Map<String, Integer> countriesCapitals = countires.stream()
                                                          .collect(Collectors.toMap(Country::getCode, Country::getCapital));
        List<City> capitals = cities.stream()
                                    .filter(c -> countriesCapitals.containsValue(c.getId()))
                                    .collect(Collectors.toList());
        return capitals.stream().max(Comparator.comparing(City::getPop));
    }

    
}
