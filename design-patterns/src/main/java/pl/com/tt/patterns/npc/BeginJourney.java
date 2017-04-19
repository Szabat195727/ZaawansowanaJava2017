package pl.com.tt.patterns.npc;

public class BeginJourney {

	public static void main(String[] args) {
		Character hero = CharacterFactory.createCharacter(CharacterType.ELF);
		Character hero2 = CharacterFactory.createCharacter(CharacterType.GOBLIN);
		Character hero3 = CharacterFactory.createCharacter(CharacterType.HUMAN);

		System.out.println(hero.getCharacterType());
		System.out.println(hero2.getCharacterType());
		System.out.println(hero3.getCharacterType());
	}
	
}
