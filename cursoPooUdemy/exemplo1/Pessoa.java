package cursoPooUdemy.exemplo1;

public class Pessoa {
     // Atributos
     //#region Atributos
     private String nome;
     private Integer idade; 
     //#endregion

     // Getters e Setters
     //#region Getters e Setters
     public void setNome(String nome){
          // Aqui pode ter validações e outros.
          this.nome = nome;
     }

     public String getNome(){
          return this.nome;
     }

     public void setIdade(Integer idade){
          this.idade = idade;
     }

     public Integer getIdade(){
          return this.idade;
     }
     //#endregion
}
/**
 * METODOS ACESSORES:
 * 
 * PUBLIC: Indica que qualquer um pode acessar o elemento.
 * 
 * PRIVATE: Indica que somente a classe consegue acessar.
 * 
 * PROTECTED: Indica que somente a classe e seus filhos    conseguem acessar
 *  
 * DEFAULT: Indica que somente a classe,seus filhos e as classes no mesmo package podem acessar
 */

 /**
  * Getters e Setters
  */