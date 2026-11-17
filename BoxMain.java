// This is box class

/*
  This class define properties of Box.
  It has 3 variables. width depth and height.
*/

/**

*/
class Box {
 	private double width;
 	private double height;
 	private double depth;
 	
 	void display(){
 		System.out.println("Dimensions of Box - width : " + this.width + ", height:"+this.height+", depth: "+ this.depth);
 	}
 	
 	public void setWidth(double width){
 	  this.width = width;
 	}
 	
 	public void setHeight(double height){
 	  this.height = height;
 	}
 	
 	public void setDepth(double depth){
 	  this.depth = depth;
 	}
}

class BoxMain{
	public static void main(){
		Box b = new Box();
		b.setWidth(10);
		b.setHeight(20);
		b.setDepth(5);
		b.display();
		
		Box b1 = new Box();
		b1.setWidth(100);
		b1.setHeight(200);
		b1.setDepth(50);
		b1.display();
	}
}
