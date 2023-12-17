public SimpleFilterProvider() { [EOL]     this(new HashMap<String, BeanPropertyFilter>()); [EOL] } <line_num>: 44,46
public SimpleFilterProvider(Map<String, BeanPropertyFilter> mapping) { [EOL]     _filtersById = mapping; [EOL] } <line_num>: 51,53
public SimpleFilterProvider setDefaultFilter(BeanPropertyFilter f) { [EOL]     _defaultFilter = f; [EOL]     return this; [EOL] } <line_num>: 61,65
public BeanPropertyFilter getDefaultFilter() { [EOL]     return _defaultFilter; [EOL] } <line_num>: 67,69
public SimpleFilterProvider setFailOnUnknownId(boolean state) { [EOL]     _cfgFailOnUnknownId = state; [EOL]     return this; [EOL] } <line_num>: 71,74
public boolean willFailOnUnknownId() { [EOL]     return _cfgFailOnUnknownId; [EOL] } <line_num>: 76,78
public SimpleFilterProvider addFilter(String id, BeanPropertyFilter filter) { [EOL]     _filtersById.put(id, filter); [EOL]     return this; [EOL] } <line_num>: 80,83
public BeanPropertyFilter removeFilter(String id) { [EOL]     return _filtersById.remove(id); [EOL] } <line_num>: 85,87
@Override [EOL] public BeanPropertyFilter findFilter(Object filterId) { [EOL]     BeanPropertyFilter f = _filtersById.get(filterId); [EOL]     if (f == null) { [EOL]         f = _defaultFilter; [EOL]         if (f == null && _cfgFailOnUnknownId) { [EOL]             throw new IllegalArgumentException("No filter configured with id '" + filterId + "' (type " + filterId.getClass().getName() + ")"); [EOL]         } [EOL]     } [EOL]     return f; [EOL] } <line_num>: 95,107
