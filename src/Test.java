public class Test {
    public static void main(String[] args) {


        int[][] tab1 = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
                {4, 5, 6, 7}};


        int[][] tab2 = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
                {4, 5, 6, 7}};
        int[][] tab3 = new int[4][3];
        int[][] tab4 = new int[2][5];


        boolean compare1 = ArrayComparator.compare(tab1, tab2);
        boolean compare2 = ArrayComparator.compare(tab2, tab3);
        boolean compare3 = ArrayComparator.compare(tab4, tab3);
//        ArrayComparator arrayComparator = new ArrayComparator();
//        boolean compare = arrayComparator.compare(tab1, tab2);
//        boolean compare2 = arrayComparator.compare(tab3, tab4);

        System.out.println(compare1);
        System.out.println(compare2);
        System.out.println(compare3);

    }
}
