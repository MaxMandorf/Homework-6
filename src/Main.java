public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        // Quest 1
        int[] costs = new int[30];
        int sum = 0;
        for (int i = 0; i < costs.length; i++) {
            sum += costs[i];
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        }
        // Quest 2

        int maxcosts = -1;
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] > maxcosts) {
                maxcosts = costs[i];
            }
        }
        System.out.println("Максимальная сумма затрат составила " + maxcosts + " рублей");

        int mincosts = 100000;
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] <= mincosts) {
                mincosts = costs[i];
            }
        }
        System.out.println("Минимальная сумма затрат составила " + maxcosts + " рублей");
        // Quest 3
        int[] average = new int[30];
        double sumaverage = 0;
        for (int x : average) {
            sumaverage += x;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sumaverage + " рублей");
        // Quest 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }


    }

}
