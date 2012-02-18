package edu.uprm.ece.icom4035.vector.interfacE;



public class VectorN implements Vector {

	private double[] dims;
	
	public VectorN(int dimensions){
		if (dimensions < 2){
			throw new IllegalArgumentException("Dimensions must be at least 2.");
		}
		this.dims = new double[dimensions];
	}
	
	public VectorN(double[] vals){
		if (vals == null){
			throw new IllegalArgumentException("Cannot pass array vals as null.");
		}
		else {
			this.dims = vals;
		}
		
	}
	
	public String toString(){
		String result = "(";
		for (int i= 0 ; i < this.dimensions() - 1; ++i){
			result += this.dims[i] + ",";
		}
		result += this.dims[this.dimensions()-1] + ")";
		return result;
		
	}
	private void checkDim(Vector V0, Vector V1){
		if (V0.dimensions() != V1.dimensions()){
			throw new IllegalArgumentException("Vectors must have same dimensions.");
		}
	}
	@Override
	public Vector sum(Vector V1) {
		checkDim(this, V1);
		VectorN result = new VectorN(this.dimensions());
		
		for (int i=0; i < this.dimensions(); ++i){
			result.dims[i] = this.dims[i] + V1.getDimensionValue(i);
		}
		return result;
	}

	@Override
	public Vector substract(Vector V1) {
		checkDim(this, V1);
		VectorN result = new VectorN(this.dimensions());
		
		for (int i=0; i < this.dimensions(); ++i){
			result.dims[i] = this.dims[i] - V1.getDimensionValue(i);
		}
		return result;
	}

	@Override
	public double dot(Vector V1) {
		checkDim(this, V1);	
		double result = 0;
		for (int i=0; i < this.dimensions(); ++i){
			result += this.dims[i] * V1.getDimensionValue(i);
		}

		return result;
	}

	@Override
	public Vector cross(Vector V1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double magnitude() {
		// OK, but verbose
//		double result = 0;
//		for (int i= 0; i < this.dimensions(); ++i){
//			result += this.dims[i] * this.dims[i];
//		}
//		return Math.sqrt(result);
		
		// cool
		//
		return Math.sqrt(this.dot(this));
	}

	@Override
	public int dimensions() {
		return this.dims.length;
	}

	@Override
	public double getDimensionValue(int dimension) {
		if (dimension >= this.dimensions() || dimension < 0){
			throw new IllegalArgumentException("Dimension is out of range.");		
		}
		return this.dims[dimension];
	}

	
	
	
	
	
	
	
}
