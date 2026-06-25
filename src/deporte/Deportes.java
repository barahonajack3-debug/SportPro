/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deporte;

/**
 *
 * @author Usuario
 */
public class Deportes {
    
    private String Futbol;
    private String Baloncesto;
    private String Voleibol;
    private Categoria Categoria;
    private int capacidadMaxima;
    
    public String getFutbol(){
        return Futbol;
    }
    public String getBaloncesto(){
        return Baloncesto;
    }
    public String getVoleibol(){
        return Voleibol;
    }
    public int getCapacidadMaxima(){
    return capacidadMaxima;
    }
    
    public void setCapacidadMaxima(int capacidadMaxima){
    this.capacidadMaxima = capacidadMaxima;
    }
   
    
    public Deportes (String Futbol, String Baloncesto, String Voleibol,int capacidadMaxima){
        this.Futbol=Futbol;
        this.Baloncesto=Baloncesto;
        this.Voleibol=Voleibol;
        this.capacidadMaxima = capacidadMaxima;
    }
    
    @Override
    public String toString(){
        return "Futbol"+this.getFutbol()+ "\nBaloncesto"+ this.getBaloncesto()+ "\nVoleibol"+this.getVoleibol()+
                "\nCapacidad Maxima"+this.getCapacidadMaxima();
    }
}