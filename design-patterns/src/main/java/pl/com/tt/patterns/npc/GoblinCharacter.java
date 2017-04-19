package pl.com.tt.patterns.npc;

import pl.com.tt.patterns.gatekeeper.BattleStrategy;
import pl.com.tt.patterns.gatekeeper.IStrategy;

/**
 * Created by krystian on 19.04.17.
 */
public class GoblinCharacter implements Character {
    public CharacterType getCharacterType() {
        return CharacterType.GOBLIN;
    }
}
