/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author matur
 */
public class Tratamiento {
    private String descripcion;
    private int duracion;

    public Tratamiento(){};
    
    

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Descripcion: ").append(descripcion);
        sb.append(System.lineSeparator());
        sb.append("Duracion: ").append(duracion);
        sb.append(System.lineSeparator());
        
        return sb.toString();
    }
    
    
    
    //Metodo de clase
    public static String getTratamiento(Tratamiento tratamiento, Medico medico, Paciente paciente){
        StringBuilder sb = new StringBuilder();
        
        sb.append(tratamiento.toString());
        sb.append(medico.toString());
        sb.append(System.lineSeparator());
        sb.append(paciente.toString());
        
        return sb.toString();        
    }
}
