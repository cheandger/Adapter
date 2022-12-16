
public class USBCardReader implements Usb {


    private final MemoryCard memoryCard;

    public USBCardReader(MemoryCard memoryCard) {

        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUsbCable() {
        this.memoryCard.insert();
        this.memoryCard.readData();

    }
}

