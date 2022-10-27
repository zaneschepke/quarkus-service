package com.zaneschepke.model;


public class Message {
    private final String text;
    private final String name;
    public Message(String text, String name){
        this.text = text;
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public String getName() {
        return name;
    }


}
