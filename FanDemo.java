class AC {

    private int speed;

    public void increaseSpeed() {
        speed++;
    }

    public void decreaseSpeed() {
        if (speed > 0) {
            speed--;
        }
    }

    public int getSpeed() {
        return speed;
    }
}

public class FanDemo {
    public static void main(String[] args) {

        AC ac = new AC();

        ac.increaseSpeed();
        ac.increaseSpeed();
        ac.increaseSpeed();

        System.out.println("AC Speed: " + ac.getSpeed());

        ac.decreaseSpeed();

        System.out.println("AC Speed after decrease: " + ac.getSpeed());
    }
}
