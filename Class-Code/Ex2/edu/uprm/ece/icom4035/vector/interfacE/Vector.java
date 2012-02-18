package edu.uprm.ece.icom4035.vector.interfacE;



public interface Vector {
	public Vector sum(Vector V1);
	public Vector substract(Vector V1);
	public double dot(Vector V1);
	public Vector cross(Vector V1);
	public double magnitude();
	public int dimensions();
	public double getDimensionValue(int dimension);

}
