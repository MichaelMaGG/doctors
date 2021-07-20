package nz.co.doctors.model;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String userName;
    private String email;
    private String password;
    private String name;
    private Integer age;
    private Gender gender;
    private String address;
    private String birthday;
    private String phoneNumber;
    private EmergencyContactor emergencyContactor;

}
