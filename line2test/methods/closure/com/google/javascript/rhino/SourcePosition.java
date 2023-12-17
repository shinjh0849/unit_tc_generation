public void setItem(T item) { [EOL]     this.item = item; [EOL] } <line_num>: 76,78
public void setPositionInformation(int startLineno, int startCharno, int endLineno, int endCharno) { [EOL]     if (startLineno == endLineno) { [EOL]         if (startCharno >= endCharno) { [EOL]             throw new IllegalStateException("Recorded bad position information\n" + "start-char: " + startCharno + "\n" + "end-char: " + endCharno); [EOL]         } [EOL]     } else { [EOL]         if (startLineno > endLineno) { [EOL]             throw new IllegalStateException("Recorded bad position information\n" + "start-line: " + startLineno + "\n" + "end-line: " + endLineno); [EOL]         } [EOL]     } [EOL]     this.startLineno = startLineno; [EOL]     this.startCharno = startCharno; [EOL]     this.endLineno = endLineno; [EOL]     this.endCharno = endCharno; [EOL] } <line_num>: 83,105
public T getItem() { [EOL]     return item; [EOL] } <line_num>: 110,112
public int getStartLine() { [EOL]     return startLineno; [EOL] } <line_num>: 117,119
public int getPositionOnStartLine() { [EOL]     return startCharno; [EOL] } <line_num>: 124,126
public int getEndLine() { [EOL]     return endLineno; [EOL] } <line_num>: 131,133
public int getPositionOnEndLine() { [EOL]     return endCharno; [EOL] } <line_num>: 138,140
