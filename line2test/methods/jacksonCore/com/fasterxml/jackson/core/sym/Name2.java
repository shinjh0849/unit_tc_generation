Name2(String name, int hash, int quad1, int quad2) { [EOL]     super(name, hash); [EOL]     mQuad1 = quad1; [EOL]     mQuad2 = quad2; [EOL] } <line_num>: 19,24
@Override [EOL] public boolean equals(int quad) { [EOL]     return false; [EOL] } <line_num>: 26,27
@Override [EOL] public boolean equals(int quad1, int quad2) { [EOL]     return (quad1 == mQuad1) && (quad2 == mQuad2); [EOL] } <line_num>: 29,33
@Override [EOL] public boolean equals(int[] quads, int qlen) { [EOL]     return (qlen == 2 && quads[0] == mQuad1 && quads[1] == mQuad2); [EOL] } <line_num>: 35,39
