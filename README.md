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

#### - on lines 93 to 96 - created a form in order to set up a POST request for the "buyProduct" URL endpoint using a link expression. 

#### - on lines 94 - Created an input tag in order to pass the product's Id while also keeping it hidden from the end users.

#### - on lines 95 - Created the green "Buy Now" button.

#### under BuyProductController.java

#### created the file "BuyProductController.java" controller class

#### - on line 16 - Annotated and created a private variable called productRepository with the annotation Autowired.

#### - on lines 19 to 35 - Created a buyProduct handler method that handles post requests (with @PostMapping) that checks if a product is found within the product repository. If it is, it then checks if the product's inventory is in stock. If true, it decrements the product's inventory by one after a purchase is made, saves it to the repository, and outputs a successful purchase message. Otherwise it displays a failed purchase message. This method redirects back to the "mainscreen.html" view.



