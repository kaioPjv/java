

public class Produto {

	private String nomedoItem;
	private int quantidadedoItem;

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.nomedoItem = "notebook";
		produto.quantidadedoItem = 100;
		
		System.out.println("É necessário repor estoque? " + produto.estoque());
		
	}
	private String estoque() {
		// TODO Auto-generated method stub
		return null;
		
	}

}