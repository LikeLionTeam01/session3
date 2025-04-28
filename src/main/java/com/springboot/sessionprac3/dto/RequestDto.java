package com.springboot.sessionprac3.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RequestDto {
    private String name;
    private String address;
    private String number;
    private String menu;
    private int price;


    public String toString() {
        return "RequestDto(name=" + this.getName() + ", address=" + this.getAddress() + ", number=" + this.getNumber() + ", menu=" + this.getMenu() + ", price=" + this.getPrice() + ")";
    }
}
