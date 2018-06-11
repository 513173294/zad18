public class ArrayComparator {

   static boolean compare(int[][] array1, int[][] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        if (array1[array1.length-1].length != array2[array2.length-1].length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != array2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}