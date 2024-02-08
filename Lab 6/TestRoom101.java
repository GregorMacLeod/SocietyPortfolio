

public class TestRoom101{ 
  
    public static void main(String [] args){ 
 
      Room101 ob1 = new Room101(10.0,5.5); 
      
     
      System.out.println("Length is " + ob1.getLength()); 
      System.out.println("Width is " + ob1.getWidth()); 
      

      ob1.setLength(40.0); 
      System.out.println("Length is " + ob1.getLength()); 
      ob1.setWidth(5.5); 
      System.out.println("Width is " + ob1.getWidth()); 
      

      System.out.println("Area is " + ob1.calculateArea()); 
      

      System.out.println(ob1.toString()); 
      
    }  
  }  
    

