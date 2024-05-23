import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int parametroUm = 0;
        int parametroDois = 0;

        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            parametroDois = terminal.nextInt();
            terminal.close();
        } catch (InputMismatchException e) {
            System.out.println("Digite números inteiros!");
            return; // Encerrar o programa se a entrada não for válida
        }

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.err.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}