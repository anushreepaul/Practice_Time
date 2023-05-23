import java.util.Scanner;

public class Addition_Of_Two_Matrix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in) ;
        System.out.print("Enter the value : ");
        int m = sc.nextInt() ;

        int[][] A = new int[m][m] ;
        int[][] B = new int[m][m] ;
        int[][] C = new int[m][m] ;

        System.out.print("Enter the array elements of A : ");
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the array elements of B : ");
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                B[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                C[i][j] = A[i][j] + B[i][j] ;
            }
        }

        System.out.println("The addition of two matrix is : ");
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                System.out.print(C[i][j]+" ");
            }
        }


        
    }
    
}
