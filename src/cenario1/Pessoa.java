package cenario1;

import java.util.*;

public class Pessoa implements List<Pessoa> {
    private String nome;
    private Pessoa conjuge;
    private List<Pessoa> filho;


    public Pessoa(String nome) {
        this.nome = nome;
        this.filho = new ArrayList<>();
    }

    public Pessoa(String nome, Pessoa conjuge) {
        this.nome = nome;
        this.conjuge = conjuge;
        this.filho = new ArrayList<>();
        if (conjuge != null) {
            conjuge.addFilho(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getConjuge() {
        return conjuge;
    }

    public void setConjuge(Pessoa conjuge) {
        this.conjuge = conjuge;
    }

    public List<Pessoa> getFilho() {
        return filho;
    }

    public void setFilho(List<Pessoa> filho) {
        this.filho = filho;
    }

    public void addFilho(Pessoa filho) {
        this.filho.add(filho);
    }

    public void filhoDe(Pessoa filho){

    }

    public void addConjuge(Pessoa conjuge) {
        this.conjuge = conjuge;
        conjuge.conjuge = this;
    }

    public void printFamilyTree(){
        System.out.print(this.nome);
        if (this.conjuge != null) {
            System.out.print(" -- Casado(a) com: " + this.conjuge.nome);
        }
        else{
            System.out.println(" -- Solteiro(a)");

        }
        if (!this.filho.isEmpty()) {
            System.out.println(" -- Filhos:");
            for (Pessoa filho : this.filho) {
                filho.printFamilyTree();
            }
        }


    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Pessoa> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Pessoa pessoa) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Pessoa> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Pessoa> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Pessoa get(int index) {
        return null;
    }

    @Override
    public Pessoa set(int index, Pessoa element) {
        return null;
    }

    @Override
    public void add(int index, Pessoa element) {

    }

    @Override
    public Pessoa remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Pessoa> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Pessoa> listIterator(int index) {
        return null;
    }

    @Override
    public List<Pessoa> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}
