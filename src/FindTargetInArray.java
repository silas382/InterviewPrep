public class FindTargetInArray {

    public static void findTarget(int[] ary, int target){
        int[] indexArray = new int[2];

        boolean firstMatch = false;
        int firstIndex = -1;
        int secondIndex = firstIndex;
        for(int i = 0 ; i < ary.length; i++){
            if(ary[i] == target && !firstMatch){
                firstIndex = i;
                firstMatch = true;
            }
            if(ary[i] == target){
                secondIndex = i;
            }
        }
        indexArray[0] = firstIndex;
        indexArray[1] = secondIndex;

        System.out.println("[" + indexArray[0] + "," + indexArray[1] + "]");
    }

    public static void main(String[] args) {

        int myAry[] = {2,2,3,4,5,6};
        findTarget(myAry, 1);
    }

}
