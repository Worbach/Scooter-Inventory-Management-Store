# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS


### C. Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

#### under mainscreen.html

#### - on line 21 - changed the title tag to "My Scooter Shop" to reflect the website's title tab when viewing the site. 
#### - on line 26 - changed the h1 tag to "Scooty's Electric Scooters Shop" to reflect the shop's name.
#### - on line 28 - changed the h2 tag from "Parts" to "Scooty's Scooters Parts" to better reflect the shop's current custom parts lineup.
#### - on lines 42 and 43 - changed the column headers of the Parts table from "Name" and "Price" to "Part Name" and "Part Price" respectively to help describe the table's contents more.
#### - on line 60 - changed the h2 tag from "Products" to "Scooty's Scooters Products" to better reflect the shop's current lineup of products.
#### - on lines 78 and 79 - changed the column headers of the Product table from "Name" and "Price" to "Product Name" and "Product Price" respectively to help describe the table's contents more.


### D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

#### under about.html

#### - created the file "about.html"
#### - on lines 13 to 15 - added a navigational element that links back to "mainscreen.html".
#### - on line 19  - added a title tag called "About Us" that explains the webpage's title tab when viewing the webpage.
#### - on line 21 to 96 - added content in the body tag that explains what the company "Scooty Electric Scooters" is all about.

#### under AboutController.java

#### - created the file "AboutController.java"
#### - on line 7 - created a controller annotation
#### - on line 8 to 13 - created the controller class and handler method that receives HTTP GET requests and maps them to the template URL "localhost:8080/about.html".

#### under mainscreen.html

#### - on lines 15 to 17 - added a navigational element that links to "about.html".

### E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.

#### under BootStrapData.java

#### - on lines 45 to 46 - created the variables "partsCount" and "productsCount" that count the number of parts and products held in their respective repositories.

#### - on lines 48 to 99 - created an if statement that checks if both partsCount and productsCount variables are empty and populates the parts and products tables in the mainscreen view with sample data (5 sample parts - split between 3 outsourced parts and 2 in-house parts - and 5 sample products) in their respective tables, if true.

#### - on lines 101 to 112 - commented out example code that prints to the terminal.

### F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

#### under mainscreen.html

#### - on line 54 - changed the color of the button designated for deleting parts to red.

#### - on line 75 - added a div container that displays a purchase message above the product table after clicking the "Buy Now" button on a product.

#### - on line 91 - changed the color of the button designated for deleting products to red.

#### - on line 93 to 96 - created a form in order to set up a POST request for the "buyProduct" URL endpoint using a link expression. 

#### - on line 94 - Created an input tag in order to pass the product's Id while also keeping it hidden from the end users.

#### - on line 95 - Created the green "Buy Now" button.

#### under BuyProductController.java

#### created the file "BuyProductController.java" controller class

#### - on line 16 - Annotated and created a private variable called productRepository with the annotation Autowired.

#### - on lines 19 to 35 - Created a buyProduct handler method that handles post requests (with @PostMapping) that checks if a product is found within the product repository. If it is, it then checks if the product's inventory is in stock. If true, it decrements the product's inventory by one after a purchase is made, saves it to the repository, and outputs a successful purchase message. Otherwise it displays a failed purchase message. This method redirects back to the "mainscreen.html" view.


