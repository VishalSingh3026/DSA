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



Q2- search element in sorted matrix?

    public static void main(String[] args) {
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(arr.length);
        System.out.println();

        System.out.println(Arrays.toString(search(arr,38)));

    }
    static int[] search(int[][] matrix,int target ){
        int r=0;
        int c=matrix.length-1;

        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            if(matrix[r][c]>target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }

Q3-




