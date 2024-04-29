package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrincipalList {
    public static void main(String[] args) {
        List list;

        list = new ArrayList<>();
        list.add(2);
        list.add(435);
        list.add(23);
        list.add(67);
        list.add(1);
        list.add(434);
        list.add(6);
        list.add(50);
        System.out.println("Antes de usar a Ordenação: ");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Depois de usar a Ordenação: ");
        System.out.println(list);

        list = new LinkedList<>();
        list.add("A");
        list.add("Z");
        list.add("J");
        list.add("P");

        System.out.println("Polimorfismo de List: " + list);
        Collections.sort(list);

        System.out.println("Ordenado: "+ list);

    }
}
