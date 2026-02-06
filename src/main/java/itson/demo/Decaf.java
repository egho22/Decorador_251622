/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.demo;

/**
 *
 * @author Alejandro Rodríguez Lugo - 251622
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Descafeinado";
    }

    @Override
    public double cost() {
        return 55.5;
    }
}
