package homework_5;

public class Horse extends Animal {
    private static final int DEFAULT_MAX_LENGTH_RUN = 1500;
    private static final double DEFAULT_MAX_HEIGHT_JUMP = 3;
    private static final int DEFAULT_MAX_DISTANCE_SWIM = 100;

    public Horse(String name) {
        super(name, DEFAULT_MAX_LENGTH_RUN, DEFAULT_MAX_HEIGHT_JUMP, DEFAULT_MAX_DISTANCE_SWIM);
    }

    public Horse(String name, int max_length_run, double max_height_jump, int max_distance_swim) {
        super(name, max_length_run, max_height_jump, max_distance_swim);
    }

    @Override
    protected void run(int length) {
        if (this.max_length_run >= length) {
            System.out.println(name + " пробежал!");

        } else {
            System.out.println(name + " не пробежал");
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
        if (this.max_distance_swim >= distance) {
            System.out.println(name + " проплыл!");
        } else {
            System.out.println(name + " не проплыл!");
        }


    }
}
