public class Sandalia extends Chinelo{ //classe entidade

	private String mate;   //atributos
	private String modelo;
	private int preco;
		
	public Sandalia(){
		mate="";
		modelo="";
		preco=0;
	}
	
	public void setMate(String mate){
		this.mate=mate;
	}
	public void setModelo(String modelo){
		this.modelo=modelo;
	}
	public void setPreco(int preco){
		this.preco=preco;
	}
	public String getMate(){
		return mate;
	}
	public String getModelo(){
		return modelo;
	}
	public int getPreco(){
		return preco;
	}	
}