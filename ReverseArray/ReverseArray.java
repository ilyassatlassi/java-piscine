public class ReverseArray {
    public static Integer[] reverse(Integer[] arr) {
        // your code here
         int point1 = 0;
        int point2 = arr.length -1  ;
        for(int i = 0; i < arr.length/ 2; i++ ){
        int tmp = arr[point1]; 
       arr[point1] = arr[point2]; 
       arr[point2] = tmp; 
       point1++;
       point2--;
        }
        return arr;
    }
}