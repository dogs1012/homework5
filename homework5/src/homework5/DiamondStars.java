package star;
import java.util.Scanner;
public class DiamondStars 
{ void DS(){
Scanner s= new Scanner(System.in); 
System.out.print("다이아몬드의 크기 입력 :"); 
int S = s.nextInt();
for (int i = 0; i < S; i++) {   
for (int j = i; j < S; j++) {  
System.out.print(" ");      
}
for (int j = 0; j < i; j++) {
System.out.print("*");  
}     
for (int j = 0; j < i - 1; j++) {
System.out.print("*");   
}    
System.out.println();   
}
for (int i = 0; i < S; i++) {  
for (int j = 0; j < i; j++) {     
System.out.print(" ");       
}       
for (int j = i; j < S; j++) {   
System.out.print("*");     
}     
for (int j = i + 1; j < S; j++)
{         
System.out.print("*");      
}        
System.out.println();   
}}}
