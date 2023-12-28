package Concepts;
    // package whatever; // don't place package name!
// Installed Libraries: JSON-Simple, JUNit 4, Apache Commons Lang3
import java.util.*;

    class SetMultiObjExample {
        public static void main (String[] args) {
            Set<User> set = new HashSet<>();

            set.add(new User("Max", 12));
            set.add(new User("Max", 12));
            set.add(new User("Max", 12));
            set.add(new User("Max", 12));

            if (set.size() == 1) {
                System.out.println("Passed!");
            } else {
                System.out.println("Failed!");
            }
        }

        static class User {

            String name;
            int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }
    }

