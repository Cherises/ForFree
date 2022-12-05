package org.example.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LinkSQLite {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public LinkSQLite() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:forfree.db");
            statement = connection.createStatement();
            checkTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void checkTable(){
        try {
            String sql = "create table if not exists article(tid AUTO_INCREMENT,title varchar(255) not null,resume varchar(255) not null,label varchar(255) not null,cdate datetime not null,mdate datetime not null,value text,primary key(tid))";
            statement.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void closeDB(){
        try {
            connection.close();
            statement.close();
            System.out.println("数据库已关闭");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
