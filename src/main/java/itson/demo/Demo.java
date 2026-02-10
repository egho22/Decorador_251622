/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package itson.demo;

/**
 *
 * @author Alejandro Rodríguez Lugo - 251622
 */
public class Demo {

    public static void main(String[] args) {
        // Pedimos un espresso simple
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // Pedimos un espresso con doble mocha y crema 
        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2); // Envolvemos con Mocha
        beverage2 = new Mocha(beverage2); // Envolvemos con otro Mocha
        beverage2 = new Whip(beverage2);  // Envolvemos con Crema
        System.out.println(beverage2.getDescription() + " $" + String.format("%.2f", beverage2.cost()));
    }
}
