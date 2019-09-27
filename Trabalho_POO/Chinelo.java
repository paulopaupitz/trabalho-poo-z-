public class Chinelo{ //classe entidade 
	
	private String cor;      //atributos 
	private int num;
	private Fabrica fabrica;

	public Chinelo(){
		cor="";
		num=0;
		fabrica=new Fabrica();				
	}
	public void setFabrica(Fabrica fabrica){
		this.fabrica=fabrica;
	}
	public void setCor(String cor){
		this.cor=cor;
	}
	public void setNum(int num){
		this.num=num;
	}
	public Fabrica getFabrica(){
		return fabrica;
	}
	public String getCor(){
		return cor;
	}
	public int getNum(){
		return num;
	}
}	