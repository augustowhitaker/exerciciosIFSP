package testes;

import testes.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
      Carro carro1 = new Carro();
      Carro carro = new Carro();
      

      carro1 = carro;
      
      carro1.modelo = "Corsa";
      carro1.ano = 2021;
      carro1.nome = "Sei la";

      carro.modelo = "Tempra";
      carro.ano = 1994;
      carro.nome = "blaa";

      System.out.println(carro1.modelo );
      System.out.println(carro1.ano );
      System.out.println(carro1.nome );
        System.out.println("\n\n");
      System.out.println(carro.modelo );
      System.out.println(carro.ano );
      System.out.println(carro.nome );
    }  

    
}
