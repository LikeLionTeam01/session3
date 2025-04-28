package com.springboot.sessionprac3.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ChangeNameRequestDto {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "ChangeNameRequestDto(id=" + this.getId() + ", name=" + this.getName() + ")";
    }
}
