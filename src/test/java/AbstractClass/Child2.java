package AbstractClass;

public class Child2 extends Base{
    int m;
    int n;

    public Child2(int i, int j, int m, int n) {
        super(i, j);
        this.m = m;
        this.n = n;
    }

    public static void main(String[] args) {
        Child2 c = new Child2(5,6,7,8);
        System.out.println(c.i+" "+c.j+" "+c.m+" "+c.n);
    }
}
