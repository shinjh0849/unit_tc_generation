public HttpSessionAndServletContext(HttpSession session, ServletContext context) { [EOL]     this.session = session; [EOL]     this.context = context; [EOL] } <line_num>: 33,37
public HttpSession getSession() { [EOL]     return session; [EOL] } <line_num>: 39,41
public ServletContext getServletContext() { [EOL]     return context; [EOL] } <line_num>: 43,45
