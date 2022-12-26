import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int 	numeroDaConta;
		String 	numeroDaAgencia;
		String 	nomeDoCliente;
		double 	saldoDaConta = 237.48;
		
		System.out.println("------------->>>>Bem vindo ao Banco XPTO!<<<<---------------");
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Por favor, digite o número da sua conta: ");
		numeroDaConta = sc.nextInt();
		
		System.out.println("Por favor, digite o número da sua agência: ");
		numeroDaAgencia = sc.next();
		
		System.out.println("Por favor, digite o seu nome: ");
		nomeDoCliente = sc.next();
		
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Olá " + nomeDoCliente + "!, obrigado por criar uma conta em nosso banco, sua agência é nº:"
				+ numeroDaAgencia + ", conta nº:" + numeroDaConta +  " e seu saldo de R$" + saldoDaConta + " já está disponível para saque!.");
		
        System.out.println("------------------------------------------------------------");
        System.out.println("--------->>>>Grato por acessar nossos serviços!<<<<---------");
		
		sc.close();
        }
        
    }

