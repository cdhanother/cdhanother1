/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceprinter;

/**
2         Describes a quantity of an article to purchase.  
3   */
public  class  LineItem
{  
 private  int  quantity;
 private  Product theProduct;
 
   /**
10               Constructs an item from the product and quantity.  
11              @param  aProduct   the product  
12              @param  aQuantity   the item quantity  
13        */
 public  LineItem(Product  aProduct,  int  aQuantity)
{  
   theProduct  =  aProduct;
   quantity  =  aQuantity;
  
 }
  /**
21               Computes the total cost of this line item.  
22              @return   the total price  
23        */
public  double  getTotalPrice()
{  
  ;
    return  theProduct.getPrice()  *  quantity;
 }
      
/**
30               Formats this item.  
31              @return   a formatted string of this line item  
32        */
public  String  format()
{  
 return  String.format("%-30s%8.2f%5d%8.2f",   theProduct.getDescription(),  theProduct.getPrice(),  quantity,  getTotalPrice());
}
  }
