import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int primeiroParametro = scanner.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int segundoParametro = scanner.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        scanner.close();
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {

        if (primeiroParametro >= segundoParametro) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = segundoParametro - primeiroParametro;
        for (int numero = 1; numero <= contagem; numero++) {
            System.out.println("Imprimindo o número: " + numero);
        }

    }
}
