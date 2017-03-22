package com.technologies.transition.codesmells.usingdatatables;

import java.util.ArrayList;
import java.util.List;

public class FootbalSeasonStatistics {
	
	public static final int INDEX_OF_FIRST_TEAM = 0;
	public static final int INDEX_OF_SECOND_TEAM = 1;
	public static final int INDEX_OF_RESULT = 2;
	public static final int INDEX_OF_FOULS_FOR_FIRST_TEAM = 3;
	public static final int INDEX_OF_FOULS_FOR_SECOND_TEAM = 4;

	private List<String[]> games = new ArrayList<>();
	
	public void addGameData (String[] gameData) {
		String firstTeam = gameData[INDEX_OF_FIRST_TEAM];
		String secondTeam = gameData[INDEX_OF_SECOND_TEAM];
		String result = gameData[INDEX_OF_RESULT];
		String foulsForFirstTeam = gameData[INDEX_OF_FOULS_FOR_FIRST_TEAM];
		String foulsForSecondTeam = gameData[INDEX_OF_FOULS_FOR_SECOND_TEAM];
		
		// proces the data.....
	}

}
