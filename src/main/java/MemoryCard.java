import java.util.ArrayList;

public class MemoryCard  {


 private final    ArrayList<Integer> data;

    MemoryCard() {
        this.data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);

    }

    public void insert() {
        System.out.println("The card has inserted successfully!");
    }

    public ArrayList<Integer> getData() {//we have a memory card, but we can read the data
                                         //only by adapter.
        return data;
    }


    }


