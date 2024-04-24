/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordbubuja;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author YULIETH
 */
public class OrdBubuja {
    
    
  
         

    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de cartas
        System.out.println("Ingrese el número de cartas que desea ingresar:");
        int numCartas = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Crear una lista para almacenar las cartas
        ArrayList<Carta> mazo = new ArrayList<>();

        // Pedir al usuario que ingrese las cartas
        for (int i = 0; i < numCartas; i++) {
            System.out.println("Ingrese el valor de la carta " + (i + 1) + ":");
            String valor = scanner.nextLine();
            System.out.println("Ingrese el palo de la carta " + (i + 1) + ":");
            String palo = scanner.nextLine();
            mazo.add(new Carta(valor, palo));
        }

        ordernarBurbuja(mazo);
        Mostrar(mazo);

        scanner.close();
    }
 public static ArrayList<Carta>generalizar(){
 ArrayList<Carta>Mazo= new ArrayList<>();
         String []Palos ={"Corazonez","Diamantes","Picas","Treboles" };
       String []Valores={"1","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
       for(String Palo :Palos){
           for(String valor :Valores){
               Mazo.add(new Carta(valor, Palo));
               
           }
       }
       return Mazo ;
}
    
    public static int PaloPri(String palo){
        switch (palo){
        case "Corazones":
            return 1 ;
             case "Diamentes":
            return 2 ;
             case "Picas":
            return 3 ;
             case "Treboles":
            return 4 ;
            
             default :
                 return -1 ;
                
                }
    }
    
     public static int Conve(String valor){
        switch (valor){
        case "J":
            return 11 ;
             case "Q":
            return 12 ;
             case "K":
            return 13 ;
             case "A":
            return 14 ;
            
             default :
                 return Integer.parseInt(valor) ;
                
                }
    }
     
      public static void Mostrar (ArrayList<Carta> Maso){
       for (Carta carta : Maso){
           
           System.out.println(carta);
       }
   }
       public static void ordernarBurbuja(ArrayList<Carta>cartas){
     
        int n = cartas.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                String valorActual = cartas.get(j).getValor();
                String valorSiguiente = cartas.get(j + 1).getValor();
                if (valorActual.equals(valorSiguiente)) {
                    // Si los valores son iguales, comparar por palo
                    String paloActual = cartas.get(j).getPalo();
                    String paloSiguiente = cartas.get(j + 1).getPalo();
                    if (PaloPri(paloActual) > PaloPri(paloSiguiente)) {
                        // Intercambiar las posiciones de las cartas
                        Carta temp = cartas.get(j);
                        cartas.set(j, cartas.get(j + 1));
                        cartas.set(j + 1, temp);
                    }
                } else if (Conve(valorActual) > Conve(valorSiguiente)) {
                    // Si los valores son diferentes, comparar por valor
                    // Intercambiar las posiciones de las cartas
                    Carta temp = cartas.get(j);
                    cartas.set(j, cartas.get(j + 1));
                    cartas.set(j + 1, temp);
                }
            }
        }

}
   }







