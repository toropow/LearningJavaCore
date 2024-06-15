package generic;

public class ParametrizeClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Privet");
        System.out.println(info1);
        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);

        String s1 = info1.getValue();
        System.out.println(s1);
        Integer s2 = info2.getValue();
        System.out.println(s2);

    }

}

class Info<T> {
    private T value;

    public Info(T value){
        this.value = value;
    }

    public String toString(){
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

class Parent {
    public void abc(Info<String> info){
        String s = info.getValue();
    }
}

//class Child extends Parent{
//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }
//}
