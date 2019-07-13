package com.jetlight.myappchat;

public class Message {
    private String message;
    private String titre;
    private String photoURL;

    public Message(String message, String titre, String photoURL) {
        this.message = message;
        this.titre = titre;
        this.photoURL = photoURL;
    }

    public Message() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }
}
