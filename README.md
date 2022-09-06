# inventorySales

The ideas of abstract classes and interfaces can be difficult. Both concepts are used to enforce behavior in a project. That is, any class that inherits from an abstract class must implement whatever was abstract in that class. Any class that implements an interface has access to the variables declared there, and if there are any methods, they must be implemented in that class. You may write a class or interface for a specific project, so you can make sure to include whatever methods that need to be implemented. If your class or interface is used in another project, how do you ensure that the other project will have the appropriate methods? Abstract methods and methods in an interface require some code before the compiler can execute, thus enforcing certain behaviors.

To see this in action, this simple project about inventory and sales of items in inventory will have an abstract method, which makes the class abstract, and an interface with a method. There are 2 types of inventory, food and non-food (other items), and each is taxed at a different rate. 

Start with the interface, which specifies sales tax. This tax interface has 2 variables for tax rates in it -- 4% for food, 10% for other items. These can be declared as constants in the tax interface, and when the interface is implemented in the inventory classes, those values are available. What does this provide? You might consider these to be global values, declared in one place and used in many. If the tax rate changes, you only have to edit the value for those variables in the interface, and all methods will use that new rate. In addition, this tax interface will have a method to make sure that tax is calculated for each sale. This is an example of enforcing behavior. If the method to calculate tax is declare in an interface, it is the header only, no content or code -- that is left up to the classes and methods that use this interface. Because the method is declared in the interface, it must also be declared in the classes that implement the interface, which enforces the behavior that sales tax must be calculated. It becomes much harder to "forget" to calculate the tax if the method to calculate it is required this way.

Create an interface in your project. Click on File, then New File, select Java Interface, which is just below Java Class. Name it Tax -- use an initial uppercase letter, as you do with classes. Declare 2 constants, one for food tax at 4% or .04, one for non-food or item tax at 10% or .10. Write the header for a method to calculate the tax, which needs a double as a parameter and returns a double. End this header with a semicolon -- this declares the method but doesn't flesh it out, which must be done in classes that implement this interface before the project can compile.

Create an Inventory class which is the super class for the 2 types of inventory. This class has instance variables for the inventory ID (integer), name (string), quantity on hand (integer), and unit cost (double). The constructor for the class includes all 4 instance variables as parameters. Write a method to display the item, as seen in the images below, making sure to display money values correctly.

There will be 2 other classes, sub classes to the Inventory class. One is Food, one is OtherItem. The only difference in these classes is they use different tax rates. You might question why there are 3 classes to describe inventory when the only difference is that tax rate. You could have a field or fields in Inventory that specify if the item is Food or Other, which would work in this very simple example. But in more realistic projects, food items would have a lot of instance variables that don't describe non-food items, and non-food items would have a lot of instance variables not appropriate for food items. To focus on abstract methods and interfaces, we are leaving out all of those specific variables and including only the 4 that are common to both sub classes. 

Create a Food class that inherits from the Inventory class. It has no additional instance variables. Its constructor needs 4 parameters, and all of them will be sent to the super class constructor. 

Create a class for OtherItem that inherits from the Inventory class. It looks exactly the same as the Food class so far.

There are 3 classes in this project. Where should you implement the Tax interface? If only one of the sub classes needed the variables and methods of this interface, then that sub class would implement it. In this case, both the Food class and the OtherItem class could implement it. If the super class, Inventory, implements the interface, then both sub classes will inherit that implementation. It is another way to enforce behavior to implement the interface at the super class level, which will require code in the sub classes for the interface method(s). So implement the Tax interface in the Inventory class.

Look at the Food and OtherItem classes -- they won't compile at this point. The Tax interface has a method header in it to calculate the tax, which must be completed -- its code must be written to satisfy the requirements of interfaces. You could write code for that method in the Inventory class -- but the sub classes need to use different tax rates. So the best place to implement the method is in each sub class. Write a method to calculate the tax in the Food class and in the OtherItem class. The specifications of the method are in the interface -- it has a name, it needs a double for a parameter, and it returns a double. The code you write in the sub classes can do whatever work is needed for each class, as long as it matches that header in the interface. 

