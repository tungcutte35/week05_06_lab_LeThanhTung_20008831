package com.example.week05_06_lab_lethanhtung_20008831.backend.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Data
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private long addId;
    private String city;
    private CountryCode country;
    private String street;
    private String zipCode;
    private String number;



    public Address(String number, String street, String city, String zipcode, CountryCode countryCode) {
        this.number = number;
        this.country = countryCode;
        this.zipCode = zipcode;
        this.city = city;
        this.street = street;
    }
}
