/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

/**
 *
 * @author vinicius
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calculaAte = 34;
        int k = 0;
        int i = 1;

        System.out.println("0 ");
        System.out.println("1 ");

        int soma = 0;
        while(soma < calculaAte){
            soma = i + k;
            k = i;
            i = soma;
            System.out.println(soma);
        }

        if(soma == calculaAte){
            System.out.println("Número informado pertence a sequência");
        }else{
            System.out.println("Número informado não pertence a sequência");
        }
    }
    
}
