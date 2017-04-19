package pl.com.tt.patterns.npc;

import pl.com.tt.patterns.gatekeeper.FriendStrategy;
import pl.com.tt.patterns.gatekeeper.IStrategy;

/**
 * Created by krystian on 19.04.17.
 */
public class HumanCharacter implements Character {
    public CharacterType getCharacterType() {
        return CharacterType.HUMAN;
    }
}
