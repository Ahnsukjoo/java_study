package chap_06;

public class _03_Return {

    // 호텔 전화번호
    public static String getphoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;

    }

    // 호텔 주소
    public static String getAddress() {
        return "서울시 어딘가";
    }

    // 호텔 액티비티  S
    public static String getActivities() {
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        //반환값, Return
        String contactNumber = getphoneNumber();
        System.out.println("호텔 전화번호:" + contactNumber);

        String address = getAddress();
        System.out.println("호텔주소: " + address);

        System.out.println("호텔액티비티: " + getActivities());
    }

}
