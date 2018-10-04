package www.shuzu.org;

import java.util.*;

public class xuanzepaixu {
	public static void main(String[] args) {
		int[] array = { 10, 3, 1000, 135, 435, 86, 58, 30, 79 };

		int temp;
		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] < array[j]) {

					temp = array[i];

					array[i] = array[j];

					array[j] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + "  ");
		}
	}
}