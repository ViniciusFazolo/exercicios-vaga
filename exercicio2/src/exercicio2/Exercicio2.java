/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

/**
 *
 * @author vinicius
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String palavra = "abacateaaaaaa";
       int contador = 0;

       for(int i = 0; i < palavra.length(); i++){
           char caracter = palavra.charAt(i);
           
           if(caracter == 'a' || caracter == 'A'){
               contador++;
           }
       }
       
        System.out.println("A palavra: " + palavra + " contém " + contador + " caracteres");
    }
    
}
