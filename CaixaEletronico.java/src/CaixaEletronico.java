import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String args[]) {
        
        int saldo = 8000;
        int saque = 0;
        int deposito = 0;
        
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\nBem vindo ao Caixa Eletronico!");  
            System.out.println("\nPressione 1 para Saque");  
            System.out.println("Pressione 2 para Deposito");  
            System.out.println("Pressione 3 para Saldo");  
            System.out.println("Pressione 4 para Sair");  
            System.out.print("\nPressione a operação desejada"); 
        
            int escolha = sc.nextInt();
            switch(escolha)
            {
                case 1:;

                System.out.println("Digite o valor do Saque");
                saque = sc.nextInt();
                    if(saldo >= saque)
                    {
                        saldo = saldo - saque;
                        System.out.println("Saque realizado com  sucesso!");
                        System.out.println("Por favor retire o seu dinheiro");
                    }
                    else
                    {
                        System.out.println("\nSaldo insuficiente");
                        System.out.println("Seu Saldo atual é: " + saldo);
                    }
                    System.out.println("");
                    break;
                    
                case 2:;

                System.out.println("Digite o valor de seu Deposito");

                    deposito = sc.nextInt();
                    saldo = saldo + deposito;
                    System.out.println("Deposito realizado com sucesso!");
                    System.out.println("");
                break;

                case 3:;

                    System.out.println("\nSeu Saldo atual é: " + saldo);
                    System.out.println("");
                    break;
                    
                case 4:;
                    System.out.println("Obrigado por utilizar nossos serviços\n");
                    System.exit(0);
            }
        }
    }
}    