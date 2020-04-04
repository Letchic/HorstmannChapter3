package runnable;

public class Greeter implements Runnable {
    private String target;
    private int n;
    public Greeter(String s, int n) {
        target = s;
        this.n = n;
    }
    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello, " + target);
        }
    }
}