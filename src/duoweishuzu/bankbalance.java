package duoweishuzu;

public class bankbalance {
	public static void main(String[] args) {
		double rate[]= {0.05,0.055,0.06,0.065};
//		表示账单的二维数组
		int[][]balance=new int[10][4];
		for(int i=0;i<balance[0].length;i++)
			balance[0][i]=1000;
//		计算账单的值
		for(int i=1;i<balance.length;i++)
			for(int j=0;j<rate.length;j++) {
				double inc=balance[i-1][j]*rate[j];
				balance[i][j]=(int)(balance[i-1][j]+inc);
			}
		System.out.println("years"+"");
		System.out.println("0.05"+" "+"0.055"+" "+"0.06"+" "+"0.065") ;
		for(int i=0;i<balance.length;i++) {
			for(int j=0;j<balance[i].length;j++)
				System.out.print(balance[i][j]+" ");
			System.out.println();
			System.out.println();
		}
	}

}
