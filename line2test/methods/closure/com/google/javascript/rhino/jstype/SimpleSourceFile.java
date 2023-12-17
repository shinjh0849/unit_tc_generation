public SimpleSourceFile(String name, boolean extern) { [EOL]     this.name = name; [EOL]     this.extern = extern; [EOL] } <line_num>: 50,53
@Override [EOL] public String getName() { [EOL]     return name; [EOL] } <line_num>: 55,58
@Override [EOL] public boolean isExtern() { [EOL]     return extern; [EOL] } <line_num>: 60,63
@Override [EOL] public int getColumnOfOffset(int offset) { [EOL]     return 0; [EOL] } <line_num>: 65,68
@Override [EOL] public int getLineOfOffset(int offset) { [EOL]     return 1; [EOL] } <line_num>: 70,73
@Override [EOL] public int getLineOffset(int line) { [EOL]     if (line < 1) { [EOL]         throw new IllegalStateException("Should not call getLineOffset with line number " + line); [EOL]     } [EOL]     return Integer.MIN_VALUE; [EOL] } <line_num>: 75,82
@Override [EOL] public String toString() { [EOL]     return name; [EOL] } <line_num>: 84,87
