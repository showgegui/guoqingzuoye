package duoweishuzu;

public class buguizedeshixian {
	public static void main(String[] args) {
		int[][]a=new int[4][];
//		创建一个二维数组，指定它的行数
		a[0]=new int[1];
		a[1]=new int[2];
		a[2]=new int[3];
		a[3]=new int[4];
//		指定各个行的列数
		int k=1;
//		对数组元素进行赋值
		for(int i=0;i<a.length;i++)
		{
			for(int b=0;b<a[i].length;b++)
				a[i][b]=k++;
			System.out.println("得到的二维数组为");
			for(int c=0;c<a.length;c++) {
				for(int b=0;b<a[c].length;b++)
					System.out.println(a[c][b]);
				System.out.println();
			}
		}
	}

}
