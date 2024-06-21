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
                case 2: controller.selectEmpById(inputEmpId()); break;
//                case 3: Controller.selectEmpByName(inputEmpName); break;
//                case 4: Controller.registEmp(inputEmp); break;
                case 5: Controller.modifyEmp(inputModifyEmp); break;
//                case 6: Controller.deleteEmp(inputEmpCode); break;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다");
                    break;

            }

        } while (true);



        }

    private static Map<String, String> inputEmpId() {

        Scanner sc = new Scanner(System.in);
        System.out.println("직원코드를 입력하세요 : ");
        String empID = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId", empID);

        return parameter;



    }

    private static Map<String, String> inputModifyEmp() {

        Scanner sc = new Scanner(System.in);
        System.out.println("직원코드를 입력하세요 : ");
        String empId = sc.nextLine();
        System.out.println("직원이름을 입력하세요 : ");
        String empName = sc.nextLine();
        System.out.println("직원번호를 입력하세요 : ");
        String empNO = sc.nextLine();
        System.out.println("이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.println("전화번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.println("부서번호를 입력하세요 : ");
        String deptCode = sc.nextLine();
        System.out.println("직급번호를 입력하세요 : ");
        String jobCode = sc.nextLine();
        System.out.println("연봉레벨을 입력하세요 : ");
        String salLevel = sc.nextLine();
        System.out.println("연봉을 입력하세요 : ");
        String salary = sc.nextLine();
        System.out.println("보너스를 입력하세요 : ");
        String bonus = sc.nextLine();
        System.out.println("관리자번호를 입력하세요 : ");
        String empId = sc.nextLine();
        System.out.println("입사날짜를 입력하세요 : ");
        String empId = sc.nextLine();
        System.out.println("퇴사날짜를 입력하세요 : ");
        String empId = sc.nextLine();
        System.out.println("퇴사여부를 입력하세요 : ");
        String empId = sc.nextLine();



    }


}


