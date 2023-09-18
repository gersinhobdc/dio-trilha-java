import java.util.Scanner;

public class ContaTerminal {

	
	

	public static void main(String[] args) throws Exception{
		Scanner grava = new Scanner(System.in);
		//TODO: Conhecer e importar a classe Scanner
		
		//Exibir as mensagens para nosso usuário
		
		//Obter pela classe Scanner os valores digitados no terminal
		
		//Exibir a mensagem na tela.

		
		
		int numeroConta;
		String agencia, nomeCliente;
		Double saldo = 1934.42;
		
		System.out.println("Bem vindo! Por favor, digite seu nome: ");
		nomeCliente = grava.nextLine();
		
		System.out.println("Por favor, digite os 4 números da agência,\n assim como no exemplo a seguir: "
				+ "067-8 ");
		agencia = grava.nextLine();
		
		System.out.println("Agora digite o número da conta de 4 digítos: ");
		numeroConta = grava.nextInt();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numeroConta +  " e seu saldo de R$ " + saldo + " já está disponível para saque");
		
		
		
		
		
			
			
		}
		
		
			
			
		}

	

