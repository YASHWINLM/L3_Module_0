float grav= 1;
float groundHeight=10;
float groundY=490;
ArrayList<Float>x= new ArrayList<Float>();
ArrayList<Float>y= new ArrayList<Float>();
void setup(){
size(500,500);
for(int i=0; i<51;i++){
float rand= random(10,490);
float rand2= random(10,490);
x.add(rand);
y.add(rand2);
}
}
void draw(){
 
background(500,500);
 rect(0,groundY,500,groundHeight);
grav++;
  for(int i=0; i<x.size();i++){
noStroke();
  
  ellipse(x.get(i), y.get(i)+grav,10,10);
 if(y.get(i)+grav>500){
 groundHeight+=10;
 groundY--;
 } 
}


}