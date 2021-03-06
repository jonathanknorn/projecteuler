package p10;

import res.Euler;

public class P10 extends Euler {


	public static void main(String[] args) {
		Euler p = new P10();
		System.out.println(p.description());
		System.out.println("\n------------------------------------------\n");
		System.out.println(p.run());
	}

	@Override
	public long run(){
		int lim = 2000000;
		long val = 2;
		for(int pr = 3; pr < lim; pr += 2){
			boolean prime = true;
			for(int i = 3; i*i <= pr; i++){
				if(pr % i == 0){
					prime = false;
					break;
				}
			}
			if(prime){
				val += pr;
			}
		}
		return val;
	}
	
	@Override
	public String getName() {
		return "P10";
	}
	
//	@Override
	public String description() {
		return "";
	}

}
