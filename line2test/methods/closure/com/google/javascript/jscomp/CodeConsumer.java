void startSourceMapping(Node node) { [EOL] } <line_num>: 38,39
void endSourceMapping(Node node) { [EOL] } <line_num>: 45,46
boolean continueProcessing() { [EOL]     return true; [EOL] } <line_num>: 52,54
abstract char getLastChar(); <line_num>: 59,59
void addIdentifier(String identifier) { [EOL]     add(identifier); [EOL] } <line_num>: 61,63
abstract void append(String str); <line_num>: 74,74
void appendBlockStart() { [EOL]     append("{"); [EOL] } <line_num>: 76,78
void appendBlockEnd() { [EOL]     append("}"); [EOL] } <line_num>: 80,82
void startNewLine() { [EOL] } <line_num>: 84,85
void maybeLineBreak() { [EOL]     maybeCutLine(); [EOL] } <line_num>: 87,89
void maybeCutLine() { [EOL] } <line_num>: 91,92
void endLine() { [EOL] } <line_num>: 94,95
void notePreferredLineBreak() { [EOL] } <line_num>: 97,98
void beginBlock() { [EOL]     if (statementNeedsEnded) { [EOL]         append(";"); [EOL]         maybeLineBreak(); [EOL]     } [EOL]     appendBlockStart(); [EOL]     endLine(); [EOL]     statementNeedsEnded = false; [EOL] } <line_num>: 100,109
void endBlock() { [EOL]     endBlock(false); [EOL] } <line_num>: 111,113
void endBlock(boolean shouldEndLine) { [EOL]     appendBlockEnd(); [EOL]     if (shouldEndLine) { [EOL]         endLine(); [EOL]     } [EOL]     statementNeedsEnded = false; [EOL] } <line_num>: 115,121
void listSeparator() { [EOL]     add(","); [EOL]     maybeLineBreak(); [EOL] } <line_num>: 123,126
void endStatement() { [EOL]     endStatement(false); [EOL] } <line_num>: 134,136
void endStatement(boolean needSemiColon) { [EOL]     if (needSemiColon) { [EOL]         append(";"); [EOL]         maybeLineBreak(); [EOL]         statementNeedsEnded = false; [EOL]     } else if (statementStarted) { [EOL]         statementNeedsEnded = true; [EOL]     } [EOL] } <line_num>: 138,146
void maybeEndStatement() { [EOL]     if (statementNeedsEnded) { [EOL]         append(";"); [EOL]         maybeLineBreak(); [EOL]         endLine(); [EOL]         statementNeedsEnded = false; [EOL]     } [EOL]     statementStarted = true; [EOL] } <line_num>: 152,161
void endFunction() { [EOL]     endFunction(false); [EOL] } <line_num>: 163,165
void endFunction(boolean statementContext) { [EOL]     sawFunction = true; [EOL]     if (statementContext) { [EOL]         endLine(); [EOL]     } [EOL] } <line_num>: 167,172
void beginCaseBody() { [EOL]     append(":"); [EOL] } <line_num>: 174,176
void endCaseBody() { [EOL] } <line_num>: 178,179
void add(String newcode) { [EOL]     maybeEndStatement(); [EOL]     if (newcode.length() == 0) { [EOL]         return; [EOL]     } [EOL]     char c = newcode.charAt(0); [EOL]     if ((isWordChar(c) || c == '\\') && isWordChar(getLastChar())) { [EOL]         append(" "); [EOL]     } else if (c == '/' && getLastChar() == '/') { [EOL]         append(" "); [EOL]     } [EOL]     append(newcode); [EOL] } <line_num>: 181,204
void appendOp(String op, boolean binOp) { [EOL]     append(op); [EOL] } <line_num>: 206,208
void addOp(String op, boolean binOp) { [EOL]     maybeEndStatement(); [EOL]     char first = op.charAt(0); [EOL]     char prev = getLastChar(); [EOL]     if ((first == '+' || first == '-') && prev == first) { [EOL]         append(" "); [EOL]     } else if (Character.isLetter(first) && isWordChar(prev)) { [EOL]         append(" "); [EOL]     } else if (prev == '-' && first == '>') { [EOL]         append(" "); [EOL]     } [EOL]     appendOp(op, binOp); [EOL]     if (binOp) { [EOL]         maybeCutLine(); [EOL]     } [EOL] } <line_num>: 210,238
void addNumber(double x) { [EOL]     char prev = getLastChar(); [EOL]     boolean negativeZero = isNegativeZero(x); [EOL]     if ((x < 0 || negativeZero) && prev == '-') { [EOL]         add(" "); [EOL]     } [EOL]     if (negativeZero) { [EOL]         addConstant("-0"); [EOL]     } else if ((long) x == x) { [EOL]         long value = (long) x; [EOL]         long mantissa = value; [EOL]         int exp = 0; [EOL]         if (Math.abs(x) >= 100) { [EOL]             while (mantissa / 10 * Math.pow(10, exp + 1) == value) { [EOL]                 mantissa /= 10; [EOL]                 exp++; [EOL]             } [EOL]         } [EOL]         if (exp > 2) { [EOL]             addConstant(Long.toString(mantissa) + "E" + Integer.toString(exp)); [EOL]         } else { [EOL]             long valueAbs = Math.abs(value); [EOL]             if (Long.toHexString(valueAbs).length() + 2 < Long.toString(valueAbs).length()) { [EOL]                 addConstant((value < 0 ? "-" : "") + "0x" + Long.toHexString(valueAbs)); [EOL]             } else { [EOL]                 addConstant(Long.toString(value)); [EOL]             } [EOL]         } [EOL]     } else { [EOL]         addConstant(String.valueOf(x).replace(".0E", "E")); [EOL]     } [EOL] } <line_num>: 240,276
void addConstant(String newcode) { [EOL]     add(newcode); [EOL] } <line_num>: 278,280
static boolean isNegativeZero(double x) { [EOL]     return x == 0.0 && Math.copySign(1, x) == -1.0; [EOL] } <line_num>: 282,284
static boolean isWordChar(char ch) { [EOL]     return (ch == '_' || ch == '$' || Character.isLetterOrDigit(ch)); [EOL] } <line_num>: 286,290
boolean shouldPreserveExtraBlocks() { [EOL]     return false; [EOL] } <line_num>: 300,302
boolean breakAfterBlockFor(Node n, boolean statementContext) { [EOL]     return statementContext; [EOL] } <line_num>: 307,309
void endFile() { [EOL] } <line_num>: 312,312
