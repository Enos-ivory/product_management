package Desafio.cadastro_de_produtos;
import Produtos.market.Produto;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Meneger extends Produto {

    List<Produtos> lista = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public int menu(){
        System.out.println("digite quantos produdos deseja cadastrar: ");
         int cont = scanner.nextInt();
         return cont;
    }
    public String subMenu(){
        System.out.println("Digite: ");
        System.out.println("1- LISTAR");
        System.out.println("2- FILTRAR POR CATEGORIA");
        System.out.println("3- ESTATISTICAS");
        System.out.println("4- sair");
      return null;
    }

    public Produtos cadastro(){
        System.out.println("digite o nome do objeto a ser cadastrado e categoria:  ");
        String nome = scanner.next();
        scanner.nextLine();

        System.out.println("categoria: ");
        String ktgoria = scanner.next();

        System.out.println("valor: ");
        double valor = scanner.nextDouble();

        Produtos produtos = new Produtos(nome,ktgoria,valor);
        lista.add(produtos);
        return null;
    }
    public void listarProdutos(){
        System.out.println(lista.toString());
    }

    public void buscarCategoria(){
        System.out.println(" <____lista_de_categorias____> ");

        for (Produtos produtos: lista){
            String categoria = produtos.getCategory();
            System.out.println(categoria);
        }
    }
    public void filtar() {
        buscarCategoria();
        System.out.println(" digite a categoria que deseja filtrar: ");
        String busca = scanner.nextLine();

        System.out.println("resultado da busca de "+ busca);
        Boolean encontrado = false;

        for (Produtos produto: lista){
            if (produto.getCategory().equalsIgnoreCase(busca)){
                System.out.println(produto);
                encontrado = true;
            }
            if (!encontrado){

            System.out.println("nenhum produto "+ busca +" foi encontrado");
         }
            System.out.println("____________________________________");
        }
    }
    public void estatistic (){
        long quantidade = lista.stream().count();
        System.out.println("exibindo estatisticas...");
        System.out.println("O mais caro " + lista.stream()
                .max(Comparator.comparingDouble(Produtos::getPrice)));

        System.out.println("\nO mais barato " + lista.stream()
                .min(Comparator.comparingDouble(Produtos::getPrice)));
        System.out.println("Quantidade de itens cadastrados: " + quantidade);
    }

}
