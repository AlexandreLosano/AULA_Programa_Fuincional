package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {

		List<Produto> list = new ArrayList<>();

		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablet", 450.00));

		list.sort(new MeuComparador());

		for (Produto p : list) {
			System.out.println(p);
		}
	}
}
