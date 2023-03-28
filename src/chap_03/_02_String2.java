package chap_03;

public class _02_String2 {

    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace("and", ",")); //"and" 를 "," 로 변환
        System.out.println(s.substring(7)); //인덱스 기준 7 부터 시작 (이전 내용은 삭제)
        System.out.println(s.substring(s.indexOf("Java")));
        //"Java" 가 시작하는 위치부터, "," 이 시작하는 위치 바로앞까지
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); //시작위치부터 끝위치 "직전"

        //공백 제거
        s = "          I  love Jaba.                   ";
        System.out.println(s);
    }

}

