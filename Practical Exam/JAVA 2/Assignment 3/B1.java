// javac jdbc1.java
// java -cp /data/postgresql-42.3.1.jar jdbc1.java

import java.util.*;
import java.sql.*;

public class B1 {
    public static void main(String args[]) {
        Connection c = null;
        Statement stmt = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String CreateSql = null;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/empdb", "postgres", "123");
            // c = DriverManager.getConnection("jdbc:postgresql:ty144", "ty144", "ty144");

            System.out.println("Database Connected ..");

            // CREATE TABLE Mobile1
            stmt = c.createStatement();
            CreateSql = "Create Table Mobile1(Mobile1_id int primary key, Mobile1_name varchar(20), Mobile1_color varchar(20), sim_type varchar(20), Network_type varchar(20), BatteryCapacity varchar(20), InternalStorage varchar(20), RAM varchar(20), Processor_type varchar(20))";
            stmt.executeUpdate(CreateSql);

            Scanner in = new Scanner(System.in);

            // MENU
            int choice = 0;
            while (choice != 4) {
                System.out.println("ENTER CHOICE SENPAI >_<");
                System.out.println("1. SEARCH");
                System.out.println("2. VIEW");
                System.out.println("3. Insert");
                System.out.println("4. EXIT");
                choice = in.nextInt();
                switch (choice) {

                    case 1:
                        ResultSet rs1 = null;
                        System.out.println("ENTER Mobile1 ID TO SEARCH ");
                        int smid = in.nextInt();
                        rs1 = stmt.executeQuery("select * from Mobile1 where Mobile1_id= " + smid);

                        if (rs1.next()) {
                            System.out.println("ID :" + rs1.getInt(1));
                            System.out.println("NAME :" + rs1.getString(2));
                            System.out.println("COLOR :" + rs1.getString(3));
                            System.out.println("SIM TYPE :" + rs1.getString(4));
                            System.out.println("NETWORK TYPE :" + rs1.getString(5));
                            System.out.println("BATTERY SIZE :" + rs1.getString(6));
                            System.out.println("STORAGE SIZE :" + rs1.getString(7));
                            System.out.println("RAM SIZE :" + rs1.getString(8));
                            System.out.println("PROCESSOR TYPE :" + rs1.getString(9));
                        } else {
                            System.out.println("Mobile not found!!");
                        }
                        break;

                    case 2:
                        rs = stmt.executeQuery("Select * from Mobile1");
                        while (rs.next()) {
                            System.out.println("ID :" + rs.getInt(1));
                            System.out.println("NAME :" + rs.getString(2));
                            System.out.println("COLOR :" + rs.getString(3));
                            System.out.println("SIM TYPE :" + rs.getString(4));
                            System.out.println("NETWORK TYPE :" + rs.getString(5));
                            System.out.println("BATTERY SIZE :" + rs.getString(6));
                            System.out.println("STORAGE SIZE :" + rs.getString(7));
                            System.out.println("RAM SIZE :" + rs.getString(8));
                            System.out.println("PROCESSOR TYPE :" + rs.getString(9));
                        }
                        break;

                    case 3:
                        // INSERTING VALUES
                        ps = c.prepareStatement("Insert into Mobile1 Values(?,?,?,?,?,?,?,?,?)");

                        int mid;
                        String name, color, sim, network, battery, storage, ram, processor;

                        System.out.print("Enter Mobile1 id : ");
                        mid = in.nextInt();
                        System.out.print("Enter Mobile1 name : ");
                        name = in.next();
                        System.out.print("Enter Mobile1 color : ");
                        color = in.next();
                        System.out.print("Enter sim type : ");
                        sim = in.next();
                        System.out.print("Enter network type : ");
                        network = in.next();
                        System.out.print("Enter battery SIZE : ");
                        battery = in.next();
                        System.out.print("Enter storage : ");
                        storage = in.next();
                        System.out.print("Enter ram size: ");
                        ram = in.next();
                        System.out.print("Enter processor type : ");
                        processor = in.next();

                        ps.setInt(1, mid);
                        ps.setString(2, name);
                        ps.setString(3, color);
                        ps.setString(4, sim);
                        ps.setString(5, network);
                        ps.setString(6, battery);
                        ps.setString(7, storage);
                        ps.setString(8, ram);
                        ps.setString(9, processor);
                        ps.executeUpdate();
                        System.out.println("Inserted Successfully!");
                        break;

                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("INVALID CHOICE");
                        break;
                }
            }

            stmt.close();
            c.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Table Created successfully");
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