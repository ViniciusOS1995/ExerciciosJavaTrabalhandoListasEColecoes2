package exercicioDois.titulo;

public class Titulo implements Comparable<Titulo>{
    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    String nome;

    @Override
    public String toString() {
        return "nome: " + nome;
    }

    @Override
    public int compareTo(Titulo o) {
        return this.getNome().compareTo(o.getNome());
    }
}
