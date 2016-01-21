
public class DevColibri16MASSIV {

    static int nums[] = new int[10];

    public static void main(String[] args) {

        nums[0] = 2;
        nums[1] = 123;
        nums[2] = 12313;
        nums[3] = 515;
        nums[4] = 515;
        nums[5] = 126;
        nums[6] = 531;
        nums[7] = 634;
        nums[8] = 631;
        nums[9] = 532;
    /*    for (int n : nums) {
            System.out.println(n);

        }*/

        for (int i=0; i<nums.length-1; i++){
            System.out.println(i + " : " + nums[i]);
        }
    }
}
