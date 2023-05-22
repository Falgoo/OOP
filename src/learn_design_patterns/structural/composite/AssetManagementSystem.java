package learn_design_patterns.structural.composite;

public class AssetManagementSystem {

    public static void main(String[] args) {
        AssetComponent computer1 = new Computer("PC1", 1000);
        AssetComponent computer2 = new Computer("PC2", 1500);

        AssetComponent meetingRoom = new MeetingRoom("Meeting Room");
        meetingRoom.add(computer1);
        meetingRoom.add(computer2);

        System.out.println(meetingRoom.getDescription());
        System.out.println("Total value: $" + meetingRoom.getTotalValue());
    }
}
