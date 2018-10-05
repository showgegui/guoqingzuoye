package duoweishuzu;

public class foreachyuju {
	public static void main(String[] args) {
		int sum=0;
		int[]num= {1,2,3};
		for(int i:num)
		{
			System.out.println("数组元素:"+i);
			sum+=i;
		}
		System.out.println(sum);
	
	}

}
