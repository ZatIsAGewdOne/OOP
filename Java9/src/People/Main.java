package People;

import java.io.*;
import java.util.Arrays;

public class Main {

    static People[] read(String file) {
        People[] peopleArr = new People[0];
        String[] object = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                object = line.split(" ");
                People obj;
                if(object[0].equals("S")) {
                    obj = new Student(object[1], object[2], Integer.parseInt(object[3]), Integer.parseInt(object[4]), object[5]);
                } else {
                    obj = new Employee(object[1], object[2], Integer.parseInt(object[3]), Integer.parseInt(object[4]), object[5]);
                }
                peopleArr = addElement(peopleArr, obj);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "File '" + file + "' not found!"
            );
            ex.fillInStackTrace();
        } catch (Exception e) {
            System.out.println(
                    "Something went wrong!"
            );

            e.fillInStackTrace();
        }
        return peopleArr;
    }

    static People[] addElement(People[] arr, People obj) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = obj;
        return arr;
    }

    public static void main(String[] args) {
        String file = new File("").getAbsolutePath() + "/src/People/data.txt";
        People[] arrOfPeople = read(file);
        PeopleContainer cont = new PeopleContainer(arrOfPeople);
        cont.print();
        System.out.println("*********");
        System.out.println("Oldest -> " + cont.findOldest());
        System.out.println("Average age -> " + cont.averageAge());
        System.out.println("Student amount -> " + cont.countStudents());
        System.out.println("Employee amount -> " + cont.countEmployees());
    }
}
