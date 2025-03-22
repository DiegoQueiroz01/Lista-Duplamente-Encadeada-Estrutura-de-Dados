package one.digitalinovation;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }
    public T get(int index){
        return this.getNo(index).getConteudo();
    }
    private NoDuplo<T> getNo(int index){ //metodo de uso interno da classe.
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public int size(){ //retorna um valor que é o tamanho da lista.
        return tamanhoLista;
    }
}
