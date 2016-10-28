package star;
import java.util.Scanner;
public class IsoscelesTriangleStars { 
void IS()
{   
Scanner s = new Scanner(System.in);  
int A= s.nextInt();  
for (int i = 0; i < A; i++){                  
for (int j = i; j < A; j++){
System.out.print(" ");          
}  
for (int j = 0; j < i; j++) {   
System.out.print("*");       
}                     
for (int j = 0; j < i - 1; j++) {    
System.out.print("*");            }       
System.out.println();     
}  
}
}
