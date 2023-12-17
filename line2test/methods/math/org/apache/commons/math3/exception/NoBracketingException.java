public NoBracketingException(double lo, double hi, double fLo, double fHi) { [EOL]     this(LocalizedFormats.SAME_SIGN_AT_ENDPOINTS, lo, hi, fLo, fHi); [EOL] } <line_num>: 49,52
public NoBracketingException(Localizable specific, double lo, double hi, double fLo, double fHi, Object... args) { [EOL]     super(specific, Double.valueOf(lo), Double.valueOf(hi), Double.valueOf(fLo), Double.valueOf(fHi), args); [EOL]     this.lo = lo; [EOL]     this.hi = hi; [EOL]     this.fLo = fLo; [EOL]     this.fHi = fHi; [EOL] } <line_num>: 64,73
public double getLo() { [EOL]     return lo; [EOL] } <line_num>: 80,82
public double getHi() { [EOL]     return hi; [EOL] } <line_num>: 88,90
public double getFLo() { [EOL]     return fLo; [EOL] } <line_num>: 96,98
public double getFHi() { [EOL]     return fHi; [EOL] } <line_num>: 104,106
