package tech.adarshbp.model;


import org.springframework.stereotype.Service;


import java.time.LocalDateTime;


@Service
public class LoggingData {


    public LoggingData() {

    }

    public LoggingData(String type, String message, LocalDateTime date_time) {
        this.type = type;
        this.message = message;
        this.date_time = date_time;
    }

    private String type;
    private String message ;
    private LocalDateTime date_time ;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDate_time() {
        return date_time;
    }

    public void setDate_time(LocalDateTime date_time) {
        this.date_time = date_time;
    }
}
