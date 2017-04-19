package pl.com.tt.patterns.npc;

import pl.com.tt.patterns.gatekeeper.BattleStrategy;
import pl.com.tt.patterns.gatekeeper.FriendStrategy;
import pl.com.tt.patterns.gatekeeper.HeroClass;

public class BeginJourney {

	public static void main(String[] args) {
		/*Character hero = CharacterFactory.createCharacter(CharacterType.ELF);
		Character hero2 = CharacterFactory.createCharacter(CharacterType.GOBLIN);
		Character hero3 = CharacterFactory.createCharacter(CharacterType.HUMAN);

		System.out.println(hero.getCharacterType());
		System.out.println(hero2.getCharacterType());
		System.out.println(hero3.getCharacterType());*/

		HeroClass hero = new HeroClass(new FriendStrategy());
		hero.passThroughTheGate();

		hero.changeStratego(new BattleStrategy());
		hero.passThroughTheGate();
	}
	
}
