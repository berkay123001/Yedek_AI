package com.melihawci.springrestapi.dto;

public class ChatRequest {
    private String message;
    private Long userId;

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
} 