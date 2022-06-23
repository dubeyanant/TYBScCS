// Create a database named DONAR
// javac jdbc1.java
// java -cp /data/postgresql-42.3.1.jar jdbc1.java

import java.sql.*;
import java.io.*;

public class A3 {
  public static void main(String[] args) throws Exception {

    Statement stmt;

    Class.forName("org.postgresql.Driver");
    Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/DONAR", "postgres", "123");
    // c = DriverManager.getConnection("jdbc:postgresql:ty144", "ty144", "ty144");

    stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("Select * from DONAR");
    java.sql.ResultSetMetaData rsmd = rs.getMetaData();

    int noOfColumns = rsmd.getColumnCount();
    System.out.println("Number of columns = " + noOfColumns);

    for (int i = 1; i <= noOfColumns; i++) {
      System.out.println("Column No : " + i);
      System.out.println("Column Name : " + rsmd.getColumnName(i));
      System.out.println("Column Type : " + rsmd.getColumnTypeName(i));
      System.out.println("Column display size : " + rsmd.getColumnDisplaySize(i));
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