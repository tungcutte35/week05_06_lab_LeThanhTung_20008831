package com.example.week05_06_lab_lethanhtung_20008831;

import com.example.week05_06_lab_lethanhtung_20008831.backend.models.Address;
import com.example.week05_06_lab_lethanhtung_20008831.backend.models.Candidate;
import com.example.week05_06_lab_lethanhtung_20008831.backend.respositories.AddressRepository;
import com.example.week05_06_lab_lethanhtung_20008831.backend.respositories.CandidateRepository;
import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
public class Week0506LabLeThanhTung20008831Application {

    public static void main(String[] args) {
        SpringApplication.run(Week0506LabLeThanhTung20008831Application.class, args);
    }

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private AddressRepository addressRepository;

    //	@Bean
    CommandLineRunner initData(){
        return args -> {
            Random rnd =new Random();
            for (int i = 1; i < 1000; i++) {
                Address add = new Address(rnd.nextInt(1,1000)+"","Quang Trung","HCM",
                        rnd.nextInt(70000,80000)+"", CountryCode.VN );
                addressRepository.save(add);
                Candidate can=new Candidate("Name #"+i,
                        LocalDate.of(1998,rnd.nextInt(1,13),rnd.nextInt(1,29)),
                        rnd.nextLong(1111111111L,9999999999L)+"",
                        "email_"+i+"@gmail.com",add);
                candidateRepository.save(can);
                System.out.println("Added: " +can);
            }
        };
    }
}
