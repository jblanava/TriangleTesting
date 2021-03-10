package triangulo;

public class Triangulo {

	private int p;
	private int q;
	private int r;
	
	public Triangulo(int p,int q,int r) {
		 
		boolean valido = r < p+q && q < p+r && p< q+r ;
		boolean ladosPositivos = p > 0 && q > 0 && r > 0;
		
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
	
	enum TipoDeTriangulo{
        Escaleno,Equilatero,Isosceles
        }

    public TipoDeTriangulo tipo() {

        if(this.esEquilatero()) {
            return TipoDeTriangulo.Equilatero;
        }else if(this.esIsosceles()) {
            return TipoDeTriangulo.Isosceles;
        }else {
            return TipoDeTriangulo.Escaleno;
        }
    }
	
	
	public static Triangulo creaTriangulo(String s) {

        String[] splitted = s.split(" ");
        int[] lados = new int[3];
        
        
        if(splitted.length > 3) {
            throw new RuntimeException();
        }

        for(int i = 0; i<3 ; i++) {
            lados[i] = Integer.parseInt(splitted[i]);
        }

        return new Triangulo(lados[0], lados[1], lados[2]);
    }
	
	
	
}
