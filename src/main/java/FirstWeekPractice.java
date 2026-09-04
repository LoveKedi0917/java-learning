public class FirstWeekPractice {
    public static void main(String[] args) {
        int[] scores = {78, 92, 55, 88, 63, 95, 41};

        System.out.println("最高分：" + findMax(scores));
        System.out.println("最低分：" + findMin(scores));
        System.out.println("平均分：" + findAverage(scores));

        BubbleSort(scores);
        System.out.println("排序后：");
        for (int num : scores ){
            System.out.println(num + " ");
        }
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int num : arr){
            if (num > max){
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for (int num : arr){
            if (num < min){
                min = num;
            }
        }
        return min;
    }

    public static double findAverage(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return (double) sum/arr.length;
    }

    public static int countPass(int[] arr){
        int count = 0;
        for (int num : arr){
            if(num >= 60){
                count ++;
            }
        }
        return count;
    }

    public static void BubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
