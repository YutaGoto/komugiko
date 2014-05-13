/*******************/
/* This is Komugiko*/
/*******************/

void setup() {
  size(600, 480);
  smooth();
}

float x=0,y=0;
float yj=0;
int d=0;
boolean flagj=false;

void draw(){
  background(0,192,255);
  fill(64,64,0);
  rect(0,320,480,600);
  
  if (keyPressed) {
    if (keyCode == RIGHT) {
      x += 1;
      d = 30;
    }
    else if (keyCode == LEFT) {
      x -= 1;
      d = 0;
    }
    if(keyCode == UP || flagj){
      if(keyCode == UP){
        yj=-10;
      }
      flagj=true;
      yj++;
      y=y+yj;
      if(y>0){
        flagj=false;
      }
    }
  }
  
  fill(254, 245, 218);
  ellipse(100+x, 300+y, 75, 40);
  fill(0);
  ellipse(80+x+d, 295+y, 2.5, 2.5);
  ellipse(90+x+d, 295+y, 2.5, 2.5);
  noFill();
  arc(85+x+d, 300+y, 4, 4, 0, PI);
  
}
