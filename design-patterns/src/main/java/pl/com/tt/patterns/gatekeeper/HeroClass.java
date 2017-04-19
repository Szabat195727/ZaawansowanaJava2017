package pl.com.tt.patterns.gatekeeper;

/**
 * Created by krystian on 19.04.17.
 */
public class HeroClass implements Hero {

    private IStrategy strategy;

    public HeroClass(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStratego(IStrategy newStrategy) {
        this.strategy = newStrategy;
    }

    public void passThroughTheGate() {
        strategy.doAction();
    }
}
