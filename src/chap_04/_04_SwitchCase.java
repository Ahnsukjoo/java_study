package chap_04;

public class _04_SwitchCase {

    public static void main(String[] args) {
        //Switch Case

        // 석차에 따른 장학금 지급
        //1등 : 전액 장학금
        //2등 : 반액 장학금
        //3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // If Else 문을 이용
        int ranking = 1; // 1등1
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        ranking = 1;
        //Switch Case 문을 이용
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;

            default:
                System.out.println("장학금 대상 아님");

        }
        System.out.println("조회 완료 #2");

        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;

            default:
                System.out.println("장학금 대상 아님");

        }
    }
}
