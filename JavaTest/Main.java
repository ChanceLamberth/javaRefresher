import java.util.ArrayList;

public class Main {

    // Method used to print out the DogList names.
    private void decompose(String[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].toString());
        }
    }

    public static void main(String[] args) {
        // Creating Dog Objects
        Dog test = new Dog("Fluffy", "papillon", 5, "white");
        Dog test2 = new Dog ("Stella", "terrier", 2, "brown");
        Dog test3 = new Dog();
        Dog test4 = new Dog("Peaches", "alien", 4, "green?");


        // Sending Dog objects to a new class that groups all the dogs together.
        ArrayList<Dog> l = new ArrayList<>();
        l.add(test);
        l.add(test2);
        l.add(test3);
        l.add(test4);

        // Initializes the dogs and returns an array object.
        DogList dList = new DogList(l);
        System.out.println();


        /**
         * Initialize a new instance of the main function.
         * Uses a void function to print out the names of the dog in the DogList
         * result: Prints out the entire dog list.
         */
        Main m = new Main();
        int listSize = l.size();
        m.decompose(dList.dogListNames(listSize));
        // System.out.println(list.list()[1]);
        System.out.println();
    }
    
}
