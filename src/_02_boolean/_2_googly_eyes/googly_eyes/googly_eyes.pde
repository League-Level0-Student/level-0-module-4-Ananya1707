PImage face;
void setup() {
face = loadImage("peppapig.png");
size(800,600);
face.resize(800,600);
  
}

void draw() {
  background(face);
  fill(255,255,255);
  ellipse(365,150,40,40);
  fill(0,0,0);

  
  fill(255,255,255);
  ellipse(412,175,40,40);
  fill(0,0,0);
 
  
  if( mouseX >  365 + 40/2 || mouseX<  365 - 40/2){
     ellipse(365,150,15,15);
     ellipse(365+47,150+25,15,15);
   
  } else{
    ellipse(mouseX,mouseY,15,15);
     ellipse(mouseX+47,mouseY+25,15,15);
  }
  
  
  

  
}
