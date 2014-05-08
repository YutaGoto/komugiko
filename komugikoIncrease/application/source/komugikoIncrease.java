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

public class komugikoIncrease extends PApplet {

/*******************/
/* This is Komugiko*/
/*******************/

public void setup() {
  size(600, 480);
  smooth();
  frameRate(5);
}

float x,y;

public void draw(){
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
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "komugikoIncrease" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
