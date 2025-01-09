package com.example.minichat.chat;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {
    public List<Chat> getChats() {
        return List.of(
                new Chat("Hello", "userId1", "userId2"),
                new Chat("Hi", "userId2", "userId1"),
                new Chat("How are you?", "userId1", "userId2"),
                new Chat("I'm fine", "userId2", "userId1")
        );
    }
}
