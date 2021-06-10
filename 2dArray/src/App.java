public class App {
    public static void main(String[] args) throws Exception {
        int[][] grid = {
            {2,4,323232},
            {2,4},
            {12,23,43,12}
        };
        for(int row=0;row<grid.length;row++){
            for(int col = 0; col<grid[row].length;col++){
                System.out.print(grid[row][col]+"    ");
            }
            System.out.println();
        }

        //String[][] words = new String[3][];
        //words[i] = new String[4];





    }
}
