package com.example.chatbot_2.Model;

public class ChatMessage {
    private boolean isImage,isMine;
    private String content;

    public ChatMessage(boolean isImage, boolean isMine, String content) {
        this.isImage = isImage;
        this.isMine = isMine;
        this.content = content;
    }

    public boolean isImage() {
        return isImage;
    }

    public void setImage(boolean image) {
        isImage = image;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean mine) {
        isMine = mine;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
