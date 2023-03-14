package com.example.paddleocrlib;

public class BaseResult 
{

     private boolean passport= false;
     private boolean africaCard = false;
     private boolean zimbabwe = false;

     public boolean isPassport() {
          return passport;
     }

     public void setPassport(boolean passport) {
          this.passport = passport;
     }

     public boolean isAfricaCard() {
          return africaCard;
     }

     public void setAfricaCard(boolean africaCard) {
          this.africaCard = africaCard;
     }

     public boolean isZimbabwe() {
          return zimbabwe;
     }

     public void setZimbabwe(boolean zimbabwe) {
          this.zimbabwe = zimbabwe;
     }

     private String surname = ""  ;
     private String idNumber = "";
     String dateOfBirth = "" ;

     private String sex = "" ;
     private String nationality= "" ;

     public String getSurname() {
          return surname;
     }

     public void setSurname(String surname) {
          this.surname = surname;
     }

     public String getIdNumber() {
          return idNumber;
     }

     public void setIdNumber(String idNumber) {
          this.idNumber = idNumber;
     }

     public String getDateOfBirth() {
          return dateOfBirth;
     }

     public void setDateOfBirth(String dateOfBirth) {
          this.dateOfBirth = dateOfBirth;
     }

     public String getSex() {
          return sex;
     }

     public void setSex(String sex) {
          this.sex = sex;
     }

     public String getNationality() {
          return nationality;
     }

     public void setNationality(String nationality) {
          this.nationality = nationality;
     }

     public String getBirthCountry() {
          return birthCountry;
     }

     public void setBirthCountry(String birthCountry) {
          this.birthCountry = birthCountry;
     }

     public String getStatus() {
          return status;
     }

     public void setStatus(String status) {
          this.status = status;
     }

     public String getSecondaryIdentifier() {
          return secondaryIdentifier;
     }

     public void setSecondaryIdentifier(String secondaryIdentifier) {
          this.secondaryIdentifier = secondaryIdentifier;
     }

     public String getPrimaryIdentifier() {
          return primaryIdentifier;
     }

     public void setPrimaryIdentifier(String primaryIdentifier) {
          this.primaryIdentifier = primaryIdentifier;
     }

     public String getLastName() {
          return lastName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public String getVillageOfOrigin() {
          return villageOfOrigin;
     }

     public void setVillageOfOrigin(String villageOfOrigin) {
          this.villageOfOrigin = villageOfOrigin;
     }

     public String getPlaceOfBirth() {
          return placeOfBirth;
     }

     public void setPlaceOfBirth(String placeOfBirth) {
          this.placeOfBirth = placeOfBirth;
     }

     public String getDateOfIssue() {
          return dateOfIssue;
     }

     public void setDateOfIssue(String dateOfIssue) {
          this.dateOfIssue = dateOfIssue;
     }

     private String birthCountry  = "" ;
     private String status = "" ;
     private String secondaryIdentifier = "";
     private String primaryIdentifier = "";



     private  String lastName = "";

     private String villageOfOrigin = "";
     private String placeOfBirth = "";
     private String dateOfIssue = "";
















}
