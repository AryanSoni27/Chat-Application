package com.chat.app.Entity;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "rooms")
@Data
public class Room {
    @Id
    private String id;
    private String roomId;
    private List<Message> messageList = new ArrayList<>();
}
