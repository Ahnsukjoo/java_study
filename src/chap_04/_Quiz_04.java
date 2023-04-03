package chap_04;

import java.util.Scanner;

public class _Quiz_04 {


    public static void main(String[] args) {

        int parking = 0;
        Scanner in = new Scanner(System.in);
        parking = in.nextInt();
        int money = 4000;
        int car = 1;

        if (car == 1) {
            if (parking <= 8) {
                System.out.println("장애인,경차 요금으로 50%로 할인입니다.요금은" + (parking * money / 2) + "입니다");
            } else {
                System.out.println("일일 최대 요금은 30000원입니다.");
            }
        } else if (car == 0) {
            if (parking <= 8) {
                System.out.println(
                    "주차시간이" + parking + "시간 경과하였습니다.요금은 " + (parking * money) + "입니다.");
            } else {
                System.out.println("일일 최대 요금은 30000원입니다.");
            }
        }
    }
}

