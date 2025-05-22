/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author matur
 */
public class EntradaHistorial {
    
    private String descripcion;
    private Turno turno;

    public EntradaHistorial(String descripcion, Turno turno) {
        this.descripcion = descripcion;
        this.turno = turno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EntradaHistorial: ");
        sb.append(System.lineSeparator());
        sb.append("descripcion: ").append(descripcion);
        sb.append(System.lineSeparator());
        sb.append("turno: ").append(turno);
        
        return sb.toString();
    }   
}
