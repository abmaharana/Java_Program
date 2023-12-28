package Concepts;

import java.io.*;

public class Conceptual {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * System.exit(0)
         */
//        try{
//            System.out.println("I am dying");
//            System.exit(0);
//        }finally {
//            System.exit(1);
//            System.out.println("I am still alive");
//        }

        /**
         * custom exceptions
         */
//        try {
//            throw new myException("I am throwing exceptions");
//        }catch (myException m){
//            System.out.println(m.getMessage());
//        }

        /**
         * Diff bet == and .equals
         */
//        String s1="Abhishek";
//        String s2=new String("Abhishek");
//        System.out.println(s1==s2); //false
//        System.out.println(s1.equals(s2)); //true

        /**
         * serialization - converting object into byte code
         * deserialization - re-converting byte code into object
         */
//        Student s1 = new Student();
//        s1.roll=112;
//        s1.name="Abhishek";
//        String file = "C:\\Users\\Abhishek\\byteCode.txt";
//        try {
            //serialization
//        FileOutputStream fos = new FileOutputStream(file);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(s1);

            //deserialization
//            FileInputStream fis = new FileInputStream(file);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            Student obj = (Student)ois.readObject();
//            System.out.println(obj.name);
//            System.out.println(obj.roll);
//
//            ois.close();
//            fis.close();
//        }catch (FileNotFoundException e){
//
//        }
    }
}

//For custom exception
class myException extends Exception{
    myException(String str){
        super(str);
    }
}

//For serialization/Deserialization
class Student implements Serializable {
    public int roll;
    public String name;
}
