// 4.Create a method to print the elements of a matrix.

public class hmw22oct4 {

    public static void print2D(int mat[][] )
    {        // Loop through all rows
        for (int i = 0; i < mat.length; i++) {
            // Loop through all elements of current row
            for (int j = 0; j < mat[0].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
    }}

    public static void main(String args[])
    {
        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };
        print2D(mat);
    }
}