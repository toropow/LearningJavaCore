package lambda;

public class Test2 {
    static void def(I i){
        System.out.println(i.abc("privet"));

    }

    static void def123(I1 i1){
        System.out.println(i1.abc());

    }

    public static void main(String[] args) {
        final int i = 99;

        def((String s) -> {
            int a = 5;
            s = "test";
            System.out.println(i);
            return s.length() + i;});
        def123(() -> 5);
    }
}

interface I {
    int abc (String s);
}

interface I1{
    int abc ();
}
