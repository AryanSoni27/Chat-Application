package com.chat.app.Entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Message {

    private String sender;
    private String content;
    private LocalDateTime timeStamp;

    public Message(String content, String sender) {
        this.content = content;
        this.sender = sender;
        this.timeStamp = LocalDateTime.now();
    }
}
