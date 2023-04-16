package ConcurrenyPackage;

import java.io.*;

public class SerializableExample {

    public static void main(String[] args) {

        // create an object to write to file
        Student student = new Student("kumar", "mijar", 25, "Computer Science");

        try {
            // create a file output stream
            FileOutputStream fileOutputStream = new FileOutputStream("student.ser");

            // create an object output stream
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // write the object to file
            objectOutputStream.writeObject(student);

            // close the output streams
            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Student object written to file successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // create a file input stream
            FileInputStream fileInputStream = new FileInputStream("student.ser");

            // create an object input stream
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // read the object from file
            Student studentFromFile = (Student) objectInputStream.readObject();

            // close the input streams
            objectInputStream.close();
            fileInputStream.close();

            // print the object
            System.out.println("Student object read from file:");
            System.out.println(studentFromFile);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Student implements Serializable {
    private String firstName;
    private String lastName;
    private int age;
    private String major;

    public Student(String firstName, String lastName, int age, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                '}';
    }
}
