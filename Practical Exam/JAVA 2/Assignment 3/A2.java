// Create a database named demo_db
// javac jdbc1.java
// java -cp /data/postgresql-42.3.1.jar jdbc1.java

import java.sql.*;
import java.io.*;

public class DBMetaData {
    public static void main(String[] args) throws Exception {
        ResultSet rs = null;
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/demo_db", "postgres", "123");
        // c = DriverManager.getConnection("jdbc:postgresql:ty144", "ty144", "ty144");

        DatabaseMetaData dbmd = conn.getMetaData();

        System.out.println("Database Product name = " + dbmd.getDatabaseProductName());
        System.out.println("User name = " + dbmd.getUserName());
        System.out.println("Database driver  name= " + dbmd.getDriverName());
        System.out.println("Database driver version = " + dbmd.getDriverVersion());
        System.out.println("Database product name = " + dbmd.getDatabaseProductName());
        System.out.println("Database Version = " + dbmd.getDriverMajorVersion());

        rs = dbmd.getTables(null, null, null, new String[] { "TABLE" });

        System.out.println("List of tables...");
        while (rs.next()) {
            String tblName = rs.getString("TABLE_NAME");
            System.out.println("Table : " + tblName);
        }
        conn.close();
    }
}

/*
 * su - postgres
 * exit
 * 
 * 
 * createdb db_name
 * dropdb db_name
 * 
 * 
 * psql db_name
 * \q
 * 
 * 
 * CREATE TABLE accounts (
 * user_id serial PRIMARY KEY,
 * username VARCHAR ( 50 ) UNIQUE NOT NULL,
 * password VARCHAR ( 50 ) NOT NULL,
 * email VARCHAR ( 255 ) UNIQUE NOT NULL,
 * created_on TIMESTAMP NOT NULL,
 * last_login TIMESTAMP,
 * salary int
 * );
 * 
 * 
 * Select * from emp;
 * 
 * 
 * INSERT INTO emp (empid, empname, salary) VALUES (1,'Kalam',100000);
 */