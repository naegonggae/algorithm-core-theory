public class Ch02 {
    // 디버깅
    public static void main(String[] args) {
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("hi");
            for (int j = 0; j < 10; j++) {
                System.out.println("hello");
            }
        }
    }
}
/*

디버깅을 활용해서 오류찾기
1. 변수지정 확인하기
2. 반복문에서 인덱스 범위 지정 오류확인하기
3. 자료형 범위 오류 찾아보기

중단포인트를 지정하고 하나하나 과정을 보기

로그찍고 확인하는것도 좋지만 디버깅하는것이 더 효율적이다.

*/
