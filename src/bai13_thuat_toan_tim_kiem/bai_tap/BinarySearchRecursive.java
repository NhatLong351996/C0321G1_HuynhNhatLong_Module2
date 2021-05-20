package bai13_thuat_toan_tim_kiem.bai_tap;

public class BinarySearchRecursive {
    static int binarySearch(int[] array,int left,int right,int value){
        if (left<=right){
            int mid =(left+right)/2;
            if (array[mid]==value){
                return mid;
            }else if (array[mid]>value){
                return binarySearch(array,0,mid-1,value);
            }else {
                return binarySearch(array,mid+1,right,value);
            }
        }else
            return -1;
    }

    public static void main(String[] args) {
        int[] array ={1,3,5,7,9,10,14,16};
        System.out.println(binarySearch(array,0,array.length-1,10));
    }
}
