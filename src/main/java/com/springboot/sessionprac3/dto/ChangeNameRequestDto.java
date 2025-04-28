package com.springboot.sessionprac3.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class ChangeNameRequestDto {

    private Long id;
    private String name;


    @Override
    public String toString() {
        return "ChangeNameRequestDto(id=" + this.getId() + ", name=" + this.getName() + ")";
    }
}
