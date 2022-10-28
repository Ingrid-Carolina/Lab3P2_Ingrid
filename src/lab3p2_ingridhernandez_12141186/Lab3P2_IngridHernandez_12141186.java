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

    static ArrayList<Personaje> personaje = new ArrayList();
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        
        boolean centinela = true;
        
        while(centinela == true){
            System.out.println("1)Creacion Personaje");
            System.out.println("2)Modificar Personaje");
            System.out.println("3)Vaer atribudos");
            System.out.println("4)Eliminar ");
            System.out.println("5)Combate");
            System.out.println("6)salir");
             System.out.print("Ingrese la opcion que desea: ");
            int opcion = lea.nextInt();
            switch (opcion){
                case 1:{
                    boolean centinela1 = true;

                    while (centinela1 == true) {
                        System.out.println("1)Clerigo ");
                        System.out.println("2)Barbaro ");
                        System.out.println("3)Mago");
                        System.out.println("4)Picaro");
                        System.out.print("Ingreseel personaje que desea: ");
                        int op = lea.nextInt();
                        switch (op) {
                            case 1: {
                                System.out.println("Ingrese el Nombre del presonaje: ");
                                String nom = lea.next();
                                System.out.println("Ingrese la el tipo de raza:");
                                System.out.println("1. Mediano");
                                System.out.println("2. Enano");
                                System.out.println("3. Elfo");
                                System.out.println("4. Humano");
                                int tr = lea.nextInt();
                                String raza;
                                if(tr == 1){
                                    raza = "Mediano";
                                }else if( tr == 2){
                                    raza = "Enano";
                                }else if(tr == 3){
                                    raza = "Elfo";
                                }else if( tr == 4){
                                    raza = "Humano";
                                }else {
                                    System.out.println("no existe esa raza");
                                }
                                System.out.println("Ingrese la estatura del personaje: ");
                                double estatura = lea.nextInt();
                                System.out.println("");
                            }//fin del case 1
                            break;
                            case 2: {

                            }//fin del case 2
                            break;
                            case 3: {

                            }//fin del case 3
                            break;
                            case 4:
                                centinela1 = false;
                                break;

                            default:
                                System.out.println("Opcion Incorrecta");
                        }//fin del switch
                    }//fin while
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
