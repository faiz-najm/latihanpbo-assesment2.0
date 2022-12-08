package soal2;

public class MallardDuck implements Duck {
    @Override
    // Jika method ini dihapus maka akan terjadi error
    // Karena method dalam interface tidak memiliki body dan bersifat abstrak, sehingga harus diimplementasikan di class yang mengimplementasikan interface tersebut
    // Karena method ini merupakan implementasi dari interface Duck sehingga harus diimplementasikan juga di class MallardDuck
    public void quack() {
        System.out.println("Kwek-kwek");
    }

    @Override
    public void swim() {
        System.out.println("Swimming swiftly");
    }
}
