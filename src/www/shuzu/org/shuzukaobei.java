package www.shuzu.org;

public class shuzukaobei {
	public static void main(String[] args) {
		int[]a= {1,2,3};
		int[]b= {4,5,6};
//		给两个数组一个初始值
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
//		打印出两个数组的初始值
		a=b;
		System.out.println("拷贝后数组的值是");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
//		打印出拷贝数组后的值
		b[0]=10;
		System.out.println(a[0]);
		System.out.println(b[0]);
	}

}
