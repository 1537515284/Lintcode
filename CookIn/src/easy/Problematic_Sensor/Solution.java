package easy.Problematic_Sensor;

public class Solution {

    /**
     * @param sensor1: Data of sensor1.
     * @param sensor2: Data of sensor2.
     * @return: The number of problematic sensor.
     */
    public int badSensor(int[] sensor1, int[] sensor2) {
        // --- write your code here ---
        int i = 0;
        int j = 0;
        while (i < sensor1.length && sensor1[i] == sensor2[j]){
                i++;
                j++;
        }

        if (i == sensor1.length-1 || i == sensor1.length){
            return -1;
        }
        i++;
        while (i < sensor1.length && sensor1[i] == sensor2[j]){
            i++;
            j++;
        }
        if (i == sensor1.length){
            return 2;
        }
        return 1;
    }

    public static void main(String[] args) {
//        int[] sensor1 = {2,3,4,5};
//        int[] sensor2 = {2,1,3,4};

//        int[] sensor1 = {2,3,2,2,3,2};
//        int[] sensor2 = {2,3,2,3,2,7};

        int[] sensor1 = {19,20,10,14,1,6,8,20,5,8,3,5,7,18,10,19,11,9,16,13,1,9,4,2,16,12,14,6,17,6};
        int[] sensor2 = {19,20,10,14,1,6,8,20,5,8,3,5,7,18,10,19,11,9,16,13,1,9,4,2,16,12,14,6,17,6};
        Solution solution = new Solution();
        int i = solution.badSensor(sensor1, sensor2);
        System.out.println(i);
    }
}
