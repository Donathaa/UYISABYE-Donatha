package casestudy.question2;

public class Billing extends HotelService{
    public Billing(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void bookRoom() {

    }

    @Override
    public void checkoutGuest() {

    }

    @Override
    public void generateBill() {
        double cost = 0;
        String type = getRoomType();
        int stayDays = getStayDays();
        if (type.equals("STANDARD")){
            cost = 50_000;
        }else if(type.equals("DELUXE")){
            cost = 80_000;
        } else if (type.equals("SUITE")) {
            cost = 120_000;
        }else{
            System.out.println("Invalid room type! Try again.");
        }
        double totalCost = cost * stayDays;

        System.out.println("=== Billing ===");
        System.out.println("Guest Name: "+getGuestName());
        System.out.println("Guest ID: "+getGuestId());
        System.out.println("Room Type: "+getRoomType());
        System.out.println("Stay Days: "+getStayDays());
        System.out.printf("Total Cost: %, .2f RWF%n", totalCost);
    }
}
