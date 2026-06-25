/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package deporte;

/**
 *
 * @author Usuario
 */
public enum Categoria {
    
    INFANTIL(10),
    JUVENIL(15),
    ADULTA(20);
    
    
    private int edadMinima;
    
    
    public int getEdadMinima() {
        return edadMinima;
    }
    
    
    Categoria(int edadMinima) {
        this.edadMinima = edadMinima;
    }
    
    
    @Override
    public String toString() {
        return "Edad minima"+ edadMinima;
    }
}
