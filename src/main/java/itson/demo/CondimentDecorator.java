/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.demo;

/**
 *
 * @author Alejandro Rodríguez Lugo - 251622
 */
public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage; // El objeto que estamos envolviendo

    public abstract String getDescription();
}
