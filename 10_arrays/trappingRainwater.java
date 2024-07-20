public class trappingRainwater {

    public static int trappedWater(int array[]) {
        int leftArray[] = new int[array.length];
        int rightArray[] = new int[array.length];
        int volume = 0;

        leftArray[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            leftArray[i] = Math.max(leftArray[i-1], array[i]);
        }

        rightArray[array.length-1] = array[array.length-1];
        for (int i = array.length-2; i >= 0; i--) {
            rightArray[i] = Math.max(rightArray[i+1], array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            volume += Math.min(rightArray[i], leftArray[i]) - array[i];
        }
        return volume;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedWater(height));
    }
}
