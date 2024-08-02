/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yursd
 */
public class Auto {
    // Atributos
    private String marca;
    private String color;

    // Constructor
    public Auto(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método para mostrar la información del auto
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
    }
}
