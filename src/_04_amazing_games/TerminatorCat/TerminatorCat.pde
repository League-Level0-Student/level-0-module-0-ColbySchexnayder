// 1. Drag and drop an image of a cat onto this sketch
//    a. First find an image of a cat with BIG eyes(use google to search)
//    b. Right click on the image and select 'Save image As'
//    c. Rename the image something short (e.g. cat.jpg)
//    d. Save the image to your computer's desktop
//    e. Drag and drop the image anywhere on this sketch


// This line of code creates a variable to hold your faccate picture
// You will use it later.
PImage cat;
int x=118;
int y=185;

void setup() {
  cat = loadImage("cat.jpg");
  size(500, 500);
  cat.resize(500, 500);
  background(cat);
}

void draw() {

  // 6. WHERE IS THE EYE? This code prints the x and y locations of the mouse when you click.
  //    You can use this to find the x and y for the center of the cat's eyes.
  if (mousePressed) {
    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
  }

  noStroke();
  fill(255, 0, 0);

  ellipse(x, y, 175, 175);
  ellipse(x+256, y, 175, 175);
  // Run the program to make sure it is in the right place and is the right size.
  
  if (y > height){
    background(cat);
    x = 118;
    y = 185;
    
  }
}

// 11.  LASER BEAM.  This code will make your ellipse move down and to the right when you press 
//      the space bar. Run the program to test it.
//      If you want it to move to the left, change to x-1=.
void keyPressed() {
  x+=10;
  y+=10;

  // 12.  If you want them to go faster, add more than one each time the key is pressed
}


//13.   Now make the cat shoot lasers from the other eye.
//      You will need to click the mouse on the other eye to figure our where to draw the other circle
//      Use offsets from the other eye so that you don’t need to make a second set of coordinates.
//      e.g. ellipse(x+220, y-50, 50, 50);

//14.  Set the laser back to the beginning when it goes off the screen.
//     You will need  an if statement to check when x > width 
//     Then set x and y back to their original values and re-draw the cat
//     background(cat);
