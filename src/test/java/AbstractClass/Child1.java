package AbstractClass;

public class Child1 extends Base{
    int k;
    int l;

    public Child1(int k, int l, int i, int j){
        super(i, j);
        this.k = k;
        this.l = l;
        //this.i = i; //Base class object
        //this.j = j; //Base class object
    }

    public static void main(String[] args) {
        Child1 c = new Child1(1,2, 3, 4);
        System.out.println(c.k+" "+c.l+" "+c.i+" "+c.j);

    }
}
