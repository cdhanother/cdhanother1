/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceprinter;

import  java.util.ArrayList;
  
/**
4           Describes an invoice for a set of purchased products.   
5    */
public  class  Invoice
{    
  private  Address  billingAddress;
  private  ArrayList<LineItem>  items;
  
 /**
12                 Constructs an invoice.   
13                @param  anAddress   the billing address   
14          */
 public  Invoice(Address  anAddress)
{    
    items  =  new  ArrayList<LineItem>();
    billingAddress  =  anAddress;
 }
/**
22                 Adds a charge for a product to this invoice.   
23                @param  aProduct   the product that the customer ordered   
24                @param  quantity   the quantity of the product   
25          */
public  void  add(Product  aProduct,  int  quantity)
{    
  LineItem  anItem  =  new  LineItem(aProduct,  quantity);
  items.add(anItem);
 }
 
/**
33                 Formats the invoice.   
34                @return   the formatted invoice   
35          */
public  String  format()
{  
 String  r  =  "                                          I  N  V  O  I  C  E\n\n" 
         +billingAddress.format()
          +  String.format("\n\n%-30s%8s%5s%8s\n","Description",  "Price",  "Qty",  "Total");
 
 for  (LineItem  item  :  items)
 {  
   r  =  r  +  item.format()  +  "\n";
 }
  
   r  =  r  +  String.format("\nAMOUNT  DUE:  $%8.2f",  getAmountDue());
  
  return  r;
 }
  /**
54                 Computes the total amount due.   
55                @return   the amount due   
56          */
private  double  getAmountDue()
{  
   double  amountDue  =  0;
   for  (LineItem  item  :  items)
   {  
     amountDue  =  amountDue  +  item.getTotalPrice();
   }
   return  amountDue;
  }
 }

