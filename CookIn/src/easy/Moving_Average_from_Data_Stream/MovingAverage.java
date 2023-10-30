package easy.Moving_Average_from_Data_Stream;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {

    private Queue<Integer> list;
    private int size;
    private double sum;

    /*
    * @param size: An integer
    */public MovingAverage(int size) {
        // do intialization if necessary
        this.size = size;
        this.sum = 0;
        list = new LinkedList<>();
    }

    /*
     * @param val: An integer
     * @return:  
     */
    public double next(int val) {
        // write your code here
        sum += val;
        if(this.size == list.size()){
            sum = sum - list.poll();
        }
        list.offer(val);
        return sum / list.size();
    }
}
