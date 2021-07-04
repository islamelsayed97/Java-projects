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
public class City {
    private int id;
    private String name;
    private double pop;
    private String code;

    public City(String id, String name, String pop, String code) {
        int i = Integer.parseInt(id);
        this.id = i;
        this.name = name;
        double p = Double.parseDouble(id);
        this.pop = p;
        this.code = code;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the pop
     */
    public double getPop() {
        return pop;
    }

    /**
     * @param pop the pop to set
     */
    public void setPop(double pop) {
        this.pop = pop;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return code;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.code = country;
    }

    @Override
    public String toString() {
        return "City{" + "id=" + id + ", name=" + name + ", pop=" + pop + ", code=" + code + "}\n";
    }
    
    
}
