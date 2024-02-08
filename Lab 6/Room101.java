
 public class Room101{ 

    private double length; 
  
    private double width; 
     
    public Room101(double aLength, double aWidth){ 
      length = aLength; 
      width = aWidth; 
    } 
    

    public double getLength(){ 
      return length; 
    } 

    public double getWidth(){ 
      return width; 
    } 
   
    public void setLength(double aLength){ 
      length = aLength; 
    } 
    
 
    public void setWidth(double aWidth){ 
      width = aWidth; 
    } 
    
    public double calculateArea(){ 
      return length * width; 
    } 
    
   
    public String toString(){ 
      String str = "Length is " + getLength() 
        + " , Width is " + getWidth() 
        + " and Area is " 
        + calculateArea(); 
      return str;
    } 
    
    
  } 
  
