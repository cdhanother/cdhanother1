/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceprinter;

/**
2     Describes a mailing address.  
3   */
 public class Address
{
   private String name;
   private String street;
   private String city;
   private String state;
   private String zip;
  
    /**
13      Constructs a mailing address.  
14     @param aName  the recipient name  
15     @param aStreet  the street  
16     @param aCity  the city  
17     @param aState  the two-letter state code  
18     @param aZip  the ZIP postal code  
19    */
 public Address(String aName, String aStreet,String aCity, String aState, String aZip)
 { 
    name = aName;
    street = aStreet;
    city = aCity;
    state = aState;
    zip = aZip;
   } 

 /**
31      Formats the address.  
32     @return  the address as a string with three lines  
33    */
public String format()
{ 
   return name + "\n" + street + "\n"      + city + ", " + state + " " + zip;
}
}
