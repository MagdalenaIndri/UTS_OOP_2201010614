/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author indri
 */
public class DataMenu {
     private String name;
     private double price;
    
    public  DataMenu(String name, double price){
        this.name= name;
        this.price = price;
    }
    public String getNAME(){
        return name;
    }
    public void setNAME(String name){
        this.name = name;
    }
    public double getPrice(){
        return price ;
    }
    public void setPrice(double price){
        this.price = price;
    }
    @Override
    public String toString(){
        return "Menu{name='" + name + "', price=" + price + "}";
    }
    
}


