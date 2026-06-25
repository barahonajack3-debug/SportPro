/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academia;
import deporte.Deportes;
import deporte.Categoria;

/**
 *
 * @author USER 
 */
public class Academias {
    //Atributos
    private String Nombre="SportPRO";
    private Deportes[] Deportes; //Debo importar de disciplina
    private int cantidadDeportes;
    //Metodos get
    public String getNombre() {
        return Nombre;
    }
    public Deportes[] getDisciplinas() {
        return Deportes;
    }
    public int getCantidadDisciplinas() {
        return cantidadDeportes;
    }
    //Metodos set
    public void setNombre(String Nombre) {
        this.Nombre = Nombre; 
    }
    public void setCantidadDisciplinas(int cantidadDeportes) {
        this.cantidadDeportes = cantidadDeportes;
    }
    //Metodo Constructor
       public Academias(String nombre, int capacidadMaxDisciplinas) {
        this.Nombre=nombre;
        this.Deportes=new Deportes[capacidadMaxDisciplinas];
        this.cantidadDeportes=0;
    }
       public Academias(String nombre) {
        this(nombre, 10);
    }
    //Metodos Funciones
       //Registrar entrda de disciplinas 
       public boolean registrarDisciplina(Deportes d){
       if (cantidadDeportes >= Deportes.length) {
       System.out.println("No hay espacios disponibles");
       return false;
       }
           Deportes[cantidadDeportes]=d;
           cantidadDeportes++;
           return true;
       }
        public void mostrarInformacionCompleta(){
           System.out.println("================================");
           System.out.println("Academia: " + Nombre);
           System.out.println("Cantidad de disciplinas: " + cantidadDeportes);
           System.out.println("================================");
           for (int i = 0; i < cantidadDeportes; i++) {
               System.out.println(Deportes[i].toString());
               System.out.println("--------------------------------");
           }
       }
    //To String
    public String toString() {
        return "Academia:" + Nombre+ "\nCantidad de disciplinas: " + cantidadDeportes;
    }
}
