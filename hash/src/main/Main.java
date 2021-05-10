package main;
/**
 *
 * @author Jhon Alexis
 */
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.tabla();
        main.mapa();
    }

    public void tabla(){
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

        // Input the values
        hm.put(1, "Geeks");
        hm.put(12, "forGeeks");
        hm.put(15, "A computer");
        hm.put(3, "Portal");

        // Printing the Hashtable
        System.out.println(hm);
        System.out.println(hm.get(15));
        if(hm.containsKey(5)){
            System.out.println(hm.get(5));
        }else{
            System.out.println("La tabla no contiene la llave");
        }
        if(hm.containsValue("Portal")){
            System.out.println("La tabla si lo contiene");
        }else{
            System.out.println("La tabla no lo contiene");
        }
        System.out.println(hm.keySet());
        for(String value: hm.values()){
            System.out.println(value);
        }
        Enumeration <Integer> keys = hm.keys();
        for(int i = 0; i < hm.size(); i++){
            System.out.println(hm.get(keys.nextElement()));
        }
    }

    public void mapa(){
        // Creates an empty HashMap
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        int arr[] = { 10, 34, 5, 10, 3, 5, 10 };

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {

            // Get if the element is present
            Integer c = hmap.get(arr[i]);

            // If this is first occurrence of element
            // Insert the element
            if (hmap.get(arr[i]) == null) {
                hmap.put(arr[i], 1);
            }

            // If elements already exists in hash map
            // Increment the count of element by 1
            else {
                hmap.put(arr[i], ++c);
            }
        }

        // Print HashMap
        System.out.println(hmap);

        System.out.println(hmap.size());
        hmap.replace(5,300);

        System.out.println(hmap);
        hmap.remove(3);

        System.out.println(hmap);
        System.out.println(hmap.values());
        hmap.clear();

        System.out.println(hmap.size());

    }
}
