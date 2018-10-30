package com.company;

import java.util.Scanner;

public class Main {
    /*
    En este ejercicio resolveremos una ecacuación de segundo grado mediante el uso de llamada a funciones y Scan
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bienvenido \n" +"Introduzca el primer valor para calcular la ecuación de segundo grado: ");
        double a=scanner();
        System.out.println("Introduzca el primer valor para calcular la ecuación de segundo grado: ");
        double b=scanner();
        System.out.println("Introduzca el primer valor para calcular la ecuación de segundo grado: ");
        double c=scanner();
        comprobar(a,b,c);
    }

    /*
    En el main tan solo declaramos los valores y llamamos a la funciones para operar
     */

    private static double scanner(){
        Scanner scan = new Scanner(System.in);
        while(!scan.hasNextDouble()){ //bucle para comprobar si lo introducido por el usuario son números
            System.out.println("Valor incorrecto, por favor introduzca un número");
            scan= new Scanner(System.in);
        }
        return scan.nextDouble();
    }

    /*
    En esta función comprobamos que los valores asignados son doubles y no valores no válidos como letras o símbolos
    de batman.
     */

    private static void comprobar(double a,double b, double c){
        if (0<(b*b)-(4*a*c)) {
            double x=resolver(a,b,c);
            double y=resolver1(a,b,c);
            Imprimir(x,y);
        }else{
            System.out.println("Ecuación no resoluble");
        }
    }

    /*
    Aquí verificamos que la ecuación es resoluble y no salen resultados con números complejos
     */

    private static double resolver(double a, double b, double c){
        double x=((-b+Math.sqrt((b*b)-(4*a*c)))/2*a);
        return x;
    }
    private static double resolver1(double a, double b, double c){
        double y=((-b-Math.sqrt((b*b)-(4*a*c)))/2*a);
        return y;
    }

    /*
    Las 2 funciones hacen lo mismo para las dos posibles soluciones de la ecuación
     */

    private static void Imprimir(double x,double y){
        System.out.println("Las soluciones son :\n" +x+"\n"+y);
    }

    /*
    Simplemente una función de impresión para los datos
     */
}

