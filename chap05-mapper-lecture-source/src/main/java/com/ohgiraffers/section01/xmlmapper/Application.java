package com.ohgiraffers.section01.xmlmapper;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ElementTestService elementTestService = new ElementTestService();

        do {

            System.out.println("매퍼 엘리먼트 테스트");
            System.out.println("1. cache");
            System.out.println("2. resultMap");
            System.out.println("3. sql");
            System.out.println("4. insert");
            System.out.println("메뉴 번호 입력");
            int no = sc.nextInt();


            switch (no) {

                case 1:
                    elementTestService.selectCacheTest();
                    break;
                case 2:
                    resultMapSubMenu(); break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }  while (true);

    }

    private static void resultMapSubMenu() {
        Scanner sc = new Scanner(System.in);
        ElementTestService elementTestService = new ElementTestService();
        do {

            System.out.println("resultMap 서브메뉴");
            System.out.println("1. resultMap");
            System.out.println("2. constructor");
            System.out.println("3. association");
            System.out.println("4. collection");
            System.out.println("메뉴 번호를 입력하세요");
            int no = sc.nextInt();

            switch (no) {

                case 1: elementTestService.selectResultMapTest(); break;
                case 2: elementTestService.selectResultMapConstructorTest(); break;
                case 3: elementTestService.selectResultMapAssociationTest(); break;
                case 4: elementTestService.selectResultMapCollectionTest(); break;

            }

        } while (true);


    }

}
