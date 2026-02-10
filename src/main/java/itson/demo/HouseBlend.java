/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.demo;

/**
 *
 * @author Alejandro Rodríguez Lugo - 251622
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "Café mezcla de la casa";
    }

    @Override
    public double cost() {
        return 60.5;
    }
}
