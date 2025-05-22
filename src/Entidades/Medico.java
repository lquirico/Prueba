/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author matur
 */
public class Medico extends Persona {
    private Especialidad especialidad;

    public Medico(Especialidad especialidad, String nombre, String apellido, int edad, String dni) {
        super(nombre, apellido, edad, dni);
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Medico: ");
        sb.append(super.toString());
        sb.append(System.lineSeparator());
        sb.append("Especialidad: ").append(especialidad);
        
        return sb.toString();
    }
    
    
}
