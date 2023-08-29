import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        
        int escolha = 0;
        while (escolha != 3) {
            System.out.println("Menu:");
            System.out.println("1 - Criar pessoa");
            System.out.println("2 - Mostrar pessoa");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            
            escolha = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (escolha) {
                case 1:
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    pessoa.setCPF(cpf);
                    
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    pessoa.setNome(nome);
                    
                    System.out.print("Sexo: ");
                    char sexo = scanner.nextLine().charAt(0);
                    pessoa.setSexo(sexo);
                    
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    pessoa.setIdade(idade);
                    
                    break;
                case 2:
                    System.out.println("Informações da pessoa:\n" + pessoa.imprimir());
                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }
        
        scanner.close();
    }
    }

