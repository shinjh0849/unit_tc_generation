public Weight(double[] weight) { [EOL]     weightMatrix = new DiagonalMatrix(weight); [EOL] } <line_num>: 43,45
public Weight(RealMatrix weight) { [EOL]     if (weight.getColumnDimension() != weight.getRowDimension()) { [EOL]         throw new NonSquareMatrixException(weight.getColumnDimension(), weight.getRowDimension()); [EOL]     } [EOL]     weightMatrix = weight.copy(); [EOL] } <line_num>: 52,59
public RealMatrix getWeight() { [EOL]     return weightMatrix.copy(); [EOL] } <line_num>: 66,68
