package casestudy.question2;

public class GuestCheckout extends HotelService{
    public GuestCheckout(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void bookRoom() {

    }

    @Override
    public void checkoutGuest() {
        if(getRoomStatus().equals("OCCUPIED")){
            setRoomStatus("AVAILABLE");
            System.out.println("The guest has been checked out. Room is now available.");
        }else {
            System.out.println("This room is not occupied!");
        }
    }

    @Override
    public void generateBill() {

    }
}
