
int
long
long long
boolean

var : 동적타입. 선언 시 사용불가, 초기화는 가능. 한 번 값 대입 시 dtype 고정됨

원시 / 객체(참조) 자료형 타입
원시 : 기본적으로 깔림, 별도 기능 x
객체 : 대문자로 시작 + 여러가지 추가기능 존재

클래스 통한 객체 생성: new 키워드 사용
> Class var = new Class();


String
- 객체로 생성 가능.
- 인덱싱/슬라이싱 불가능.
String의 메서드
charAt : 문자열을 인덱스를 통해 접근할 수 있게 함.
	- 음수 슬라이싱 불가
	- 범위 넘어서면 안됨
length : 문자열의 길이를 반환.
indexOf : 문자열에서 해당 문자가 최초로 등장하는 인덱스 반환. 없으면 -1반환
contains : 문자열이 특정 문자열에 포함되어있는지 알려줌. true/false
replaceAll : 문자열 중 특정 문자열을 검색해 대체. 정규식으로 target 지정 가능.
replace : replace와 같지만, 대상문자열을 문자열로만 지정 가능
toUpperCase / toLowerCase : 문자열 내 알파벳을 모두 대문자, 소문자로 변경
format : 문자열 포매팅. format("%자료형 혹은 {인덱스}",값)


Array : 0개 이상의 같은 타입을 가지는 값의 묶음.
> 자료형[] arr = {1,2,3,4,5};

ArrayList : 길이 가변적, 인덱스바탕으로 요소 조회, 타입 동일, Array와 메소드 유사. 타입 가변적으로 삽입 가능
메서드들
size()
add(인덱스, 요소) : 인덱스에 요소 추가

ArrayList<자료형> al = new ArrayList(); -> 자료형을 제한할 수 있음
메서드들
get(숫자) : 인덱스로 접근
set(숫자, 요소) : 해당 인덱스의 요소를 입력받은 요소로 바꿈