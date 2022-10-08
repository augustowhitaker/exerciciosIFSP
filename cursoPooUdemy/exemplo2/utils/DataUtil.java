package cursoPooUdemy.exemplo2.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    
//  Abaixo usamos o static
    public static String conveterDateParaDataEHora(Date data){

        SimpleDateFormat formatador = new SimpleDateFormat("    dd/MM/YYYY HH:mm");

        return formatador.format(data);

        // format é uma classe primitiva do java

    }
}
// métodos staticos não precisam de construtor pois não armazenam estado.
// Você chama eles diretamente referenciando a classe.
// Exemplo :
// var resultado = DataConversor.converter("21/12/2021");
// Perceba que aqui não preciso usar a palavra new para instanciar o objeto, simplesmente chamo ele diretamente.