// Create a database named empdb
// javac jdbc1.java
// java -cp /data/postgresql-42.3.1.jar jdbc1.java

import java.util.*;
import java.sql.*;

public class A1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter total no. of entries : ");
        int nEntries = in.nextInt();

        PreparedStatement ps = null;
        Connection c = null;
        Statement stmt = null;
        ResultSet rs = null;
        String CreateSql = null;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/empdb", "postgres", "123");
            // c = DriverManager.getConnection("jdbc:postgresql:ty144", "ty144", "ty144");
            System.out.println("Database Connected...");

            // CREATE TABLE PROJECT
            stmt = c.createStatement();
            CreateSql = "Create Table Project10(Project_id int primary key, Project_name varchar(20), Project_description varchar(50), Project_status varchar(20))";
            stmt.executeUpdate(CreateSql);
            System.out.println("Table Created successfully");

            for (int i = 0; i < nEntries; i++) {

                // INSERTING VALUES
                ps = c.prepareStatement("Insert into Project10 Values(?,?,?,?)");
                int pid;
                String name, desc, status;

                System.out.print("Enter project id : ");
                pid = in.nextInt();
                System.out.print("Enter project name : ");
                name = in.next();
                System.out.print("Enter project description : ");
                desc = in.next();
                System.out.print("Enter project status : ");
                status = in.next();

                ps.setInt(1, pid);
                ps.setString(2, name);
                ps.setString(3, desc);
                ps.setString(4, status);
                ps.executeUpdate();

                System.out.println("Entry added successfully");
                ps = null;
            }

            rs = stmt.executeQuery("Select * from Project10");
            while (rs.next()) {
                System.out.println("\nID :" + rs.getInt(1) + "\nNAME :" + rs.getString(2) + "\nDESC :" + rs.getString(3)
                        + "\nSTATUS :" + rs.getString(4));
            }

            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
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
 * INSERT INTO emp (empid, empname, salary) VALUES (1,'Hiray',100000);
 */