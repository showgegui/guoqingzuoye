package www.shuzu.org;

public class arraycopy {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int[]b=new int[10];
//		创建两个数组
		for(int i=0;i<10;i++)
			b[i]=10*i;
		System.arraycopy(a,0,b,4,a.length);
//		对数组b第五个元素开始用数组a的元素替代
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
	}

}
