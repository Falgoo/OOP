package learn_design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoom extends AssetComponent {

    private String name;
    private List<AssetComponent> assets = new ArrayList<>();

    public MeetingRoom(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return name + "Meeting room";
    }

    @Override
    public double getTotalValue() {
        double totalValue = 0;
        for (AssetComponent asset : assets) {
            totalValue += asset.getTotalValue();
        }
        return totalValue;
    }

    public void add(AssetComponent component) {
        assets.add(component);
    }

    public void remove(AssetComponent component) {
        assets.remove(component);
    }
}
