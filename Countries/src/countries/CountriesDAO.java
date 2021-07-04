/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countries;

import java.util.List;

/**
 *
 * @author Islam
 */
public interface CountriesDAO {
    public List<Country> ReadCountryFromCSV(String filename);
    public List<City> ReadCityFromCSV(String filename);
}
