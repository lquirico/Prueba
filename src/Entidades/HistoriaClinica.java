/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author matur
 */
public class HistoriaClinica {
    
    private Paciente paciente;
    private ArrayList<EntradaHistorial> entradas;

    public HistoriaClinica(Paciente paciente) {
        this.paciente = paciente;
        this.entradas = new ArrayList<>();
    }
    
    public void agregarEntrada(EntradaHistorial eh){
        entradas.add(eh);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
 
        sb.append("Paciente: ").append(paciente.getNombreYApellido());
        sb.append(",Historia clinica: ").append(entradas);
        
        return sb.toString();
    }  
}
