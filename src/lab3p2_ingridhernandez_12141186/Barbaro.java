/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_ingridhernandez_12141186;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Barbaro extends Personaje {
    private String arma;

    public Barbaro() {
    }

    public Barbaro(String arma) {
        this.arma = arma;
    }

    public Barbaro(String arma, String nombre, String raza, double estaura, double peso, int edad, String descripcion, String nacionalidad, String Tp) {
        super(nombre, raza, estaura, peso, edad, descripcion, nacionalidad, Tp);
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Barbaro{" + "arma=" + arma + '}';
    }
    
}
