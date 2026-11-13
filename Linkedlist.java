import java.util.LinkedList;
public class Linkedlist{
    public static void main(String[] args){
     LinkedList<String>names=new LinkedList<>();
     names.add("John");
     names.add("Alice");
     names.add("David");
     names.add("Robert");
     System.out.println("Linkedlist:"+names);
     System.out.println("First element:"+names.get(0));
     names.set(1,"peter");
     names.remove("Dvid");
     names.set(1,"Peter");
     names.remove("Sam");
     names.addLast("Tom");
     System.out.println("Size:"+names.size());
    }
}