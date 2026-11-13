import java.util.LinkedList;
public class Linksong{
    public static void main(String[] args){
     LinkedList<String>names=new LinkedList<>();
     names.add("mala tum tum....");
     names.add("oram pathuku...");
     names.add("neno butter fly....");
     names.add("nv vuntey na jathaga...");
     names.add("chamaki chupulu.....");
     System.out.println("Linkedlist:"+names);
     System.out.println("First element:"+names.get(0));
     System.out.println("last element:"+names.get(4));
     names.remove("chamaki chupulu.....");
     names.remove("Sam");
     System.out.println("Size:"+names.size());
    }
}