package pl.com.tt.patterns.gatekeeper;

/**
 * Created by krystian on 19.04.17.
 */
public class FriendStrategy implements IStrategy {

    public void doAction() {
        System.out.println("WITAJ PRZYJACIELU, WCHODŹ");
    }
}
