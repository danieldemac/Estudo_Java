import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class testeFilas {
    public static void main(String[] args) {
       
        Queue<Integer> minhaFila = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------PROGRAMA DE CRIAÇÃO DE FILAS 1.0----------------");
        System.out.println("----------------by Daniel Cabral--------------------------------");
        System.out.println("----------------------------------------------------------------");

        while (true) {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar valor à fila");
            System.out.println("2 - Remover valor da fila");
            System.out.println("3 - Imprimir os valores da fila atual");
            System.out.println("4 - Sair");

            if (scanner.hasNextInt()) {
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valor a ser adicionado à fila:");

                        if (scanner.hasNextInt()) {
                            int valorAdicionar = scanner.nextInt();
                            minhaFila.offer(valorAdicionar);
                            break;
                        } else {
                            System.out.println("Opção inválida. Digite um número inteiro.");
                            scanner.next(); 
                            break;
                        }

                    case 2:
                        if (!minhaFila.isEmpty()) {
                            int valorRemovido = minhaFila.poll();
                            System.out.println("Valor removido da fila: " + valorRemovido);
                        } else {
                            System.out.println("A fila está vazia.");
                        }
                        break;
                    case 4:
                        scanner.close();
                        System.exit(0);
                        break;
                    case 3:
                        System.out.println("A fila contém os números: " + minhaFila);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        scanner.next();
                }
            } else {
                System.out.println("Opção inválida. Digite um número inteiro.");
                scanner.next(); 
            }
        }
    }
}