/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yursd
 */
public class Principal {
    public static void main(String[] args) {
        // Crear un objeto de la clase Auto
        Auto miAuto = new Auto("Toyota", "Rojo");

        // Utilizar los métodos de la clase Auto
        miAuto.mostrarInformacion();

        // Cambiar algunos atributos utilizando los setters
        miAuto.setColor("Azul");

        // Mostrar la información actualizada del auto
        miAuto.mostrarInformacion();
    }
}

