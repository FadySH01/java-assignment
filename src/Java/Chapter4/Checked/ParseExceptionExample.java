package Java.Chapter4.Checked;
import java.text.*;
import java.util.*;

public class ParseExceptionExample {


        public static void main(String[] args) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date date = sdf.parse("2025-10-08"); // Wrong format
            } catch (ParseException e) {
                System.out.println("ParseException: Invalid date format!");
            }
        }
    }
