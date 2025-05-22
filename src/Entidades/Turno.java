/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author matur
 */
public class Turno {
    private Paciente paciente;
    private Medico medico;
    private LocalDate fecha;

    public Turno(Paciente paciente, Medico medico, LocalDate fecha) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
    
        sb.append("paciente: ").append(paciente.getNombreYApellido());
        sb.append(", medico: ").append(medico.getNombreYApellido());
        sb.append(System.lineSeparator());
        sb.append(", fecha: ").append(fecha);
    
        return sb.toString();
    }    
    
}
