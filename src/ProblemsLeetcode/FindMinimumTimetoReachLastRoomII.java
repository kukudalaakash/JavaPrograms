package ProblemsLeetcode;

public class FindMinimumTimetoReachLastRoomII {

	public static void main(String[] args) {
		int arr[][] = { { 0, 4 }, { 4, 4 } };
		System.out.println(minTimeToReach(arr));
	}

	public static int minTimeToReach(int[][] moveTime) {
		int r = moveTime.length;
		int c = moveTime[0].length;
		int i = 0, j = 0, t = 0, alt = 1;
		while (i < r && j < c) {
			int min;
			if (i == r - 1 && j == c - 1) {
				return t;
			}
			if (i == r - 1) {
				if (t < moveTime[i][j + 1]) {
					t += moveTime[i][j + 1] - t + alt;
				} else {
					t += alt;
				}
				alt = alt == 1 ? 2 : 1;
				j++;
			} else if (j == c - 1) {
				if (t < moveTime[i + 1][j]) {
					t += moveTime[i + 1][j] - t + alt;
				} else {
					t += alt;
				}
				alt = alt == 1 ? 2 : 1;
				i++;
			} else {
				if (moveTime[i + 1][j] < moveTime[i][j + 1]) {
					min = moveTime[i + 1][j];
					i++;
				} else {
					min = moveTime[i][j + 1];
					j++;
				}
				if (t < min) {
					t += min - t + alt;
				} else {
					t += alt;
				}
				alt = alt == 1 ? 2 : 1;
			}

		}
		return t;
	}
}

