package gr.aueb.cf.ch6;

/**
 * Jagged arrays are arrays with (potentially)
 * different dimension in each row.
 */
public class JaggedArray {

    public static void main(String[] args) {
//        int[][] jaggedArr = new int [3][];
//
//        jaggedArr[0] = new int[4];
//        jaggedArr[1] = new int[3];
//        jaggedArr[2] = new int[6];

        int [] [] jaggedArr = {{ 1, 2, 3, 4}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for (int [] row : jaggedArr) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println(" ");
        }


    }

}
