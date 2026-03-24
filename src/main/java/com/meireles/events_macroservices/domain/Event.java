package com.meireles.events_macroservices.domain;

import com.meireles.events_macroservices.dtos.EmailRequestDTO;
import com.meireles.events_macroservices.dtos.EventRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name="event")
@Table(name="event")
@EqualsAndHashCode(of="id")
public class Event {

    @Id
    @GeneratedValue(strategy =  GenerationType.UUID)
    private String id;
    private int maxParticipants;
    private int registeredParticipants;
    private String date;
    private String title;
    private String description;

    public Event(){

    }

    public Event(String id, int maxParticipants, int registeredParticipants, String date, String title, String description) {
        this.id = id;
        this.maxParticipants = maxParticipants;
        this.registeredParticipants = registeredParticipants;
        this.date = date;
        this.title = title;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public int getRegisteredParticipants() {
        return registeredParticipants;
    }

    public void setRegisteredParticipants(int registeredParticipants) {
        this.registeredParticipants = registeredParticipants;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Event(EventRequestDTO eventRequestDTO){
        this.date = eventRequestDTO.date();
        this.maxParticipants = eventRequestDTO.maxParticipants();
        this.registeredParticipants = eventRequestDTO.registeredParticipants();
        this.title = eventRequestDTO.title();
        this.description = eventRequestDTO.description();



    }
}
