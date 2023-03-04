import java.util.Random;

public class AsymptoticsMedium {

    public void constant() {
        return;
    }

    public void expo(int N) {
        return;
    }

    public void alpha(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++){
                constant();
            }
        }
    }

    public int beta(int N) {
        Random rand = new Random();
        int r = rand.nextInt();
        if (r % 3 == 0) {
            for (int i = 0; i < N; i *= 2) {
                constant();
            }
        }
        return beta(N/2) + beta(N/2);
    }

    public void delta(int N, boolean bool) {
        if (N == 0) {
            System.out.println("hello");
        }
        expo(N);
        if (bool == true) {
            delta(N-1, bool);
            delta(N/2, bool);
        } else {
            delta(N/3, bool);
        }
    }

}
