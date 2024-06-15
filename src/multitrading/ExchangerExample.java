package multitrading;

import java.util.ArrayList;
import java.util.concurrent.Exchanger;
import java.util.List;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> freind1Action = new ArrayList<>();
        freind1Action.add(Action.NOJNICI);
        freind1Action.add(Action.BUMAGA);
        freind1Action.add(Action.NOJNICI);

        List<Action> freind2Action = new ArrayList<>();
        freind2Action.add(Action.BUMAGA);
        freind2Action.add(Action.KAMEN);
        freind2Action.add(Action.KAMEN);

        new BestFriend("Vanya", freind1Action, exchanger);
        new BestFriend("Daniil", freind2Action, exchanger);


    }
}

enum Action{
    KAMEN,
    NOJNICI,
    BUMAGA
}

class BestFriend extends Thread{
    private String name;
    private List<Action> myAction;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myAction, Exchanger<Action> exchanger) {
        this.name = name;
        this.myAction = myAction;
        this.exchanger = exchanger;
        this.start();
    }

    public void whoWins(Action myAction, Action friendsAction){
        if ((myAction == Action.KAMEN && friendsAction == Action.NOJNICI)
                || (myAction == Action.NOJNICI && friendsAction == Action.BUMAGA)
                || (myAction == Action.BUMAGA && friendsAction == Action.KAMEN)
        ){
            System.out.println(name + " WINS!!!");
        }
    }
    public void run(){
        Action reply;
        for(Action action: myAction){
            try {
                reply =exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
