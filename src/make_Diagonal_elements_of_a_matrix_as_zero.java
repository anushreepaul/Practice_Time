import java.util.Scanner;

public class make_Diagonal_elements_of_a_matrix_as_zero 
{
    static void make_diagonal_zero(int[][] matrix_array , int n )
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(i == j || (i+j+1)==n)
                {
                    matrix_array[i][j] = 0 ;
                }
            }
        }

        for(int[] x : matrix_array)
        {
            for(int y : x)
            {
                System.out.print(y+" ");
            }

            System.out.println();
        }

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value : ");
        int n = sc.nextInt() ;

        int[][] matrix_array = new int[n][n] ;

        System.out.print("Enter the matrix elements : ");
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                matrix_array[i][j] = sc.nextInt() ;
            }
        }

        

        make_diagonal_zero(matrix_array , n) ;

        sc.close();
        
    }
    
}
