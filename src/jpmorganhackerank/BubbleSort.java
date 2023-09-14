package jpmorganhackerank;

public class BubbleSort {

    public void bubbleSort(int[] numAry){

        boolean swapped = true;

        while(swapped){
            swapped = false;
            for(int i = 0 ; i < numAry.length - 1; i++) {

                if(numAry[i] > numAry[i+1]){
                    int temp = numAry[i];
                    numAry[i] = numAry[i+1];
                    numAry[i+1] = temp;
                    swapped  = true;
                }
            }

        }

        for(int num : numAry){
            System.out.print(num + " ,");
        }

    }
    public static void main(String[] args) {

//        BubbleSort bubbleSort = new BubbleSort();
//
//        int[] array = new int[]{9,8,7,6,5,1,4,3,2,99,97,100,2,3,2,1,3};
//
//        bubbleSort.bubbleSort(array);

        String helloWorld = "hello               world john";
        // 3-7
        //lowo

        String[] stringArray = helloWorld.split("\\s{1,}");
        String email = "silasyahoocom";
        System.out.println(email.matches("[a-z]{1,}@[a-z]{1,}\\.[a-z]{3}"));
        for(String s : stringArray){
            System.out.println(s);
        }


    }
}
