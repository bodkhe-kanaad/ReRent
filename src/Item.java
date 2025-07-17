
import java.util.List;

public class Item {
    private final int itemId;
    private final String itemCategory;
    private String detailOne;
    private String detailTwo;
    private final String itemName;
    private boolean isAvailable;
    private List < TimeSlot > availblityTimeSlot;

    public Item(List<TimeSlot> availblityTimeSlot, String detailOne, String detailTwo, boolean isAvailable, String itemCategory, int itemId, String itemName) {
        this.availblityTimeSlot = availblityTimeSlot;
        this.detailOne = detailOne;
        this.detailTwo = detailTwo;
        this.isAvailable = isAvailable;
        this.itemCategory = itemCategory;
        this.itemId = itemId;
        this.itemName = itemName;
    }

   
public int getitemId(){
return itemId;
}

public String getitemCategory(){
    return itemCategory;
} 

public String getdetailone(){
    return detailOne;
}

public String getdetailtwo(){
    return detailTwo;
}

public String getitemName(){
    return itemName;
}

public boolean getisAvailable(){
    return isAvailable;
}

public List <TimeSlot> getavailblityTimeSlots(){
    return availblityTimeSlot;
}

public void  setisAvailable(boolean available){
    this.isAvailable = available;
}

}

