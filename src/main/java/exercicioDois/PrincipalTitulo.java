package exercicioDois;

import exercicioDois.titulo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrincipalTitulo {
    public static void main(String[] args) {
        var nome = new Titulo("Fenarda");
        var nome1 = new Titulo("Cosme");
        var nome2 = new Titulo("Zazá");
        var nome3 = new Titulo("Mauricio");

        List list = new ArrayList<Titulo>();
        list.add(nome);
        list.add(nome1);
        list.add(nome2);
        list.add(nome3);

        System.out.println("Antes da Ordenação: ");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Depois da Ordenação: ");
        System.out.println(list);

        List lista = new LinkedList<String>();
        lista.add("R");
        lista.add("P");
        lista.add("L");
        lista.add("A");

        System.out.println("Lista Instanciada: " +lista);

        Collections.sort(lista);
        System.out.println("Lista Ordenada" + lista);


    }
}
