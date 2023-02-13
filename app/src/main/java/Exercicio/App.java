
package Exercicio;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
     int numero;
     
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um valor : ");
        numero = leitor.nextInt();
        
        if(numero >= 100 && numero <= 200) {
            System.out.println(" YESS -> O numero esta no intervalo entre 100 e 200");
        } else {
            System.out.println(" OH NOO - > O numero nao esta no intervalo entre 100 e 200");
        }
    }
}
