

package basicjava;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Names {
    
    public static void display(ArrayList<String> names) {
    for (int i = 0; i < names.size(); i = i + 1) {
        System.out.println(names.get(i));
    }
}

public static int find(String s, ArrayList<String> a) {
    for (int i = 0; i < a.size(); i = i + 1) {
        String str = a.get(i);
        if (str.equals(s)) {
            return i;
        }
    }
    return -1;

}

public static void capitalize(ArrayList<String> names) {
    for (int i = 0; i < names.size(); i = i + 1) {
        String name = names.get(i);
        if (!name.isEmpty()) {
            String firstLetter = "" + name.charAt(0);
            names.set(i, firstLetter.toUpperCase() + name.substring(1).toLowerCase());

        }
    }
}

public static void sort(ArrayList<String> names) {
    for (int i = 0; i < names.size() - 1; i = i + 1) {
        int Min = i;
        for (int j = i + 1; j < names.size(); j = j + 1) {
            if (names.get(j).compareTo(names.get(Min)) < 0) {
                Min = j;
            }
        }
        String tmp = names.get(i);
        names.set(i, names.get(Min));
        names.set(Min, tmp);

    }

}

public static void getNames(ArrayList<String> fn, ArrayList<String> ln) throws IOException {
    Scanner kb = new Scanner(System.in);
    System.out.println("What is the input flie?");
    String names = kb.next();
    File inpFile = new File(names);
    Scanner in = new Scanner(inpFile);

    while (in.hasNext()) {
        String firstName = in.next();
        String lastName = in.next();
        fn.add(firstName);
        ln.add(lastName);

    }

}

private int countOccurence(String name, ArrayList<String> names){
 int count = 0;
 for(int i =0; i <= names.size; i++){
    if(name.equalsIgnoreCase(names.get(i))){
        count++;
    }
 }
 return count;
}

public static void main(String[] args) throws IOException {

    ArrayList<String> first = new ArrayList<>();
    ArrayList<String> last = new ArrayList<>();
    getNames(first, last);
    capitalize(first);
    capitalize(last);

    ArrayList<String> allNames = new ArrayList<>();
    for (int i = 0; i < first.size(); i++) {
        allNames.add(last.get(i) + ", " + first.get(i));
    }
    System.out.println("*******All Names******");

    sort(allNames);
    display(allNames);

    System.out.println("*****First Name Count***");

    for(int i =0; i<= first.size; i++){
    int count = countOccurence(first.get(i), first);
System.out.println(first.get(i) + " occured " + count + " times.");
}

    System.out.println("****Last Name Count****");

    sort(last);
    display(last);

}

    
}
