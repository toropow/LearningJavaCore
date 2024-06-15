package collection.nested_classes.local_inner_class;

public class LocalInner2 {
    public static void main(String[] args) {
        class Slojenia implements Math2{
            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        }
        Slojenia s = new Slojenia();
        System.out.println(s.doOperation(5, 3));
    }
}

interface Math2{
    int doOperation(int a, int b);
}
