import java.util.Scanner;

public class emprestimo {

    public void emprestar(conta conta) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Valor do emprestimo: ");
        double valor = leitura.nextDouble();

        if (valor > ((conta.conta * 80) / 100)) {
            System.out.println("Emprestimo negado!");
        } else {
            conta.atualizaSaldo(conta.conta + valor);
        }
    }

}
