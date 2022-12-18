
import java.util.stream.Collectors;

public class USBAdapterCardReader implements IUSBReader {


    private final MemoryCard memoryCard;

    public USBAdapterCardReader(MemoryCard memoryCard) {

        this.memoryCard = memoryCard;
    }

    @Override
    public String usbReadingData() {//Let's suppose, that we need a String view of this data for the next steps...
                                    //so, our adapter will transform the output data to String type, and we can read it

        memoryCard.insert();


      String str = memoryCard.getData().stream().map(Object::toString).collect(Collectors.joining());

      System.out.println("Your data in String view is: " + str);

      return str;

    }

    }



