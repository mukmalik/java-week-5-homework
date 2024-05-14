import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program5ArrayListColours {

    public static void arrayColours()
    {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Yellow");
        arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("White");
        arrayList.add("Purple");

//        for (String ar : arrayList )
//        {
//            System.out.println(ar);
//        }

        Iterator<String> st = arrayList.iterator();
        while (st.hasNext())
        {
            System.out.print(st.next()+"   ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        System.out.println();
        System.out.println(" \nPlease find below all the elements printed using 'Iterator' ");
        System.out.println();
        arrayColours();
    }
}
