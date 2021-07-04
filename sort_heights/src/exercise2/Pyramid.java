/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Islam
 */
public class Pyramid {
    private float hieght;
    private float volume;
    private String site;
    public Pyramid (String site, String hieght, String volume){
       if ("".equals(hieght)){
           hieght = "0";
       }
       if ("".equals(volume)){
           volume = "0";
       }
       float hieght_float = Float.parseFloat(hieght);
       float volume_float = Float.parseFloat(volume);
       this.site = site;
       this.hieght = hieght_float;
       this.volume = volume_float;
    }
    /**

     * @return the site
     */
    public String getSite() {
        return site;
    }

    /**
     * @param site the site to set
     */
    public void setSite(String site) {
        this.site = site;
    }
    /**
     * @return the hieght
     */
    public float getHieght() {
        return hieght;
    }

    /**
     * @param hieght the hieght to set
     */
    public void setHieght(float hieght) {
        this.hieght = hieght;
    }

    /**
     * @return the volume
     */
    public float getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(float volume) {
        this.volume = volume;
    }
    
    public String toString(){
        String s = "height = "+this.hieght;
        return s;
    }
}
