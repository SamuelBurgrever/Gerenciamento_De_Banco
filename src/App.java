import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int numero;
        Scanner leitura = new Scanner(System.in);
        double conta;

        conta con = new conta();
        emprestimo emp = new emprestimo();

        do {

            System.out.println("1-Depositar, 2-Sacar, 3-Ver saldo, 4- Emprestimo, 5-Sair");
            numero = leitura.nextInt();

            if (numero == 1) {

                con.depositar();

            } else if (numero == 2) {

                con.sacar();

            } else if (numero == 3) {

                con.saldo();

            } else if (numero == 4) {
                emp.emprestar(con);
                ;
            }

        } while (numero != 5);

    }
}