### G: In this step you have to add max and min inventory fields for parts, modify your sample inventory to show the max and min inventory, and update both the part forms to have additional inputs for the max and min inventory. Then they want you to rename the database file, and add code that enforces that the inventory is between the max and min values. First go to Part.java, and add the minInv and maxInv fields (name em whatever you want), you can also use the same '@Min' annotation as the other fields to enforce that it cannot be below zero, and have a message with it. Be sure to also add a new constructor that includes these new fields, and make getter and setter functions for them. Next go back to BootStrapData.java and add max and min inventory values for your sample inventory parts. Then for both InhousePartForm and OutsourcedPartForm, add text inputs for both max and min inventory. You can probably figure out how to put it in there just by seeing how the other fields are put in there and copying it but changing as necessary. Then rename the database file, it will look something like this spring-boot-h2-db.mv.db you can find it in file explorer or finder and right click it and rename it to whatever you like. In the application.properties file, you will need to rename it there as well and make sure they match. Next I would create a method in Part.java that checks if an inventory is valid, by returning true if the inventory falls between the max and min values, and returns false otherwise. For both inhouse and outsourced part controller files, add logic that uses the isInvValid method you created to generate an error message if the inventory is outside of range. I used BindingResult to reject bad values with a message, look into this for the error messaging. Once this is working as expected and desired, commit and push with a message.

#### under Part.java

#### - on lines 32 to 35 - Created two new fields "minInv" and "maxInv" and set their min values to 0 using the @Min annotation.

#### - on line 45 - Created a new full constructor containing all the fields including the updated minInv and maxInv fields.

#### - on line 95 - Created the green "Buy Now" button.

#### - on lines 80 to 91 - Created new setters and getters for minInv.

#### - on lines 94 to 99 - Created new setters and getters for maxInv.

#### - on lines 110 to 112 - Created a Boolean method "isInvValid()" that checks to see if the inventory value entered by the user when adding a new part (in-house or outsourced) is between the minimum and maximum value range set by the user.

#### under BootstrapData.java

#### - on lines 54 to 55 - Modified sample data for "outPartOne" object to include a minimum value(5) and maximum value(10).

#### - on lines 64 to 65 - Modified sample data for "outPartTwo" object to include a minimum value(0) and maximum value(20).

#### - on lines 74 to 75 - Modified sample data for "outPartThree" to include a minimum value(0) and maximum value(30).

#### - on lines 84 to 85 - Modified sample data for "inPartOne" to include a minimum value(1) and maximum value(40).

#### - on lines 84 to 85 - Modified sample data for "inPartTwo" to include a minimum value(0) and maximum value(50).

#### under InhousePartForm.html

#### - on lines 24 to 28 - Added text inputs for both minimum and maximum inventory inside the form.

#### under OutsourcedPartForm.html

#### - on lines 25 to 29 - Added text inputs for both minimum and maximum inventory inside the form.

#### under spring-boot-h2-db102

#### - changed the database's name to "spring-boot-h2-db103".

#### under application.properties

#### - on line 6 - modified the "spring.datasource.url=jdbc:h2:file:~/spring-boot-h2-db102" to "spring.datasource.url=jdbc:h2:file:~/spring-boot-h2-db103"

#### under AddInhousePartController.java

#### - on lines 45 to 48 - created an if statement that checks if the added in-house part's inventory is valid (falls within the range of min value and max value set) and if it returns false, throws the error "Inventory must be between min and max values".

#### under AddOutsourcedPartController.java

#### - on lines 46 to 49 - created an if statement that checks if the added outsourced part's inventory is valid (falls within the range of min value and max value set) and if it returns false, throws the error "Inventory must be between min and max values".

### H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

#### under AddInhousePartController.java

#### on lines 45 to 50 - modified and expanded on the previous if/else statement to return a more specific error message when the part's inventory is below the set minimum limit or above the set maximum limit respectively. 

#### under AddOutsourcedPartController.java

#### on lines 46 to 51 - modified and expanded on the previous if/else statement to return a more specific error message when the part's inventory is below the set minimum limit or above the set maximum limit respectively.

#### under EnufPartsValidator.java

#### on line 36 - added an if statement that checks if a part's inventory dips below the minimum inventory limit for that part while creating a product using that part. If that's true, the method "isValid()" returns false and the user is prompted with an error stating there is no more inventory for that part(s) to be added to the product.

### I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

#### under PartTest.java

#### on lines 152 to 160 - added a unit test called "SetMinInvTest()" that tests if the setMinInv() method properly stores a minimum number inside the in-house and outsourced part objects. 

