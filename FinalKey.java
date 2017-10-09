package KeyWord;
//package : Package is name that organizes a set of related classes and interfaces similar to 
//different folders on my computer
public class FinalKey {
	//public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		 dailyclass dailyclass=new dailyclass(); //new dailyclass                          
         lateclass lateclass =new lateclass(); //new lateclass
     
         dailyclass.display(); //displays dailyclass
         lateclass.display(); //displays lateclass                   
        }
}
// if i have taken the weeks class as final and that class cannot be extended another subclass because we declared it has final                                  

  class dailyclass{                                        
	  //here I'm taking the sub class name as FinalKey
      //here i am showing the use of a final keyword in the variables
   
 	  final int Time =10;                        
 	  //and i have taken an integer variable  as days =7 and i declared it as final 
 	 public  void display(){  
 		//public : members which can access as public,public members are visible to all other classes.
     	//void: it is void if the method does not return a value.	    	
 		System.out.println("Daily class is at"+Time);   
 		 //system : system is a class in java language.lang package
	  	//out : out is the static member of system class.It's type PrintStream
	  	//println: which is used to print the output.
    	
  }
  

}
  class lateclass extends dailyclass{//extends weeks
  	 
      public final void display (){     
    	//public : members which can access as public,public members are visible to all other classes.
    	//void: it is void if the method does not return a value.
  			    			
    	  System.out.println("today class will be late");  
    	//system : system is a class in java language.lang package
  	  	//out : out is the static member of system class.It's type PrintStream
  	  	//println: which is used to print the output.
      
      }
  }