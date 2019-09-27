public class Sapato{
    private String corSola;
    private int tamanhoFormato;
    private int tamanhoBico;

    public Sapato(){
        corSola="";
        tamanhoFormato=0;
        tamanhoBico=0;
    }
    public void setCorsola(String corSola){
        this.corSola=corSola;
    }
    public void setTamanhoBico(int tamanhoBico){
        this.tamanhoBico=tamanhoBico;
    }
    public void setTamanhoFormato(int tamanhoFormato){
        this.tamanhoFormato=tamanhoFormato;
    }
    public String getCorSola() {
        return corSola;
    }
    public int getTamanhoBico(){
        return tamanhoBico;
    }
    public int getTamanhoFormato(){
        return tamanhoFormato;
    }

}