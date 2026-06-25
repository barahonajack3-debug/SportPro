/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author USER
 */
public class Personas {
    //Atributos 
    private String Nombre_Completo;
    private LocalDate Fecha_Nacimiento;
    private String Telefono;

    //Metodos get
    public String getNombre_Completo() {
        return Nombre_Completo;
    }
    public LocalDate getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }
    public String getTelefono() {
        return Telefono;
    }
    public int getEdad(){
        return Period.between(Fecha_Nacimiento,LocalDate.now()).getYears();
    }
    //Metodos Set
    public void setNombre_Completo(String Nombre_Completo) {
        this.Nombre_Completo = Nombre_Completo;
    }
    //Metodo Constructor
    public Personas(String Nombre_Completo, LocalDate Fecha_Nacimiento, String Telefono) {
        this.Nombre_Completo = Nombre_Completo;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Telefono = Telefono;
    }
    //Metodo ToString
    @Override
    public String toString() {
        return "Nombre_Complet:" + Nombre_Completo + "\nFecha_Nacimiento:" + Fecha_Nacimiento + "'\nTelefono:" + Telefono;
    }
    
}
