package com.atalkumar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int no = 0;
        Scanner input = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        while (true) {
            System.out.println("1. ENTER / 2.SERVED ");
            int x = input.nextInt();
            if (x == 1) {
                System.out.println("ENTER id");
                int k = input.nextInt();
                System.out.println("ENTER NAME");
                String y = input.next();
                System.out.println("ENTER CGPA");
                double z = input.nextDouble();
                list.add(new Student(k, y, z));
                Collections.sort(list);
                no++;
            }
            if (x == 2) {
                list.remove(no - 1);
                for (Student st : list) {
                    System.out.println(st.getId() + " " + st.getName() + " " + st.getCgpa());
                }
                no--;
            }
            else break;
        }
    }
}
