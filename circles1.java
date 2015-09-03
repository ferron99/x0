//// Wild circles #1.

// GLOBAL VARIABLES //
float x,y;

// Setup:  screen size, initialization. //
void setup() {
  size(1600, 900);        // Try changing the width & height.
  x=  width/2;
  y=  height/2;
}

void draw() {
  ellipse(x, y, 80, 80);
  ellipse(x+60, y+60, 40, 40);
  ellipse(x+90, y+90, 20, 20);
 
  // Move them???? //--              
  x=  x + 2;  y=  y + 1;
  // Insert BREAK here ^
  // to uncomment the above code,
}

