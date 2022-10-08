package Faculdade.Exercicios.exercicioHerancaPoliformismo;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Millo", 4);
        Cachorro cachorro = new Cachorro("Dog", 5);

        System.out.println(gato.nome);
        System.out.println(gato.idade);
        gato.som();
        System.out.println("\n");
        System.out.println(cachorro.nome);
        System.out.println(cachorro.idade);
        cachorro.som();
       
        //  Animal [] animal = new Animal[2];

        //  animal[0] = gato;
        //  animal[1] = cachorro;

        //  for (Animal animalAtual : animal) {
        //     animalAtual.som();
            
        //  }
        
    }
}
