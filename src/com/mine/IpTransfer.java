package com.mine;

/**
 * Created by fatchao
 * 日期  2018-02-23.
 * 邮箱  fat_chao@163.com
 */
//3232235521
public class IpTransfer {

    public static long IpToLong(String strIp) {
        long[] ip = new long[4];
        String[] strArray = strIp.split("\\.");
        //将每个.之间的字符串转换成整型
        for (int i = 0; i < strArray.length; i++) {
            ip[i]=Long.parseLong(strArray[i]);
        }
        return (ip[0] << 24) + (ip[1] << 16) + (ip[2] << 8) + ip[3];
    }

    public static String IpToString(Long longIp) {
        StringBuffer sb = new StringBuffer("");
        //直接右移24位
        sb.append(String.valueOf((longIp >>> 24)));
        sb.append(".");
        //将高8位置0，然后右移16位
        sb.append(String.valueOf((longIp & 0x00FFFFFF) >>> 16));
        sb.append(".");
        //将高16位置0，然后右移8位
        sb.append(String.valueOf((longIp & 0x0000FFFF) >>> 8));
        sb.append(".");
        //将高24位置0
        sb.append(String.valueOf((longIp & 0x000000FF)));
        return sb.toString();
    }

    public static void main(String[] args) {
        String ipStr = "192.168.0.1";
        long longIp = IpToLong(ipStr);
        System.out.println("192.168.0.1 的整数形式为：" + longIp);
        System.out.println("整数" + longIp + "转化成字符串IP地址："
                + IpToString(longIp));
        //ip地址转化成二进制形式输出
        System.out.println("192.168.0.1 的二进制形式为：" + Long.toBinaryString(longIp));
    }
}
