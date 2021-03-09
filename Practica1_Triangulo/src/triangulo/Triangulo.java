package triangulo;

public class Triangulo {

	private int p;
	private int q;
	private int r;
	
	public Triangulo(int p,int q,int r) {
		 
		boolean valido = r < p+q && q < p+r && p< q+r ;
		boolean ladosPositivos = p >= 0 && q >= 0 && r>=0;
		
		if(!valido || !ladosPositivos) {
			throw new RuntimeException();
		}
		
		this.p = p;
		this.q = q;
		this.r = r;
	}
	
	public boolean esEscaleno() {
		return p != q && p!= r && q!=r;
	}
	
	public boolean esIsosceles() {
		return (p == q && p != r)|| (p == r && p != q )| (q == r && q != p);
	}
	
	public boolean esEquilatero() {
		return p == q && p == r && q == r;
	}
}
