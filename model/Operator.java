package model;

public class Operator extends BaseModel{
    private String name;
    private String empId;
    private String emailId;
    private String phoneNumber;

    public Operator(String name, String empId, String emailId, String phoneNumber) {
        this.name = name;
        this.empId = empId;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
