package sem1.sportniki;

public class UrejenSeznam implements SeznamElement {
	
	public UrejenSeznam next;
	public String v;
	
	public UrejenSeznam(String v) {
		this.v = v;
	}

	public UrejenSeznam() {

	}

	public void dodaj(String v){
		if(v == null){
			return;
		}
		if(this.v == null){
			this.v = v;
		}else{
			if (this.v.compareTo(v)>0){
				dodaj(this.v);
				this.v = v;
			}else if(next == null){
				next = new UrejenSeznam();
				next.dodaj(v);
			}else if(next.v == null){
				next.dodaj(v);
			}else{
				if(next.v.compareTo(v) < 0){
					next.dodaj(v);
				}else{
					UrejenSeznam dodan = new UrejenSeznam(v);
					dodan.next = next;
					next = dodan;
				}
			}
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
