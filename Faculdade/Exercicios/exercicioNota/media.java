package Faculdade.Exercicios.exercicioNota;

import java.util.Locale;
import java.util.Scanner;

public class media {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner teclado = new Scanner(System.in);

        Notas not = new Notas();
        
        System.out.println("Digite as duas notas ");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();

        not.mediaFinal(nota1,nota2);


        teclado.close();

    }
  
}
