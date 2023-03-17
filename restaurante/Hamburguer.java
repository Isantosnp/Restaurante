package AulaLP.br.com.newton.restaurante;

public class Hamburguer {
    public String nome;
    public double valor;
    public boolean artesanal;

    public double calculaValor(boolean artesanal){
        if(artesanal){
            return valor + 8.0;
        }
        return valor;
    }
    public String getNome(){
        return nome;
    }
}
