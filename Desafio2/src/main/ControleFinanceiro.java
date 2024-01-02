package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Categoria;
import entities.Lancamento;
import entities.Produto;

public class ControleFinanceiro {

	public static void main(String[] args) {

		Categoria lazer = new Categoria("Lazer");

		Categoria saude = new Categoria();
		saude.setNome("Saúde");

		System.out.println(lazer.toString());
		System.out.println(saude.toString());

		Lancamento despesa1 = new Lancamento("despesa", true, "02/01/2024", 150.0);

		Lancamento receita1 = new Lancamento();
		receita1.setTipo("receita");
		receita1.setPago(false);
		receita1.setData("03/02/2024");
		receita1.setValor(3000.0);

		System.out.println(despesa1.toString());
		System.out.println(receita1.toString());

		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("Produto A", 50.0));
		produtos.add(new Produto("Produto B", 30.0));
		produtos.add(new Produto("Produto C", 20.0));
		produtos.add(new Produto("Produto D", 40.0));
		produtos.add(new Produto("Produto E", 25.0));

		for (Produto produto : produtos) {
			produto.setPreco(produto.getPreco() + 10.0);
		}

		List<Produto> produtosMaisCaros = new ArrayList<>();

		produtosMaisCaros.add(new Produto("Produto X", 80.0));
		produtosMaisCaros.add(new Produto("Produto Y", 65.0));
		produtosMaisCaros.add(new Produto("Produto Z", 100.0));

		Collections.sort(produtos, (p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()));
		Collections.sort(produtosMaisCaros, (p1, p2) -> Double.compare(p2.getPreco(), p1.getPreco())); 

		System.out.println("Produtos mais caros:");
		for (Produto produto : produtosMaisCaros) {
			System.out.println(" " + produto.toString());
		}

		System.out.println("Todos os produtos:");
		for (Produto produto : produtos) {
			System.out.println(" " + produto.toString());
		}
	}
}