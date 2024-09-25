/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1061688186
 */
public class Entrenador extends SeleccionFutbol{
    public String id_Federacion;

    public Entrenador() {
        super();
    }

    public Entrenador(String Nombres, String Apellidos, String id, int edad,String id_Federacion) {
        super(Nombres, Apellidos, id, edad);
        this.id_Federacion = id_Federacion;
    }

    public String getId_Federacion() {
        return id_Federacion;
    }

    public void setId_Federacion(String id_Federacion) {
        this.id_Federacion = id_Federacion;
    }

    public void DirigirPartido() {
        System.out.println("Dirigiendo partido");
    }
    public void DirigirEntrenamiento() {
        System.out.println("Dirigiendo Entrenamineto");
    }
    
}
