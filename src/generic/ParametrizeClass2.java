package generic;

public class ParametrizeClass2 {


    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(5, "s");

        System.out.println(pair.getFirstValue() + " other " + pair.getSecondValue());

        OtherPair<String> otherPair = new OtherPair<>("privet", "poka");
        System.out.println("First value " + otherPair.getFirstValue() + "; Second value " + otherPair.getSecondValue());

    }

}

class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    Pair(V1 value1, V2 value2){
        this.value1 = value1;
        this.value2 = value2;

    }

    public V1 getFirstValue(){
        return value1;
    }

    public V2 getSecondValue(){
        return value2;
    }

}

class OtherPair<V>{
    private V value1;
    private V value2;

    public V abc(V val){
        return val;
    }

    OtherPair(V value1, V value2){
        this.value1 = value1;
        this.value2 = value2;

    }

    public V getFirstValue(){
        return value1;
    }

    public V getSecondValue(){
        return value2;
    }

}

