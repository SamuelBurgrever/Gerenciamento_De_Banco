import java.util.Scanner;

public class conta {

    double conta;

    public conta() {
    }

    public conta(Double conta) {
        this.conta = conta;
    }

    public void atualizaSaldo(Double valor) {
        this.conta = valor;
    }

    public void sacar() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Quanto você quer sacar?");
        Double sacar = leitura.nextDouble();

        if (conta < sacar) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.conta = conta - sacar;
        }
    }

    public void depositar() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Quanto você quer depositar?");
        Double depositar = leitura.nextDouble();

        this.conta = conta + depositar;
    }

    public void saldo() {
        System.out.println(conta);
    }

}
