package com.nutech.take_home_test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    String name;
    Date dateOfBirth;
    int nik;
    public String toString(){
        return "name:"+this.name+";date:"+Util.dateFormat().format(this.dateOfBirth) +";nik:"+this.nik;
    }
}
