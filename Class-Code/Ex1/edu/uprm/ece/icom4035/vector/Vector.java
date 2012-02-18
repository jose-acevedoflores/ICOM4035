package edu.uprm.ece.icom4035.vector;

//import edu.uprm.ece.icom4035.vector.interfacE.Vector;

public class Vector {
	// field
	private double x;
	private double y;
	
	public Vector(double x, double y){
		this.x= x;
		this.y  = y;
	}
	
	public Vector(){
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
		return new Vector(this.x+V1.x, this.y + V1.y);
	}
	
	public Vector substract(Vector V1){
		return new Vector(this.x - V1.x, this.y - V1.y);
	}
	
	public double dot(Vector V1){
		return this.x*V1.x + this.y*V1.y;
	}
	
	public double magnitude(){
		return Math.sqrt(this.x*this.x+this.y*this.y);
	}
	
	
	
}
