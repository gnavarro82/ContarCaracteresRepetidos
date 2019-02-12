package main;

import java.util.Scanner;

public class ContarCaracteresRepetidos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String cadena = "";
        char[] arrayCadena;
        char caracter;
        int contador = 0;
        System.out.println("Escribe una frase");
        cadena = lector.next();
        
        arrayCadena=cadena.toCharArray();//se obtiene todos los caracteres de la cadena, y se almacena en el array.
        
        for (int i = 0; i <arrayCadena.length; i++) {
            caracter=arrayCadena[i];
            for (int j = 0; j < arrayCadena.length; j++) {
                if(arrayCadena[j]==caracter){
                    contador++;
                }
            }
        System.out.println(arrayCadena[i]+" "+contador);
              contador=0;
        
        }
        
        

    }

}
