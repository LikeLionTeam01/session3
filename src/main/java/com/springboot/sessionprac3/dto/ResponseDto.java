package com.springboot.sessionprac3.dto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
    private Long id;
    private String name;
    private String address;
    private String number;
    private String menu;
    private int price;

    private Long getId(){
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getNumber() {
        return number;
    }
    public String getMenu() {
        return menu;
    }
    public int getPrice() {
        return price;
    }

    public String toString() {
        return "RequestDto(id=" + this.getId() + "name=" + this.getName() + "adress=" + this.getAddress() + "number=" + this.getNumber() + "menu=" + this.getMenu() + "price=" + this.getPrice() + ")";
    }

    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public void setMenu(String menu){
        this.menu = menu;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
