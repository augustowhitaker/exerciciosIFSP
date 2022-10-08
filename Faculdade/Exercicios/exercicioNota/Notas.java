package Faculdade.Exercicios.exercicioNota;

public class Notas {
   
    public double mediaFinal;

    public void mediaFinal(double nota1, double nota2){

        mediaFinal =  (nota1 + nota2) / 2;

        if(mediaFinal > 10){
            System.out.println("Media maior que 10 não existe você digitou errado = " + mediaFinal);
        }
        else if(mediaFinal >= 6){
            System.out.printf("Aprovado nota %.2f " ,mediaFinal);

        }else if(mediaFinal >= 4 && mediaFinal < 6){
            System.out.printf("Recuperação nota %.2f " ,mediaFinal);
        }else{
            System.out.printf("Reprovado nota %.2f " ,mediaFinal);
        }

    }

}
