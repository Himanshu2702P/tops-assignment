package assignment;
//• Write a Java program to display the system time. 

import java.time.LocalTime;

public class program_11 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        
        System.out.println("Current System Time: " + currentTime);
    }
}
