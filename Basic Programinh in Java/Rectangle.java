import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    
    public static void main(String[] args) 
    {
        int rows, columns, i, j;
        Scanner sc = new Scanner(System.in);
    
        rows = sc.nextInt();    

        columns = sc.nextInt();     
            
        for(i = 1; i <= rows; i++)
        {
            for(j = 1; j <= columns; j++)
            {
                //System.out.print("* "); 
                if (i == 1 || i == rows || 

                    j == 1 || j == columns)            

                    System.out.print("*");            

                else

                    System.out.print(" ");
            }
            System.out.println(); 
        }
    }
}