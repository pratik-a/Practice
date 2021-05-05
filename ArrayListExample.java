import java.util.*;
class ArrayListExample
{
    public static void main(String args[])
    {
        ArrayList<String> al = new ArrayList<>();
        al.add("shivangi");
        al.add("mohini");
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}