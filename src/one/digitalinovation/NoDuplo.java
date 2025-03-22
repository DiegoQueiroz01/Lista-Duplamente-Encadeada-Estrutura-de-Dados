package one.digitalinovation;

public class NoDuplo<T> {
    private T conteudo;
    private NoDuplo<T> noProximo;
    private NoDuplo<T> noPrevio;

    public NoDuplo(T conteudo){
        this.conteudo = conteudo;
        this.noProximo = null;
        this.noPrevio = null;
    }
    public NoDuplo<T> getNoProximo(){
        return noProximo;
    }
    public void setNoProximo(NoDuplo<T> noProximo){
        this.noProximo = noProximo;
    }
    public NoDuplo<T> getNoPrevio(){
        return noPrevio;
    }
    public void setNoPrevio(NoDuplo<T> noPrevio){
        this.noPrevio = noPrevio;
    }
    public T getConteudo(){
        return conteudo;
    }
    @Override
    public String toString(){
        return "NoDuplo{" +
                "conteudo= " + conteudo +
                '}';
    }
    public Object getProximoNo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProximoNo'");
    }
}
