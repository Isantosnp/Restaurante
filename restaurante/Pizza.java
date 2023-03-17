package AulaLP.br.com.newton.restaurante;

public class Pizza {
    public String nome;
    public double valor;
    public boolean possuiBorda;

    public double calcularValor(Boolean possuiBorda){
        if(possuiBorda){
            return valor + 5.0;
        }
        return valor;
    }
    public String getNome(){
        return nome;
    }
    }
