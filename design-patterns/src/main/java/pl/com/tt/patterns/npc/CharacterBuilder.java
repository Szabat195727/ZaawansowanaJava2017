package pl.com.tt.patterns.npc;

/**
 * Created by krystian on 19.04.17.
 */
public class CharacterBuilder {

    private CharacterBuilder(){}

    public static CharacterClass createCharacter(CharacterType type){
        CharacterClass character = new CharacterClass(type);
        return character;
    }
}
