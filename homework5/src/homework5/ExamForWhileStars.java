package star;
import java.util.Scanner;
public class ExamForWhileStars {
	public static void main(String[] args){ 
		Scanner s= new Scanner(System.in);
		System.out.println("반복문연습하기");
		System.out.println("1.정사각형 별찍기"); 
		System.out.println("2.직삼각형 별찍기"); 
		System.out.println("3.이등변삼각형 별찍기");   
		System.out.println("4.다이아몬드 별찍기"); 
		System.out.println("5.종료하기");  
		System.out.print("원하는 메뉴는 >>");  
		int num = s.nextInt();  
		switch (num){  
			case 1:  
				new RectagleStars().RS(); 
			case 2:   
				new TriangleStars().TS(); 
			case 3: 
				new IsoscelesTriangleStars().IS(); 
			case 4:   
				new DiamondStars().DS();  
			case 5:    System.exit(0); 
		}
	}
}
