package com.zgw.test;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(createCode(5));
    }

    /**
     * 生成验证码
     *
     * @param n 验证码长度
     * @return 验证码
     */
    public static String createCode(int n) {
        Random r = new Random();
        String code = "";
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            switch (type) {
                case 0:
                    code += r.nextInt(9);
                    break;
                case 1:
                    char ch1 = (char) (r.nextInt(26) + 64);
                    code += ch1;
                    break;

                case 2:
                    char ch2 = (char) (r.nextInt(26) + 97);
                    code += ch2;
                    break;

            }
        }
        return code;
    }
}
