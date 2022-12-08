package soal2;

public class Main {
    public static void main(String[] args) {

        // MallardDuck
        Duck mallardDuck1 = new MallardDuck();
        Duck mallardDuck2 = new MallardDuck();
        Duck mallardDuck3 = new MallardDuck();


        // Action quanck
        mallardDuck1.quack(); // output : Kwek-kwek karena method quack() diimplementasikan di class MallardDuck
        mallardDuck2.quack(); // dan didekalarasikan di interface Duck
        mallardDuck3.quack();
        System.out.println();

        // Action swim
        mallardDuck1.swim(); // output : Swimming swiftly karena method swim() diimplementasikan di class MallardDuck
        mallardDuck2.swim(); // dan didekalarasikan di interface Duck
        mallardDuck3.swim();
        System.out.println();

        // RubberDuck
        Duck rubberDuck1 = new RubberDuck();
        Duck rubberDuck2 = new RubberDuck();
        Duck rubberDuck3 = new RubberDuck();

        // Action quanck
        rubberDuck1.quack(); // output : Squeak-squeak karena method quack() diimplementasikan di class RubberDuck
        rubberDuck2.quack(); // dan didekalarasikan di interface Duck
        rubberDuck3.quack();
        System.out.println();

        // Action swim
        rubberDuck1.swim(); // output : floating karena method swim() diimplementasikan di class RubberDuck
        rubberDuck2.swim(); // dan didekalarasikan di interface Duck
        rubberDuck3.swim();

    }
}
