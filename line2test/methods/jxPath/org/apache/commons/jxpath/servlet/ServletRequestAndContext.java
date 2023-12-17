public ServletRequestAndContext(ServletRequest request, ServletContext context) { [EOL]     super(null, context); [EOL]     this.request = request; [EOL] } <line_num>: 35,40
public HttpSession getSession() { [EOL]     if (request instanceof HttpServletRequest) { [EOL]         return ((HttpServletRequest) request).getSession(false); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 43,48
public ServletRequest getServletRequest() { [EOL]     return request; [EOL] } <line_num>: 50,52
