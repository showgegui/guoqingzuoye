package www.shuzu.org;
import java.util.Arrays;
import java.util.Scanner;
public class xuanze {
	

	public static void main(String[] args) {
		int a[]=new int[10];
		//将输入的十个数，依次赋值给数组
		for(int i=0;i<10;i++){
		Scanner sc=new Scanner(System.in);
		System.out.println("please input the "+(i+1)+" number");
		a[i]=sc.nextInt();
		}
		//两层循环，进行冒泡排序 
		for(int j=0;j<a.length;j++){
		for(int k=0;k<a.length-j-1;k++){
		int l;
		if(a[k]>a[k+1]){

		l=a[k];
		a[k]=a[k+1];
		a[k+1]=l;
		}
		}
		}

		System.out.println(Arrays.toString(a));
		}

		}