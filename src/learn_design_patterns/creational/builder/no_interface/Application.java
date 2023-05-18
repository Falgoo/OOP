package learn_design_patterns.creational.builder.no_interface;

public class Application {

    public static void main(String[] args) {
        RoomBooking booking = new RoomBooking.Builder("ABC Hotel", "Deluxe Room")
                .setNumGuests(2)
                .setWithBreakfast(true)
                .build();

        System.out.println("Hotel Name: " + booking.getHotelName());
        System.out.println("Room Type: " + booking.getRoomType());
        System.out.println("Number of Guests: " + booking.getNumGuests());
        System.out.println("With Breakfast: " + booking.isWithBreakfast());
    }
}
