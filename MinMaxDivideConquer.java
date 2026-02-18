class MinMaxDivideConquer {
    static class Pair {
        int min;
        int max;
    }
    static Pair getMinMax(int[] arr, int low, int high) {
        Pair result = new Pair();
        if (low == high) {
            result.min = arr[low];
            result.max = arr[low];
            return result;
        }
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                result.max = arr[low];
                result.min = arr[high];
            } else {
                result.max = arr[high];
                result.min = arr[low];
            }
            return result;
        }
        int mid = (low + high) / 2;
        Pair left = getMinMax(arr, low, mid);
        Pair right = getMinMax(arr, mid + 1, high);
        result.min = Math.min(left.min, right.min);
        result.max = Math.max(left.max, right.max);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {17,4};
        Pair result = getMinMax(arr, 0, arr.length - 1);
        System.out.println("Minimum = " + result.min);
        System.out.println("Maximum = " + result.max);
    }
}
