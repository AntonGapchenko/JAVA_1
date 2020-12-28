package homework_5;

public class Bird extends Animal {
    private static final int DEFAULT_MAX_LENGTH_RUN = 5;
    private static final double DEFAULT_MAX_HEIGHT_JUMP = 0.2;
    private static final int DEFAULT_MAX_DISTANCE_SWIM = 0;


    public Bird(String name) {

        super(name, DEFAULT_MAX_LENGTH_RUN, DEFAULT_MAX_HEIGHT_JUMP, DEFAULT_MAX_DISTANCE_SWIM);
    }

    public Bird(String name, int max_length_run, double max_height_jump) {
        super(name, max_length_run, max_height_jump, DEFAULT_MAX_DISTANCE_SWIM);
    }

    @Override
    protected void run(int length) {
        if (this.max_length_run >= length) {
            System.out.println(name + " пробежал!");

        } else {
            System.out.println(name + " не пробежал!");
        }

    }

    @Override
    protected void jump_Barrier(double height) {
        if (this.max_height_jump >= height) {
            System.out.println(name + " перепрыгнул!");

        } else {
            System.out.println(name + " не перепрыгнул!");
        }

    }

    @Override
    protected void swim(int distance) {
        System.out.println(name + " не плавает!");
    }
}
