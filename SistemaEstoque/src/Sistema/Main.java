package Sistema;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Produto produto = new Produto(1, "Produto1", "Descrição do Produto1", 10, 100.00);
		produto.gravaEstoque(produto.getCodigo(), produto.getNome(), produto.getDescricao(), produto.getQuantidade(),
				produto.getPreco());

		Alimento alimento = new Alimento(2, "Arroz", "Arroz branco", 20, 5.00, LocalDate.of(2024, 12, 31));
		alimento.gravaEstoque(alimento.getCodigo(), alimento.getNome(), alimento.getDescricao(),
				alimento.getQuantidade(), alimento.getPreco());

		Eletronico eletronico = new Eletronico(3, "Smartphone", "Smartphone X", 5, 1500.00, "MarcaX", "ModeloX");
		eletronico.gravaEstoque(eletronico.getCodigo(), eletronico.getNome(), eletronico.getDescricao(),
				eletronico.getQuantidade(), eletronico.getPreco());
	}
}
