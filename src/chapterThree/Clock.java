package chapterThree;

public class Clock {
    private int hour;
    private int minutes;
    private int seconds;

    public Clock(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int getHours() {
        return hour;
        }

    public void SetHours(int hour) {
        //this.hour = hour;
        if (hour > 23)
           this.hour = 0;
    }

    public void setMinutes(int minutes) {
        //this.minutes = minutes;
        if (minutes > 59)
            this.minutes = 0;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {
       // this.seconds = seconds;
        if (seconds > 59)
            this.seconds = 0;
    }

    public int getSeconds() {
        return seconds;
    }
}