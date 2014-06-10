/*******************/
/* This is Komugiko*/
/*******************/

void setup() {
  size(800, 480);
  smooth();
}

float x=0,y=0;
float yj=0;
float xm=0;
int d=0;
boolean flagj=false;

void draw(){
  background(0,192,255);
  fill(64,64,0);
  rect(0,320,200,600);
  rect(300,320,500,600);
  
  fill(0,128,0);
  rect(500, 270, 50,50);
  fill(254, 245, 218);
  
  if (keyPressed) {
    if (keyCode == RIGHT) {
      xm = 3;
      d = 30;
      if(x>700.0 - 37.5) xm = 0;
      if(x>400-37.5 && x<450-37.5 && y>-40) xm = 0;
    }
    else if (keyCode == LEFT) {
      xm = -3;
      d = 0;
      if(x<-100+37.5) xm = 0;
      if(x>475.5-37.5 && x<525.5-37.5 && y>-40) xm = 0;
    }
  }else{
    xm = 0;
  }
  if(keyPressed){
    if(key == 'z' && !flagj){
      flagj=true;
      yj = -10;
    }
  }
  
  if(flagj){
    y += yj;
    yj += 0.3;
  }
  if(y > -52){
    if(x>400 && x<450){
      yj = 0;
      flagj = false;
    }else{
      flagj=true;
    }
  }
  if(y>=0){
    if(x>100 && x<200){
      yj += 0.3;
      y += yj;
      xm = 0;
      fill(128, 64,0);
    }else{
      flagj = false;
      yj = 0;
    }
  }
  x += xm;
  ellipse(100+x, 300+y, 75, 40);
  fill(0);
  ellipse(80+x+d, 295+y, 2.5, 2.5);
  ellipse(90+x+d, 295+y, 2.5, 2.5);
  noFill();
  arc(85+x+d, 300+y, 4, 4, 0, PI);
  
}
