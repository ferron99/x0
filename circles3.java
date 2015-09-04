//// Wild circles #2.
String title=  "Click for another circle.";
String subtitle=  "Press any key to erase.";
String author=  "Nick Ferro";

// GLOBAL VARIABLES //
float x,y,u,v,l,g,e,i,q,d;
int h,w;

// Setup:  screen size, initialization. //
void setup() {
  size(500, 500);
  x=  width/2;
  y=  height/2;
  w=  80;          // width of ellipse.
  h=  80;          // height of ellipse
  u=  85;
  v=  50;
  l=  85;
  g=  50;
  e=  10;
  i=  5;
  q=  12;
  d=  5;
}

// Next frame. //
void draw() {
  text( title, 10, 10 );
  text( subtitle, width/2, 10 );
  text( author, 10, height-10 );
  text( w+"x"+h, width/2,height-10 );
  //
  line(x+15, y-15, x+u, y-v);  //right arm
  line(x-15, y+15, x-g, y+l);  //left leg
  line(x+15, y+15, x+g, y+l);  //right leg
  line(x-15, y-15, x-u, y-v);  //leg arm
  ellipse(x, y, w, h);
  ellipseMode(CENTER);
  ellipse(x+e,y-i,q,q);
  ellipse(x-e,y-i,q,q);
  ellipse(x+e,y-i,d,d);
  ellipse(x-e,y-i,d,d);
}


//  Handle mouse clicks //
void mousePressed() {
  x=  mouseX;
  y=  mouseY;
}


//  Handle keyboard //
void keyPressed() {
  // Erase everything, change size & color. //
  background( random(255), random(255), random(255) );
  fill( random(255), random(255), random(255) );
  w=  int( random(50,150) );
  h=  int( random(50,150) );
  u=  int( random(60,100) );
  v=  int( random(60,100) );
  l=  int( random(60,100) );
  g=  int( random(60,100) );
  e=  int( random(8,12) );
  i=  int( random(4,6) );
  q=  int( random(8,12) );
  d=  int( random(4,6) );
}
