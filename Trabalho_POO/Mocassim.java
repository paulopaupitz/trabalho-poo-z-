public class Mocassim extends Sapato{  //classe entidade 
    
    private String palmilha;  //atributos
    private String marca;   

    public Mocassim(){
        palmilha="";
        marca="";
    }
    public void setPalmilha(String palmilha){
        this.palmilha=palmilha;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getPalmilha(){
        return palmilha;
    }
    public String getMarca(){
        return marca;
    }
}