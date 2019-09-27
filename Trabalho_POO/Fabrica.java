public class Fabrica{ //classe entidade

	private String nome;  //atributos
	private int cnpj;

	public Fabrica(){
		nome="";
		cnpj=0;
	} 			
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setCnpj(int cnpj){
		this.cnpj=cnpj;
	}
	public String getNome(){
		return nome;
	}
	public int getCnpj(){
		return cnpj;
	}
}


