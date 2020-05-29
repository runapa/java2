package lesson15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassWork {
    public static void main(String[] args) /*throws MyCheckedException*/ {
/*        StringBuilder stringBuilder = new StringBuilder("Hello");
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("T");
            stringBuilder.reverse();
        }
        System.out.println(stringBuilder.toString());

        StringBuffer stringBuffer = new StringBuffer("Hello");*/

        //Exceptions
        //testRuntimeExc(0);


        //Стандартное решение для перехвата исключений коннекшена
        //Try with resources
        try(Connection connectionX = DriverManager.getConnection("127.0.0.1")){
            connectionX.commit();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            System.out.println("It's a final operation");
        }

/*        try {
            testCheckedExc(5);
        } catch (MyCheckedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
            exc.printStackTrace();
        }*/
    }

    public static void testCheckedExc(int i) throws Exception {
        if (i > 1000) {
            throw new MyCheckedException("argument is too big");
        }
        if (i < 0) {
            throw new MyCheckedException("argument can not be negative");
        }

        if (i == 5) {
            throw new Exception("i can't be 5");
        }
        System.out.println("Ok");
    }

    public static void testRuntimeExc(int i) {
        if (i == 0) {
            throw new RuntimeException("i can't be zero");
        }
    }
}
