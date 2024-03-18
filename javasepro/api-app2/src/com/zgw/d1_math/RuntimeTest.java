package com.zgw.d1_math;

import java.io.IOException;

public class RuntimeTest {
    public static void main(String[] args) throws IOException {
        // 程序所在的运行环境 getRuntime方法获取当前运行时对象
        Runtime r = Runtime.getRuntime();

        // 终止当前虚拟机
        // r.exit(0);

        // 获取虚拟机能够使用的处理器数
        System.out.println(r.availableProcessors());

        // 返回java虚拟机中的内存总量
        System.out.println(r.totalMemory());

        // 返回java虚拟机中的可用内存量
        System.out.println(r.freeMemory());

        // 启动某个程序
        r.exec("C:\\Users\\cxd\\Desktop\\krpanos\\MAKE VTOUR Droplet.exe");
    }
}
