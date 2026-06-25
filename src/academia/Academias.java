/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academia;

/**
 *
 * @author USER
 */
public class Academias {
    //Atributos
    private String Nombre;
    private String[] Disciplinas; //Debo importar de disciplina
    private int cantidadDisciplinas;
    //Metodos get
    public String getNombre() {
        return Nombre;
    }
    public String[] getDisciplinas() {
        return Disciplinas;
    }
    public int getCantidadDisciplinas() {
        return cantidadDisciplinas;
    }
    //Metodos set
    public void setNombre(String Nombre) {
        this.Nombre = Nombre; 
    }
    public void setCantidadDisciplinas(int cantidadDisciplinas) {
        this.cantidadDisciplinas = cantidadDisciplinas;
    }
    //Metodo Constructor
       public Academias(String nombre, int capacidadMaxDisciplinas) {
        this.Nombre=nombre;
        this.Disciplinas=new Disciplinas[capacidadMaxDisciplinas];
        this.cantidadDisciplinas=0;
    }
       public Academias(String nombre) {
        this(nombre, 10);
    }
    //Metodos Funciones
       //Registrar entrda de disciplinas 
       public boolean registrarDisciplina(Disciplina d){
       if (cantidadDisciplinas >= disciplinas.length) {
       System.out.println("No hay espacios disponibles");
       return false;
       }
           Disciplinas[cantidadDisciplinas]=d;
           cantidadDisciplinas++;
           return true;
       }
       
    //To String
    public String toString() {
        return "Disciplinas:" + Disciplinas;
    }
}
