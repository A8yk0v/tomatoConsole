package core;

public class Break extends State {
    private int minute;
    private int seconds;
    private boolean isActive;

    public Break() {
        minute = init_minute = 4;
        seconds = init_seconds = 0;
        isActive = true;
    }

    public void start() {
        isActive = true;
    }

    public void stop() {
        isActive = false;
    }

    public void update() {
        if (seconds > 0)
            seconds -= 1;
        else {
            seconds = 59;
            minute -= 1;
        }
    }

    public void restart() {
        minute = init_minute;
        seconds = init_seconds;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isfinish() {
        return seconds + minute == 0;
    }

    public boolean isActive() {
        return isActive;
    }
}
