package com.tencent.java;

import com.mysql.jdbc.Driver;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcTest {
    @Test
    public void connection() throws SQLException {
        Driver driver = new Driver();
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","root");
        Connection connect = driver.connect("jdbc:mysql://localhost:3306/test",properties);
        System.out.println(connect);
    }
    @Test
    public void connection2() throws SQLException, IOException, ClassNotFoundException {
        InputStream resource = JdbcTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties pro = new Properties();
        pro.load(resource);
        String user = pro.getProperty("user");
        String password = pro.getProperty("password");
        String url = pro.getProperty("url");
        String driverClass = pro.getProperty("driverClass");
        Class.forName(driverClass);
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }
}
