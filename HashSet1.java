import java.util.*;  

class HashSet2{

    private int id;  
    private String name,author,publisher;  
    private int quantity;
    
    HashSet2(final int id, final String name, final String author, final String publisher, final int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getQuantity() {
        return quantity;
    }

}

/**
 * HashSet1
 */
class HashSet1 {

    public static void main(final String[] args) {
        
        HashSet<HashSet2> set = new HashSet<HashSet2>();
        
        HashSet2 b1=new HashSet2(101,"Let us C","Yashwant Kanetkar","BPB",8);  
        HashSet2 b2=new HashSet2(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
        HashSet2 b3=new HashSet2(103,"Operating System","Galvin","Wiley",6);

        set.add(b1);
        set.add(b2);
        set.add(b3);

        for(HashSet2 h : set){
            System.out.println(h.getId()+" "+h.getName()+" "+h.getAuthor()+" "+h.getPublisher()+" "+h.getQuantity());
        }
    }
}