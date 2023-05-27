package br.com.cursonelio.nelio.resources.exeptions;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant timesamp;
    private Integer Status;
    private String error;
    private String menssage;
    private String path;

    public StandardError() {
    }

    public StandardError(Instant timesamp, Integer status, String error, String menssage, String path) {
        this.timesamp = timesamp;
        Status = status;
        this.error = error;
        this.menssage = menssage;
        this.path = path;
    }

    public Instant getTimesamp() {
        return timesamp;
    }

    public void setTimesamp(Instant timesamp) {
        this.timesamp = timesamp;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMenssage() {
        return menssage;
    }

    public void setMenssage(String menssage) {
        this.menssage = menssage;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
