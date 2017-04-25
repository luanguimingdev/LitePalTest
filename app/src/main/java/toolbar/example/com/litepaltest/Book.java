package toolbar.example.com.litepaltest;

import org.litepal.crud.DataSupport;

/**
 * author xiaohei
 * Created by xh on 2017/4/14.
 * 创建数据表的时候使用的javaBean
 * 在想要为表添加数据 列的时候直接在这个类中添加字段就行
 */
//该类要在android配置文件中进行配置
public class Book extends DataSupport {
    /***
     * id  书的编号
     * anthor 书的作者
     * price  书的价格
     * name   书的名称
     */
    private int id;
    private String author;
    private double price;
    private int pages;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public String getName() {
        return name;
    }
}
