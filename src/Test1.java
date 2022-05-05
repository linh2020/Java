public class Test1 {

    private int data;

    Test1(int d) {
        this.data = d;
    }

    public static void main(String[] args) {

        Test1 t1 = new Test1(1);
        Test1 t2 = new Test1(999);

        t2 = t1;
        System.out.println("Before t1: " + t1.data);
        System.out.println("Before t2: " + t2.data);
//        System.out.println("t3: " + t3.data);


        Test1 t3 = new Test1(5);
        t1 = t3;

        System.out.println("t1: " + t1.data);
        System.out.println("t2: " + t2.data);
        System.out.println("t3: " + t3.data);

        t1.data = 10;
        t2.data = 611;
        System.out.println("Change t1: " + t1.data);
        System.out.println("Change t2: " + t2.data);
        System.out.println("Change t3: " + t3.data);
    }
}
