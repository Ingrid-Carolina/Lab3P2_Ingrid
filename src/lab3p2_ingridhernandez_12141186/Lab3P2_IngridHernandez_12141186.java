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
                                System.out.println("Ingrese la Creancia si es un  Dios o Demonio al Sirve: ");
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
                                System.out.println("Tipo del personaje esta clase mago es:");
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
                                System.out.println("Tipo del personaje esta clase picaro es");
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
                        if (per.get(pos) instanceof Clerigo) {
                            System.out.println("====================================================");
                            System.out.println("Que quieres modificar");
                            System.out.println("1-)la Creancia si es un  Dios o Demonio al Sirve ");
                            System.out.println("2-)La invocacion ");
                            System.out.println("3-)Tipo de Personaje");
                            System.out.println("=====================================================");
                            System.out.println("Ingrese su opcion:");
                            int pc = lea.nextInt();
                            if (pc == 1) {
                                System.out.println("Ingrese la nueva Creancia del personaje :");
                                String dd = lea.next();
                                ((Clerigo) per.get(pos)).setDios(dd);
                                System.out.println("Modificacion Exitosa");
                            } else if (pc == 2) {
                                System.out.println("Ingrese su nueva invonacion:");
                                String invo = lea.next();
                                ((Clerigo) per.get(pos)).setInvocacion(invo);
                                System.out.println("Modificacion Exitosa");
                            } else if (pc == 3) {

                                System.out.println("============================================");
                                System.out.println("Ingrese el nuevo tipo de Personaje:");
                                System.out.println("1-lead");
                                System.out.println("2-Support ");
                                System.out.println("3-offensive");
                                System.out.println("4-spammer");
                                System.out.println("5-Tank");
                                System.out.println("=============================================");
                                System.out.println("Ingrese le Tipo de Personaje:");
                                int rv = lea.nextInt();
                                String tp = "";
                                if (rv == 1) {
                                    tp = "lead";
                                    ((Personaje) per.get(pos)).setTp(tp);
                                } else if (rv == 2) {
                                    System.out.println("No puede poner es tipo de personaje en ta clase");
                                } else if (rv == 3) {
                                    System.out.println("No puede poner es tipo de personaje en ta clase");
                                } else if (rv == 4) {
                                    System.out.println("No puede poner es tipo de personaje en ta clase");
                                } else if (rv == 5) {
                                    System.out.println("No puede poner es tipo de personaje en ta clase");
                                }
                            } else {
                                System.out.println("no se puede");
                            }
                        } else if (per.get(pos) instanceof Barbaro) {
                            System.out.println("=========================================");
                            System.out.println("Que quieres modificar");
                            System.out.println("1-)Arma");
                            System.out.println("2-)El nivel px");
                            System.out.println("3-)Tipo de Personaje");
                            System.out.println("=======================================");
                            System.out.println("Ingrese la opcion:");
                            int co = lea.nextInt();
                            if (co == 1) {
                                System.out.println("==================================");
                                System.out.println("Ingrese el tipo de arama");
                                System.out.println("1.Pesada");
                                System.out.println("2.Ligera");
                                System.out.println("3.Escudo");
                                System.out.println("==================================");
                                System.out.println("Ingrese el tipo de arma:");
                                int ar = lea.nextInt();
                                String arm = "";
                                if (ar == 1) {
                                    arm = "Pesada";
                                    ((Barbaro) per.get(pos)).setArma(arm);
                                } else if (ar == 2) {
                                    arm = "Ligera";
                                    ((Barbaro) per.get(pos)).setArma(arm);
                                } else if (ar == 3) {
                                    arm = "Escudo";
                                    ((Barbaro) per.get(pos)).setArma(arm);
                                } else {

                                    System.out.println("No existe otra arma");
                                }

                            } else if (co == 2) {
                                System.out.println("Ingrese el nivel px:");
                                int px = lea.nextInt();
                                ((Barbaro) per.get(pos)).setPx(px);
                            } else if (co == 3) {
                                System.out.println("============================================");
                                System.out.println("Ingrese el nuevo tipo de Personaje:");
                                System.out.println("1-lead");
                                System.out.println("2-Support ");
                                System.out.println("3-offensive");
                                System.out.println("4-spammer");
                                System.out.println("5-Tank");
                                System.out.println("=============================================");
                                System.out.println("Ingrese le Tipo de Personaje:");
                                int rv = lea.nextInt();
                                String tp = "";
                                if (rv == 1) {
                                    tp = "lead";
                                    ((Personaje) per.get(pos)).setTp(tp);
                                } else if (rv == 2) {
                                    tp = "Supoort";
                                    ((Personaje) per.get(pos)).setTp(tp);

                                } else if (rv == 3) {
                                    tp = "offensive";
                                    ((Personaje) per.get(pos)).setTp(tp);
                                } else if (rv == 4) {
                                    System.out.println("No puede poner es tipo de personaje en ta clase");
                                } else if (rv == 5) {
                                    System.out.println("No puede poner es tipo de personaje en ta clase");
                                }
                            } else {
                                System.out.println("no se puede");
                            }
                        } else if (per.get(pos) instanceof Mago) {
                            System.out.println("==============================");
                            System.out.println("Que quieres modificar");
                            System.out.println("1-)Tipo de mago");
                            System.out.println("2-)Tipo de Personaje");
                            System.out.println("==============================");
                            System.out.println("Ingrese la opcion:");
                            int va  = lea.nextInt();
                            if (va== 1) {
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
                                    ((Mago) per.get(pos)).setTipodeMagia(mag);
                                } else if (ar == 2) {
                                    mag = "Mago Negro";
                                    ((Mago) per.get(pos)).setTipodeMagia(mag);
                                } else if (ar == 3) {
                                    mag = "Sanador";
                                    ((Mago) per.get(pos)).setTipodeMagia(mag);
                                } else {
                                    System.out.println("No existe otra tipo de mago");
                                }
                            } else if (va  == 2) {
                                System.out.println("============================================");
                                System.out.println("Ingrese el nuevo tipo de Personaje:");
                                System.out.println("1-lead");
                                System.out.println("2-Support ");
                                System.out.println("3-offensive");
                                System.out.println("4-spammer");
                                System.out.println("5-Tank");
                                System.out.println("=============================================");
                                System.out.println("Ingrese le Tipo de Personaje:");
                                int rv = lea.nextInt();
                                String tp = "";
                                if (rv == 1) {
                                    System.out.println("No puede poner es tipo de personaje en ta clase");

                                } else if (rv == 2) {
                                    tp = "Support";
                                    ((Personaje) per.get(pos)).setTp(tp);
                                } else if (rv == 3) {
                                    System.out.println("No puede poner es tipo de personaje en ta clase");
                                } else if (rv == 4) {
                                    System.out.println("No puede poner es tipo de personaje en ta clase");
                                } else if (rv == 5) {
                                    tp = "Tank";
                                    ((Personaje) per.get(pos)).setTp(tp);
                                }
                            } else {
                                System.out.println("no se puede");
                            }
                        } else if (per.get(pos) instanceof Picaro) {
                            System.out.println("===============================");
                            System.out.println("Que quieres modificar");
                            System.out.println("1-)Tipo de Instrumento");
                            System.out.println("2-)Cantidad de robo existosos");
                            System.out.println("3-)Tipo de personaje");
                            System.out.println("===============================");
                            System.out.println("Ingrese la opcion:");
                            int c = lea.nextInt();
                            if (c == 1) {
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
                                    ((Picaro) per.get(pos)).setTipoInstrumento(mag);
                                } else if (ar == 2) {
                                    mag = "Arma";
                                    ((Picaro) per.get(pos)).setTipoInstrumento(mag);
                                } else if (ar == 3) {
                                    mag = "Piedra Antigua";
                                    ((Picaro) per.get(pos)).setTipoInstrumento(mag);
                                } else {
                                    System.out.println("No existe otra tipo de instrumento");
                                }
                            } else if (c == 2) {
                                System.out.println("Ingrese la nueva cantidad de los robos exitosos:");
                                int cant = lea.nextInt();
                                ((Picaro) per.get(pos)).setCantrobo(cant);
                            } else if (c == 3) {
                                System.out.println("============================================");
                                System.out.println("Ingrese el nuevo tipo de Personaje:");
                                System.out.println("1-lead");
                                System.out.println("2-Support ");
                                System.out.println("3-offensive");
                                System.out.println("4-spammer");
                                System.out.println("5-Tank");
                                System.out.println("=============================================");
                                System.out.println("Ingrese le Tipo de Personaje:");
                                int rv = lea.nextInt();
                                String tp = "";
                                if (rv == 1) {
                                    System.out.println("No puede poner es tipo de personaje en ta clase");

                                } else if (rv == 2) {
                                    System.out.println("No puede poner es tipo de personaje en ta clase");
                                } else if (rv == 3) {
                                    System.out.println("No puede poner es tipo de personaje en ta clase");
                                } else if (rv == 4) {
                                    tp = "Spammer";
                                    ((Personaje) per.get(pos)).setTp(tp);
                                } else if (rv == 5) {
                                    tp = "Tank";
                                    ((Personaje) per.get(pos)).setTp(tp);
                                }
                            } else {
                                System.out.println("no se puede");
                            }
                        }
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
                    System.out.println("Ingrese la posicion del Personaje:");
                    int pos = lea.nextInt();
                    if (pos <= per.size()-1  && per.get(pos) instanceof Personaje) {
                        for (Object object : per) {
                            if (object instanceof Personaje) {
                                String message = String.format("[%d] %s%n", per.indexOf(object), object);
                                System.out.println(message);
                            }
                        }
                        System.out.println("Selecione el personaje contra quien desea jugar: ");
                        int pos2 = lea.nextInt();
                        if (pos2 != pos) {
                            if (pos2 <= per.size() - 1 && per.get(pos2) instanceof Personaje) {
                                double hpj1 = ((Personaje) per.get(pos)).getHp();
                                double hpj2 = ((Personaje) per.get(pos2)).getHp();
                                double CS1 = ((Personaje) per.get(pos)).getCs(), CS2 = ((Personaje) per.get(pos2)).getCs();
                                double bono = 0, bonoc = 0;
                                double DM = 0;
                                double DM2 = 0;
                                double AC1 = ((Personaje) per.get(pos)).getAc(), AC2 = ((Personaje) per.get(pos2)).getAc();
                                if (per.get(pos) instanceof Clerigo || per.get(pos2) instanceof Clerigo) {
                                    if (per.get(pos) instanceof Clerigo) {
                                        DM = 5 + r.nextInt(15);
                                    } else if (per.get(pos2) instanceof Clerigo) {
                                        DM2 = 5 + r.nextInt(15);
                                    }
                                } else if (per.get(pos) instanceof Barbaro || per.get(pos2) instanceof Barbaro) {
                                    if (per.get(pos) instanceof Barbaro) {
                                        DM = 15 + r.nextInt(30);
                                    } else if (per.get(pos2) instanceof Barbaro) {
                                        DM2 = 15 + r.nextInt(30);
                                    }
                                } else if (per.get(pos) instanceof Mago || per.get(pos2) instanceof Mago) {
                                    if (per.get(pos) instanceof Mago) {
                                        DM = 5 + r.nextInt(10);
                                    } else if (per.get(pos2) instanceof Mago) {
                                        DM2 = 5 + r.nextInt(10);
                                    }
                                } else if (per.get(pos) instanceof Picaro || per.get(pos2) instanceof Picaro) {
                                    if (per.get(pos) instanceof Picaro) {
                                        DM = 15 + r.nextInt(20);
                                    } else if (per.get(pos2) instanceof Picaro) {
                                        DM2 = 15 + r.nextInt(20);
                                    }
                                }
                                if (((Personaje) per.get(pos)).getTp().equals("Lead") || ((Personaje) per.get(pos2)).getTp().equals("Lead")) {
                                    if (((Personaje) per.get(pos)).getTp().equals("Lead") && (per.get(pos) instanceof Clerigo || per.get(pos) instanceof Barbaro)) {
                                        bono = CS1 * 0.05;
                                        CS1 = CS1 + bono;
                                    } else if (((Personaje) per.get(pos2)).getTp().equals("Lead") && (per.get(pos2) instanceof Clerigo || per.get(pos2) instanceof Barbaro)) {
                                        bono = CS2 * 0.05;
                                        CS2 = CS2 + bono;
                                    }
                                } else if (((Personaje) per.get(pos)).getTp().equals("Support") || ((Personaje) per.get(pos2)).getTp().equals("Support")) {
                                    if (((Personaje) per.get(pos)).getTp().equals("Support") && (per.get(pos) instanceof Mago || per.get(pos) instanceof Barbaro)) {
                                        bono = CS1 * 0.02;
                                        CS1 = CS1 + bono;
                                        bonoc = AC1 * 0.03;
                                        AC1 = AC1 + bonoc;

                                    } else if (((Personaje) per.get(pos)).getTp().equals("Support") && (per.get(pos2) instanceof Mago || per.get(pos2) instanceof Barbaro)) {
                                        bono = CS2 * 0.02;
                                        CS2 = CS2 + bono;
                                        bonoc = AC2 * 0.03;
                                        AC2 = AC2 + bonoc;
                                    }
                                } else if (((Personaje) per.get(pos)).getTp().equals("Offensive") || ((Personaje) per.get(pos2)).getTp().equals("Offensive")) {
                                    if (((Personaje) per.get(pos)).getTp().equals("Offensive") && per.get(pos) instanceof Barbaro) {
                                        bono = DM * 0.05;
                                        DM = DM + bono;
                                        hpj1 = hpj1 - (hpj1 * 0.01);
                                    } else if (((Personaje) per.get(pos2)).getTp().equals("Offensive") && per.get(pos2) instanceof Barbaro) {
                                        bono = DM2 * 0.05;
                                        DM2 = DM2 + bono;
                                        hpj2 = hpj2 - (hpj2 * 0.01);
                                    }
                                } else if (((Personaje) per.get(pos)).getTp().equals("Spammer") || ((Personaje) per.get(pos2)).getTp().equals("Spammer")) {
                                    if (((Personaje) per.get(pos)).getTp().equals("Spammer") && per.get(pos) instanceof Picaro) {
                                        bonoc = AC1 * 0.02;
                                        AC1 = AC1 + bonoc;
                                        bono = DM * 0.03;
                                        DM = DM + bono;
                                        CS1 = CS1 - (CS1 * 0.01);
                                    } else if (((Personaje) per.get(pos2)).getTp().equals("Spammer") && per.get(pos2) instanceof Picaro) {
                                        bonoc = AC1 * 0.02;
                                        AC2 = AC2 + bonoc;
                                        bono = DM2 * 0.03;
                                        DM2 = DM2 + bono;
                                        CS1 = CS1 - (CS1 * 0.01);
                                    }
                                } else if (((Personaje) per.get(pos)).getTp().equals("Tank") || ((Personaje) per.get(pos2)).getTp().equals("Tank")) {
                                    if (((Personaje) per.get(pos)).getTp().equals("Tank") && (per.get(pos) instanceof Mago || per.get(pos) instanceof Picaro)) {
                                        hpj1 = hpj1 + (hpj1 * 0.02);
                                    } else if (((Personaje) per.get(pos2)).getTp().equals("Tank") && (per.get(pos2) instanceof Mago || per.get(pos2) instanceof Picaro)) {
                                        hpj2 = hpj2 + (hpj2 * 0.02);
                                    }
                                }
                                while (hpj1 > 0 && hpj2 > 0) {
                                    System.out.println("Turno Jugador 1: (Usuario)");
                                    System.out.println("Desea \n 1. Atacar?"
                                            + "\n2. Defender?");
                                    int ad = lea.nextInt();
                                    boolean flag0 = false;
                                    while (flag0 == false) {
                                        switch (ad) {
                                            case 1:
                                                int ard = 1 + r.nextInt(100);
                                                if (ard > AC2) {
                                                    if (ard > CS2) {
                                                        DM = DM * 2;
                                                        hpj2 = hpj2 - DM;
                                                        System.out.println("Ha acertado el doble del golpe!!");
                                                    }
                                                    hpj2 = hpj2 - DM;
                                                    System.out.println("Ha acertado eL golpe!!");
                                                } else if (ard < AC2) {
                                                    System.out.println("No ha hecho daño...");

                                                }
                                                System.out.println(hpj1);
                                                System.out.println(hpj2);
                                                flag0 = true;
                                                break;
                                            case 2:
                                                AC1 = AC1 + 15;
                                                flag0 = true;
                                                break;
                                            default:
                                                System.out.println("Opcion invalida, intente de nuevo!...");
                                                flag0 = false;
                                        }

                                    }
                                    System.out.println("Turno Jugador 2: ");
                                    System.out.println("Desea \n 1. Atacar?"
                                            + "\n2. Defender?");
                                    int ad1 = lea.nextInt();
                                    boolean flagp = false;
                                    while (flagp == false) {
                                        switch (ad1) {
                                            case 1:
                                                int ard = 1 + r.nextInt(100);
                                                if (ard > AC1) {
                                                    if (ard > CS2) {
                                                        DM2 = DM2 * 2;
                                                        hpj1 = hpj1 - DM2;
                                                        System.out.println("Ha acertado el doble del golpe!!");
                                                    }
                                                    hpj1 = hpj1 - DM2;
                                                    System.out.println("Ha acertado eL golpe!!");
                                                } else if (ard < AC1) {
                                                    System.out.println("No ha hecho daño...");

                                                }
                                                System.out.println(hpj1);
                                                System.out.println(hpj2);
                                                flagp = true;
                                                break;
                                            case 2:
                                                AC1 = AC1 + 15;
                                                flagp = true;
                                                break;
                                            default:
                                                System.out.println("Opcion invalida, intente de nuevo!...");
                                                flagp = false;
                                        }
                                    }
                                }
                                System.out.println("El juego ha terminado...");
                                if (hpj1 > hpj2) {
                                    System.out.println("El jugador 1 ha ganado");
                                } else {
                                    System.out.println("El jugador 2 ha ganado");
                                }

                            }
                        } else {
                            System.out.println("No puede seleccionarse a si mismo");
                        }
                    }
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
