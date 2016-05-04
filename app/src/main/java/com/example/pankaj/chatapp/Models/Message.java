package com.example.pankaj.chatapp.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by pankaj on 26/04/16.
 */
public class Message extends RealmObject implements Serializable{

    @PrimaryKey
    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("sent_by")
    @Expose
    private Integer sentById;
    @SerializedName("sent_to")
    @Expose
    private Integer sentToId;
    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("media_path")
    @Expose
    private String media_path;

    public String getMedia_path() {
        return media_path;
    }

    public void setMedia_path(String media_path) {
        this.media_path = media_path;
    }

    @SerializedName("read")
    @Expose
    private Integer read;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }



    /**
     *
     * @return
     * The sentById
     */
    public Integer getSentById() {
        return sentById;
    }

    /**
     *
     * @param sentById
     * The sent_by_id
     */
    public void setSentById(Integer sentById) {
        this.sentById = sentById;
    }

    /**
     *
     * @return
     * The sentToId
     */
    public Integer getSentToId() {
        return sentToId;
    }

    /**
     *
     * @param sentToId
     * The sent_to_id
     */
    public void setSentToId(Integer sentToId) {
        this.sentToId = sentToId;
    }

    /**
     *
     * @return
     * The message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return
     * The read
     */
    public Integer getRead() {
        return read;
    }

    /**
     *
     * @param read
     * The read
     */
    public void setRead(Integer read) {
        this.read = read;
    }

    /**
     *
     * @return
     * The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     * The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return
     * The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     *
     * @param updatedAt
     * The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
