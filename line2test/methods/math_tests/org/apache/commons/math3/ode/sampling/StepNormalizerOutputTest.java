@Override [EOL] protected double getStart() { [EOL]     return 0.3; [EOL] } <line_num>: 24,27
@Override [EOL] protected double getEnd() { [EOL]     return 10.1; [EOL] } <line_num>: 29,32
@Override [EOL] protected double[] getExpInc() { [EOL]     return new double[] { 0.3, 0.8, 1.3, 1.8, 2.3, 2.8, 3.3, 3.8, 4.3, 4.8, 5.3, 5.8, 6.3, 6.8, 7.3, 7.8, 8.3, 8.8, 9.3, 9.8, 10.1 }; [EOL] } <line_num>: 34,39
@Override [EOL] protected double[] getExpIncRev() { [EOL]     return new double[] { 10.1, 9.6, 9.1, 8.6, 8.1, 7.6, 7.1, 6.6, 6.1, 5.6, 5.1, 4.6, 4.1, 3.6, 3.1, 2.6, 2.1, 1.6, 1.1, 0.6, 0.3 }; [EOL] } <line_num>: 41,46
@Override [EOL] protected double[] getExpMul() { [EOL]     return new double[] { 0.3, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5, 6.0, 6.5, 7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.1 }; [EOL] } <line_num>: 48,53
@Override [EOL] protected double[] getExpMulRev() { [EOL]     return new double[] { 10.1, 10.0, 9.5, 9.0, 8.5, 8.0, 7.5, 7.0, 6.5, 6.0, 5.5, 5.0, 4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.5, 0.3 }; [EOL] } <line_num>: 55,60
@Override [EOL] protected int[][] getO() { [EOL]     return new int[][] { { 1, 1 }, { 1, 1 }, { 0, 1 }, { 0, 1 }, { 1, 0 }, { 1, 0 }, { 0, 0 }, { 0, 0 }, { 1, 1 }, { 1, 1 }, { 0, 1 }, { 0, 1 }, { 1, 0 }, { 1, 0 }, { 0, 0 }, { 0, 0 } }; [EOL] } <line_num>: 62,68
