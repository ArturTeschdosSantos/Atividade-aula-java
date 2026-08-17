import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        try (Scanner leia = new Scanner(System.in)) {
            int opcao;

            do {
                exibirMenu();
                opcao = lerOpcao(leia);

                switch (opcao) {
                    case 1:
                        consultarStatus(veiculos);
                        break;
                    case 2:
                        cadastrarVeiculo(leia, veiculos);
                        break;
                    case 0:
                        System.out.println("Sistema encerrado.");
                        break;
                    default:
                        System.out.println("Opcao invalida. Tente novamente.");
                }
            } while (opcao != 0);
        }
    }

    private static void exibirMenu() {
        System.out.println("\nSistema de consulta mecanica");
        System.out.println("1 - Consultar status dos veiculos");
        System.out.println("2 - Cadastrar veiculo");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opcao: ");
    }

    private static int lerOpcao(Scanner leia) {
        while (!leia.hasNextInt()) {
            System.out.print("Digite um numero: ");
            leia.nextLine();
        }

        int opcao = leia.nextInt();
        leia.nextLine();
        return opcao;
    }

    private static void cadastrarVeiculo(Scanner leia, List<Veiculo> veiculos) {
        System.out.print("Marca: ");
        String marca = leia.nextLine();
        System.out.print("Placa: ");
        String placa = leia.nextLine();
        System.out.print("Modelo: ");
        String modelo = leia.nextLine();
        System.out.print("Proprietario: ");
        String proprietario = leia.nextLine();

        veiculos.add(new Veiculo(marca, placa, modelo, proprietario));
        System.out.println("Veiculo cadastrado com status EM_AVALIACAO.");
    }

    private static void consultarStatus(List<Veiculo> veiculos) {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veiculo cadastrado.");
            return;
        }

        for (Veiculo veiculo : veiculos) {
            System.out.printf("Placa: %s | Modelo: %s | Status: %s%n",
                    veiculo.getPlaca(), veiculo.getModelo(), veiculo.getStatus());
        }
    }
}
