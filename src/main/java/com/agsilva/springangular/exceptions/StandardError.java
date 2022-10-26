package com.agsilva.springangular.exceptions;

public class StandardError {
    private long timeStamp;
    private Integer status;
    private String error;

    public StandardError() {
        super();
    }

    public StandardError(long timeStamp, Integer status, String error) {
        super();
        this.timeStamp = timeStamp;
        this.status = status;
        this.error = error;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}