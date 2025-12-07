package Desafio.cadastro_de_produtos;

import java.util.Objects;

public class Produto implements Comparable<Produto>  {
    private String name;
    private  String category;
    private double price;

    public Produto(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    /// constructor of a temporary object
    public Produto(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Produto o) {
        return 0;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return  true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Produto produto = (Produto) obj;

        return Objects.equals(name, produto.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
