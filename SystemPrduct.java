package Desafio.cadastro_de_produtos;

import java.util.Scanner;

public class SystemPrduct extends Meneger {

    public void start(){
        Meneger m =  new Meneger();
        int repite = m.menu();
        m.scanner.nextLine();

        for (int i = 1; i <= repite; i++){
            m.cadastro();
        }
        int option ;
        do {
            m.subMenu();
            System.out.println("digite a opcao desejada: ");
            option = scanner.nextInt();
            m.scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("listando os itens");
                    m.listarProdutos();
                    break;
                case 2:
                    m.filtar();
                    break;
                case 3:
                    m.estatistic();
                    break;
                case 4:
                    System.out.println("deletar obejetos");
                    m.delete();
                    break;
                case 5:
                    System.out.println("adcionando objetos ");
                    m.cadastro();
                    break;
                case 6:
                    System.out.println("saindo.....");
                    break;
                default:
                    System.out.println("opcao invalida tente novamente.");
                    break;
            }
            if (option != 5){
                System.out.println("\n presione enter para continuar.... ");
                scanner.nextLine();

            }
        }
        while ( option!= 5);

    }


}





