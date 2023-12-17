public RootHandler() { [EOL]     this.subHandlers = new Stack(); [EOL] } <line_num>: 59,61
public Stack getSubHandlers() { [EOL]     return this.subHandlers; [EOL] } <line_num>: 68,70
public void characters(char[] ch, int start, int length) throws SAXException { [EOL]     DefaultHandler handler = getCurrentHandler(); [EOL]     if (handler != this) { [EOL]         handler.characters(ch, start, length); [EOL]     } [EOL] } <line_num>: 81,87
public DefaultHandler getCurrentHandler() { [EOL]     DefaultHandler result = this; [EOL]     if (this.subHandlers != null) { [EOL]         if (this.subHandlers.size() > 0) { [EOL]             Object top = this.subHandlers.peek(); [EOL]             if (top != null) { [EOL]                 result = (DefaultHandler) top; [EOL]             } [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 94,105
public void pushSubHandler(DefaultHandler subhandler) { [EOL]     this.subHandlers.push(subhandler); [EOL] } <line_num>: 112,114
public DefaultHandler popSubHandler() { [EOL]     return (DefaultHandler) this.subHandlers.pop(); [EOL] } <line_num>: 121,123
