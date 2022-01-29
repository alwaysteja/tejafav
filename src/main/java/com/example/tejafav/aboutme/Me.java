package com.example.tejafav.aboutme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.beans.BeanProperty;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
@Component
public class Me {
   String fullName;
  String name;
  LocalDate dob;
    long getAge(){
        return ChronoUnit.DAYS.between(dob, LocalDate.now())/365;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Me() {
        fullName="Teja Kumar Nutakki";
        name="Teja";
        dob=LocalDate.of(2000, Month.AUGUST,8);
    }
}
