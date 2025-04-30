package casestudy.question2;

public class RoomBooking extends HotelService{
    public RoomBooking(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void bookRoom() {
        if(getStayDays() >= 1 && getStayDays() <= 30){
            if(getRoomStatus().equals("AVAILABLE")){
                System.out.println("The room is successfully occupied!");
                setRoomStatus("OCCUPIED");
            }else {
                System.out.println("This room is not available");
            }
        }else {
            System.out.println("Invalid stay days. Stay days must be between 1 and 30.");
        }
    }

    @Override
    public void checkoutGuest() {

    }

    @Override
    public void generateBill() {

    }
}
