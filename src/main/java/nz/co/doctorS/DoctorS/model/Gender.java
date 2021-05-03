package nz.co.doctorS.DoctorS.model;

import lombok.Getter;

@Getter
public enum Gender {

    MALE(0, "Male"),
    FEMALE(1, "Female"),
    OTHER(99, "Other");

    private int code;
    private String gender;

    Gender(int code, String gender) {
        this.code = code;
        this.gender = gender;
    }

}
