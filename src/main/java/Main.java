public class Main {

            public static void main(String[] args) {

                IUSBReader cardReader = new USBAdapterCardReader(new MemoryCard());
                cardReader.usbReadingData();

            }
        }


