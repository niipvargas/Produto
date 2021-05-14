package produto;

import java.util.Scanner;

public class Produto {

   
    public static void main(String[] args) {
      double preco, resul;
      String nome;
      
      Scanner entrada = new Scanner (System.in);
        System.out.println ("Nome do produto: ");
        nome =entrada.next();
      
        System.out.println ("Preço do produto: ");
        preco =entrada.nextDouble();
      
      resul=preco*1.65;
      
        System.out.println ("Você vai vender o produto: "+nome+" por R$"+resul);
      
    }
    
}
