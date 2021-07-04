/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countries;

/**
 *
 * @author Islam
 */
public class Country {
    private String code, name, continent;
    private double area;
    private double pop;
    private int capital;

    public Country(String code, String name, String continent, String area, String pop, String capital) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        double a = Double.parseDouble(area);
        this.area = a;
        double p = Double.parseDouble(pop);
        this.pop = p;
        int c = Integer.parseInt(capital);
        this.capital = c;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }
    
    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Country{" + "code=" + code + ", name=" + name + ", continent=" + continent + ", area=" + area + ", pop=" + pop + "}\n";
        //return code;
    }
    
    
  
}
