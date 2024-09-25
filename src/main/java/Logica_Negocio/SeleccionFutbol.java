/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1061688186
 */
public class SeleccionFutbol {
    protected String Nombres, Apellidos,id;
    protected int edad;

    public SeleccionFutbol() {
    }

    

    public SeleccionFutbol(String Nombres, String Apellidos, String id, int edad) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.id = id;
        this.edad = edad;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    //Metodos propios
    public void Concentrarse() {
        System.out.println("En concentracion");
    }
    
    public void Viajar() {
        System.out.println("Viajando");
    }
}


