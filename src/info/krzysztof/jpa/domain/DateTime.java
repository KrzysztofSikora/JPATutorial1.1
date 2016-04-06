package info.krzysztof.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

/**
 * Created by krzysztof on 06.04.16.
 */
@Entity
public class DateTime {

    @Id
    private long id;

    private java.sql.Date date;
    private java.sql.Time time;
    private java.sql.Timestamp timestamp;

    @Temporal(TemporalType.DATE)
    private java.util.Date utilDate;

    @Temporal(TemporalType.TIME)
    private java.util.Date utilTime;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date utilTimestamp;


    @Temporal(TemporalType.DATE)
    private java.util.Calendar calendar;

    public java.util.Date getUtilDate() {
        return utilDate;
    }

    public void setUtilDate(java.util.Date utilDate) {
        this.utilDate = utilDate;
    }

    public java.util.Date getUtilTime() {
        return utilTime;
    }

    public void setUtilTime(java.util.Date utilTime) {
        this.utilTime = utilTime;
    }

    public java.util.Date getUtilTimestamp() {
        return utilTimestamp;
    }

    public void setUtilTimestamp(java.util.Date utilTimestamp) {
        this.utilTimestamp = utilTimestamp;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
