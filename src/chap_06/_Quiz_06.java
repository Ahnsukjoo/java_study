package chap_06;

public class _Quiz_06 {

    public static String getHiddenData(String name, int x) {
        char[] charArray = name.toCharArray();
        for (int i = x; i < name.length(); i++) {
            charArray[i] = '*';
            name = String.valueOf(charArray);
        }
        return name;
    }

    public static void main(String[] args) {
        String name = "나코딩"; //이름
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }

}
