package crawler_model.entity;

import javax.persistence.*;
/*
 * @author:何翔
 * @date:2020/11/29 15:42
 * @description:商品的实体类
 */

@Entity
@Table(name = "item")
public class Item {
    //主键
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //商品的名称
    private String name;
    //商品的作者和出版社
    private String author_publish;
    //商品的信息
    private String info;
    //商品的原价
    private String listPrice;
    //商品的现价
    private String salePrice;
    //商品的节约价
    private String savePrice;
    //商品图片地址
    private String imageURL;
    //商品详情地址
    private String bookURL;
    //创建时间
    private String created;


    public String getAuthor_publish() {
        return author_publish;
    }

    public void setAuthor_publish(String author_publish) {
        this.author_publish = author_publish;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getListPrice() {
        return listPrice;
    }

    public void setListPrice(String listPrice) {
        this.listPrice = listPrice;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getSavePrice() {
        return savePrice;
    }

    public void setSavePrice(String savePrice) {
        this.savePrice = savePrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String pic) {
        this.imageURL = pic;
    }

    public String getBookURL() {
        return bookURL;
    }

    public void setBookURL(String url) {
        this.bookURL = url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

}


