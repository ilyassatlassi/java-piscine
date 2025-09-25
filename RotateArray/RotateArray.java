import java.util.Arrays;
public class RotateArray {
    public static Integer[] rotate(Integer[] arr, int rotationCount){
        int point1 = 0;
        int point2 = arr.length  ;
        if( point2 ==0) {
            return arr;
        }

        Integer [] res = new Integer[arr.length];
        rotationCount = rotationCount % point2;
        if (rotationCount > 0) {
     
        for(int i =  point2 - rotationCount; i < point2; i++) {
            res[point1] = arr[i];
            point1++;
        }
 
        for(int i =  0; i < point2 -rotationCount; i++) {
            res[point1] = arr[i];
            point1++;
        }
        } else {
            rotationCount = -rotationCount;
       
        for(int i =  rotationCount; i < point2; i++) {
            res[point1] = arr[i];
            point1++;
        }
 
        for(int i =  0; i < rotationCount; i++) {
            res[point1] = arr[i];
            point1++;
        }

        }
        return res;
    }
}