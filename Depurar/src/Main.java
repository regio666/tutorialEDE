
public class Main {
	public static void main(String args[]){
		int random = (int) (Math.random() * 10);
		ArrayCreator a = new ArrayCreator(random);
		a.fillArray();
		for(int i = 0; i<a.getSize(); i++){
			Car c = a.getCar(i);
			if (a.getCar(i)!=null) {
			System.out.println("Car "+(i+1)+" is from "+c.getBrand()+" and "
					+ "has "+c.getHP()+" hp.");
			}
		}
	}
}