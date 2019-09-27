public class Salto extends Sapato{ //classe entidade
    
    private int tamSalto; //atributos
    private String tipoSalto;

    public Salto(){
        tamSalto=0;
        tipoSalto="";
    }
    public void setTamSalto(int tamSalto){
        this.tamSalto=tamSalto;
    }
    public void setTipoSalto(String tipoSalto){
        this.tipoSalto=tipoSalto;
    }
    public int getTamSalto(){
        return tamSalto;
    }
    public String getTipoSalto(){
        return tipoSalto;
    }











}