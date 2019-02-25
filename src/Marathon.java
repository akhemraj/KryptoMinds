import java.util.Arrays;

public class Marathon {

	private String[] name = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James",
			"Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };

	private int[] marTime = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

	void findWinners() {

		int[] temp = new int[16];
		for (int j = 0; j < marTime.length; j++) {
			temp[j] = marTime[j];
		}

		Arrays.sort(temp);
		int r1 = temp[0];
		int r2 = temp[1];
		int count = 0;
		int count2 = 0;

		for (int i = 0; i < marTime.length; i++) {
			if (r1 == marTime[i]) {
				count = i;
			}
			if (r2 == marTime[i]) {
				count2 = i;
			}

		}

		System.out.println(
				"(Fastest Runner) 1st Rank Winner is: " + name[count] + " with time of " + temp[0] + " minutes");
		System.out.println(
				"(2nd Fastest Runner) 2nd Rank Winner is: " + name[count2] + " with time of " + temp[1] + " minutes");

	}

	public static void main(String[] args) {

		Marathon m1 = new Marathon();
		m1.findWinners();

	}

}
