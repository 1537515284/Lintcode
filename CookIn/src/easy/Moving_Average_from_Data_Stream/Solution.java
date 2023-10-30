package easy.Moving_Average_from_Data_Stream;

public class Solution {
    public static void main(String[] args) {
        MovingAverage m = new MovingAverage(3);
        System.out.println(m.next(1));      // 1.00000
        System.out.println(m.next(10));     // 5.50000
        System.out.println(m.next(3));      // 4.66667
        System.out.println(m.next(5));      // 6.00000

        // MovingAverage m = new MovingAverage(3);
        // System.out.println(m.next(9));
        // System.out.println(m.next(3));
        // System.out.println(m.next(2));
        // System.out.println(m.next(4));
        // System.out.println(m.next(8));
    }
}
