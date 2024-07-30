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



