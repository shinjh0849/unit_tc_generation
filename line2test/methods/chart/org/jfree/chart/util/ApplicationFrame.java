public ApplicationFrame(String title) { [EOL]     super(title); [EOL]     addWindowListener(this); [EOL] } <line_num>: 62,65
public void windowClosing(WindowEvent event) { [EOL]     if (event.getWindow() == this) { [EOL]         dispose(); [EOL]         System.exit(0); [EOL]     } [EOL] } <line_num>: 72,77
public void windowClosed(WindowEvent event) { [EOL] } <line_num>: 84,86
public void windowActivated(WindowEvent event) { [EOL] } <line_num>: 93,95
public void windowDeactivated(WindowEvent event) { [EOL] } <line_num>: 102,104
public void windowDeiconified(WindowEvent event) { [EOL] } <line_num>: 111,113
public void windowIconified(WindowEvent event) { [EOL] } <line_num>: 120,122
public void windowOpened(WindowEvent event) { [EOL] } <line_num>: 129,131
