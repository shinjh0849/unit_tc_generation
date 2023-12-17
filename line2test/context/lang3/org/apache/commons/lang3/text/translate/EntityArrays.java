public static String[][] ISO8859_1_ESCAPE()
public static String[][] ISO8859_1_UNESCAPE()
public static String[][] HTML40_EXTENDED_ESCAPE()
public static String[][] HTML40_EXTENDED_UNESCAPE()
public static String[][] BASIC_ESCAPE()
public static String[][] BASIC_UNESCAPE()
public static String[][] APOS_ESCAPE()
public static String[][] APOS_UNESCAPE()
public static String[][] JAVA_CTRL_CHARS_ESCAPE()
public static String[][] JAVA_CTRL_CHARS_UNESCAPE()
public static String[][] invert(final String[][] array)
String[][] ISO8859_1_ESCAPE=Optional[{ // non-breaking space
{ "\u00A0", "&nbsp;" }, // inverted exclamation mark
{ "\u00A1", "&iexcl;" }, // cent sign
{ "\u00A2", "&cent;" }, // pound sign
{ "\u00A3", "&pound;" }, // currency sign
{ "\u00A4", "&curren;" }, // yen sign = yuan sign
{ "\u00A5", "&yen;" }, // broken bar = broken vertical bar
{ "\u00A6", "&brvbar;" }, // section sign
{ "\u00A7", "&sect;" }, // diaeresis = spacing diaeresis
{ "\u00A8", "&uml;" }, // � - copyright sign
{ "\u00A9", "&copy;" }, // feminine ordinal indicator
{ "\u00AA", "&ordf;" }, // left-pointing double angle quotation mark = left pointing guillemet
{ "\u00AB", "&laquo;" }, // not sign
{ "\u00AC", "&not;" }, // soft hyphen = discretionary hyphen
{ "\u00AD", "&shy;" }, // � - registered trademark sign
{ "\u00AE", "&reg;" }, // macron = spacing macron = overline = APL overbar
{ "\u00AF", "&macr;" }, // degree sign
{ "\u00B0", "&deg;" }, // plus-minus sign = plus-or-minus sign
{ "\u00B1", "&plusmn;" }, // superscript two = superscript digit two = squared
{ "\u00B2", "&sup2;" }, // superscript three = superscript digit three = cubed
{ "\u00B3", "&sup3;" }, // acute accent = spacing acute
{ "\u00B4", "&acute;" }, // micro sign
{ "\u00B5", "&micro;" }, // pilcrow sign = paragraph sign
{ "\u00B6", "&para;" }, // middle dot = Georgian comma = Greek middle dot
{ "\u00B7", "&middot;" }, // cedilla = spacing cedilla
{ "\u00B8", "&cedil;" }, // superscript one = superscript digit one
{ "\u00B9", "&sup1;" }, // masculine ordinal indicator
{ "\u00BA", "&ordm;" }, // right-pointing double angle quotation mark = right pointing guillemet
{ "\u00BB", "&raquo;" }, // vulgar fraction one quarter = fraction one quarter
{ "\u00BC", "&frac14;" }, // vulgar fraction one half = fraction one half
{ "\u00BD", "&frac12;" }, // vulgar fraction three quarters = fraction three quarters
{ "\u00BE", "&frac34;" }, // inverted question mark = turned question mark
{ "\u00BF", "&iquest;" }, // � - uppercase A, grave accent
{ "\u00C0", "&Agrave;" }, // � - uppercase A, acute accent
{ "\u00C1", "&Aacute;" }, // � - uppercase A, circumflex accent
{ "\u00C2", "&Acirc;" }, // � - uppercase A, tilde
{ "\u00C3", "&Atilde;" }, // � - uppercase A, umlaut
{ "\u00C4", "&Auml;" }, // � - uppercase A, ring
{ "\u00C5", "&Aring;" }, // � - uppercase AE
{ "\u00C6", "&AElig;" }, // � - uppercase C, cedilla
{ "\u00C7", "&Ccedil;" }, // � - uppercase E, grave accent
{ "\u00C8", "&Egrave;" }, // � - uppercase E, acute accent
{ "\u00C9", "&Eacute;" }, // � - uppercase E, circumflex accent
{ "\u00CA", "&Ecirc;" }, // � - uppercase E, umlaut
{ "\u00CB", "&Euml;" }, // � - uppercase I, grave accent
{ "\u00CC", "&Igrave;" }, // � - uppercase I, acute accent
{ "\u00CD", "&Iacute;" }, // � - uppercase I, circumflex accent
{ "\u00CE", "&Icirc;" }, // � - uppercase I, umlaut
{ "\u00CF", "&Iuml;" }, // � - uppercase Eth, Icelandic
{ "\u00D0", "&ETH;" }, // � - uppercase N, tilde
{ "\u00D1", "&Ntilde;" }, // � - uppercase O, grave accent
{ "\u00D2", "&Ograve;" }, // � - uppercase O, acute accent
{ "\u00D3", "&Oacute;" }, // � - uppercase O, circumflex accent
{ "\u00D4", "&Ocirc;" }, // � - uppercase O, tilde
{ "\u00D5", "&Otilde;" }, // � - uppercase O, umlaut
{ "\u00D6", "&Ouml;" }, // multiplication sign
{ "\u00D7", "&times;" }, // � - uppercase O, slash
{ "\u00D8", "&Oslash;" }, // � - uppercase U, grave accent
{ "\u00D9", "&Ugrave;" }, // � - uppercase U, acute accent
{ "\u00DA", "&Uacute;" }, // � - uppercase U, circumflex accent
{ "\u00DB", "&Ucirc;" }, // � - uppercase U, umlaut
{ "\u00DC", "&Uuml;" }, // � - uppercase Y, acute accent
{ "\u00DD", "&Yacute;" }, // � - uppercase THORN, Icelandic
{ "\u00DE", "&THORN;" }, // � - lowercase sharps, German
{ "\u00DF", "&szlig;" }, // � - lowercase a, grave accent
{ "\u00E0", "&agrave;" }, // � - lowercase a, acute accent
{ "\u00E1", "&aacute;" }, // � - lowercase a, circumflex accent
{ "\u00E2", "&acirc;" }, // � - lowercase a, tilde
{ "\u00E3", "&atilde;" }, // � - lowercase a, umlaut
{ "\u00E4", "&auml;" }, // � - lowercase a, ring
{ "\u00E5", "&aring;" }, // � - lowercase ae
{ "\u00E6", "&aelig;" }, // � - lowercase c, cedilla
{ "\u00E7", "&ccedil;" }, // � - lowercase e, grave accent
{ "\u00E8", "&egrave;" }, // � - lowercase e, acute accent
{ "\u00E9", "&eacute;" }, // � - lowercase e, circumflex accent
{ "\u00EA", "&ecirc;" }, // � - lowercase e, umlaut
{ "\u00EB", "&euml;" }, // � - lowercase i, grave accent
{ "\u00EC", "&igrave;" }, // � - lowercase i, acute accent
{ "\u00ED", "&iacute;" }, // � - lowercase i, circumflex accent
{ "\u00EE", "&icirc;" }, // � - lowercase i, umlaut
{ "\u00EF", "&iuml;" }, // � - lowercase eth, Icelandic
{ "\u00F0", "&eth;" }, // � - lowercase n, tilde
{ "\u00F1", "&ntilde;" }, // � - lowercase o, grave accent
{ "\u00F2", "&ograve;" }, // � - lowercase o, acute accent
{ "\u00F3", "&oacute;" }, // � - lowercase o, circumflex accent
{ "\u00F4", "&ocirc;" }, // � - lowercase o, tilde
{ "\u00F5", "&otilde;" }, // � - lowercase o, umlaut
{ "\u00F6", "&ouml;" }, // division sign
{ "\u00F7", "&divide;" }, // � - lowercase o, slash
{ "\u00F8", "&oslash;" }, // � - lowercase u, grave accent
{ "\u00F9", "&ugrave;" }, // � - lowercase u, acute accent
{ "\u00FA", "&uacute;" }, // � - lowercase u, circumflex accent
{ "\u00FB", "&ucirc;" }, // � - lowercase u, umlaut
{ "\u00FC", "&uuml;" }, // � - lowercase y, acute accent
{ "\u00FD", "&yacute;" }, // � - lowercase thorn, Icelandic
{ "\u00FE", "&thorn;" }, // � - lowercase y, umlaut
{ "\u00FF", "&yuml;" } }]
String[][] ISO8859_1_UNESCAPE=Optional[invert(ISO8859_1_ESCAPE)]
String[][] HTML40_EXTENDED_ESCAPE=Optional[{ // <!-- Latin Extended-B -->
// latin small f with hook = function= florin, U+0192 ISOtech -->
{ "\u0192", "&fnof;" }, // <!-- Greek -->
// greek capital letter alpha, U+0391 -->
{ "\u0391", "&Alpha;" }, // greek capital letter beta, U+0392 -->
{ "\u0392", "&Beta;" }, // greek capital letter gamma,U+0393 ISOgrk3 -->
{ "\u0393", "&Gamma;" }, // greek capital letter delta,U+0394 ISOgrk3 -->
{ "\u0394", "&Delta;" }, // greek capital letter epsilon, U+0395 -->
{ "\u0395", "&Epsilon;" }, // greek capital letter zeta, U+0396 -->
{ "\u0396", "&Zeta;" }, // greek capital letter eta, U+0397 -->
{ "\u0397", "&Eta;" }, // greek capital letter theta,U+0398 ISOgrk3 -->
{ "\u0398", "&Theta;" }, // greek capital letter iota, U+0399 -->
{ "\u0399", "&Iota;" }, // greek capital letter kappa, U+039A -->
{ "\u039A", "&Kappa;" }, // greek capital letter lambda,U+039B ISOgrk3 -->
{ "\u039B", "&Lambda;" }, // greek capital letter mu, U+039C -->
{ "\u039C", "&Mu;" }, // greek capital letter nu, U+039D -->
{ "\u039D", "&Nu;" }, // greek capital letter xi, U+039E ISOgrk3 -->
{ "\u039E", "&Xi;" }, // greek capital letter omicron, U+039F -->
{ "\u039F", "&Omicron;" }, // greek capital letter pi, U+03A0 ISOgrk3 -->
{ "\u03A0", "&Pi;" }, // greek capital letter rho, U+03A1 -->
{ "\u03A1", "&Rho;" }, // <!-- there is no Sigmaf, and no U+03A2 character either -->
// greek capital letter sigma,U+03A3 ISOgrk3 -->
{ "\u03A3", "&Sigma;" }, // greek capital letter tau, U+03A4 -->
{ "\u03A4", "&Tau;" }, // greek capital letter upsilon,U+03A5 ISOgrk3 -->
{ "\u03A5", "&Upsilon;" }, // greek capital letter phi,U+03A6 ISOgrk3 -->
{ "\u03A6", "&Phi;" }, // greek capital letter chi, U+03A7 -->
{ "\u03A7", "&Chi;" }, // greek capital letter psi,U+03A8 ISOgrk3 -->
{ "\u03A8", "&Psi;" }, // greek capital letter omega,U+03A9 ISOgrk3 -->
{ "\u03A9", "&Omega;" }, // greek small letter alpha,U+03B1 ISOgrk3 -->
{ "\u03B1", "&alpha;" }, // greek small letter beta, U+03B2 ISOgrk3 -->
{ "\u03B2", "&beta;" }, // greek small letter gamma,U+03B3 ISOgrk3 -->
{ "\u03B3", "&gamma;" }, // greek small letter delta,U+03B4 ISOgrk3 -->
{ "\u03B4", "&delta;" }, // greek small letter epsilon,U+03B5 ISOgrk3 -->
{ "\u03B5", "&epsilon;" }, // greek small letter zeta, U+03B6 ISOgrk3 -->
{ "\u03B6", "&zeta;" }, // greek small letter eta, U+03B7 ISOgrk3 -->
{ "\u03B7", "&eta;" }, // greek small letter theta,U+03B8 ISOgrk3 -->
{ "\u03B8", "&theta;" }, // greek small letter iota, U+03B9 ISOgrk3 -->
{ "\u03B9", "&iota;" }, // greek small letter kappa,U+03BA ISOgrk3 -->
{ "\u03BA", "&kappa;" }, // greek small letter lambda,U+03BB ISOgrk3 -->
{ "\u03BB", "&lambda;" }, // greek small letter mu, U+03BC ISOgrk3 -->
{ "\u03BC", "&mu;" }, // greek small letter nu, U+03BD ISOgrk3 -->
{ "\u03BD", "&nu;" }, // greek small letter xi, U+03BE ISOgrk3 -->
{ "\u03BE", "&xi;" }, // greek small letter omicron, U+03BF NEW -->
{ "\u03BF", "&omicron;" }, // greek small letter pi, U+03C0 ISOgrk3 -->
{ "\u03C0", "&pi;" }, // greek small letter rho, U+03C1 ISOgrk3 -->
{ "\u03C1", "&rho;" }, // greek small letter final sigma,U+03C2 ISOgrk3 -->
{ "\u03C2", "&sigmaf;" }, // greek small letter sigma,U+03C3 ISOgrk3 -->
{ "\u03C3", "&sigma;" }, // greek small letter tau, U+03C4 ISOgrk3 -->
{ "\u03C4", "&tau;" }, // greek small letter upsilon,U+03C5 ISOgrk3 -->
{ "\u03C5", "&upsilon;" }, // greek small letter phi, U+03C6 ISOgrk3 -->
{ "\u03C6", "&phi;" }, // greek small letter chi, U+03C7 ISOgrk3 -->
{ "\u03C7", "&chi;" }, // greek small letter psi, U+03C8 ISOgrk3 -->
{ "\u03C8", "&psi;" }, // greek small letter omega,U+03C9 ISOgrk3 -->
{ "\u03C9", "&omega;" }, // greek small letter theta symbol,U+03D1 NEW -->
{ "\u03D1", "&thetasym;" }, // greek upsilon with hook symbol,U+03D2 NEW -->
{ "\u03D2", "&upsih;" }, // greek pi symbol, U+03D6 ISOgrk3 -->
{ "\u03D6", "&piv;" }, // <!-- General Punctuation -->
// bullet = black small circle,U+2022 ISOpub -->
{ "\u2022", "&bull;" }, // <!-- bullet is NOT the same as bullet operator, U+2219 -->
// horizontal ellipsis = three dot leader,U+2026 ISOpub -->
{ "\u2026", "&hellip;" }, // prime = minutes = feet, U+2032 ISOtech -->
{ "\u2032", "&prime;" }, // double prime = seconds = inches,U+2033 ISOtech -->
{ "\u2033", "&Prime;" }, // overline = spacing overscore,U+203E NEW -->
{ "\u203E", "&oline;" }, // fraction slash, U+2044 NEW -->
{ "\u2044", "&frasl;" }, // <!-- Letterlike Symbols -->
// script capital P = power set= Weierstrass p, U+2118 ISOamso -->
{ "\u2118", "&weierp;" }, // blackletter capital I = imaginary part,U+2111 ISOamso -->
{ "\u2111", "&image;" }, // blackletter capital R = real part symbol,U+211C ISOamso -->
{ "\u211C", "&real;" }, // trade mark sign, U+2122 ISOnum -->
{ "\u2122", "&trade;" }, // alef symbol = first transfinite cardinal,U+2135 NEW -->
{ "\u2135", "&alefsym;" }, // <!-- alef symbol is NOT the same as hebrew letter alef,U+05D0 although the
// same glyph could be used to depict both characters -->
// <!-- Arrows -->
// leftwards arrow, U+2190 ISOnum -->
{ "\u2190", "&larr;" }, // upwards arrow, U+2191 ISOnum-->
{ "\u2191", "&uarr;" }, // rightwards arrow, U+2192 ISOnum -->
{ "\u2192", "&rarr;" }, // downwards arrow, U+2193 ISOnum -->
{ "\u2193", "&darr;" }, // left right arrow, U+2194 ISOamsa -->
{ "\u2194", "&harr;" }, // downwards arrow with corner leftwards= carriage return, U+21B5 NEW -->
{ "\u21B5", "&crarr;" }, // leftwards double arrow, U+21D0 ISOtech -->
{ "\u21D0", "&lArr;" }, // <!-- ISO 10646 does not say that lArr is the same as the 'is implied by'
// arrow but also does not have any other character for that function.
// So ? lArr canbe used for 'is implied by' as ISOtech suggests -->
// upwards double arrow, U+21D1 ISOamsa -->
{ "\u21D1", "&uArr;" }, // rightwards double arrow,U+21D2 ISOtech -->
{ "\u21D2", "&rArr;" }, // <!-- ISO 10646 does not say this is the 'implies' character but does not
// have another character with this function so ?rArr can be used for
// 'implies' as ISOtech suggests -->
// downwards double arrow, U+21D3 ISOamsa -->
{ "\u21D3", "&dArr;" }, // left right double arrow,U+21D4 ISOamsa -->
{ "\u21D4", "&hArr;" }, // <!-- Mathematical Operators -->
// for all, U+2200 ISOtech -->
{ "\u2200", "&forall;" }, // partial differential, U+2202 ISOtech -->
{ "\u2202", "&part;" }, // there exists, U+2203 ISOtech -->
{ "\u2203", "&exist;" }, // empty set = null set = diameter,U+2205 ISOamso -->
{ "\u2205", "&empty;" }, // nabla = backward difference,U+2207 ISOtech -->
{ "\u2207", "&nabla;" }, // element of, U+2208 ISOtech -->
{ "\u2208", "&isin;" }, // not an element of, U+2209 ISOtech -->
{ "\u2209", "&notin;" }, // contains as member, U+220B ISOtech -->
{ "\u220B", "&ni;" }, // <!-- should there be a more memorable name than 'ni'? -->
// n-ary product = product sign,U+220F ISOamsb -->
{ "\u220F", "&prod;" }, // <!-- prod is NOT the same character as U+03A0 'greek capital letter pi'
// though the same glyph might be used for both -->
// n-ary summation, U+2211 ISOamsb -->
{ "\u2211", "&sum;" }, // <!-- sum is NOT the same character as U+03A3 'greek capital letter sigma'
// though the same glyph might be used for both -->
// minus sign, U+2212 ISOtech -->
{ "\u2212", "&minus;" }, // asterisk operator, U+2217 ISOtech -->
{ "\u2217", "&lowast;" }, // square root = radical sign,U+221A ISOtech -->
{ "\u221A", "&radic;" }, // proportional to, U+221D ISOtech -->
{ "\u221D", "&prop;" }, // infinity, U+221E ISOtech -->
{ "\u221E", "&infin;" }, // angle, U+2220 ISOamso -->
{ "\u2220", "&ang;" }, // logical and = wedge, U+2227 ISOtech -->
{ "\u2227", "&and;" }, // logical or = vee, U+2228 ISOtech -->
{ "\u2228", "&or;" }, // intersection = cap, U+2229 ISOtech -->
{ "\u2229", "&cap;" }, // union = cup, U+222A ISOtech -->
{ "\u222A", "&cup;" }, // integral, U+222B ISOtech -->
{ "\u222B", "&int;" }, // therefore, U+2234 ISOtech -->
{ "\u2234", "&there4;" }, // tilde operator = varies with = similar to,U+223C ISOtech -->
{ "\u223C", "&sim;" }, // <!-- tilde operator is NOT the same character as the tilde, U+007E,although
// the same glyph might be used to represent both -->
// approximately equal to, U+2245 ISOtech -->
{ "\u2245", "&cong;" }, // almost equal to = asymptotic to,U+2248 ISOamsr -->
{ "\u2248", "&asymp;" }, // not equal to, U+2260 ISOtech -->
{ "\u2260", "&ne;" }, // identical to, U+2261 ISOtech -->
{ "\u2261", "&equiv;" }, // less-than or equal to, U+2264 ISOtech -->
{ "\u2264", "&le;" }, // greater-than or equal to,U+2265 ISOtech -->
{ "\u2265", "&ge;" }, // subset of, U+2282 ISOtech -->
{ "\u2282", "&sub;" }, // superset of, U+2283 ISOtech -->
{ "\u2283", "&sup;" }, // <!-- note that nsup, 'not a superset of, U+2283' is not covered by the
// Symbol font encoding and is not included. Should it be, for symmetry?
// It is in ISOamsn --> <!ENTITY nsub", "8836"},
// not a subset of, U+2284 ISOamsn -->
// subset of or equal to, U+2286 ISOtech -->
{ "\u2286", "&sube;" }, // superset of or equal to,U+2287 ISOtech -->
{ "\u2287", "&supe;" }, // circled plus = direct sum,U+2295 ISOamsb -->
{ "\u2295", "&oplus;" }, // circled times = vector product,U+2297 ISOamsb -->
{ "\u2297", "&otimes;" }, // up tack = orthogonal to = perpendicular,U+22A5 ISOtech -->
{ "\u22A5", "&perp;" }, // dot operator, U+22C5 ISOamsb -->
{ "\u22C5", "&sdot;" }, // <!-- dot operator is NOT the same character as U+00B7 middle dot -->
// <!-- Miscellaneous Technical -->
// left ceiling = apl upstile,U+2308 ISOamsc -->
{ "\u2308", "&lceil;" }, // right ceiling, U+2309 ISOamsc -->
{ "\u2309", "&rceil;" }, // left floor = apl downstile,U+230A ISOamsc -->
{ "\u230A", "&lfloor;" }, // right floor, U+230B ISOamsc -->
{ "\u230B", "&rfloor;" }, // left-pointing angle bracket = bra,U+2329 ISOtech -->
{ "\u2329", "&lang;" }, // <!-- lang is NOT the same character as U+003C 'less than' or U+2039 'single left-pointing angle quotation
// mark' -->
// right-pointing angle bracket = ket,U+232A ISOtech -->
{ "\u232A", "&rang;" }, // <!-- rang is NOT the same character as U+003E 'greater than' or U+203A
// 'single right-pointing angle quotation mark' -->
// <!-- Geometric Shapes -->
// lozenge, U+25CA ISOpub -->
{ "\u25CA", "&loz;" }, // <!-- Miscellaneous Symbols -->
// black spade suit, U+2660 ISOpub -->
{ "\u2660", "&spades;" }, // <!-- black here seems to mean filled as opposed to hollow -->
// black club suit = shamrock,U+2663 ISOpub -->
{ "\u2663", "&clubs;" }, // black heart suit = valentine,U+2665 ISOpub -->
{ "\u2665", "&hearts;" }, // black diamond suit, U+2666 ISOpub -->
{ "\u2666", "&diams;" }, // <!-- Latin Extended-A -->
// -- latin capital ligature OE,U+0152 ISOlat2 -->
{ "\u0152", "&OElig;" }, // -- latin small ligature oe, U+0153 ISOlat2 -->
{ "\u0153", "&oelig;" }, // <!-- ligature is a misnomer, this is a separate character in some languages -->
// -- latin capital letter S with caron,U+0160 ISOlat2 -->
{ "\u0160", "&Scaron;" }, // -- latin small letter s with caron,U+0161 ISOlat2 -->
{ "\u0161", "&scaron;" }, // -- latin capital letter Y with diaeresis,U+0178 ISOlat2 -->
{ "\u0178", "&Yuml;" }, // <!-- Spacing Modifier Letters -->
// -- modifier letter circumflex accent,U+02C6 ISOpub -->
{ "\u02C6", "&circ;" }, // small tilde, U+02DC ISOdia -->
{ "\u02DC", "&tilde;" }, // <!-- General Punctuation -->
// en space, U+2002 ISOpub -->
{ "\u2002", "&ensp;" }, // em space, U+2003 ISOpub -->
{ "\u2003", "&emsp;" }, // thin space, U+2009 ISOpub -->
{ "\u2009", "&thinsp;" }, // zero width non-joiner,U+200C NEW RFC 2070 -->
{ "\u200C", "&zwnj;" }, // zero width joiner, U+200D NEW RFC 2070 -->
{ "\u200D", "&zwj;" }, // left-to-right mark, U+200E NEW RFC 2070 -->
{ "\u200E", "&lrm;" }, // right-to-left mark, U+200F NEW RFC 2070 -->
{ "\u200F", "&rlm;" }, // en dash, U+2013 ISOpub -->
{ "\u2013", "&ndash;" }, // em dash, U+2014 ISOpub -->
{ "\u2014", "&mdash;" }, // left single quotation mark,U+2018 ISOnum -->
{ "\u2018", "&lsquo;" }, // right single quotation mark,U+2019 ISOnum -->
{ "\u2019", "&rsquo;" }, // single low-9 quotation mark, U+201A NEW -->
{ "\u201A", "&sbquo;" }, // left double quotation mark,U+201C ISOnum -->
{ "\u201C", "&ldquo;" }, // right double quotation mark,U+201D ISOnum -->
{ "\u201D", "&rdquo;" }, // double low-9 quotation mark, U+201E NEW -->
{ "\u201E", "&bdquo;" }, // dagger, U+2020 ISOpub -->
{ "\u2020", "&dagger;" }, // double dagger, U+2021 ISOpub -->
{ "\u2021", "&Dagger;" }, // per mille sign, U+2030 ISOtech -->
{ "\u2030", "&permil;" }, // single left-pointing angle quotation mark,U+2039 ISO proposed -->
{ "\u2039", "&lsaquo;" }, // <!-- lsaquo is proposed but not yet ISO standardized -->
// single right-pointing angle quotation mark,U+203A ISO proposed -->
{ "\u203A", "&rsaquo;" }, // <!-- rsaquo is proposed but not yet ISO standardized -->
// -- euro sign, U+20AC NEW -->
{ "\u20AC", "&euro;" } }]
String[][] HTML40_EXTENDED_UNESCAPE=Optional[invert(HTML40_EXTENDED_ESCAPE)]
String[][] BASIC_ESCAPE=Optional[{ // " - double-quote
{ "\"", "&quot;" }, // & - ampersand
{ "&", "&amp;" }, // < - less-than
{ "<", "&lt;" }, // > - greater-than
{ ">", "&gt;" } }]
String[][] BASIC_UNESCAPE=Optional[invert(BASIC_ESCAPE)]
String[][] APOS_ESCAPE=Optional[{ // XML apostrophe
{ "'", "&apos;" } }]
String[][] APOS_UNESCAPE=Optional[invert(APOS_ESCAPE)]
String[][] JAVA_CTRL_CHARS_ESCAPE=Optional[{ { "\b", "\\b" }, { "\n", "\\n" }, { "\t", "\\t" }, { "\f", "\\f" }, { "\r", "\\r" } }]
String[][] JAVA_CTRL_CHARS_UNESCAPE=Optional[invert(JAVA_CTRL_CHARS_ESCAPE)]
