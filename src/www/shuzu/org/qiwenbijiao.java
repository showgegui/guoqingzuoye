package www.shuzu.org;
import java.util.*;

public class qiwenbijiao {
	public static void main(String[] args) {
		int count;
		double avg,sum;
		sum=0;
		double[]temperature=new double[7];
//		声明变量类型
		Scanner sc=new Scanner (System.in);
//		创建一个scanner类的对象，用它来获取用户的输入
		System.out.println("输入七天的气温");
		for(count =0;count<7;count++) {
			temperature[count]=sc.nextDouble();
			sum=sum+temperature[count];
		}
		avg=sum/7;
		System.out.println("平均气温是"+avg);
		for(count=0;count<temperature.length;count++) {		
			if(temperature[count]<avg) {
//				比较各天的天气
				System.out.println("第"+(count+1)+"天的气温低于平均气温");
			}
				else if(temperature[count]>avg) {
					System.out.println("第"+(count+1)+"天的气温高平均气温");
				}
			}
		}
		
		
	}


