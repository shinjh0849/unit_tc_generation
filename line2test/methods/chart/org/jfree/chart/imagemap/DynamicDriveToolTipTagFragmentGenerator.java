public DynamicDriveToolTipTagFragmentGenerator() { [EOL]     super(); [EOL] } <line_num>: 62,64
public DynamicDriveToolTipTagFragmentGenerator(String title, int style) { [EOL]     this.title = title; [EOL]     this.style = style; [EOL] } <line_num>: 74,77
public String generateToolTipFragment(String toolTipText) { [EOL]     return " onMouseOver=\"return stm(['" + ImageMapUtilities.javascriptEscape(this.title) + "','" + ImageMapUtilities.javascriptEscape(toolTipText) + "'],Style[" + this.style + "]);\"" + " onMouseOut=\"return htm();\""; [EOL] } <line_num>: 86,91
