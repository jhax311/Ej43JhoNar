package ej43jhonar;

import java.util.*;
//import java.lang.Math;

public class Ej43JhoNar {
    //array list

    public static ArrayList<Integer> ent = new ArrayList<>();
//array linkdesk
    public static LinkedList<Integer> entL = new LinkedList<>();
//metodo borrar 55

    public static void borrar() {
        for (int i = 0; i < ent.size(); i++) {
            if (ent.get(i).equals(55)) {
                //ent.remove(i);
                ent.set(i,0);
            }
        }
        System.out.println(ent);
    }
//metodo para linked

    public static void borrarL() {
        for (int i = 0; i < entL.size(); i++) {
            if (entL.get(i).equals(55)) {
                entL.remove(i);
            }
        }
        System.out.println(entL);
    }

    public static void main(String[] args) {
        boolean salir = false;
        byte opc = 0;
        Scanner sc = new Scanner(System.in);
        do {
            //menu
            System.out.println("-----------------------------------------");
            System.out.println("\t\t1\tEjercicio con ArrayList");
            System.out.println("\t\t2\tEjercicio con LinkedList");
            System.out.println("\t\t3\tSalida");
            System.out.println("-----------------------------------------");
            System.out.print("ELIGE UNA OPCIÓN: ");
            try {
                opc = sc.nextByte();
            } catch (InputMismatchException ime) {
                System.out.println("No has insertado un número de opción correcta");
                sc.nextLine();
            }

            switch (opc) {
                case 1:
                    //ejercicio 1
                    //num randoms en el arraylist
                    for (int i = 0; i != 10; i++) {
                        int num = (int) Math.floor(Math.random() * (97 - (31 + 1)) + 31);
                        ent.add(i, num);
                    }
                    //lo muestra por pantalla
                    System.out.println(ent);
                    //borramos el 55 con el metodo
                    borrar();
                    //creamos array con el tamaño del otro
                    int enteros[] = new int[ent.size()];
                    //metemos los datos del array list en array normal
                    for (int i = 0; i < ent.size(); i++) {
                        enteros[i] = ent.get(i);
                    }

                    //mostramos el array de enteros
                    System.out.print("[");
                    for (int i = 0; i < enteros.length; i++) {
                        if (i == (enteros.length - 1)) {
                            System.out.print(enteros[i]);
                        } else {
                            System.out.print(enteros[i] + ", ");
                        }

                    }
                    System.out.println("]");
                    //borrar array completo
                    ent.clear();
                    break;
                case 2:
                    //num randoms en el arraylinked
                    for (int i = 0; i != 10; i++) {
                        int num = (int) Math.floor(Math.random() * (97 - (31 + 1)) + 31);
                        entL.add(i, num);
                    }
                    //lo muestra por pantalla
                    System.out.println(entL);
                    //borramos el 55 con el metodo
                    borrarL();
                    //creamos array con el tamaño del otro
                    int enterosl[] = new int[entL.size()];
                    //metemos los datos del array linked en array normal
                    for (int i = 0; i < entL.size(); i++) {
                        enterosl[i] = entL.get(i);
                    }

                    //mostramos el array de enteros
                    System.out.print("[");
                    for (int i = 0; i < enterosl.length; i++) {
                        if (i == (enterosl.length - 1)) {
                            System.out.print(enterosl[i]);
                        } else {
                            System.out.print(enterosl[i] + ", ");
                        }

                    }
                    System.out.println("]");
                    //borrar array completo
                    entL.clear();
                    break;
                case 3:
                    //Salidaa
                    salir = true;
                    break;
                    
                    
                default:
                    System.out.println("Introduce una opción correcta: ");
                //ingrese una opcion correcta
            }

        } while (!salir);

    }
}
