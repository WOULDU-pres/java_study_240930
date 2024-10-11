package day8.innerInterface2;

class Button{
	OnClickListener ocl;
	void setOnClickListener (OnClickListener ocl){
		this.ocl = ocl;
	}
	interface OnClickListener {
		public abstract void OnClick();
	}
	void onClick () {
		ocl.OnClick();
	}
}

public class ButtonAPIExample {
	public static void main(String[] args) {

		Button btn1 = new Button();
		btn1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void OnClick() {
				// TODO Auto-generated method stub
				System.out.println("개발자 1 : 음악 재생");
			}
		});
		btn1.onClick();
		
		Button btn2 = new Button();
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void OnClick() {
				// TODO Auto-generated method stub
				System.out.println("개발자 2 : 네이버 접속");
			}
		});
		btn2.onClick();
	}
}