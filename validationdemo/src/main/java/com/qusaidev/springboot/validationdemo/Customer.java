package com.qusaidev.springboot.validationdemo;

import com.qusaidev.springboot.validationdemo.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    @Pattern(regexp = "^[a-zA-Z \\-]+$", message = "digits are not allowed")
    private String lastName;

    @Min(value = 0, message = "must be greater than or equal to 0")
    @Max(value = 10, message = "must be less than or equal to 10")
    @NotNull(message = "is required")
    private Integer freePasses;

    @CourseCode
    private String courseCode;

    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
