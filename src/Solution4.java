import java.text.MessageFormat;
import java.util.Arrays;

public class Solution4 {
    public static void main(String[] args) {
        // array : 0개 이상의 같은 타입을 가지는 값의 묶음
        int[] arr = {1,2,3,4,5};    //중괄호로 묶음
        System.out.println(Arrays.toString(arr));

        //String Array
        String[] strArr = {"Hello","World","Java"};
        System.out.println("strArr = "+ Arrays.toString(strArr));

        //배열의 길이는 고정임;
        String[] weeks1 = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        String[] weeks2 = new String[7];     //7개의 위치를 가지는 빈 문자열 배열
        for (int i=0;i<5;i++){
            weeks2[i]=weeks1[i];
        }
        System.out.println(Arrays.toString(weeks2));
        System.out.println("Sat : "+weeks2[5]);
        System.out.println("weeks2.length = "+weeks2.length);

        // 자바에서의 길이 : length <-오버라이딩 가능

        int[] intArr = new int[5];
        intArr[0]=1;
        intArr[1]=2;
//        intArr[6]=5;


    }
}
