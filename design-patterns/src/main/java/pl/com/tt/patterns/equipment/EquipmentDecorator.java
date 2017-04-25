package pl.com.tt.patterns.equipment;

/**
 * Created by krystian on 19.04.17.
 */
public class EquipmentDecorator implements Equipment {

    protected Equipment equipment;

    public EquipmentDecorator(Equipment storedEquipment){
        equipment = storedEquipment;
    }

    public String getType() {
        return equipment.getType();
    }

    public int getPrice() {
        return equipment.getPrice();
    }
}
