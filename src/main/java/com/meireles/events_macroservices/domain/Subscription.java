package com.meireles.events_macroservices.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity(name="subscription")
@Table(name="subscription")

@EqualsAndHashCode(of="id")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Event event;

    private String participantEmail;

    public Subscription(){

    }

    public Subscription(Long id, Event event, String participantEmail) {
        this.id = id;
        this.event = event;
        this.participantEmail = participantEmail;
    }

    public Subscription(Event event, String participantEmail) {
        this.event = event;
        this.participantEmail = participantEmail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getParticipantEmail() {
        return participantEmail;
    }

    public void setParticipantEmail(String participantEmail) {
        this.participantEmail = participantEmail;
    }
}
