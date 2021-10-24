
import static com.ShortPrint.*;

import java.util.Dictionary;
import java.util.*;

import javax.swing.JOptionPane;


import com.Lessons;
import com.Student;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--------UNI----------");

        Student s = new Student(12345);

        // JOptionPane.showMessageDialog(null, "qweqwe", "title", JOptionPane.INFORMATION_MESSAGE);
        // s.show();

        Lessons.undergraduate ul = new Lessons.undergraduate();
        Lessons.undergraduate gl = new Lessons.undergraduate();
        Lessons.undergraduate pl = new Lessons.undergraduate();
        Lessons l = new Lessons();


        // ul.add("magnetics");
        print(ul.get_ee_lessons());

        l.add("qweqweasd");
        print(l.getList());

    }





}
