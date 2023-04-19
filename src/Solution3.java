import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Locale;

public class Solution3 {
    public static void main(String[] args) {
//         원시 / 객체(참조) 자료형 타입
//         원시 : 기본적으로 깔림, 별도 기능 x
//         객체 : 대문자로 시작 + 여러가지 추가기능 존재
        System.out.println("Hello world");
        System.out.println('H');    //리터럴임

        // 문자열의 자료형은 String.
        String str = "Hello World";
        System.out.println(str);

        String str2="12345";
        System.out.println(str2);

        //클래스 통한 객체 생성
        String str3 = new String("Hello world");
        // 키워드 : 특정 언어에서 기능을 위해 미리 빼놓은 단어.
        // new 키워드 사용해 string 객체-인스턴스 만듬
        System.out.println(str3);

        String str4 = "Hello World";
        // 같은 주소값 가짐
        String str5 = new String("Hello World");
        String str6 = new String("Hello World");
        //다른 주소값 가짐 - 만들때마다 새로운 주소값 가짐
        System.out.print("str5==str6: ");
        System.out.println(str5==str6);
        // 둘이 다름 : 클래스 생성자 통해 만들어진 객체들은 비교 시 주소값으로 비교

        //equals 메소드 사용
        System.out.print("equals: ");
        System.out.println(str4.equals(str5));

        //indexOf : 문자열에서 해당 문자가 최초로 등장하는 인덱스 반환
        String str7 = "Hello World";
        System.out.print("l의 위치:");
        System.out.println(str7.indexOf("l"));
        System.out.print("bye의 위치:");
        System.out.println(str7.indexOf("bye"));

        //contains : 문자열이 특정 문자열에 포함되어있는지 알려줌
        String str8 = "Hello World";
        System.out.print("l이 포함되었나요?");
        System.out.println(str8.contains("l"));
        System.out.print("bye이 포함되었나요?");
        System.out.println(str8.contains("bye"));

        //str 인덱싱 불가능
//        System.out.println(str8[0]);
        // -> charAt 메서드 사용
        System.out.print("3번째 문자: ");
        System.out.println(str8.charAt(0));
        System.out.print("str의 길이: ");
        System.out.println(str8.length());
        System.out.print("str의 마지막 인덱스 문자: ");
        System.out.println(str8.charAt(str8.length()-1));

        // replaceAll : 문자열 중 특정 문자열을 검색해 대체
        System.out.println(str8.replaceAll("l","L"));
        System.out.println(str8);
        System.out.println(str8.replace("l", "L"));
        // replaceall은 정규표현식으로 가능. replace는 단어만!!!

        //subString : string에서 특정 부분을 뽑아옴
        System.out.print("str의 1-3번째 문자: ");
        System.out.println(str8.substring(0,3));
        System.out.print("str의 3번째 문자부터: ");
        System.out.println(str8.substring(2));

        //upper / lower
        String str10 = "Hello Java!";
        System.out.println(str10);
        System.out.println(str10.toUpperCase());
        System.out.println(str10.toLowerCase());

        //split : 문자열 쪼개기
        String split="a:b:c:d";
        String[] result = split.split(":");
        System.out.println(result); // 주소값, 타입을 출력
        System.out.println(Arrays.toString(result)); //리스트로됨

        //문자열 포매팅
        System.out.println(String.format("나는 오늘 %d원짜리 밥을 먹었언", 8500));
        System.out.println(String.format("나는 오늘 %s에서 밥을 먹었언", "천지회관"));
        int money = 5000;
        System.out.println(String.format("나는 오늘 %d원짜리 밥을 먹었언", money));
        String name="이규린";
        int height=164;
        System.out.println(MessageFormat.format("my name is {0}", name));
        System.out.println(MessageFormat.format("my name is {0}, height is {1}", name, height));
    }
}
