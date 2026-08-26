import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Saldo;
        double Limite;
        double Valor;

        System.out.print("Saldo da conta: R$ ");
        Saldo = sc.nextDouble();

        System.out.print("Limite diário de saque: R$ ");
        Limite = sc.nextDouble();

        System.out.print("Valor solicitado: R$ ");
        Valor = sc.nextDouble();

        if (Saldo < Valor) {
            System.out.println("Saldo insuficiente");
        } else {
            if (Valor > Limite) {
                System.out.println("Valor ultrapassa o limite diário");
            } else {
                Saldo = Saldo - Valor;
                System.out.printf("Saque efetuado%n");
                System.out.printf("Novo saldo: R$ %.2f%n", Saldo);
            }
        }

        sc.close();
    }
}import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Saldo;
        double Limite;
        double Valor;

        System.out.print("Saldo da conta: R$ ");
        Saldo = sc.nextDouble();

        System.out.print("Limite diário de saque: R$ ");
        Limite = sc.nextDouble();

        System.out.print("Valor solicitado: R$ ");
        Valor = sc.nextDouble();

        if (Saldo < Valor) {
            System.out.println("Saldo insuficiente");
        } else {
            if (Valor > Limite) {
                System.out.println("Valor ultrapassa o limite diário");
            } else {
                Saldo = Saldo - Valor;
                System.out.printf("Saque efetuado%n");
                System.out.printf("Novo saldo: R$ %.2f%n", Saldo);
            }
        }

        sc.close();
    }
}