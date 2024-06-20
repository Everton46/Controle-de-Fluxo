package desafio_controle_fluxo;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Leitura dos parametros via terminal
            System.out.print("Digite o primeiro numero: ");
            int primeiroParametro = scanner.nextInt();

            System.out.print("Digite o segundo numero: ");
            int segundoParametro = scanner.nextInt();

            // Chama o metodo para contar e imprimir os numeros
            contar(primeiroParametro, segundoParametro);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro >= segundoParametro) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }

        int quantidade = segundoParametro - primeiroParametro;

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Imprimindo o numero " + i);
        }
    }
}


