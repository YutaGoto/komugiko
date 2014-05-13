import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class komugikoMario extends PApplet {

/*******************/
/* This is Komugiko*/
/*******************/

public void setup() {
  size(600, 480);
  smooth();
}

float x=0,y=0;
float yj=0;
int d=0;
boolean flagj=false;

public void draw(){
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
  ellipse(80+x+d, 295+y, 2.5f, 2.5f);
  ellipse(90+x+d, 295+y, 2.5f, 2.5f);
  noFill();
  arc(85+x+d, 300+y, 4, 4, 0, PI);
  
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "komugikoMario" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
