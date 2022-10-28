package lab3p2_ingridhernandez_12141186;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMINISTRADOR1
 */
public class Personaje {
    private String nombre;
    private String raza;
    private double estaura;
    private double peso;
    private int edad;
    private String descripcion;
    private String nacionalidad;
    private String Tp;

    public Personaje() {
    }

    public Personaje(String nombre, String raza, double estaura, double peso, int edad, String descripcion, String nacionalidad, String Tp) {
        this.nombre = nombre;
        this.raza = raza;
        this.estaura = estaura;
        this.peso = peso;
        this.edad = edad;
        this.descripcion = descripcion;
        this.nacionalidad = nacionalidad;
        this.Tp = Tp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getEstaura() {
        return estaura;
    }

    public void setEstaura(double estaura) {
        this.estaura = estaura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTp() {
        return Tp;
    }

    public void setTp(String Tp) {
        this.Tp = Tp;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", raza=" + raza + ", estaura=" + estaura + ", peso=" + peso + ", edad=" + edad + ", descripcion=" + descripcion + ", nacionalidad=" + nacionalidad + ", Tp=" + Tp + '}';
    }
    
    
}