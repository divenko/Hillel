import java.util.ArrayList;
import java.util.Collections;


public class HomeTask {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(1);
        list.add(5);
        removeDup(list);
    }
    public static void removeDup(ArrayList list){
        for (int i =0; i < list.size(); i++) {
            int a1 = i;
            Object element = list.get(i);
            int a2 = list.lastIndexOf(element);

            if (a1!=a2) {
              while (a1>-1) {
                  list.remove(a1);
                  a1=list.indexOf(element);
              }
              i--;
            }
        }
        System.out.println(list);

    }

}