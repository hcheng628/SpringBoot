package us.supercheng.common;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
public class ServerResponse<T> {
    private int statusCode;
    private T data;

    private ServerResponse(int inStatusCode, T inData) {
        this.statusCode = inStatusCode;
        this.data = inData;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public T getData() {
        return this.data;
    }

    public static <T> ServerResponse<T> createResponse(int inStatusCode, String Msg) {
        return new ServerResponse(inStatusCode, Msg);
    }

    public static <T> ServerResponse<T> createResponse(int inStatusCode, T inData) {
        return new ServerResponse(inStatusCode, inData);
    }

    public static <T> ServerResponse<T> createResponseSuccess(T inData) {
        return new ServerResponse(ResponseCode.SUCCESS.getCode(), inData);
    }

    public static <T> ServerResponse<T> createResponseError(String errMsg) {
        return new ServerResponse(ResponseCode.ERROR.getCode(), errMsg);
    }
}