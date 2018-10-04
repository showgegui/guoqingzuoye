package www.kongzhiliuchengyuju.org;

public class ifyuju {
	public static void main(String[] args) {
		int a=3;
		int b=5;
		int c=7;
		if(a>b && a>c)
//		使用if语句进行判断
			System.out.println(a);
		else if(b>a && b>c)
			System.out.println(b);
//		使用else if 语句进行多重判断
		else if(c>a && c>b)
			System.out.println(c);
	}

}
