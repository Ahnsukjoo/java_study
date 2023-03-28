package chap_02;

public class _Quiz_02 {

    public static void main(String[] args) {
        int heightA = 115;
        int heightB = 121;

        System.out.println(heightA >= 120 ? "키가" + heightA + "cm 이므로 탑승이 가능합니다."
            : "키가" + heightA + "cm 이므로 탑승이 불가능합니다.");

        System.out.println(heightB >= 120 ? "키가" + heightB + "cm 이므로 탑승이 가능합니다."
            : "키가" + heightB + "cm 이므로 탑승이 불가능합니다.");
    }
}
