import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int verificaSaida = 0;
        double saldoDaConta = 0;
        String nome = null;
        int conta = 0;
        String agencia = null;
        int proximoPasso = 0;

        do{
            System.out.println("*******Sistema Bancario*******");
            System.out.println("1 - Criar Conta\n2 - Entrar em uma Conta\n3 - Sair");
            proximoPasso = scanner.nextInt();

            if (proximoPasso == 3){
                System.exit(0);
            }
            else if (proximoPasso == 1) {

                scanner.nextLine();
                System.out.println("Digite seu nome:");
                nome = scanner.nextLine();

                System.out.println("Digite seu numero de conta:");
                conta = scanner.nextInt();

                System.out.println("Digite sua Agencia!");
                agencia = scanner.next();

                saldoDaConta = 0;

                System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + ".\n" +
                                   "--------------------------------------------------------------------------------------------------------------------");
            }
                else if(proximoPasso == 2){

                System.out.println("Digite seu numero de conta:");
                int entraConta = scanner.nextInt();

                System.out.println("Digite sua Agencia!");
                String entraAgencia = scanner.next();

                    if(entraConta != conta || entraAgencia != agencia) {
                        System.out.println("Conta ou agencia inexistentes");
                    }
            }
            do {
                System.out.println("Bem vindo à Conta " + conta + " da Agencia " + agencia);
                System.out.println("\nEscolha uma ação\n\n1 - Consultar Saldo\n2 - Depositar Saldo\n3 - Sacar\n4 - Sair");

                verificaSaida = scanner.nextInt();

                if(verificaSaida == 1){
                    System.out.println("Seu Saldo eh de:\nRS " + saldoDaConta);

                }
                 else if(verificaSaida == 2){
                        System.out.println("Informe seu Saldo");
                        saldoDaConta += scanner.nextDouble();
                 } else if (verificaSaida == 3) {
                    System.out.println("Digite quanto deseja sacar:");
                    double saque = scanner.nextDouble();

                    if(saldoDaConta - saque < 0){
                        System.out.println("Valor de Saque acima do Saldo\nSaque: RS " + saque + "\nSaldo: RS " + saldoDaConta);
                    } else {
                        saldoDaConta -= saque;
                    }
                } else if (verificaSaida > 4 || verificaSaida < 1) {
                    System.out.println("Dugute uma entrada valida!");
                }

            }while (verificaSaida != 4);

        }while (proximoPasso != 3);
    }
}