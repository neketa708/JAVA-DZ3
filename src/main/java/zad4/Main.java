package zad4;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(12);
        ar.add(21);
        ar.add(55);
        ar.add(2);
        ar.add(21);
        ar.add(111);
        ar.add(666);
        Collections.sort(ar);

        System.out.println("Наименьшее значение "+ar.get(0));
        System.out.println("среднее значение "+ar.get(ar.size() /2));
        System.out.println("Наибольшее значение "+ar.get(ar.size() - 1));

    }

}
