public PageScopeContext(PageContext pageContext) { [EOL]     this.pageContext = pageContext; [EOL] } <line_num>: 35,37
public Enumeration getAttributeNames() { [EOL]     return pageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE); [EOL] } <line_num>: 42,44
public Object getAttribute(String attribute) { [EOL]     return pageContext.getAttribute(attribute, PageContext.PAGE_SCOPE); [EOL] } <line_num>: 46,48
public void setAttribute(String attribute, Object value) { [EOL]     pageContext.setAttribute(attribute, value, PageContext.PAGE_SCOPE); [EOL] } <line_num>: 50,52
