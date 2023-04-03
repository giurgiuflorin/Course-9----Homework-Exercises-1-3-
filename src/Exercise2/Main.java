package Exercise2;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> buquet = new HashSet<>();
        buquet.add("rose");
        buquet.add("gardenia");
        buquet.add("tulip");
        buquet.add("black rose");

        //getAll(): Collection<String>  - returns all the flowers
        System.out.println(buquet);

        //add(String) - adds a flower (remember to keep them unique)
        buquet.add("white rose");
        buquet.add("rose"); //"rose" va aparea o singura data, fiind in contextul HashSet,
                            //astfel doar "white rose" a fost adaugat
        System.out.println(buquet);

        //remove(String) - removes a flower
        buquet.remove("white rose");
        buquet.remove("tulip");
        System.out.println(buquet);




    }
}
