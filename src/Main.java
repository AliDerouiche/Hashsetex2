//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> firstSet = populateHashSet();
        String element = "mainValue";

        checkSet(firstSet, element);

    }

    public static HashSet<String> populateHashSet() { // Metodo per popolare l'HashSet
        HashSet<String> set = new HashSet<>();
        set.add("firstElement");
        set.add("secondElement");
        set.add("thirdElement");
        return set;
    }

    public static void checkSet(HashSet<String> set, String element) { // Metodo per verificare se un elemento è nel Set
        if (set.contains(element)) {
            System.out.println("L'HashSet contiene " + element);
        } else { // Altrimenti
            System.out.println("L'HashSet non contiene " + element);
        }
    }
}

