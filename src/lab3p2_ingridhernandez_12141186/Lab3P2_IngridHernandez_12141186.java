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
