package duoweishuzu;

public class shixian {
	public static void main(String[] args) {
		int a[][]= {
				{1,2,3,4,5},
				{6,7,8,9,10}
	};
		int[]b=new int[5];
		b=a[0];
		a[0]=a[1];
		a[1]=b;
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]+"");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]);
			System.out.println();
		}
	}	

}
