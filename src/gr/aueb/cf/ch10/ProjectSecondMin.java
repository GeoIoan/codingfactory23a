package gr.aueb.cf.ch10;

public class ProjectSecondMin {

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 14, 5, 20, 21};

        getSecondMinValue(arr);
    }

    public static int getSecondMinValue (int [] arr) {
        int min = 0;
        int secondMin = 0;
        int minValue = 0;
        int secondMinValue = 0;

        if (arr == null) return -1;
        if (arr.length < 2) return -1;

        minValue = arr[0];
        secondMinValue = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue && arr[i] < secondMinValue) {
                secondMin = minValue;
                secondMinValue = minValue;
                min = i;
                minValue = arr[i];
            } else if (arr[i] > minValue && arr[i] < secondMinValue) {
                secondMin = i;
                secondMinValue = arr[i];
            }
        }

        return secondMin;
    }
}
