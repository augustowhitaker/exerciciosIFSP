package cursoPooUdemy.exemplo3;


import java.util.ArrayList;

// import cursoPooUdemy.exemplo3.src.model.Camareira;
import cursoPooUdemy.exemplo3.src.model.Cliente;
// import cursoPooUdemy.exemplo3.src.model.EnumTipo;
// import cursoPooUdemy.exemplo3.src.model.Gerente;
// import cursoPooUdemy.exemplo3.src.model.Quarto;
// import cursoPooUdemy.exemplo3.src.model.Recepcionista;

public class App {
    public static void main(String[] args) {
        System.out.println("Hotel Java");
        System.out.println();

       

        // Recepcionista recepcionista1 = new Recepcionista("Ginger", "119876-1223", "456.980.092-76");
        // recepcionista1.atenderOTelefone();
        // recepcionista1.falarIngles();

        // Camareira camareira1 = new Camareira("Naue", "1198723-0987", "23412345643");
        // camareira1.arrumaACama();
        // camareira1.limparQuarto();

        // // Deu uma dor de barriga na Ginger ela nao vai poder trabalhar hoje
        // Gerente gerente1 = new Gerente("Downy", "11087653-2834", "234.445.345-78");
        // gerente1.atenderOTelefone();
        // gerente1.falarIngles();
        // gerente1.arrumaACama();
        // gerente1.limparQuarto();

        // Quarto quarto1 = new Quarto();
        // quarto1.setNumero("206A");
        // quarto1.setValor(100.0);
        // quarto1.setTipo(EnumTipo.BASICO);


        // Quarto quarto2 = new Quarto();
        // quarto2.setNumero("306A");
        // quarto2.setValor(200.0);
        // quarto2.setTipo(EnumTipo.PRESIDENCIAL);

        // System.out.println(quarto2.getTipo());
        // System.out.println(quarto2.getTipo().getValor());

        Cliente cliente1 = new Cliente("Fia", "1194532-4533", "12345678901",32);
        Cliente cliente2 = new Cliente("Ginger", "1199765-5567", "97793356",23);
        Cliente cliente3 = new Cliente("Downy", "1198675-7663", "34456335",19);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        // Retorna a quantidade de elementos presentes em uma stream
        clientes.stream().count();

         clientes.stream()
         .limit(2)
         .forEach(c -> System.out.println(c.getNome()));
        System.out.println();
         clientes.stream()
         .skip(1)
         .forEach(c -> System.out.println(c.getNome()));
         System.out.println();
        //var resultado3 = clientes.stream().sorted();

        // clientes.stream().sorted();

         clientes.stream()
        .filter(c -> c.getIdade() > 25)
        .forEach(c -> System.out.println(c.getNome()));
        ;
        System.out.println();
        clientes.stream()
        .filter(c -> c.getNome().contains("Fia"))
        .forEach(c -> System.out.println(c.getNome()));
        ;
        
        clientes.stream().map(c -> c.getNome());

        
    }
}
