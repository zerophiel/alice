package com.msmsystemlink.alice.dto.core;

public class SingleBaseResponse<T> extends BaseResponse {

    private T data;

    public SingleBaseResponse() {
    }

    public SingleBaseResponse(String errorMessage, String errorCode, boolean success, T data) {
        super(errorMessage, errorCode, success);
        this.data = data;
    }

    public T getValue() {
        return data;
    }

    public void setValue(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SingleBaseResponse{" +
                "data=" + data +
                '}';
    }
}
