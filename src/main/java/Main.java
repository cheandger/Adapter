public class Main {

    public static void main(String[] args) {

        Usb cardReader = new USBCardReader(new MemoryCard());
        cardReader.connectWithUsbCable();
    }
}