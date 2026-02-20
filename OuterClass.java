class OuterClass {

    private int data = 10;

    class InnerClass {
        void display() {
            System.out.println("Value of data is: " + data);
        }
    }

    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.display();
    }
}
