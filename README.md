# DSA

Q1-finding the highest elemnt(pivot) in rotated sorted array by binary search?

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr={3,5,6,7,8,0,1};
        int target=1;
        int piovt=Search(arr,target);
        System.out.println(piovt);
    }

    static int Search(int[] arr,int target){

        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int m=s+(e-s)/2;

            if( m<e && arr[m]>arr[m+1]){
                return m;
            }
            if(m>s && arr[m]<arr[m-1]){
                return m-1;
            }
            if(arr[s]<arr[m]){
                s=m;
            }
            if(arr[s]>arr[m]){
                e=m-1;
            }

        }



        return -1;
    }
}







