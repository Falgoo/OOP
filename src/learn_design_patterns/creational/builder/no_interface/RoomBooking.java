package learn_design_patterns.creational.builder.no_interface;

public class RoomBooking {

    private final String hotelName;
    private final String roomType;
    private final int numGuests;
    private final boolean withBreakfast;

    private RoomBooking(Builder builderRoom) {
        this.hotelName = builderRoom.hotelName;
        this.roomType = builderRoom.roomType;
        this.numGuests = builderRoom.numGuests;
        this.withBreakfast = builderRoom.withBreakfast;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNumGuests() {
        return numGuests;
    }

    public boolean isWithBreakfast() {
        return withBreakfast;
    }

    public static class Builder {

        private final String hotelName;
        private final String roomType;
        private int numGuests;
        private boolean withBreakfast;

        public Builder(String hotelName, String roomType) {
            this.hotelName = hotelName;
            this.roomType = roomType;
        }

        public Builder setNumGuests(int numGuests) {
            this.numGuests = numGuests;
            return this;
        }

        public Builder setWithBreakfast(boolean withBreakfast) {
            this.withBreakfast = withBreakfast;
            return this;
        }

        public RoomBooking build() {
            return new RoomBooking(this);
        }
    }
}
