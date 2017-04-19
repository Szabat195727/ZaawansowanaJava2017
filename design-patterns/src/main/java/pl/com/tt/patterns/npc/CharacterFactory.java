package pl.com.tt.patterns.npc;

/**
 * Created by krystian on 19.04.17.
 */
public class CharacterFactory {

    private CharacterFactory(){}

    public static Character createCharacter(CharacterType type){
        Character returnObject = null;
        switch (type){
            case ELF:
                returnObject = new ElfCharacter();
                break;

            case GOBLIN:
                returnObject = new GoblinCharacter();
                break;

            case HUMAN:
                returnObject = new HumanCharacter();
                break;
            default:
                break;
        }

        return returnObject;
    }
}
