package www.zhidongzhuanhuan.org;

public class zidongzhuanhuan {
	public static void main(String[] args) {
		short a=3;
		int b=a;
		float c=1.57f;
		double d=c;
		double e=b;
		long f=345l;
		double g=f;
//		对变量的数据类型进行转换
		System.out.println("short 自动转换类型为int的值等于"+b);
		System.out.println("float 自动转换类型为double的值等于"+d);
		System.out.println("int 自动转换类型为double的值等于"+e);
		System.out.println("long 自动转换类型为double的值等于"+g);
		
	}

}
