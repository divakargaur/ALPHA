public class pairsInArray {

    public static void pairsInArray(int array[]) {
        int tp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                System.out.print("(" + array[i] + ", " + array[j] + ") ");
                tp++;
            }
            System.out.println("");
        }
        System.out.println("total pairs: " + tp);
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};

        pairsInArray(array);
    }
}