/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.victorcardozo;

public class Registro {
    private int id;
    private String marca;
    private String modelo;
    private int año;
    private String tipo;
    private String numeroChasis;
    private String color;

    // Constructor
    public Registro(int id, String marca, String modelo, int año, String tipo, String numeroChasis, String color) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.numeroChasis = numeroChasis;
        this.color = color;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método para mostrar información del registro
    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Anho: " + año);
        System.out.println("Tipo: " + tipo);
        System.out.println("Numero de Chasis: " + numeroChasis);
        System.out.println("Color: " + color);
    }}

