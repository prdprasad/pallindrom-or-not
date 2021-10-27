import java.util.*;
public class NumberPallindrome{  
   public static void main(String[] args){  
       Scanner sc = new Scanner(System.in);  
       System.out.print("Enter the number: ");  
       int num=sc.nextInt();
       int rev,sum=0;
       int temp=num;    
       while(num>0)
       {    
       rev=num%10;           
       sum=(sum*10)+rev;    
       num=num/10;    
       }    
        if(temp==sum)    
        System.out.println("The entered number "+temp+" is a palindrome number ");    
        else    
        System.out.println("The entered number "+temp+" is not a palindrome");    
  }  
} 
