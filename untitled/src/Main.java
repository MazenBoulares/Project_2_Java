import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        ArrayList e = new ArrayList();


        Personne p1 = new Personne(123, "Mazen", "Boulares", 345);
        Personne p2 = new Personne(658, "Mazen", "Boulares", 345);
        Personne p3 = new Personne(987, "Mazen", "Boulares", 345);

        Personne p4 = new Personne(745, "Mazen", "Boulares", 345);

        e.add(p1);
        e.add(p2);
        e.add(p3);
        e.add(p4);

        for (int i = 0; i < e.size(); i++) {


            System.out.println(e.get(i).toString());
        }


        for (int i = 0; i < e.size(); i++) {


            System.out.println(((Personne) e.get(i)).getNom());
        }


        ArrayList<Personne> e2 = new <Personne>ArrayList();


        e2.add(p1);
        e2.add(p2);
        e2.add(p3);
        e2.add(p4);


        for (int i = 0; i < e2.size(); i++) {


            System.out.println(e2.get(i).toString());
        }


        for (int i = 0; i < e2.size(); i++) {


            System.out.println(e2.get(i).getNom());
        }


        System.out.println(e2.contains(new Personne(658, "Mazen", "Boulares", 345)));


        // cree une list de Integer et faite le tri croi et dec
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(8);
        Collections.sort(integerList);
        System.out.println(integerList);
        Collections.sort(integerList, Collections.reverseOrder());
        System.out.println(integerList);


// cree une list de String et faite le tri croi et dec
        ArrayList<String> StringList = new ArrayList<String>();
        StringList.add("a");
        StringList.add("c");
        StringList.add("b");
        Collections.sort(StringList);
        System.out.println(StringList);
        Collections.sort(StringList, Collections.reverseOrder());
        System.out.println(StringList);

//trier la liste de personne

        System.out.println(e2);

        Collections.sort(e2, new Comparator<Personne>() {
            @Override
            public int compare(Personne p1, Personne p2) {
                return Integer.compare(p1.getId(), p2.getId());
            }
        });


    }
}