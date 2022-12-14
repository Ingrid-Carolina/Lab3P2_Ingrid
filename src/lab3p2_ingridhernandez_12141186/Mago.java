/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_ingridhernandez_12141186;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Mago extends Personaje{
    private String tipodeMagia;

    public Mago() {
    }

    public Mago(String tipodeMagia) {
        this.tipodeMagia = tipodeMagia;
    }

    public Mago(String tipodeMagia, String nombre, String raza, double estaura, double peso, int edad, int Ac, int Cs, int Hp, String descripcion, String nacionalidad, String Tp) {
        super(nombre, raza, estaura, peso, edad,  Ac, Cs, Hp, descripcion, nacionalidad, Tp);
        this.tipodeMagia = tipodeMagia;
    }

    public String getTipodeMagia() {
        return tipodeMagia;
    }

    public void setTipodeMagia(String tipodeMagia) {
        this.tipodeMagia = tipodeMagia;
    }

    @Override
    public String toString() {
        return super.toString() +"Mago{" + "tipodeMagia=" + tipodeMagia + '}';
    }
    
}
