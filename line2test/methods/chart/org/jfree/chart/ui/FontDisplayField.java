public FontDisplayField(Font font) { [EOL]     super(""); [EOL]     setDisplayFont(font); [EOL]     setEnabled(false); [EOL] } <line_num>: 74,78
public Font getDisplayFont() { [EOL]     return this.displayFont; [EOL] } <line_num>: 85,87
public void setDisplayFont(Font font) { [EOL]     this.displayFont = font; [EOL]     setText(fontToString(this.displayFont)); [EOL] } <line_num>: 94,97
private String fontToString(Font font) { [EOL]     if (font != null) { [EOL]         return font.getFontName() + ", " + font.getSize(); [EOL]     } else { [EOL]         return localizationResources.getString("No_Font_Selected"); [EOL]     } [EOL] } <line_num>: 106,113
