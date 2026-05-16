package com.example.tbs.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "train", schema = "karbs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trainId;

    private String trainNumber;
    private String trainName;
    private Integer totalSeatsPerCoach;
    private Integer numberOfCoaches;

    @Column(nullable = false, columnDefinition = "bigint default 100")
    private Long price = 100L;

    // Getters and Setters
    public Long getTrainId() {
        return trainId;
    }

    public void setTrainId(Long trainId) {
        this.trainId = trainId;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public Integer getTotalSeatsPerCoach() {
        return totalSeatsPerCoach;
    }

    public void setTotalSeatsPerCoach(Integer totalSeatsPerCoach) {
        this.totalSeatsPerCoach = totalSeatsPerCoach;
    }

    public Integer getNumberOfCoaches() {
        return numberOfCoaches;
    }

    public void setNumberOfCoaches(Integer numberOfCoaches) {
        this.numberOfCoaches = numberOfCoaches;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
