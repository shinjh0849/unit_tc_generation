Name1(String name, int hash, int quad) { [EOL]     super(name, hash); [EOL]     mQuad = quad; [EOL] } <line_num>: 19,23
static Name1 getEmptyName() { [EOL]     return sEmptyName; [EOL] } <line_num>: 25,25
@Override [EOL] public boolean equals(int quad) { [EOL]     return (quad == mQuad); [EOL] } <line_num>: 27,31
@Override [EOL] public boolean equals(int quad1, int quad2) { [EOL]     return (quad1 == mQuad) && (quad2 == 0); [EOL] } <line_num>: 33,37
@Override [EOL] public boolean equals(int[] quads, int qlen) { [EOL]     return (qlen == 1 && quads[0] == mQuad); [EOL] } <line_num>: 39,43
