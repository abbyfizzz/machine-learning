import java.util.*;
class test {
    public static void main(String[] args) {
        /*
         * Read input from stdin and provide input before running
		*/
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
	in.nextLine();
        int[][] m=new int[r][c];
        
        for (int i = 0; i < r; i++)
        	for (int j = 0; j < c; j++)
        		m[i][j]=in.nextInt();
        
        for (int i = 0; i < c; i++)
        {	for (int j = 0; j < r; j++)
        		System.out.print(m[j][i]+" ");
        
        	System.out.println();
        }		
    }
}
