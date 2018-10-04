package www.shuzu.org;

import java.util.*;

public class pingjunqiwen {
	public static void main(String[] args) {
		int count;
		double next, sum, avg;
		sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("输入七天的温度");
		for (count = 0; count < 7; count++) {
			next = sc.nextDouble();
			sum += next;
		}
		System.out.println(sum);
		avg = sum / 7;
		System.out.println(avg);
	}
}
