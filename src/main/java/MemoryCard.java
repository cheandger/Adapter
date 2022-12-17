import java.util.ArrayList;

public class MemoryCard implements IAttantion {


    ArrayList<Integer> data;

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

    public ArrayList<Integer> getData() {
        return data;
    }

    @Override
    public void readDescribe() {
        System.out.println("There is a data file on this disc" +
                "try to use the usbAdapter to read it" + "\n");

    }
}

