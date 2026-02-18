import java.util.Arrays;

class FractionalKnapsack {

    static class Item {
        int value, weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    static double optimalSolution(int capacity, Item[] items) {

        Arrays.sort(items, (a, b) ->
            Double.compare((double) b.value / b.weight,
                           (double) a.value / a.weight));

        double optimalValue = 0.0;

        for (Item item : items) {
            if (capacity == 0)
                break;

            if (item.weight <= capacity) {
                capacity -= item.weight;
                optimalValue += item.value;
            } else {
                optimalValue += item.value * ((double) capacity / item.weight);
                capacity = 0;
            }
        }
        return optimalValue;
    }

    public static void main(String[] args) {
        Item[] items = {
            new Item(70, 10),
            new Item(80, 20),
            new Item(100, 40)
        };

        int capacity = 5;
        System.out.println("Optimal solution value = " +
                optimalSolution(capacity, items));
    }
}
