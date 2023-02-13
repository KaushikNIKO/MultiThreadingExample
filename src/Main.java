public class Main {

    public static void main(String[] args) {
        Company com = new Company();
        Producer p1 = new Producer(com);
        Consumer c1 = new Consumer(com);

        p1.start();
        c1.start();

    }

}
