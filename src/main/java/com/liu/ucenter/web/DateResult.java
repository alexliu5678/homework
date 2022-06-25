package com.liu.ucenter.web;

/**
 * result from facade
 * @param <T> object define
 */
public class DateResult <T> extends Result{
    private T result;

    public T getResult() {
        return (T) result;
    }

    public void setResult(T result) {
        this.result = result;
    }

}
