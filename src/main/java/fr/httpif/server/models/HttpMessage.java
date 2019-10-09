package fr.httpif.server.models;

import java.util.HashMap;

public abstract class HttpMessage {
    protected HashMap<String, String> headers;
    protected String body;

    public HttpMessage() {
        headers = new HashMap<>();
    }

    public HashMap<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(HashMap<String, String> headers) {
        this.headers = headers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}