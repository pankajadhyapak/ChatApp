package com.example.pankaj.chatapp.Models.Events;

/**
 * Created by pankaj on 01/05/16.
 */
public class NewChatMsg {

    String id;
    String sent_by ;
    String sent_to ;
    String message ;
    String media_path;
    String updated_at ;
    String created_at;

    public NewChatMsg(String id, String sent_by, String sent_to, String message, String media_path, String updated_at, String created_at) {
        this.id = id;
        this.sent_by = sent_by;
        this.sent_to = sent_to;
        this.message = message;
        this.media_path = media_path;
        this.updated_at = updated_at;
        this.created_at = created_at;
    }

    public String getMedia_path() {
        return media_path;
    }

    public void setMedia_path(String media_path) {
        this.media_path = media_path;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSent_by() {
        return sent_by;
    }

    public void setSent_by(String sent_by) {
        this.sent_by = sent_by;
    }

    public String getSent_to() {
        return sent_to;
    }

    public void setSent_to(String sent_to) {
        this.sent_to = sent_to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String cub) {
        this.message = cub;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "NewChatMsg{" +
                "id='" + id + '\'' +
                ", sent_by='" + sent_by + '\'' +
                ", sent_to='" + sent_to + '\'' +
                ", message='" + message + '\'' +
                ", media_path='" + media_path + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", created_at='" + created_at + '\'' +
                '}';
    }
}
