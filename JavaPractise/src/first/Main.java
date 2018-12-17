package first;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        java.sql.Date sqlDate = new java.sql.Date(new Date().getTime());
        System.out.println(sqlDate);
        System.out.println(new Date());
    }
}
