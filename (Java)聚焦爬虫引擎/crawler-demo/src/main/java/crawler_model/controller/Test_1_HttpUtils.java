package crawler_model.controller;


import crawler_model.util.HttpUtils;
/*
 * @author:何翔
 * @date:2020/11/29 13:52
 * @description:测试是否能够获取到网址源代码
*/

public class Test_1_HttpUtils {
    public static void main(String[] args) {
        String content =new HttpUtils().doGetHtml("https://www.youlu.net/classify/2-0101-4139-1.html");
        System.out.println(content);
    }
}
