/**
 * Class to keep track and manipulate the score of the program
 */
public class Score {
	private int missedWords;
	private int caughtWords;
	private int gameScore;
	
	/**
	 * Default constructor setting the values
	 */
	Score() {
		missedWords=0;
		caughtWords=0;
		gameScore=0;
	}
		
	// all getters and setters must be synchronized
	
	public int getMissed() {
		return missedWords;
	}

	public int getCaught() {
		return caughtWords;
	}
	
	public int getTotal() {
		return (missedWords+caughtWords);
	}

	public int getScore() {
		return gameScore;
	}
	
	public void missedWord() {
		missedWords++;
	}

	public void caughtWord(int length) {
		caughtWords++;
		gameScore+=length;
	}

	public void resetScore() {
		caughtWords=0;
		missedWords=0;
		gameScore=0;
	}
}
