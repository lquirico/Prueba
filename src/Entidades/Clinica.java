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
public class Clinica {
    private String nombre;
    private ArrayList<Turno> turnos;
    private ArrayList<Persona> personas;
    private ArrayList<HistoriaClinica> historiales;
    private static Clinica instancia;

    
    // Si el constructor tiene que estar vacio pero tengo atributos ArrayList
    // debo asegurarme de inicializarlas
    private Clinica() {
        this.turnos = new ArrayList<>();
        this.personas = new ArrayList<>();
        this.historiales = new ArrayList<>();
    }

    
    //Como debo devolver UNA instancia, primero chequeo que no sea null
    public static Clinica getInstancia() {
        if(instancia == null){
            instancia = new Clinica();
        }
        return instancia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean agregarPersona(Persona persona){
        boolean seAgrego = false;
        if(!this.personas.contains(persona)){
           personas.add(persona);
           seAgrego = true;
        } 
        return seAgrego;
    }
    
    public void agregarHistoriaClinica (HistoriaClinica hc){
        historiales.add(hc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Nombre de la Clinica: ").append(nombre);
        sb.append(System.lineSeparator());
        
        int cantidadMedicos = 0;
        int cantidadPacientes = 0;
        
        for(Persona persona : this.personas){
            if(persona instanceof Medico){
                cantidadMedicos++;
        }else if(persona instanceof Paciente){
                cantidadPacientes++;
                }
        sb.append(persona.toString());
        
    }
        sb.append("Cantidad de medico: ").append(cantidadMedicos);
        sb.append("Cantidad de pacientes: ").append(cantidadPacientes);
        sb.append("Cantidad de historiales: ").append(this.historiales.size());
        return sb.toString();
    }
    
    
    
}
