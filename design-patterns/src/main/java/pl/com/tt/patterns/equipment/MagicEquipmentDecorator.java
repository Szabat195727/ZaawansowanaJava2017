package pl.com.tt.patterns.equipment;

/**
 * Created by krystian on 19.04.17.
 */
public class MagicEquipmentDecorator extends EquipmentDecorator {
    public MagicEquipmentDecorator(Equipment storedEquipment) {
        super(storedEquipment);
    }

    @Override
    public String getType() {
        return addSomeMagic() + equipment.getType();
    }

    private String addSomeMagic() {
        return "MAGICZNY ";
    }
}
