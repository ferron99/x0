/// Wild circles #1.

// GLOBAL VARIABLES //
float x,y,a,b,c,d;

// Setup:  screen size, initialization. //
void setup() {
  size(1600, 900);        // Try changing the width & height.
  x=  width/2;
  y=  height/2;
  a= width/2;
  b= height/2;
  c= width/2;
  d= height/2;
}

void draw() {
  ellipse(a, b, 80, 80);
  ellipse(x+60, y+60, 40, 40);
  ellipse(c+90, d+90, 20, 20);
 
  // Move them???? //--              
  x=  x + 2;  y=  y + 1;
  a=  a + 1;  b=  b + 2;
  c=  c + 3;  d=  d + .5;
  // Insert BREAK here ^
  // to uncomment the above code,
}
