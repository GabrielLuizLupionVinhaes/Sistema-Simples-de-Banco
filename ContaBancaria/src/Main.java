import java.util.Scanner;

public class Main {
    double saldo = 0;
    public static void main(String[] args) {
        double saldo = 0;
        int opcao = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("\n***********************************");
        System.out.println("Sua conta Bancaria");
        System.out.println("Saldo da conta: R$"+saldo);
        System.out.println("***********************************");

        while(opcao != 4){
            System.out.println("\nQue ação que deseja fazer?");
            System.out.println("1 - Depositar        |  2 - Transferir");
            System.out.println("3 - Verificar Saldo  |  4 - Sair");
            System.out.println("-----------------------------------");

            System.out.println("\nDigite a opção desejada: ");
            opcao = scan.nextInt();
            while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4){
                System.out.println("[Digite uma opção valida]");
                System.out.println("Digite a opção desejada: ");
                opcao = scan.nextInt();
            }
            switch (opcao){
                case 1:
                    saldo = Deposito(saldo);
                    break;
                case 2:
                    saldo = Transferencia(saldo);
                    break;
                case 3:
                    System.out.println("\n\n\n[Seu saldo atual é de R$"+saldo+"]");

                    break;
                case 4:

                    break;
            }


        }


    }
    public static double Deposito(double s){
        double saldo = s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor que deseja DEPOSITAR ou digite 0 (ZERO) para retornar ao menu: ");
        saldo += scan.nextDouble();

        if(saldo <= 0){
            return s;
        }

        return saldo;
    }

    public static double Transferencia(double s){
        double transf;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor que deseja TRANSFERIR ou digite 0 (ZERO) para retornar ao menu: ");
        transf = scan.nextDouble();

        if(transf != 0){
            while(transf > s){
                System.out.println("[Você não pode transferir um valor maior que o saldo atual]");
                System.out.println("[Saldo: R$"+s+"]");
                System.out.println("Digite o valor que deseja TRANSFERIR ou digite 0 (ZERO) para retornar ao menu: ");
                transf = scan.nextInt();

            }
            return s - transf;
        }
        return s;

    }

}
