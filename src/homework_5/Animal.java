package homework_5;

public abstract class Animal {
    protected String name;
    protected int max_length_run;
    protected double max_height_jump;
    protected int max_distance_swim;


    public Animal(String name, int max_length_run, double max_height_jump, int max_distance_swim) {
        this.name = name;
        this.max_length_run = max_length_run;
        this.max_height_jump = max_height_jump;
        this.max_distance_swim = max_distance_swim;
    }

    protected abstract void run(int length);


    protected abstract void jump_Barrier(double height);

    protected abstract void swim(int distance);

}
