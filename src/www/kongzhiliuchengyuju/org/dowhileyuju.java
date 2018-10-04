package www.kongzhiliuchengyuju.org;
import java.io.IOException;;
public class dowhileyuju {
	public static void main(String[] args) throws IOException{
		
		char n=0;
		do {
			System.out.println("1选择1");
			System.out.println("2选择2");
			System.out.println("3选择3");
			System.out.println("4选择4");
			System.out.println("5选择5");
			n=(char)System.in.read();
//			将输入的内容转换成字符型
		switch(n) {
		case '1':
			System.out.println("选择1");	
			break;
		case '2':
			System.out.println("选择2");	
			break;
		case '3':
			System.out.println("选择3");	
			break;
		case '4':
			System.out.println("选择4");	
			break;
		case '5':
			System.out.println("选择5");	
			break;
			default:
			System.out.println("输入非法");			
		}
		}while (n<'1'||n>'5');
		
		
	}

}
