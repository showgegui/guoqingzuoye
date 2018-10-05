package duoweishuzu;

public class dingyi {
	public static  void main(String[] args) {
		int a[][]= {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,18},
		};
//	定义一个二维数组
		int b[][]=new int[5][3];
		int k=1;
		for(int i=0;i<b.length;i++)
			for(int j=0;j<b[i].length;j++)
				b[i][j]=k++;
		for(int i=0;i<b.length;i++) {
			
			for(int j=0;j<b[i].length;j++)
			System.out.print(b[i][j]+"");
			System.out.println();
	}
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
				a[i][j]=k++;
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++)
			System.out.print(a[i][j]+"");
			System.out.println();
	}
	}

}
