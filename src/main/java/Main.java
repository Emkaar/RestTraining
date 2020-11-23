import java.util.*;

public class Main {
    public static void main(String[] args) {
        AbstractSequentialList<String> l = new LinkedList<>();    //1
        l.add(2,"s");                    //2
        Collection<String> c = l;                    //3
        Iterator i = c.iterator();
        ListIterator li = (ListIterator)i;            //4
        while(li.hasNext())
            System.out.println(li.next());
    }
}
