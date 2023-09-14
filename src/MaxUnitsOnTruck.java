public class MaxUnitsOnTruck {


    public static int maximumUnits(int[][] boxTypes, int truckSize) {

        int[][] sortedBoxTypes = sortNumberOfUnitsPerBox(boxTypes);

        int totalBoxCountToLoad = 0 ;
        int maxUnits = 0;

        // loop
        // inside the loop logic
        // -- get number of boxes to load: boxTypes[i][0] or enough boxes to reach truck size. Add to the total number of maxes
        // -- calculate the number of units and add to the total number of units
        for(int i = 0 ; i < boxTypes.length; i++){
            totalBoxCountToLoad += boxTypes[i][0];

            int boxesToLoad = boxTypes[i][0];

            if (totalBoxCountToLoad > truckSize) {
                boxesToLoad = totalBoxCountToLoad - truckSize;
                totalBoxCountToLoad = truckSize;
            }
            maxUnits += boxesToLoad * boxTypes[i][1];

        }
        return maxUnits;

    }

    private static int[][] sortNumberOfUnitsPerBox(int[][] boxTypes) {

        return boxTypes;

    }
}