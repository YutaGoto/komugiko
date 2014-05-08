/*******************/
/* This is Komugiko*/
/*******************/

void setup() {
  size(600, 480);
  smooth();
  frameRate(5);
}

float x,y;

void draw(){
  x=random(-100,500);
  y=random(-100,500);
  fill(254, 245, 218);
  ellipse(100+x, 100+y, 150, 80);
  fill(0);
  ellipse(60+x, 90+y, 5, 5);
  ellipse(80+x, 90+y, 5, 5);
  noFill();
  arc(70+x, 100+y, 8, 8, 0, PI);
  
}
