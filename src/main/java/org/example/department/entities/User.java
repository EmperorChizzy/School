package org.example.department.entities;

import org.example.department.enums.Behaviour;

import java.util.Objects;
import java.util.Set;

public abstract class User {
    private Address address;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private Long phoneNumber;
    private Behaviour behaviour;

    public User(Address address, String firstName, String lastName, int age, String gender, Long phoneNumber, Behaviour behaviour) {
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.behaviour = behaviour;
    }

    public User(){
    }
    public User(String firstName, String lastName, Long phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Behaviour getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(Behaviour behaviour) {
        this.behaviour = behaviour;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(address, user.address) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(gender, user.gender) && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(behaviour, user.behaviour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, firstName, lastName, age, gender, phoneNumber,behaviour);
    }

    @Override
    public String toString() {
        return "User{" +
                "address=" + address +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber +'\'' +
                ",behaviour=" + behaviour +
                '}';
    }
}