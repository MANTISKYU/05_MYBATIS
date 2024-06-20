package com.ohgiraffers.remix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();

        do {

            System.out.println("햄버거쌍쌍바 직원관리 시스템");
            System.out.println("1. 모든 직원 조회");
            System.out.println("2. 직원 번호로 조회");
            System.out.println("3. 직원 이름으로 조회");
            System.out.println("4. 직원 추가");
            System.out.println("5. 직원 수정");
            System.out.println("6. 직원 삭제");
            int no = sc.nextInt();

            switch (no) {
                case 1: controller.selectAllEmp(); break;
                case 2: controller.selectEmpByCode(inputEmpCode()); break;
//                case 3: Controller.selectEmpByName(inputEmpName); break;
//                case 4: Controller.registEmp(inputEmp); break;
//                case 5: Controller.modifyEmp(inputModifyEmp); break;
//                case 6: Controller.deleteEmp(inputEmpCode); break;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다");
                    break;

            }

        } while (true);



        }

    private static Map<String, String> inputEmpCode() {

        Scanner sc = new Scanner(System.in);
        System.out.println("직원코드를 입력하세요 : ");
        String code = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);

        return parameter;



    }


}


