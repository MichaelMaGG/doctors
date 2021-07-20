package nz.co.doctorS.DoctorS.model;

import lombok.Data;

@Data
public class EmergencyContactor {

    private String name;
    private Gender gender;
    private String address;
    private String phoneNumber;

}