In the sub classes, add a method for calculating the tax, which returns the price of a purchase multiplied by the appropriate tax. This method returns the amount of tax, doesn't add to a total cost or change inventory levels, just calculate tax for that kind of inventory object.

Note that it is possible to have multiple interfaces in a project. If there were two interfaces, like FedTax and StateTax, you could implement both in a class with "implements FedTax, StateTax" -- put a comma between them.

Go back to the Inventory class. You could write a method to calculate the cost of an inventory object. That method could be inherited in sub classes. But you may not be able to say that the calculation is exactly the same in every sub class. The way to require a method in sub classes is to declare its header in the parent class and make it abstract. Just like declaring a method in an interface, you write the header line of the method and end it with a semicolon -- no code in the body of this method. Add the word "abstract", usually after "public" and before the return type. If this method that must be written in sub classes is named "calcCost", the header might be:

public abstract double calcCost(int qty);

Because this method is abstract, the entire class must be marked as abstract. Add that word in the class header, like this:

public abstract class Inventory implements Tax {

Now there is a method named calcCost in the Inventory class that is abstract. That means the sub classes, Food and OtherItem, must have methods that provide the code for calcCost. Go to each sub class, which is not able to compile without handling the abstract method. Add the method, which must have the same header but without the word "abstract". In this simple project, again, these methods are identical in the two sub classes, but in reality, they could be very different. In this project, check if the quantity of the purchase is less than or equal to the quantity on hand. If the sale quantity is valid, determine the price by multiplying the quantity of the purchase and the unit cost. Calculate the tax by calling the calcTax method that was required by the interface. Add that tax to the price. Subtract the quantity of the sale from the quantity on hand. Return the price. If the quantity of the purchase is invalid, if it is greater than the quantity on hand, print out an error message and return a price of zero.

At this point, you should have:

an interface for the tax rates, which includes a method to calculate tax
a class for inventory, which has 4 instance variables, a 4-parameter constructor, a display method, and an abstract method for calculating the cost of a sale, which requires that the whole class is abstract, and it implements the Tax interface
a sub class for Food objects that inherits from the Inventory class, which has code for the method to calculate tax (required from the interface) and for the method to calculate the cost of a sale (required to complete the abstract method in the Inventory class)
a sub class for OtherItem objects that is basically identical to the Food class, except it uses a different tax rate in the method to calculate the tax
Now work on the main method. Create an Array List of Inventory objects. Add anonymous Food objects and OtherItem objects to it, 2 of each type. Using a For-Each loop, print out the item, ask the user how many they want to purchase, get the price for that sale, and print out the item to see that the quantity on hand has changed.

Here is the sample session. The first sale for each type of inventory is more than the quantity on hand, so it prints the error message. If there is enough to sell, it prints out the price for that quantity plus tax, and displays the new listing.

For this sample, the anonymous objects are:

Food item #1234, "lg soda", quantity on hand = 50, unit cost = $2.50
Food item #2345, "donuts", quantity on hand = 30, unit cost = $5.00
OtherItem #9876, "metal straw", quantity on hand = 30, unit cost = $1.50
OtherItem #8765, "sunglasses", quantity on hand = 30, unit cost = $4.75
Run the project once to match the sample session. Change all of the details of the 4 inventory items, and run the project again, making sure all sales are valid. Take screenshots of both runs. 

 

Submission: the specified screenshots and the root folder for the project

 

Pay careful attention to the rubric for this assignment.

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.

== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project. I have a [website](https://bellKevin.me) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the [Give up GitHub](https://GiveUpGitHub.org) campaign 
from [the Software Freedom Conservancy](https://sfconservancy.org) to understand some of the reasons why GitHub is not 
a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[email me](**bellKevin@pm.me**) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
