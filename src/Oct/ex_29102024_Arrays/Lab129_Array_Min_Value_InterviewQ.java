package Oct.ex_29102024_Arrays;

public class Lab129_Array_Min_Value_InterviewQ {
    public static void main(String[] args) {
        int[] array = {25,14,56,15,36,56,77,18,29,49};
        int min_value = give_min(array);
        System.out.printf("Min Value is %d", min_value);
    }

    static int give_min(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }

        return  min;
    }
}
