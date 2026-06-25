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
    private String Disciplinas; //Debo importar de disciplina
    private String Entrenadores; //Debo importar de entrenador
    private String Participantes; //Debo importar de participante
    private String Sistema; //Debo importar de sistema
    //Metodos get 
    public String getDisciplinas() {
        return Disciplinas;
    }
    public String getEntrenadores() {
        return Entrenadores;
    }
    public String getParticipantes() {
        return Participantes;
    }
    public String getSistema() {
        return Sistema;
    }
    //Metodos set
    public void setDisciplinas(String Disciplinas) {
        this.Disciplinas = Disciplinas;
    }
    public void setEntrenadores(String Entrenadores) {
        this.Entrenadores = Entrenadores;
    }
    public void setParticipantes(String Participantes) {
        this.Participantes = Participantes;
    }
    //Metodo Constructor
    public Academias(String Disciplinas, String Entrenadores, String Participantes, String Sistema) {
        this.Disciplinas = Disciplinas;
        this.Entrenadores = Entrenadores;
        this.Participantes = Participantes;
        this.Sistema = Sistema;
    }
    //To String
    public String toString() {
        return "Disciplinas:" + Disciplinas + "\nEntrenadores:" + Entrenadores + "\nParticipantes:" + Participantes + "\nSistema:" + Sistema;
    }
}
