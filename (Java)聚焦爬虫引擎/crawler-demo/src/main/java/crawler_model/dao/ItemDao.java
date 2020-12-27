package crawler_model.dao;


import crawler_model.entity.Item;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemDao extends BaseDao {
    public boolean addItemInfo(Item item){
        /*
         * @author: 何翔
         * @param: [scl]
         * @return: boolean
         * @date: 2020/11/20 9:24
         * @description：添加商品信息
         */
        String sql = "insert into item values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setLong(1, item.getId());
            preparedStatement.setString(2, item.getName());
            preparedStatement.setString(3, item.getAuthor_publish());
            preparedStatement.setString(4, item.getInfo());
            preparedStatement.setString(5, item.getListPrice());
            preparedStatement.setString(6, item.getSalePrice());
            preparedStatement.setString(7, item.getSavePrice());
            preparedStatement.setString(8, item.getImageURL());
            preparedStatement.setString(9, item.getBookURL());
            preparedStatement.setString(10,  item.getCreated());
            if(preparedStatement.executeUpdate() > 0)
                return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Item> getItems(Item item){
        List<Item> itemList = new ArrayList<>();
        String sql = "select * from item";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet executeQuery = preparedStatement.executeQuery();
            while(executeQuery.next()){
                Item items = new Item();
                items.setId(executeQuery.getLong("id"));
                items.setName(executeQuery.getString("name"));
                items.setAuthor_publish(executeQuery.getString("author_publish"));
                items.setInfo(executeQuery.getString("info"));
                items.setListPrice(executeQuery.getString("listPrice"));
                items.setSalePrice(executeQuery.getString("salePrice"));
                items.setSavePrice(executeQuery.getString("savePrice"));
                items.setImageURL(executeQuery.getString("imageURL"));
                items.setBookURL(executeQuery.getString("bookURL"));
                items.setCreated(executeQuery.getString("created"));
                itemList.add(items);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return itemList;
}
}
