package www.yunsuanfu.org;

public class luojiyunsuanfu {
	public static void main(String[] args) {
		int a=5;
		int b=3;
//		定义数据类型
		boolean c=(a>4)&(b<4);
		boolean d=(a>4)|(b<4);
		boolean e=!(a>4);
//		使用逻辑运算符进行判断
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
//		输出结果
		int f=5;
		boolean g=(f<4)&&(f++<10);
		System.out.println(f);
		System.out.println(g);
	}

}
