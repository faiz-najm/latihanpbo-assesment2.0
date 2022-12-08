package soal2;

public class RubberDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Squeak-squeak");
    }

    @Override
    // Jika method ini dihapus maka akan terjadi error
    // Karena method dalam interface tidak memiliki body dan bersifat abstrak, sehingga harus diimplementasikan di class yang mengimplementasikan interface tersebut
    // Karena method ini merupakan implementasi dari interface Duck sehingga harus diimplementasikan juga di class RubberDuck
    public void swim() {
        System.out.println("floating");
    }
}
