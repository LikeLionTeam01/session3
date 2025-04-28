package com.springboot.sessionprac3.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {
    private String name;
    private String address;
    private String number;
    private String menu;
    private int price;

    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public String getNumber() {
        return this.number;
    }
    public String getMenu() {
        return this.menu;
    }
    public int getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setMenu(String menu) {
        this.menu = menu;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "RequestDto(name=" + this.getName() + "adress=" + this.getAddress() + "number=" + this.getNumber() + "menu=" + this.getMenu() + "price=" + this.getPrice() + ")";
    }
}
