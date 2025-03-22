package one.digitalinovation;

public class NoDuplo<T> {
    private T conteudo;
    private NoDuplo<T> noProximo;
    private NoDuplo<T> noPrevio;

    public NoDuplo(T conteudo){
        this.conteudo = conteudo;
    }
    public NoDuplo<T> getNoProximo(NoDuplo<T> noProximo){
        return noProximo;
    }
    public void setNoProximo(NoDuplo<T> noProximo){
        this.noProximo = noProximo;
    }
    public NoDuplo<T> getnoPrevio(NoDuplo<T> noPrevio){
        return noPrevio;
    }
    public void setNoPrevio(NoDuplo<T> noPrevio){
        this.noPrevio = noPrevio;
    }
    public String toString(){
        return "NoDuplo{" +
                "conteudo= " + conteudo +
                '}';
    }
}
