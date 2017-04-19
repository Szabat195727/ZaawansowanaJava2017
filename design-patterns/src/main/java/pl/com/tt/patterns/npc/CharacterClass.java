package pl.com.tt.patterns.npc;

/**
 * Created by krystian on 19.04.17.
 */
public class CharacterClass implements Character {
    private CharacterType type;

    public CharacterClass(CharacterType type) {
        this.type = type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    public CharacterType getCharacterType() {
        return this.type;
    }
}
