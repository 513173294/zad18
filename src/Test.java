public class Test {
    public static void main(String[] args) {


        int[][] tab1 = new int[2][3];
        int[][] tab2 = new int[2][3];
        int[][] tab3 = new int[4][3];
        int[][] tab4 = new int[2][5];
        ArrayComparator arrayComparator = new ArrayComparator();
        boolean compare = arrayComparator.compare(tab1, tab2);
        boolean compare2 = arrayComparator.compare(tab3, tab4);

        System.out.println(compare);
        System.out.println(compare2);

    }
}
