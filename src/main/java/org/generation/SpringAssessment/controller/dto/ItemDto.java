package org.generation.SpringAssessment.controller.dto;

import java.time.LocalDate;

public class ItemDto {

    private String name;
    private String description;
    private LocalDate date;

    public ItemDto(String name, String description, LocalDate date) {

        this.name = name;
        this.description = description;
        this.date = date;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
