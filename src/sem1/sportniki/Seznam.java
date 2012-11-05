package sem1.sportniki;

public class Seznam implements SeznamElement {
	
	public String v;
	public SeznamElement next;
	
	public Seznam(){
		
	}
	
	public Seznam(String v){
		this.v = v;
	}
	
	public void dodaj(String v){
		if(v == null){
			return;
		}
		if(this.v == null){
			this.v = v;
		}else{
			if(next == null){
				next = new Seznam();
			}
			next.dodaj(v);
		}
	}
	
	public void izpisiN(){
		if(v != null){
			System.out.println(v.toString());
		}
		if(next != null){
			next.izpisiN();
		}
	}
	
	public void izpisiL(){
		if(next != null){
			next.izpisiL();
		}
		if(v != null){
			System.out.println(v.toString());
		}
	}
}
