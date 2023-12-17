public OverLIBToolTipTagFragmentGenerator() { [EOL]     super(); [EOL] } <line_num>: 56,58
public String generateToolTipFragment(String toolTipText) { [EOL]     return " onMouseOver=\"return overlib('" + ImageMapUtilities.javascriptEscape(toolTipText) + "');\" onMouseOut=\"return nd();\""; [EOL] } <line_num>: 67,71
