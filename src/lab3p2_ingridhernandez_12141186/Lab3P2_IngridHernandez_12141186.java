/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_ingridhernandez_12141186;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Lab3P2_IngridHernandez_12141186 {

    static ArrayList<Personaje> per = new ArrayList();
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        
        boolean centinela = true;
        
        while(centinela == true){
            System.out.println("1)Creacion Personaje");
            System.out.println("2)Modificar Personaje");
            System.out.println("3)Ver atribudos");
            System.out.println("4)Eliminar ");
            System.out.println("5)Combate");
            System.out.println("6)salir");
             System.out.print("Ingrese la opcion que desea: ");
            int opcion = lea.nextInt();
            switch (opcion){
                case 1:{
                    boolean centinela1 = true; 
                            while(centinela1 ==true){
                        System.out.println("Ingrese la clase de personaje");      
                        System.out.println("1)Clerigo ");
                        System.out.println("2)Barbaro ");
                        System.out.println("3)Mago");
                        System.out.println("4)Picaro"); 
                        System.out.println("5)salir");
                        System.out.println("que clase desea: ");
                        int p = lea.nextInt();
                        switch (p ){
                            case 1:{
                                System.out.println("Ingrese el Nombre del presonaje: ");
                                String nom = lea.next();
                                System.out.println("Ingrese la el tipo de raza:");
                                System.out.println("1. Mediano");
                                System.out.println("2. Enano");
                                System.out.println("3. Elfo");
                                System.out.println("4. Humano");
                                int tr = lea.nextInt();
                                String raza="";
                                if (tr == 1) {
                                    raza = "Mediano";
                                } else if (tr == 2) {
                                    raza = "Enano";
                                } else if (tr == 3) {
                                    raza = "Elfo";
                                } else if (tr == 4) {
                                    raza = "Humano";
                                } else {
                                    System.out.println("no existe esa raza");
                                }
                                System.out.println("Ingrese la estatura del personaje: ");
                                double estatura = lea.nextDouble();
                                System.out.println("Ingrese el peso del Personaje: ");
                                double peso = lea.nextDouble();
                                System.out.println("Ingrese el edad del personaje: ");
                                int edad = lea.nextInt();
                                System.out.println("Ingrese la descripsion del personaje:");
                                String desp = lea.next();
                                System.out.println("Ingrese la nacionalidad del personaje:");
                                System.out.println("1. Norfair");
                                System.out.println("2. Brinstar");
                                System.out.println("3. Maridia");
                                System.out.println("4. Zebes");
                                System.out.println("5. Crateria");
                                int tn = lea.nextInt();
                                String nac="";
                                if (tn == 1) {
                                    nac = "Norfair";
                                } else if (tn == 2) {
                                    nac = "Brinstar";
                                } else if (tn == 3) {
                                    nac = "Maridia";
                                } else if (tn == 4) {
                                    nac = "Zebes";
                                } else if (tn == 5) {
                                    nac = "Crateria";
                                } else {
                                    System.out.println("No existe esa nacionalidad");
                                }
                                System.out.println("Ingrese a que que Dios o Demonio Sirve: ");
                                String dd = lea.next();
                                System.out.println("Ingrese la invocacion: ");
                                String invo = lea.next();
                                System.out.println("Tipo del personaje esta clase Clerigo es:");
                                System.out.println("1-lead");
                                String tp = "Lead";

                                per.add(new Clerigo(dd, invo, nom, raza, estatura, peso, edad, desp, nac, tp));
                            }
                            break;
                            case 2:{
                                System.out.println("Ingrese el Nombre del presonaje: ");
                                String nom = lea.next();
                                System.out.println("Ingrese la el tipo de raza:");
                                System.out.println("1. Mediano");
                                System.out.println("2. Enano");
                                System.out.println("3. Elfo");
                                System.out.println("4. Humano");
                                int tr = lea.nextInt();
                                String raza="";
                                if (tr == 1) {
                                    raza = "Mediano";
                                } else if (tr == 2) {
                                    raza = "Enano";
                                } else if (tr == 3) {
                                    raza = "Elfo";
                                } else if (tr == 4) {
                                    raza = "Humano";
                                } else {
                                    System.out.println("no existe esa raza");
                                }
                                System.out.println("Ingrese la estatura del personaje: ");
                                double estatura = lea.nextDouble();
                                System.out.println("Ingrese el peso del Personaje: ");
                                double peso = lea.nextDouble();
                                System.out.println("Ingrese el edad del personaje: ");
                                int edad = lea.nextInt();
                                System.out.println("Ingrese la descripsion del personaje:");
                                String desp = lea.next();
                                System.out.println("Ingrese la nacionalidad del personaje:");
                                System.out.println("1. Norfair");
                                System.out.println("2. Brinstar");
                                System.out.println("3. Maridia");
                                System.out.println("4. Zebes");
                                System.out.println("5. Crateria");
                                int tn = lea.nextInt();
                                String nac="";
                                if (tn == 1) {
                                    nac = "Norfair";
                                } else if (tn == 2) {
                                    nac = "Brinstar";
                                } else if (tn == 3) {
                                    nac = "Maridia";
                                } else if (tn == 4) {
                                    nac = "Zebes";
                                } else if (tn == 5) {
                                    nac = "Crateria";
                                } else {
                                    System.out.println("No existe esa nacionalidad");
                                }
                                System.out.println("Ingrese el tipo de arama:");
                                System.out.println("1.Pesada");
                                System.out.println("2.Ligera");
                                System.out.println("3.Escudo");
                                System.out.println("Ingrese el tipo de arma:");
                                int ar = lea.nextInt();
                                String arm ="";
                                if (ar == 1) {
                                    arm = "Pesada";
                                } else if (ar == 2) {
                                    arm = "Ligera";
                                } else if (ar == 3) {
                                    arm = "Escudo";
                                } else {
                                    System.out.println("No existe otra arma");
                                }
                                System.out.println("Tipo del personaje esta clase Barbaro es:");
                                System.out.println("1-lead");
                                System.out.println("2-Support ");
                                System.out.println("3-offensive");
                                System.out.println("Ingrese le Tipo de Personaje:");
                                int rv= lea.nextInt();
                                String tp="" ;
                                if(rv == 1){
                                tp = "lead";
                                }else if (rv == 2){
                                  tp = "Support";  
                                }else if(rv == 3){
                                   tp= "offensive"; 
                                }

                                per.add(new Barbaro (arm, nom, raza, estatura, peso, edad, desp, nac, tp));
                            }
                             
                            break;
                            case 3:{
                                
                            }  
                            break;
                            case 4:{
                                
                            }  
                            break;
                            case 5:
                                centinela1 = false;
                                break;

                            default:
                                System.out.println("Opcion Incorrecta");
                        } 
                       }
                    
                                
                             
                           
                           
                        
                }//fin del case 1
                break;
                case 2:{
                    
                }//fin del case 2
                break;
                case 3:{
                    
                }//fin del case 3
                break;
                case 4:{
                    
                }//fin del case 3
                break;
                case 5:{
                    
                }//fin del case 3
                break;
                case 6:
                    centinela = false;
                 break;
           
                default:
           System.out.println("Opcion Incorrecta");
            }//fin del switch
    }//fin while
    }
    
}
