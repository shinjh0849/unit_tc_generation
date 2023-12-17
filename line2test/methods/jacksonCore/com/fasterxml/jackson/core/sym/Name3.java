Name3(String name, int hash, int q1, int q2, int q3) { [EOL]     super(name, hash); [EOL]     mQuad1 = q1; [EOL]     mQuad2 = q2; [EOL]     mQuad3 = q3; [EOL] } <line_num>: 15,21
@Override [EOL] public boolean equals(int quad) { [EOL]     return false; [EOL] } <line_num>: 24,25
@Override [EOL] public boolean equals(int quad1, int quad2) { [EOL]     return false; [EOL] } <line_num>: 28,29
@Override [EOL] public boolean equals(int[] quads, int qlen) { [EOL]     return (qlen == 3) && (quads[0] == mQuad1) && (quads[1] == mQuad2) && (quads[2] == mQuad3); [EOL] } <line_num>: 31,38
