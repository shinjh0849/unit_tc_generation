public SimpleFilterProvider()
public SimpleFilterProvider(Map<String, BeanPropertyFilter> mapping)
public SimpleFilterProvider setDefaultFilter(BeanPropertyFilter f)
public BeanPropertyFilter getDefaultFilter()
public SimpleFilterProvider setFailOnUnknownId(boolean state)
public boolean willFailOnUnknownId()
public SimpleFilterProvider addFilter(String id, BeanPropertyFilter filter)
public BeanPropertyFilter removeFilter(String id)
public BeanPropertyFilter findFilter(Object filterId)
long serialVersionUID=Optional[-2825494703774121220L]
Map<String, BeanPropertyFilter> _filtersById
BeanPropertyFilter _defaultFilter
boolean _cfgFailOnUnknownId=Optional[true]
