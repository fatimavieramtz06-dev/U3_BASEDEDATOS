package com.model;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fatim
 */
public class Personal {
    private int idPersonal;
    private String nombre;
    private String apellido;
    private String correo;
    private String fecha;
    private String sexo;
    
    public Personal(){
    }
    
    public Personal(int idPersonal, String nombre, String apellido, String correo, String fecha, String sexo){
        this.idPersonal = idPersonal;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fecha = fecha;
        this.sexo = sexo;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public int calcularEdad(){
        int edad = 0;
       
        LocalDate f_nacimiento = LocalDate.of(
                                              Integer.valueOf(fecha.substring(0, 4)), 
                                              Integer.valueOf(fecha.substring(5, 7)), 
                                              Integer.valueOf(fecha.substring(8, 10)));
    
        LocalDate f_actual = LocalDate.now();
        
        Period periodo = Period.between(f_nacimiento, f_actual);
        
        edad = periodo.getYears();
        return edad;
    }

    @Override
    public String toString() {
        return "Personal{" + "idPersonal=" + idPersonal + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", fecha=" + fecha + ", sexo=" + sexo + '}';
    }   
}
