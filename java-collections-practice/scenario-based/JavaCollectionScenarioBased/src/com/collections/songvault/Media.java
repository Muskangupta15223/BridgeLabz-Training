package com.collections.songvault;

public class Media<T> {

    private T data;

    public Media(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

