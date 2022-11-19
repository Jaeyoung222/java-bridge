package repository;

public class PlayCount {
	private static final int INITIAL_VALUE = 1;

	private static PlayCount playCount = new PlayCount();

	private PlayCount() {
		count = INITIAL_VALUE;
	}

	public static PlayCount getInstance() {
		return playCount;
	}

	private int count;

	public void addCount() {
		count++;
	}

	public int getCount() {
		return count;
	}
}
