package ru.halcyon.meetingease.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "agents")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agent extends BaseModel {
    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "photo")
    private String photo;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "agent")
    @JsonBackReference
    private List<Meeting> meetings;
}
