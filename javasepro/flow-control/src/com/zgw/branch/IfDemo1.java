package com.zgw.branch;

public class IfDemo1 {
    public static void main(String[] args) {
        int scope = 59;
        if (scope >= 90) {
            System.out.println("优秀");
        } else if (scope >= 60 && scope < 90) {
            System.out.println("良好");
        } else {
            System.out.println("差生");
        }


        switch (scope) {
            case 100:
                System.out.println("天才");
                break;
            case 90:
                System.out.println("优秀");
                break;
            case 70:
                System.out.println("良好");
                break;
            case 59:
                System.out.println("废物");
                break;
            default:
                System.out.println("------------");
        }
    }
}
