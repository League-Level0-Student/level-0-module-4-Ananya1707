PImage face;
void setup() {
face = loadImage("peppapig.png");
size(800,600);
face.resize(800,600);
  
}

void draw() {
  int x = mouseX;
  int y = mouseY;
  
  background(face);
  fill(255,255,255);
  ellipse(365,150,40,40);
  fill(0,0,0);

  
  fill(255,255,255);
  ellipse(412,175,40,40);
  fill(0,0,0);
 
  
  if( mouseX >  378){
     x = 378;
   
  } 
  if( mouseX <  352){
    x = 352;
    
  }
  
  if(mouseY > 160 ){
   y = 160;
  
  } 
  if(mouseY < 140){
    y = 140;
    
  }
  
  ellipse(x,y,15,15);
  ellipse(x+47,y+25,15,15);
  
  
  

  

}
