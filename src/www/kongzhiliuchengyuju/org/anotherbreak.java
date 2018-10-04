package www.kongzhiliuchengyuju.org;

public class anotherbreak {
	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
		for(int i=5;i<10;i++) {
			sum=sum+i;
			if(i>8)
				break;
			System.out.println(sum);
			for(int k=4;k<i;k++) {
				sum1=k+sum1;
				System.out.println(sum1);
			}
		}
	}

}
