/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrenador;
import java.time.LocalDate;
import persona.Personas;
/**
 *
 * @author Dario R
 */
public class Entrenadores extends Personas {
    private int experiencia;
    
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public Entrenadores(String Nombre_Completo, LocalDate Fecha_Nacimiento, String Telefono) {
        super(Nombre_Completo, Fecha_Nacimiento, Telefono);
    }

    @Override
    public String toString() {
        return "Entrenadores{" +"Nombre Completo"+ this.getNombre_Completo()+
               "\nExperiencia=" + this.getExperiencia() +
               "\nFecha de nacimiento" + this.getFecha_Nacimiento()+
               "\nNumero Telefonico" + this.getTelefono();
    }
    
   
}
