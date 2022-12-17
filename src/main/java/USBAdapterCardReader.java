
import java.util.stream.Collectors;

public class USBAdapterCardReader implements IUSBReader {


    private final MemoryCard memoryCard;

    public USBAdapterCardReader(MemoryCard memoryCard) {

        this.memoryCard = memoryCard;
    }

    @Override
    public String usbReadingData() {

        memoryCard.readDescribe();

        memoryCard.insert();


      String str = memoryCard.getData().stream().map(Object::toString).collect(Collectors.joining());

      System.out.println("Your data in String view is: " + str);

      return str;

    }

    }



