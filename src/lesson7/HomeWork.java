package lesson7;

import enums.Months;

public class HomeWork {
    public static void main(String[] args) {
        Months[] month = {
                Months.JANUARY,
                Months.APRIL,
                Months.AUGUST,
                Months.DECEMBER,
                Months.FEBRUARY,
                Months.MARCH,
                Months.JULY,
                Months.JUNE
        };

        calculateSummerMonth(month);
    }

    public static void calculateSummerMonth(Months[] arr){
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].season == "summer"){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
