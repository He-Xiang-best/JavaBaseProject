package crawler_model.controller;

import crawler_model.util.HttpUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
/*
 * @author:何翔
 * @date:2020/11/29 13:52
 * @description:测试是否能够将获取到的网页源代码进行解析
 */

public class Test_2_Document {
    public static void main(String[] args) {
        Document document = Jsoup.parse(new HttpUtils().doGetHtml("https://www.youlu.net/classify/2-0101-4139-1.html"));
        System.out.println(document);
    }
}
