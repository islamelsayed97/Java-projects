/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Islam
 */
public interface PyramidsDAO {
    public List<Pyramid> ReadPyramidsFromCSV(String filename);
    public Pyramid create_pyramid(String[] metadata);
    public Map<String, Integer> Map_site(List<Pyramid> p);
}
