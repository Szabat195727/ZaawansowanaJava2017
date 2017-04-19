package pl.com.tt.patterns.npc;

public class BeginJourney {

	public static void main(String[] args) {
		Character hero = CharacterBuilder.createCharacter(CharacterType.ELF);
		System.out.println(hero.getCharacterType().toString());
	}
	
}
