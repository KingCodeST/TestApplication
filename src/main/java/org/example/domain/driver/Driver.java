//package org.example.domain.driver;
//
//import javax.persistence.*;
//
//
//@Entity
//public class Driver {
//
//    @Id
//    private String driverId;
//    private String fname;
//    private String lname;
//    private int age;
//    private double amt;
//
//    public Driver(){};
//
//    private Driver(Builder build){
//        this.driverId =build.driverId;
//        this.age =build.age;
//        this.amt =build.amt;
//        this.fname =build.fname;
//        this.lname=build.lname;
//    }
//
//    public String getDriverId() {
//        return driverId;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public double getAmt() {
//        return amt;
//    }
//
//    public String getFname() {
//        return fname;
//    }
//
//    public String getLname() {
//        return lname;
//    }
//
//    public static class Builder{
//        private String driverId;
//        private int age;
//        private double amt;
//        private String fname;
//        private String lname;
//
//     public Builder setFname(String fname)
//     {
//         this.fname =fname;
//         return this;
//     }
//
//     public Builder setLname(String lname)
//     {
//         this.lname =lname;
//         return this;
//     }
//
//     public Builder setDriverId(String driverId)
//     {
//         this.driverId=driverId;
//         return this;
//     }
//
//     public Builder setAge(int age)
//     {
//         this.age =age;
//         return this;
//     }
//
//     public Builder setAmount(double amt)
//     {
//         this.amt =amt;
//         return this;
//     }
//
//     public Builder copy(Driver driver)
//     {
//         this.driverId=driver.driverId;
//         this.age =driver.age;
//         this.amt =driver.amt;
//         this.fname=driver.fname;
//         this.lname=driver.lname;
//         return this;
//     }
//
//     public Driver buid()
//     {
//         return new Driver(this);
//     }
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Driver driver = (Driver) o;
//        return age == driver.age &&
//                Double.compare(driver.amt, amt) == 0 &&
//                driverId.equals(driver.driverId);
//    }
//
//
//}
