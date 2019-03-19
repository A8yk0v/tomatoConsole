package core;

public abstract class State {
    protected int init_minute;
    protected int init_seconds;

    public abstract void start();
    public abstract void update();
    public abstract void stop();
    public abstract void restart();

    public abstract int getMinute();
    public abstract int getSeconds();

    public abstract boolean isActive();
    public abstract boolean isfinish();
}
