import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args){


    int opcao = 0;

    Scanner leia = new Scanner();

    do {
        System.out.println("Sistema consulta mecânica");
        System.out.println("1 - consultar Satus dos veículos");
        System.out.println("2 - cadastrar veículos");
        System.out.println("0 - Sair");




        switch  (opcao){
            case 1:
                System.out.println("Status do veículo"+ getStatus());
                break;

            case 2:

                break;

            default:


    }  while (opcao > 0);
}
}

