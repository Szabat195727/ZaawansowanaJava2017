package pl.com.tt.patterns.equipment;

/**
 * Created by krystian on 19.04.17.
 */
public class Weapon implements Equipment {
    public String getType() {
        return "KARABIN";
    }

    public int getPrice() {
        return 20;
    }
}
