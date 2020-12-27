package crawler_model.controller;

import crawler_model.dao.ItemDao;
import crawler_model.entity.Item;
import crawler_model.util.HttpUtils;
import crawler_model.view.CrawlerWindow;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
/*
 * @author:何翔
 * @date:2020/11/29 15:09
 * @description:爬取的工程
 /*
 
 */

@Component
public class Catch_Item {
    @Autowired
    private HttpUtils httpUtils;
    static long id=1;
    static int catchTimes=1;

    //当下载任务完成后，间隔多长时间进行下一次的任务。
    @Scheduled(fixedDelay = 100 * 1000)
    public void itemTask() {
        /*
         * @author: 何翔
         * @param: []
         * @return: void
         * @date: 2020/11/29 15:16
         * @description：解析页面，获取商品数据并存储
         */

        //声明需要解析的初始地址 —— https://www.youlu.net/classify/2-0101-4139-1.html

        String url = "https://www.youlu.net/classify/2-0101-4139-";
        System.out.println("数据正在爬取当中。。。。。。。。。");
        CrawlerWindow crawlerView = new CrawlerWindow();
        crawlerView.showCrawlerWindow();
        crawlerView.setLogTextArea("数据正在爬取当中。。。。。。。。。");
        for (; catchTimes < 2; catchTimes++) {
            String html = this.httpUtils.doGetHtml(url + catchTimes + ".html");
            this.parse(html,crawlerView);
        }
        System.out.println("数据抓取完成！");
//      System.exit(0);
    }

    //解析页面，获取商品数据并存储
    private void parse(String html, CrawlerWindow crawlerView)  {
        /*
         * @author: 何翔
         * @param: [html]
         * @return: void
         * @date: 2020/11/29 15:18
         * @description：爬取二手书网站的相关数据
         */

        //解析html获取Document
        Document doc = Jsoup.parse(html);
        //获取书本列表
        Element bookList = doc.select(".newBookList").get(0);
        //找到列表下的信息元素
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
            //下载图片
            this.httpUtils.doGetImage(bookImgeURL);
            //获取商品的详细信息地址
            String bookTempURL = book.select(".bName>a").attr("href");
            String bookURL = "https://www.youlu.net" + bookTempURL;
            //将信息保存到类的属性当中
            Item item = new Item();
            item.setId(id);
            item.setName(bookName);
            item.setAuthor_publish(bookCover);
            item.setInfo(bookInfo);
            item.setListPrice(bookListPrice);
            item.setSalePrice(bookSalePrice);
            item.setSavePrice(bookSavePrice);
            item.setImageURL(bookImgeURL);
            item.setBookURL(bookURL);
            item.setCreated(LocalDate.now().toString());
            //保存商品数据到数据库中
            ItemDao itemDao =  new ItemDao();
            itemDao.addItemInfo(item);
            itemDao.CloseConnection();
//          System.out.println("当前已爬取成功数据："+(id++)+"条");
            crawlerView.setTable(item);
            crawlerView.setLogTextArea("当前已爬取成功数据："+(id++)+"条");
        }
    }
}
