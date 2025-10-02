import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectTime {
    private String startTime;
    private String endTime;
    private float hoursLogged;
    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public ProjectTime(String start, String end) {
        this.startTime = start;
        this.endTime = end;
        setHoursLogged();

    };

    public void setStartTime(String star) {
        this.startTime = star;
        setHoursLogged();
    };

    public void setEndTime(String end) {
        this.endTime = end;
        setHoursLogged();
    };

    public String getStartTime() {
        return startTime;
    };

    public String getEndTime() {
        return endTime;
    };

    public void setHoursLogged() {
        try {
            long dateStar = DATE_FORMAT.parse(startTime).getTime();
            long dateEnd = DATE_FORMAT.parse(endTime).getTime();
            this.hoursLogged = (float) (dateEnd - dateStar) / (1000 * 60 * 60);
            if (hoursLogged < 0) {
                this.hoursLogged = -1;
            }

        } catch (ParseException e) {
            this.hoursLogged = -1;
        }
    }

    public String getHoursLogged() {
        if (hoursLogged == -1) {
            return "-1";
        }
        String res;
        if ((hoursLogged * 60 < 120)) {
            res = "" + (int) (hoursLogged * 60) + " m";
        } else if (hoursLogged < 120) {
            res = "" + (int) (hoursLogged) + " h";
        } else if (hoursLogged / (24) < 120) {
            res = "" + (int) (hoursLogged / (24)) + " d";

        } else {
            res = "" + (int) (hoursLogged / (720)) + " mo";
        }
        return res;

    };
}