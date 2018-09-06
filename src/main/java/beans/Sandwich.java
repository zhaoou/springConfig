package beans;


public class Sandwich {
	private Coudiment firstCoudiment;
	private Coudiment secondCoudiment;
	private Coudiment thirdCoudiment;
	private Bread ryeBread;

	public Sandwich() {	
	}
	public Sandwich(Coudiment firstCoudiment, Coudiment secondCoudiment, Coudiment thirdCoudiment, Bread ryeBread)  {
		this.firstCoudiment = firstCoudiment;
		this.secondCoudiment = secondCoudiment;
		this.thirdCoudiment = thirdCoudiment;
		this.ryeBread = ryeBread;
	}
	public Sandwich(Coudiment firstCoudiment, Coudiment secondCoudiment, Coudiment thirdCoudiment)  {
		this.firstCoudiment = firstCoudiment;
		this.secondCoudiment = secondCoudiment;
		this.thirdCoudiment = thirdCoudiment;
	}

	public void setFirstCoudiment(Coudiment coudiment) {
		// TODO Auto-generated method stub
		firstCoudiment = coudiment;

	}

	public Coudiment getFirstCoudiment() {
		// TODO Auto-generated method stub
		return firstCoudiment;
	}

	public void setSecondCoudiment(Coudiment coudiment) {
		// TODO Auto-generated method stub
		secondCoudiment = coudiment;

	}

	public Coudiment getSecondCoudiment() {
		// TODO Auto-generated method stub
		return secondCoudiment;
	}

	public void setThirdCoudiment(Coudiment coudiment) {
		// TODO Auto-generated method stub
		thirdCoudiment = coudiment;

	}

	public Coudiment getThirdCoudiment() {
		// TODO Auto-generated method stub
		return thirdCoudiment;
	}

	public void setTheBread(Bread bread) {
		// TODO Auto-generated method stub
		ryeBread = bread;

	}

	public Bread getTheBread() {
		// TODO Auto-generated method stub
		return ryeBread;
	}

	public String makeSandwich() {
		// TODO Auto-generated method stub
		String a = "The Sandwich is made of "
				+ getFirstCoudiment().getName()+", " + getSecondCoudiment().getName()+","
				+ " "+ getThirdCoudiment().getName()+", "+ getTheBread().getName();
		return a;
	}



}
