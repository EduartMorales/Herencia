/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1061688186
 */
public class Futbolista extends SeleccionFutbol{
    // Atributos
    public String Dorsal;
    public String Posicion;

    public Futbolista() {
        super();
    }

    public Futbolista( String Nombres, String Apellidos, String id, int edad,String Dorsal, String Posicion) {
        super(Nombres, Apellidos, id, edad);
        this.Dorsal = Dorsal;
        this.Posicion = Posicion;
    }

    public String getDorsal() {
        return Dorsal;
    }

    public void setDorsal(String Dorsal) {
        this.Dorsal = Dorsal;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }
    
    public void JugarPartido() {
        System.out.println("Jugando Paratido");
    }
    
    public void Entrenando() {
        System.out.println("Entrenando");
    }
}
