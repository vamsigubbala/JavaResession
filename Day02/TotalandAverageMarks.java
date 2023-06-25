import java.util.Scanner;

public class TotalandAverageMarks 
	{
       public static void main(String[] args)
          {
    	   Scanner scanner = new Scanner(System.in);
    	   
    	   System.out.print("Enter Telugu Marks :");
    	   int T = scanner.nextInt();
    	   System.out.print("Enter English Marks :");
	   int E = scanner.nextInt();
    	   System.out.print("Enter Hinidi Marks :");
    	   int H = scanner.nextInt();
    	   
    	   scanner.close();
    	   
    	   int total = T + E + H ;
    	   
    	   float avg = total / 3 ;
    	  
    	   System.out.println("Telugu Marks: " + T);
    	   System.out.println("English Marks: " + E);
    	   System.out.println("Hinidi Marks: " + H);
    	   System.out.println("TotalMarks :" + total);
    	   System.out.println("AverageMarks :" + avg);
          }
    }
