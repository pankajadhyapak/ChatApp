package com.example.pankaj.chatapp.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by pankaj on 26/04/16.
 */
public class Chat implements Serializable {

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("case_id")
    @Expose
    private Integer case_id;

    @SerializedName("owner_id")
    @Expose
    private Integer owner_id;

    @SerializedName("participant_id")
    @Expose
    private Integer participant_id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("owner")
    @Expose
    private Entity owner;

    @SerializedName("participant")
    @Expose
    private Entity participant;

    @SerializedName("created_at")
    @Expose
    private String createdAt;

    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCase_id() {
        return case_id;
    }

    public void setCase_id(Integer case_id) {
        this.case_id = case_id;
    }

    public Integer getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        this.owner_id = owner_id;
    }

    public Integer getParticipant_id() {
        return participant_id;
    }

    public void setParticipant_id(Integer participant_id) {
        this.participant_id = participant_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Entity getOwner() {
        return owner;
    }

    public void setOwner(Entity owner) {
        this.owner = owner;
    }

    public Entity getParticipant() {
        return participant;
    }

    public void setParticipant(Entity participant) {
        this.participant = participant;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public class Entity implements Serializable{

        private Integer id;
        private String email;
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
