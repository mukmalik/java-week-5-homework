import java.util.HashMap;

public class Program9HashMap {

    public static void hashMap()
    {
        //create hashmap object call String people
        HashMap<String,Integer> people = new HashMap<String,Integer>();

        //Add keys and Values (Name,age)
        people.put("Ram", 30);
        people.put("Sham", 15);
        people.put("MohanDas", 35);

        for (String i : people.keySet()){
            System.out.println("Keys : " + i + "value:" + people.get(i));
        }
    }

    public static void main(String[] args)
    {
        hashMap();
    }
}
