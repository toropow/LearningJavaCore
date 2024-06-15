package collection.nested_classes.anonymus_class;

public class AnonymusClass {
    private int x=5;

    public static void main(String[] args) {

        Math m = new Math(){
            int c=10;
            void abc(){}
            @Override
            public int doOperation(int a, int b){
                AnonymusClass ac = new AnonymusClass();
                return a+b+ac.x;
            }
        };

        Math2 m2 = new Math2() {
            @Override
            public int doOperation(int a, int b){
                return a*b;
            }
        };
        System.out.println(m.doOperation(3,5));
        System.out.println(m2.doOperation(3,5));
    }

}

interface Math{
    int doOperation(int a, int b);
}


class Math2{
    int doOperation(int a, int b){
      return a/b;
    };
}
