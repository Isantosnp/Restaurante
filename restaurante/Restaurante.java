package AulaLP.br.com.newton.restaurante;

import javax.swing.JOptionPane;

public class Restaurante {
    public static void main(String[] args) {


        Pizza pizza = new Pizza();
        Hamburguer hamburguer = new Hamburguer();

        String escolhaComida = JOptionPane.showInputDialog("Informe o nome do que você deseja : \n 1 - Pizza \n 2 -Hamburguer \n 3 - Não quero nada no momento. ");
        int pedido = Integer.parseInt(escolhaComida);
        switch (pedido) {
            case 1:

                pizza.nome = JOptionPane.showInputDialog("Informe o nome do sabor da pizza que deseja");
                pizza.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da pizza"));
                int respostaBorda = Integer.parseInt(JOptionPane.showInputDialog(" A sua pizza possui borda? \n (1) Para sim \n (2) Para Não. "));
                if (respostaBorda == 1) {
                    pizza.valor = pizza.calcularValor(true);
                } else if (respostaBorda == 2) {
                    pizza.calcularValor(false);
                }
                break;

            case 2:
                hamburguer.nome = JOptionPane.showInputDialog("Informe o nome do hamburguer que você deseja: ");
                hamburguer.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do hamburguer escolhido: "));
                int respostaArtesanal = Integer.parseInt(JOptionPane.showInputDialog(" A sua pizza possui borda? \n (1) Para sim \n (2) Para Não. "));
                if (respostaArtesanal == 1) {
                    hamburguer.valor = hamburguer.calculaValor(true);
                } else if (respostaArtesanal == 2) {
                    hamburguer.calculaValor(false);
                }
                break;
            case 3:
                break;
        }
        JOptionPane.showMessageDialog(null, "O valor total é de "+pizza.valor,
                "Valor", JOptionPane.INFORMATION_MESSAGE);
    }
}
