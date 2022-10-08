package cursoPooUdemy.exemplo1;

public class Carro{
  
   //#region Atributos
   private String modelo;
   private Integer ano;
   private String cor;
   //#endregion

  
   //#region Getters e Setters
   public void setModelo(String modelo){
      // Aqui pode ter validações e outros
      this.modelo = modelo;
   }

   public String getModelo(){
      return this.modelo;
   }
  
    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
  
    public String getCor() {
        return cor;
    }
 
    public void setCor(String cor) {
        this.cor = cor;
    }
    //#endregion

    //#region Construtor
    public Carro(){}//esse é o construtor padrão,sempre que cria um contrutor personalizado é necessario construir ele

    public Carro(String modelo, Integer ano, String cor){//construtor personlaizadp
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    //#endregion

    
    //#region Metodo / Função
    public void Formato(){
       System.out.println("\n **************************");
    }
    //#endregion
}
