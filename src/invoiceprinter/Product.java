/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceprinter;

/**
2           Describes a product with a description and a price.   
3    */
public  class  Product
{  
 private  String  description;
 private  double  price;
  
  /**
10                 Constructs a product from a description and a price.   
11                @param  aDescription   the product description   
12                @param  aPrice   the product price   
13          */
 public  Product(String  aDescription,  double  aPrice)
{  
   description  =  aDescription;
   price  =  aPrice;
 }
         
  /**
21                 Gets the product description.   
22                @return   the description   
23          */
public  String  getDescription()
{  
  return  description;
}
  
 /**
30                 Gets the product price.   
31                @return   the unit price   
32          */
public double getPrice()
{
   return  price;
}
}