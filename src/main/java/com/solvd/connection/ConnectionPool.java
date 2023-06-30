package com.solvd.connection;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.DriverManager;
import java.util.Properties;


public class ConnectionPool {
    private static final Logger LOGGER = LogManager.getLogger(ConnectionPool.class);
    private static final int CON_POOL_SIZE = 10;
    private static Properties p = new Properties();
    private static String userName;
    private static String url;
    private static String password;
    private static ConnectionPool instance = null;
    private ConnectionPool() {

    }

    public static ConnectionPool getInstance() {
        if (instance == null) instance = new ConnectionPool();
        return instance;
    }

    static {
        try (FileInputStream f = new FileInputStream(".//src//main//resources//database.properties")) {
            p.load(f);
        } catch (IOException e) {
            LOGGER.info(e);
        }
        url = p.getProperty("url");
        userName = p.getProperty("userName");
        password = p.getProperty("password");
    }

    private Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            LOGGER.info(e);
        }
        return conn;
    }

    public synchronized Connection retrieve() {
        Connection newConn = null;
        return newConn;
    }

    public synchronized void putback(Connection c) {
        if (c != null) {
            } else {
                throw new NullPointerException("Connection is not in the Active Connections array");
            }
        }
    }



