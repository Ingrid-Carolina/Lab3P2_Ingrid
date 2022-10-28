/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_ingridhernandez_12141186;

import java.util.ArrayList;
import java.util.Random;
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
        Random r = new Random();
        defaultpersonajes();
        int hp = 0;
        boolean centinela = true;
        
        while (centinela == true) {
            System.out.println("===========Menu Principal============");
            System.out.println("1)Creacion Personaje");
            System.out.println("2)Modificar Personaje");
            System.out.println("3)Ver atribudos");
            System.out.println("4)Eliminar ");
            System.out.println("5)Combate");
            System.out.println("6)salir");
            System.out.println("====================================");
            System.out.print("Ingrese la opcion que desea: ");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1: {
                    boolean centinela1 = true;                    
                    while (centinela1 == true) {
                        System.out.println("================SubMENU=================");
                        System.out.println("Ingrese la clase de personaje");                        
                        System.out.println("1)Clerigo ");
                        System.out.println("2)Barbaro ");
                        System.out.println("3)Mago");
                        System.out.println("4)Picaro");                        
                        System.out.println("5)salir");
                        System.out.println("========================================");
                        System.out.println("que clase desea: ");
                        int p = lea.nextInt();
                        switch (p) {
                            case 1: {
                                System.out.println("Ingrese el Nombre del presonaje: ");
                                String nom = lea.next();
                                System.out.println("=============================");
                                System.out.println("Ingrese la el tipo de raza");
                                System.out.println("1. Mediano");
                                System.out.println("2. Enano");
                                System.out.println("3. Elfo");
                                System.out.println("4. Humano");
                                System.out.println("============================");
                                int tr = lea.nextInt();
                                String raza = "";
                                
                                if (tr == 1) {
                                    raza = "Mediano";
                                    hp = 50 + r.nextInt(60);
                                } else if (tr == 2) {
                                    raza = "Enano";
                                    hp = 80 + r.nextInt(100);
                                } else if (tr == 3) {
                                    raza = "Elfo";
                                    hp = 50 + r.nextInt(70);
                                } else if (tr == 4) {
                                    raza = "Humano";
                                    hp = 40 + r.nextInt(75);
                                } else {
                                    System.out.println("no existe esa raza");
                                }
                                System.out.println("Ingrese la estatura del personaje: ");
                                double estatura = lea.nextDouble();
                                System.out.println("Ingrese el peso del Personaje: ");
                                double peso = lea.nextDouble();
                                System.out.println("Ingrese el edad del personaje: ");
                                int edad = lea.nextInt();
                                int ac = 40;
                                int cs = 97;                                
                                System.out.println("Ingrese la descripsion del personaje:");
                                String desp = lea.next();
                                System.out.println("============================================");
                                System.out.println("Ingrese la nacionalidad del personaje");
                                System.out.println("1. Norfair");
                                System.out.println("2. Brinstar");
                                System.out.println("3. Maridia");
                                System.out.println("4. Zebes");
                                System.out.println("5. Crateria");
                                System.out.println("============================================");
                                int tn = lea.nextInt();
                                String nac = "";
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
                                System.out.println("============================================");
                                System.out.println("Tipo del personaje esta clase Clerigo es");
                                System.out.println("1-lead");
                                System.out.println("============================================");
                                String tp = "Lead";
                                
                                per.add(new Clerigo(dd, invo, nom, raza, estatura, peso, edad, ac, cs, hp, desp, nac, tp));
                                System.out.println("ya se agrego la clase Clerigo con existo");
                            }
                            break;
                            case 2: {
                                System.out.println("Ingrese el Nombre del presonaje: ");
                                String nom = lea.next();
                                System.out.println("==================================");
                                System.out.println("Ingrese la el tipo de raza:");
                                System.out.println("1. Mediano");
                                System.out.println("2. Enano");
                                System.out.println("3. Elfo");
                                System.out.println("4. Humano");
                                System.out.println("==================================");
                                int tr = lea.nextInt();
                                String raza = "";
                                
                                if (tr == 1) {
                                    raza = "Mediano";
                                   hp = 50 + r.nextInt(60);
                                } else if (tr == 2) {
                                    raza = "Enano";
                                    hp = 80 + r.nextInt(100);
                                } else if (tr == 3) {
                                    raza = "Elfo";
                                   hp = 50 + r.nextInt(70);
                                } else if (tr == 4) {
                                    raza = "Humano";
                                   hp = 40 + r.nextInt(75);
                                } else {
                                    System.out.println("no existe esa raza");
                                }
                                System.out.println("Ingrese la estatura del personaje: ");
                                double estatura = lea.nextDouble();
                                System.out.println("Ingrese el peso del Personaje: ");
                                double peso = lea.nextDouble();
                                System.out.println("Ingrese el edad del personaje: ");
                                int edad = lea.nextInt();
                                int ac = 65;
                                int cs = 93;
                                
                                System.out.println("Ingrese la descripsion del personaje:");
                                String desp = lea.next();
                                System.out.println("=========================================");
                                System.out.println("Ingrese la nacionalidad del personaje:");
                                System.out.println("1. Norfair");
                                System.out.println("2. Brinstar");
                                System.out.println("3. Maridia");
                                System.out.println("4. Zebes");
                                System.out.println("5. Crateria");
                                System.out.println("=========================================");
                                int tn = lea.nextInt();
                                String nac = "";
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
                                System.out.println("==================================");
                                System.out.println("Ingrese el tipo de arama:");
                                System.out.println("1.Pesada");
                                System.out.println("2.Ligera");
                                System.out.println("3.Escudo");
                                System.out.println("==================================");
                                System.out.println("Ingrese el tipo de arma:");
                                int ar = lea.nextInt();
                                String arm = "";
                                if (ar == 1) {
                                    arm = "Pesada";
                                } else if (ar == 2) {
                                    arm = "Ligera";
                                } else if (ar == 3) {
                                    arm = "Escudo";
                                } else {
                                    System.out.println("No existe otra arma");
                                }
                                System.out.println("Ingrese el nivel px:");
                                int px = lea.nextInt();
                                System.out.println("============================================");
                                System.out.println("Tipo del personaje esta clase Barbaro es:");
                                System.out.println("1-lead");
                                System.out.println("2-Support ");
                                System.out.println("3-offensive");
                                System.out.println("=============================================");
                                System.out.println("Ingrese le Tipo de Personaje:");
                                int rv = lea.nextInt();
                                String tp = "";
                                if (rv == 1) {
                                    tp = "lead";
                                } else if (rv == 2) {
                                    tp = "Support";                                    
                                } else if (rv == 3) {
                                    tp = "offensive";                                    
                                } else {
                                    System.out.println("No existe tipo de personaje.");
                                }
                                
                                per.add(new Barbaro(arm, px, nom, raza, estatura, peso, edad, ac, cs, hp, desp, nac, tp));
                                System.out.println("ya se agrego la clase Barbaro con existo");
                            }
                            
                            break;
                            case 3: {
                                System.out.println("Ingrese el Nombre del presonaje: ");
                                String nom = lea.next();
                                System.out.println("==================================");
                                System.out.println("Ingrese la el tipo de raza:");
                                System.out.println("1. Mediano");
                                System.out.println("2. Enano");
                                System.out.println("3. Elfo");
                                System.out.println("4. Humano");
                                System.out.println("==================================");
                                int tr = lea.nextInt();
                                String raza = "";
                               
                                if (tr == 1) {
                                    raza = "Mediano";
                                    hp = 50 + r.nextInt(60);
                                } else if (tr == 2) {
                                    raza = "Enano";
                                    hp = 80 + r.nextInt(100);
                                } else if (tr == 3) {
                                    raza = "Elfo";
                                    hp = 50 + r.nextInt(70);
                                } else if (tr == 4) {
                                    raza = "Humano";
                                    hp = 40 + r.nextInt(75);
                                } else {
                                    System.out.println("no existe esa raza");
                                }
                                System.out.println("Ingrese la estatura del personaje: ");
                                double estatura = lea.nextDouble();
                                System.out.println("Ingrese el peso del Personaje: ");
                                double peso = lea.nextDouble();
                                System.out.println("Ingrese el edad del personaje: ");
                                int edad = lea.nextInt();
                                int ac = 20;
                                int cs = 101;
                                System.out.println("Ingrese la descripsion del personaje:");
                                String desp = lea.next();
                                System.out.println("=======================================");
                                System.out.println("Ingrese la nacionalidad del personaje");
                                System.out.println("1. Norfair");
                                System.out.println("2. Brinstar");
                                System.out.println("3. Maridia");
                                System.out.println("4. Zebes");
                                System.out.println("5. Crateria");
                                System.out.println("======================================");
                                int tn = lea.nextInt();
                                String nac = "";
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
                                System.out.println("=================================");
                                System.out.println("Ingrese el tipo de mago");
                                System.out.println("1.Mago Blanco");
                                System.out.println("2.Mago Negro");
                                System.out.println("3.Sanador");
                                System.out.println("=================================");
                                System.out.println("Ingrese el tipo de mago:");
                                int ar = lea.nextInt();
                                String mag = "";
                                if (ar == 1) {
                                    mag = "Mago Blanco";
                                } else if (ar == 2) {
                                    mag = "Mago Negro";
                                } else if (ar == 3) {
                                    mag = "Sanador";
                                } else {
                                    System.out.println("No existe otra tipo de mago");
                                }
                                System.out.println("=============================================");
                                System.out.println("Tipo del personaje esta clase Barbaro es:");
                                System.out.println("1-Support");
                                System.out.println("2-Tank");
                                System.out.println("=============================================");
                                System.out.println("Ingrese le Tipo de Personaje:");
                                int rv = lea.nextInt();
                                String tp = "";                                
                                if (rv == 1) {
                                    tp = "Support";
                                } else if (rv == 2) {
                                    tp = "Tank";                                    
                                } else {
                                    System.out.println("No existe tipo de personaje");
                                    
                                }
                                per.add(new Mago(mag, nom, raza, estatura, peso, edad, ac, cs, hp, desp, nac, tp));
                                System.out.println("ya se agrego la clase Mago con existo");
                            }                            
                            break;
                            case 4: {
                                System.out.println("Ingrese el Nombre del presonaje: ");
                                String nom = lea.next();
                                System.out.println("=================================");
                                System.out.println("Ingrese la el tipo de raza");
                                System.out.println("1. Mediano");
                                System.out.println("2. Enano");
                                System.out.println("3. Elfo");
                                System.out.println("4. Humano");
                                System.out.println("=================================");
                                int tr = lea.nextInt();
                                String raza = "";
                                
                                if (tr == 1) {
                                    raza = "Mediano";
                                   hp = 50 + r.nextInt(60);
                                } else if (tr == 2) {
                                    raza = "Enano";
                                    hp = 80 + r.nextInt(1000);
                                } else if (tr == 3) {
                                    raza = "Elfo";
                                   hp = 50 + r.nextInt(70);
                                } else if (tr == 4) {
                                    raza = "Humano";
                                    hp = 40 + r.nextInt(75);
                                } else {
                                    System.out.println("no existe esa raza");
                                }
                                System.out.println("Ingrese la estatura del personaje: ");
                                double estatura = lea.nextDouble();
                                System.out.println("Ingrese el peso del Personaje: ");
                                double peso = lea.nextDouble();
                                System.out.println("Ingrese el edad del personaje: ");
                                int edad = lea.nextInt();
                                int ac = 50;
                                int cs = 80;
                                System.out.println("Ingrese la descripsion del personaje:");
                                String desp = lea.next();
                                System.out.println("=======================================");
                                System.out.println("Ingrese la nacionalidad del personaje");
                                System.out.println("1. Norfair");
                                System.out.println("2. Brinstar");
                                System.out.println("3. Maridia");
                                System.out.println("4. Zebes");
                                System.out.println("5. Crateria");
                                System.out.println("=======================================");
                                int tn = lea.nextInt();
                                String nac = "";
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
                                System.out.println("======================================");
                                System.out.println("el tipo de instrumento:");
                                System.out.println("1.Amuleto");
                                System.out.println("2.Arma");
                                System.out.println("3.Piedra Antigua");
                                System.out.println("======================================");
                                System.out.println("Ingrese el tipo de instrumento:");
                                int ar = lea.nextInt();
                                String mag = "";
                                if (ar == 1) {
                                    mag = "Amuleto";
                                } else if (ar == 2) {
                                    mag = "Arma";
                                } else if (ar == 3) {
                                    mag = "Piedra Antigua";
                                } else {
                                    System.out.println("No existe otra tipo de instrumento");
                                }
                                System.out.println("Ingrese la cantidad de robos exitosos:");
                                int robo = lea.nextInt();
                                System.out.println("==========================================");
                                System.out.println("Tipo del personaje esta clase Barbaro es");
                                System.out.println("1-Spammer");
                                System.out.println("2-Tank");
                                System.out.println("==========================================");
                                System.out.println("Ingrese le Tipo de Personaje:");
                                int rv = lea.nextInt();
                                String tp = "";                                
                                if (rv == 1) {
                                    tp = "Spammer";
                                } else if (rv == 2) {
                                    tp = "Tank";                                    
                                } else {
                                    System.out.println("No existe tipo de personaje");
                                    
                                }
                                per.add(new Picaro(mag, robo, nom, raza, estatura, peso, edad, ac, cs, hp, desp, nac, tp));
                                System.out.println("ya se agrego la clase Picaro con existo");
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
                case 2: {
                    System.out.println("Ingrese la posicion del Personaje:");
                    int pos = lea.nextInt();
                    if (pos < per.size()) {
                        
                        boolean centinela3 = true;
                        while (centinela3 == true) {
                            System.out.println("==========================================");
                            System.out.println("Que es lo que desea editar");
                            System.out.println("1)nombre");
                            System.out.println("2)Raza");
                            System.out.println("3)estatura");
                            System.out.println("4)peso");
                            System.out.println("5)Edad");
                            System.out.println("6)Descripcion");
                            System.out.println("7)nacinalidad");
                            System.out.println("8)salir");
                            System.out.println("===========================================");
                            System.out.print("Ingrese la opcion que desea: ");
                            int opc = lea.nextInt();
                            switch (opc) {
                                case 1: {
                                    System.out.println("Ingrese el nuevo nombre: ");
                                    String nom = lea.next();
                                    ((Personaje) per.get(pos)).setNombre(nom);
                                    System.out.println("Modifico existosamente");
                                }//fin del case 1
                                break;
                                case 2: {
                                    System.out.println("===================================");
                                    System.out.println("Ingrese el nuevo tipo de raza");
                                    System.out.println("1. Mediano");
                                    System.out.println("2. Enano");
                                    System.out.println("3. Elfo");
                                    System.out.println("4. Humano");
                                    System.out.println("=================================");
                                    int tr = lea.nextInt();
                                    String raza = "";
                                    
                                    if (tr == 1) {
                                        raza = "Mediano";
                                       hp = 50 + r.nextInt(60);
                                    } else if (tr == 2) {
                                        raza = "Enano";
                                        hp = 80 + r.nextInt(100);
                                    } else if (tr == 3) {
                                        raza = "Elfo";
                                        hp = 50 + r.nextInt(70);
                                    } else if (tr == 4) {
                                        raza = "Humano";
                                       hp = 40 + r.nextInt(75);
                                    } else {
                                        System.out.println("no existe esa raza");
                                    }
                                    ((Personaje) per.get(pos)).setRaza(raza);
                                    System.out.println("Modifico existosamente");
                                }//fin del case 2
                                break;
                                case 3: {
                                    System.out.println("Ingrese la nueva estatura del personaje: ");
                                    double estatura = lea.nextDouble();
                                    
                                    ((Personaje) per.get(pos)).setEstaura(estatura);
                                    System.out.println("Modifico existosamente");                                    
                                    
                                }//fin del case 3
                                break;
                                case 4: {
                                    System.out.println("Ingrese el nuevo peso del Personaje: ");
                                    double peso = lea.nextDouble();
                                    ((Personaje) per.get(pos)).setPeso(peso);
                                    System.out.println("Modifico existosamente");                                    
                                }//fin del case 4
                                break;
                                case 5: {
                                    System.out.println("Ingrese el nuevo edad del personaje: ");
                                    int edad = lea.nextInt();
                                    ((Personaje) per.get(pos)).setEdad(edad);
                                    System.out.println("Modifico existosamente");                                    
                                }//fin del case 5
                                break;
                                case 6: {
                                    System.out.println("Ingrese la descripsion del personaje:");
                                    String desp = lea.next();
                                    ((Personaje) per.get(pos)).setDescripcion(desp);
                                    System.out.println("Modifico existosamente");                                    
                                }//fin del case 6
                                break;
                                case 7: {
                                    System.out.println("=======================================");
                                    System.out.println("Ingrese la nacionalidad del personaje");
                                    System.out.println("1. Norfair");
                                    System.out.println("2. Brinstar");
                                    System.out.println("3. Maridia");
                                    System.out.println("4. Zebes");
                                    System.out.println("5. Crateria");
                                    System.out.println("=======================================");
                                    int tn = lea.nextInt();
                                    String nac = "";
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
                                    ((Personaje) per.get(pos)).setNacionalidad(nac);
                                    System.out.println("Modifico existosamente");
                                }//fin del case 7
                                break;
                                case 8:
                                    centinela3 = false;
                                    break;
                                
                                default:
                                    System.out.println("Opcion Incorrecta");
                            }//fin del switch
                        }//fin while
                    }
                    
                }//fin del case 2
                break;
                case 3: {
                    for (Object object : per) {
                        if (object instanceof Personaje) {
                            String message = String.format("[%d] %s%n", per.indexOf(object), object);
                            System.out.println(message);
                        }
                    }                    
                }//fin del case 3
                break;
                case 4: {
                    System.out.println("Ingrese la posicion del Personaje que desea eliminar:");
                    int p = lea.nextInt();
                    if (p < per.size() && per.get(p) instanceof Personaje) {
                        per.remove(p);
                        System.out.println("Personaje Eliminado");
                        
                    } else {
                        System.out.println("No existe el aula que busca");
                        
                    }
                }//fin del case 3
                break;
                case 5: {
                    //Combate
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

    public static void defaultpersonajes() {
        per.add(new Clerigo("Lucifer", "Hielo", "lamar", "Elfo", 5.7, 8.4, 23, 40, 97, 78, "Increible", "Zebes", "lead"));
        per.add(new Barbaro("ligera", 57, "Fer", "Elfo", 8.4, 5.3, 33, 65, 93, 81, "Bosque", "Crateria", "offensive"));
        per.add(new Mago("Sanador", "Juan", "Mediano", 9.3, 4.6, 29, 20, 101, 54, "Fuerte", "Norfair", "Tank"));
        per.add(new Mago("Mago Negro", "luis", "Enano", 6.5, 8.4, 29, 20, 101, 85, "Veloz", "Brinstar", "Support"));
    }
}
