package Concepts;

import static Concepts.AbstractExample.Gurgaon.shops;

public class AbstractExample {
    class India
    {
        void mall(){
            System.out.println("A");
        }
        void states(){
            System.out.println("A1");
        }
        static void shops(){
            System.out.println("A4");
        }
    }

    class Haryana extends India
    {
        void mall()
        {
            System.out.println("B");
        }
        void districts()
        {
            System.out.println("B2");
        }
    }

    class Gurgaon extends Haryana
    {
        void mall(){
            System.out.println("C");
        }
        void cyberhub(){
            System.out.println("C3");
        }
        static void shops(){
            System.out.println("C4");
        }
    }
    class Test1 {
        public void main(String[] args)
        {
            India a2=new Gurgaon();
            a2.mall(); // what is the output here >
            //a2.cyberhub(); // what is the output here >
            shops(); // what is the output here >
        }
    }




}


