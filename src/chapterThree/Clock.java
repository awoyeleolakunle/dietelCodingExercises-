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

        if(minutes>59 && hour<24){
            ++hour;}
        else if (seconds >59 && minutes==59)
            return ++hour;
        return hour;
        }

    public void SetHours(int hour) {
        this.hour = hour;
        if (hour > 23)
           this.hour = 0;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        if (minutes > 59)
            this.minutes = 0;

    }

    public int getMinutes() {
        if (seconds > 59)
            ++minutes;
         if (minutes <= 59)
            return minutes;
         return 0;
        }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
        if (seconds > 59)
            this.seconds = 0;
    }

    public int getSeconds() {
        if(seconds<=59)
            return seconds;
        return 0;
    }

}