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
  size(800, 480);
  smooth();
}

float x=0,y=0;
float yj=0;
float xm=0;
int d=0;
boolean flagj=false;

public void draw(){
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
      if(x>700.0f - 37.5f) xm = 0;
      if(x>400-37.5f && x<450-37.5f && y>-40) xm = 0;
    }
    else if (keyCode == LEFT) {
      xm = -3;
      d = 0;
      if(x<-100+37.5f) xm = 0;
      if(x>475.5f-37.5f && x<525.5f-37.5f && y>-40) xm = 0;
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
    yj += 0.3f;
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
      yj += 0.3f;
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
