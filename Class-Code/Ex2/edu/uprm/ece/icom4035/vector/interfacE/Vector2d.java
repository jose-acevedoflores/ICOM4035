package edu.uprm.ece.icom4035.vector.interfacE;



public class Vector2d implements Vector{
	// field
	private double x;
	private double y;
	
	public Vector2d(double x, double y){
		this.x= x;
		this.y  = y;
	}
	
	public Vector2d(){
		this.x = 0;
		this.y = 0;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String toString(){
		return "(" + this.x + ", " + this.y + ")";
	}
	
	public Vector sum(Vector V1){
		// Correcto, but too verbose
//		Vector result = null;
//		double x = this.x + V1.x;
//		double y = this.y + V1.y;
//		result = new Vector(x, y);
//		return result;
		return new Vector2d(this.x+((Vector2d) V1).x, 
				this.y + ((Vector2d) V1).y);
	}
	
	public Vector substract(Vector V1){
		Vector2d temp = (Vector2d) V1;
		return new Vector2d(this.x - temp.x, this.y - temp.y);
	}
	
	public double dot(Vector V1){
		Vector2d temp = (Vector2d) V1;
		return this.x*temp.x + this.y*temp.y;
	}
	
	public double magnitude(){
		return Math.sqrt(this.x*this.x+this.y*this.y);
	}
	
	@Override
	public int dimensions() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public double getDimensionValue(int dimension) {
		// TODO Auto-generated method stub
		if (dimension == 0){
			return this.x;
		}
		else {
			return this.y;
		}
	}

	public Vector cross(Vector V1){
		return null;
	}


}
