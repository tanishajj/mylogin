package com.example.mylogin;

public class Data {
    public static final String TABLE_NAME = "Student";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_FIRSTNAME = "firstname";
    public static final String COLUMN_LASTNAME = "lastname";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_PHONE = "phone no";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_FINALPASSWORD = "confirm password";
    public static final String COLUMN_COUNTRY = "country";
    public static final String COLUMN_STATE = "state";
    public static final String COLUMN_CITY = "city";

    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String password;
    private String finalpassword;
    private String country;
    private String state;
    private String city;

    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_FIRSTNAME + " TEXT,"
                    + COLUMN_LASTNAME + " TEXT, "
                    + COLUMN_EMAIL + " TEXT, "
                    + COLUMN_PHONE + " TEXT,"
                    + COLUMN_PASSWORD + " TEXT,"
                    + COLUMN_FINALPASSWORD + " TEXT, "
                    + COLUMN_COUNTRY + " TEXT,"
                    + COLUMN_STATE + " TEXT, "
                    + COLUMN_CITY + " TEXT "
                    + ")";

    public Data() {
    }
    public Data(String id,String firstname,String lastname,String email,String phone,String password,String finalpassword,String country,String state,String city) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.finalpassword = finalpassword;
        this.country = country;
        this.state = state;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFinalpassword() {
        return finalpassword;
    }

    public void setFinalpassword(String finalpassword) {
        this.finalpassword = finalpassword;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
