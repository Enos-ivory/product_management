package Desafio.cadastro_de_produtos;

public class Main extends Meneger {
    public static void main(String[] args) {

     Meneger m = new Meneger();
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
                 System.out.println("saindo.....");
                 break;
             default:
                 System.out.println("opcao invalida tente novamente.");
                 break;
         }
         if (option != 4){
             System.out.println("\n presione enter para continuar.... ");
             scanner.nextLine();
             scanner.nextLine();
         }
     }
     while ( option!= 4);

    }
}
