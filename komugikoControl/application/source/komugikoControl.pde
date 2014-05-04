/***************************/
/* This is control Komugiko*/
/***************************/

void setup() {
  size(500, 200);
  smooth();
}

float yk=1;
float x=0;
float d=70; //direction 70=right, 0=left
boolean fy=true;

void draw() {
  background(255);
  if (fy) {
    yk += 0.5;
    if (yk>10) fy=false;
  }
  else {
    yk -= 0.5;
    if (yk<0) fy=true;
  }
  if (keyPressed) {
    if (keyCode == RIGHT) {
      x += 1;
      d = 70;
    }
    else if (keyCode == LEFT) {
      x -= 1;
      d = 0;
    }
  }
  fill(254, 245, 218);
  ellipse(100+x, 100, 150, 80+yk);
  fill(0);
  ellipse(60+x+d, 90, 5, 5);
  ellipse(80+x+d, 90, 5, 5);
  noFill();
  arc(70+x+d, 100, 8, 8, 0, PI);
}

