import hsa.*;
import java.util.*;

public class ListIteratorSample {
static Console c;
static ArrayList <String> al;
static ListIterator li;
static int pos=0;

    public static void main(String[] args) {
        c= new Console(30,50);
        al= new ArrayList();
        al.add("a");
        al.add("b");
        al.add("c");
        // make list iterator
        li= al.listIterator();
        showList();
        //move 1
        c.print("\nMove over item "+li.next()+"\n");
        pos++;
        showList();
        //move 2
        c.print("\nMove over item "+li.next()+"\n");
        pos++;
        showList();
        //move 3
        c.print("\nRemove object b\n");
        li.remove();
        pos--;
        showList();
        //move 4
        c.println("\nAdding b");
        li.add("b");
        pos++;
        showList();
        //move 5
        c.print("\nMove over item "+li.next()+"\n");
        pos++;
        showList();
        //move 6
        c.print("\nMove back over item "+li.previous()+"\n");
        pos--;
        showList();
        //move 7
        c.print("\nRemove object c\n");
        li.remove();
        showList();
        //move 8
        c.print("\nMove back over item "+li.previous()+"\n");
        pos--;
        showList();
        //move 9
        c.println("\nSet last object seen to e");
        li.set("e");
        showList();
        //move 10
        c.println("\nAdding b");
        li.add("b");
        pos++;
        showList();
        //move 11
        c.println("\nAdding c");
        li.add("c");
        pos++;
        showList();
        //move 12 error
//        c.print("\nRemove object c\n");
//        li.remove();
//        showList();
        //move 13
        c.print("\nMove over item "+li.next()+"\n");
        pos++;
        showList();
        //move 14 error
        c.println("\nIs there a next? "+ li.hasNext());
        //li.next();
        
        
        
    }
    
    public static void showList(){
        for (int i = 0; i < al.size(); i++) {
            if(i==pos) c.print("*");
            c.print(al.get(i));
        }
        if(pos==al.size()) c.print("*");
    }
    
}
