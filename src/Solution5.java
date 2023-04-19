import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution5 {
    public static void main(String[] args) {
        // list
        // arrayList
        // 길이가 고정적
        // ArrayList : 길이 가변적, 인덱스바탕으로 요소 조회, 타입 동일, 메소드 유사

        ArrayList menu = new ArrayList();
        menu.add("pizza");  //add : append와 같은 느낌
        menu.add("burger");
        menu.add("hotdog");
        //add 는 맨 끝에 추가
        // menu.add(menu.size(), "hotdog")와 같은 뜻
        System.out.println("menu= "+menu);
        // 인덱스 부여 가능
        menu.add(0,"cheeseBurger");
        System.out.println("menu= "+menu);

        ArrayList<String> menu2 = new ArrayList();
        menu2.add("pizza");
//        menu2.add(1234);
        System.out.println(menu2);

        //get
        System.out.println(menu.get(1));    //menu에서 1번째 인덱스를 가져오기
        //set
        menu.set(1,"salad");
        System.out.println(menu);

        //POJO : plain old java object
        //Lombok : 뭔데이게

        //size는 list(array의 상위)의 속성
        System.out.println("menu size : " + menu.size());

        //contains : 포함 여부
        System.out.println("menu contains pizza : "+ menu.contains("pizza"));
        System.out.println("menu contains burger : "+ menu.contains("burger"));

        //remove : 부여된 인덱스 삭제
        //인덱스 부여해 삭제하는 것과 대상을 직접 넣는 것은 다름.

        menu.remove(0);
        System.out.println("menu: "+menu);
        menu.remove("salad");
        System.out.println("menu: "+menu);

        // 메소드 오버로딩 : 이름 같은데 패러미터 다르면 다른 기능을 함
        //        예) remove에서 인덱스 부여하는 것과 대상을 직접 넣을 때 다르게 동작.
        // 메소드 오버라이딩 : 상속 시 init 새로 정의함

        //1. add를 통해 만들기
        //2. array를 arraylist로 변환
        String[] foods={"pizza", "burger","hotdog"};
        ArrayList<String> foods2 = new ArrayList<>(Arrays.asList(foods));
        //foods를 리스트로서 가져와, foods2라는 이름을 가진 ArrayList로 새로 만듦

        ArrayList<String> foods3 = new ArrayList<>(
                Arrays.asList("pizza", "burger", "hotdog")
        );
        System.out.println(foods3);

        // join
        String join = String.join(", ", foods);
        // delimiter를 붙여서 join
        System.out.println("Arrays.toString(foods) = "+ Arrays.toString(foods));
        System.out.println("join : "+ join);
        join = String.join("; ", foods);
        System.out.println("join : "+join);
        //arraylist도 똑가틈
        join = String.join("; ", foods2);
        System.out.println("join : "+join);

        //sort
        ArrayList<Integer> nums = new ArrayList<>(
                Arrays.asList(31,12,17)
        );
        System.out.println("nums="+nums);
        nums.sort(null);                //null이면 오름차순,
        System.out.println("nums="+nums);
        // descending sort
        nums.sort(Comparator.naturalOrder()); //작은것부터 커져야 자연적
        System.out.println("nums="+nums);
        nums.sort(Comparator.reverseOrder()); //역순으로 정렬
        System.out.println("nums="+nums);



    }
}
