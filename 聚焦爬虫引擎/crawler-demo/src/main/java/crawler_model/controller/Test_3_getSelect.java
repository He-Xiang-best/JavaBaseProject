package crawler_model.controller;

import crawler_model.util.HttpUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/*
 * @author:何翔
 * @date:2020/11/29 13:55
 * @description:测试是否能够选取解析后网页的信息
 */

public class Test_3_getSelect {
    public static void main(String[] args) {
        String url ="https://www.youlu.net/classify/2-0101-4139-1.html";
        String content = new HttpUtils().doGetHtml(url);
        Document doc = Jsoup.parse(content);
        Element bookList = doc.select(".newBookList").get(0);
        Elements list =bookList.select(">ul>li");
        for (Element book : list) {
            //获取书本名字
            String bookName = book.select(".bName>a").get(0).text();
            //获取书本的作者和出版社以及质量信息
            String bookCover = book.select(".bMore").text();
            //获取书本的简介信息
            String bookInfo = book.select(".bSummary").text();
            //获取商品的原价信息
            String bookListPrice =book.select(".listPrice").get(0).text();
            //获取商品的现售价信息
            String bookSalePrice =book.select(".salePrice").get(0).text();
            //获取商品的节约价格信息
            String bookSavePrice =book.select(".savePrice").get(0).text();
            //获取商品的图片地址
            String bookImgeURL = book.select(".img>a>img").attr("src");
            //获取商品的详细信息地址
            String bookTempURL = book.select(".bName>a").attr("href");
            String bookURL = "https://www.youlu.net" + bookTempURL;
            //输出信息：
            System.out.println(bookName);
            System.out.println(bookCover);
            System.out.println(bookInfo);
            System.out.println(bookListPrice);
            System.out.println(bookSalePrice);
            System.out.println(bookSavePrice);
            System.out.println(bookImgeURL);
            System.out.println(bookURL);
            System.out.println("--------------------------------------------------------");
        }
    }
}
