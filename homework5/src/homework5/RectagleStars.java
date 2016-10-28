package star;
import java.util.Scanner;
public class RectagleStars {  
void RS()  {   
Scanner s = new Scanner(System.in);
System.out.println("==========");   
System.out.println("정사각형 크기입력 :"); 
int S = s.nextInt();  
for(int i  = 0 ; i <S ; i++){ 
for(int j = 0 ;j <S ; j++){  
System.out.print("*");      
}    System.out.println("\n");   }   
} 
}
