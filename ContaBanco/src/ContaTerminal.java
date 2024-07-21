/*
 * @author BrunoPdev
 */
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {               

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Por favor, digite o número da Conta:");  //  interação

            int numero = scanner.nextInt();                             //  captura e atribui
            
            scanner.nextLine();                                       //  quebra de linha
            
            System.out.println("Por favor, digite o número da Agência:");   //  interação

            String agencia = scanner.nextLine();                            //  captura e atribui
            
            System.out.println("Por favor, digite o nome do Cliente:"); //  interação

            String nomeCliente = scanner.nextLine();                    //  captura e atribui
            
            System.out.println("Por favor, digite o saldo:");   //  interação

            int saldo = scanner.nextInt();  //  captura e atribui
            
            String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
            
            System.out.println(mensagem);            //  concatenação variáveis
        }
    }
}   
