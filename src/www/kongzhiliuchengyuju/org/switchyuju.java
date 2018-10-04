package www.kongzhiliuchengyuju.org;

public class switchyuju {
	public static void main(String[] args) {
		int a=5;
		String str="a="+a+"的汉字形式是";
//		使用switch语句进行选择，用break结束选择，如果一直找不到，则到最后一个选项用default结束
		switch(a) {
		case 1:
			str+="一";
			break;
		case 2:
			str+="二";
			break;
		case 3:
			str+="三";
			break;
		case 4:
			str+="四";
			break;
		case 5:
			str+="五";
			break;
		case 6:
			str+="六";
			break;	
			default:
		}
				System.out.println(str);
		
	}

}
