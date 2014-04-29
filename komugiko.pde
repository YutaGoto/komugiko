void setup(){
  size(200,200);
  smooth();
}

int r=0, g=0, b=0;
boolean fr=true,fg=false,fb=false;

void draw(){
  if(fr){
    r += 3;
    if(r>255) fr=false;
  }else{
    r -= 3;
    if(r<0) fr=true;
  }
  
  if(fg){
    g += 7;
    if(g>255) fg=false;
  }else{
    g -= 7;
    if(g<0) fg=true;
  }
  
  if(fb){
    b += 11;
    if(b>255) fb=false;
  }else{
    b -= 11;
    if(b<0) fb=true;
  }
  fill(r,g,b);
  ellipse(100,100,150,80);
  fill(0);
  ellipse(60,90,5,5);
  ellipse(80,90,5,5);
  noFill();
  arc(70,100,8,8,0,PI);
}
