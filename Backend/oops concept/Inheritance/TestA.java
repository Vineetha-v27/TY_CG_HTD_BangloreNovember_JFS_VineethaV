
public class TestA {
	public static void main(String arr[]){
		//FirstGeneration fg = new FirstGeneration();
		//fg.call();
		//fg.msz();
		//SecondGeneration sg = new SecondGeneration();
		//sg.call();
		//sg.msz();
		//sg.radio();
		//ThirdGeneration tg = new ThirdGeneration();
		//tg.call();
		//tg.msz();
		//tg.radio();
		//tg.camera();
		
		FirstGeneration fg = new ThirdGeneration();
		fg.call();
		fg.msz();
		SecondGeneration sg = new SecondGeneration();
		sg.call();
		sg.msz();
		sg.radio();
		ThirdGeneration tg = new ThirdGeneration();
		tg.call();
		tg.msz();
		tg.radio();
		tg.camera();
	}

}
