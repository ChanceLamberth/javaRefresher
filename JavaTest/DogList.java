import java.util.ArrayList;

public class DogList {
    ArrayList<Dog> dogList = new ArrayList<>();

    public DogList (ArrayList<Dog> dogList) {
        this.dogList = dogList;
    }

    /**
     * Returns the names of all dogs in the arrayList.
     * @param lSize - a count of all the objects in the arraylist.
     * @return - name of dogs in the arraylist.
     */
    public String[] dogListNames(int lSize) {
        // String s = "This returned";
        String s[] = new String[lSize];
        for (int i = 0; i < dogList.size(); i++) {
            s[i] = dogList.get(i).name;
        }
        return s;
    }

    @Override
    public String toString() {
        return ("This is the dogList");
    }
}
