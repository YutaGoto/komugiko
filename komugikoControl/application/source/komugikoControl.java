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

public class komugikoControl extends PApplet {

/***************************/
/* This is control Komugiko*/
/***************************/

public void setup() {
  size(500, 200);
  smooth();
}

float yk=1;
float x=0;
float d=70; //direction 70=right, 0=left
boolean fy=true;

public void draw() {
  background(255);
  if (fy) {
    yk += 0.5f;
    if (yk>10) fy=false;
  }
  else {
    yk -= 0.5f;
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

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "komugikoControl" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