#### on lines 162 to 169 - added a unit test called "SetMaxInvTest()" that tests if the setMaxInv() method properly stores a maximum number inside the in-house and outsourced part objects.

#### on lines 172 to 181 - added a unit test called "testInvWithinRange()" that uses the isInvValid() method to test if the inventory number set inside the in-house part object and the outsourced part object stores a number inside the range of expected minimum and maximum inventory numbers.

#### on lines 183 to 193 - added a unit test called "testInvOutsideMinRange()" that uses the isInvValid() method to test if the inventory number set inside the in-house part object and the outsourced part object stores a number outside the range of the expected minimum inventory number.

#### on lines 195 to 205 - added a unit test called "testInvOutsideMaxRange()" that uses the isInvValid() method to test if the inventory number set inside the in-house part object and the outsourced part object stores a number outside the range of the expected maximum inventory number.

### J. Remove the class files for any unused validators in order to clean your code.

#### under DeletePartValidator.java

#### - deleted the "DeletePartValidator.java" file as it had no usages within the application.

### Revision #1

#### H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

Evaluator's comments regarding section H on the rubric:
The submission correctly contains the appropriate fields necessary to modify the details of both the parts and products. 
The submission is not fully developed as the expected validation for the associated parts component of the product details page was not observed.

### under ValidEnufParts.java

#### - on line 20 - modified the string to display a more error-specific message - "Adding/updating this product will cause part inventory to fall below minimum. Restock parts' inventory first." when the overridden method "isValid()" inside "EnuffPartsValidator.java" returns false.

### under EnuffPartsValidator.java

#### - on line 36 - modified the code by removing the extra unneeded parathesis, cleaning up the code a bit. 

### under productForm.html

#### - on lines 74 to 76 - uncommented the footer tag to include a link back to "mainscreen.html" in case user runs out of parts to build the product, instead of having to navigate back to "mainscreen.html" by clicking on the browser's back button or having to remove pre-existing parts from the product's form page in order to workaround successfully submitting the form again and navigating back to the "mainscreen.html".

### under BoostrapData.java

#### - on line 84 - changed the min inventory to 0 for the sample data to match the rest of the sample data sets for easier validation testing of maximum / minimum values / adding or updating products lowering parts inventory past the minimum number of parts and displaying appropriate error messages for each.

#### Included a new repository graph with my submission along with an updated zip file for the entire project.

Note to evaluator: 
Just as it is listed in the Shop Inventory Management User Guide.pdf provided - pages 6-8:
My updated submission should show the expected validation for the associated parts component of the product details page when:
1. The new product is saved to the product list, always starting with an inventory of 0.
2. After returning to the main screen, clicking on the new product's "update" button brings you back to the product form.
3. A user can then start building the product by clicking on the "add" button inside the "Available Parts" table.
4. This moves the parts over to the "Associated Parts" table that will be used to build the product.
5. Before submitting, updating the inventory amount will reflect how many products will be built using the same amount of available parts. Ex: if the number of products in stock is four, it will decrement the number of parts in stock for all the associated parts by four.
5. If there aren't any more available parts to build the new product, an error message for low inventory is generated since the part inventory is below the minimum set amount for that part or parts.

#### Adding/Removing Parts to/from a product alone does not impact the inventory count of the parts as the previously specified product is already complete and on the shelves. You still must increase the inventory count of the product and save when ready to begin assembly of the modified product, and thus reducing the stock counts of the parts associated with it.

#### To build more products, update the inventory of the products. This will remove from the parts associated with the product the number of parts equal to the current inventory of products minus the prior inventory of products. In other words, it will remove only the number of parts used to make the additional products.

#### Lowering number of products in stock does not increase the number of parts. The products aren’t disassembled and used for inventory- instead this reflects the products have been sold.

My submission should demonstrate all of the above.

I haven't made any changes to the outsourced parts or in-house parts controllers so when invalid information is entered, the appropriate error messages will still appear below the field as they did beforehand.  
