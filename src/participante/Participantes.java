/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package participante;
import persona.Personas;
import java.time.LocalDate;
import deporte.Deportes;

public class Participantes extends Personas {
    private Deportes Disciplina;
    
     public Deportes getDiciplina(){
        return Disciplina;
    }
     
    public Participantes(String Nombre_Completo, LocalDate Fecha_Nacimiento, String Telefono) {
        super(Nombre_Completo, Fecha_Nacimiento, Telefono);
    }
    public String toString() {
        return "Nombre_Complet:" + this.getNombre_Completo() +
                "\nFecha_Nacimiento:" + this.getFecha_Nacimiento() + 
                "'\nDeporte:" + this.getDiciplina();
    }
   
}
