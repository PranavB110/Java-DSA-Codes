
public class OOPS {

	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.setColor("Blue");
		System.out.println(p1.getColor());
		
		p1.setTip(5);
		System.out.println(p1.getTip());
		
		p1.setColor("Pink");
//		p1.setColor = "Pink";
		System.out.println(p1.getColor());

	}

}

//class Pen {
//	String color;
//	int tip;
//	
//	void setColor(String newColor) {
//		color = newColor;
//	}
//	void setTip(int newTip) {
//		tip = newTip;
//	}
//}

//getter setter
class Pen {
  
private String color;
  private int tip;
  
  //getters
  String getColor() {
	  return this.color;
  }
  
  
  int getTip() {
	  return this.tip;
  }
//  setters
  void setColor(String newColor) {
	color = newColor;
  }
  void setTip(int newTip) {
	tip = newTip;
  }
}

