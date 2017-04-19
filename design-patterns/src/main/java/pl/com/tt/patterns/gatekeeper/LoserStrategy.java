package pl.com.tt.patterns.gatekeeper;

/**
 * Created by krystian on 19.04.17.
 */
public class LoserStrategy implements IStrategy {

    public void doAction() {
        System.out.println("NIEEEEE");
    }
}
