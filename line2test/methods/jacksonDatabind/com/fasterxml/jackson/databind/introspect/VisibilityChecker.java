public Std(JsonAutoDetect ann) { [EOL]     _getterMinLevel = ann.getterVisibility(); [EOL]     _isGetterMinLevel = ann.isGetterVisibility(); [EOL]     _setterMinLevel = ann.setterVisibility(); [EOL]     _creatorMinLevel = ann.creatorVisibility(); [EOL]     _fieldMinLevel = ann.fieldVisibility(); [EOL] } <line_num>: 188,196
public Std(Visibility getter, Visibility isGetter, Visibility setter, Visibility creator, Visibility field) { [EOL]     _getterMinLevel = getter; [EOL]     _isGetterMinLevel = isGetter; [EOL]     _setterMinLevel = setter; [EOL]     _creatorMinLevel = creator; [EOL]     _fieldMinLevel = field; [EOL] } <line_num>: 201,208
public Std(Visibility v) { [EOL]     if (v == Visibility.DEFAULT) { [EOL]         _getterMinLevel = DEFAULT._getterMinLevel; [EOL]         _isGetterMinLevel = DEFAULT._isGetterMinLevel; [EOL]         _setterMinLevel = DEFAULT._setterMinLevel; [EOL]         _creatorMinLevel = DEFAULT._creatorMinLevel; [EOL]         _fieldMinLevel = DEFAULT._fieldMinLevel; [EOL]     } else { [EOL]         _getterMinLevel = v; [EOL]         _isGetterMinLevel = v; [EOL]         _setterMinLevel = v; [EOL]         _creatorMinLevel = v; [EOL]         _fieldMinLevel = v; [EOL]     } [EOL] } <line_num>: 216,232
public T with(JsonAutoDetect ann); <line_num>: 31,31
public T with(Visibility v); <line_num>: 43,43
public T withVisibility(PropertyAccessor method, Visibility v); <line_num>: 55,55
public T withGetterVisibility(Visibility v); <line_num>: 61,61
public T withIsGetterVisibility(Visibility v); <line_num>: 67,67
public T withSetterVisibility(Visibility v); <line_num>: 73,73
public T withCreatorVisibility(Visibility v); <line_num>: 80,80
public T withFieldVisibility(Visibility v); <line_num>: 86,86
public boolean isGetterVisible(Method m); <line_num>: 95,95
public boolean isGetterVisible(AnnotatedMethod m); <line_num>: 96,96
public boolean isIsGetterVisible(Method m); <line_num>: 103,103
public boolean isIsGetterVisible(AnnotatedMethod m); <line_num>: 104,104
public boolean isSetterVisible(Method m); <line_num>: 111,111
public boolean isSetterVisible(AnnotatedMethod m); <line_num>: 112,112
public boolean isCreatorVisible(Member m); <line_num>: 119,119
public boolean isCreatorVisible(AnnotatedMember m); <line_num>: 120,120
public boolean isFieldVisible(Field f); <line_num>: 127,127
public boolean isFieldVisible(AnnotatedField f); <line_num>: 128,128
public static Std defaultInstance() { [EOL]     return DEFAULT; [EOL] } <line_num>: 180,180
@Override [EOL] public Std with(JsonAutoDetect ann) { [EOL]     Std curr = this; [EOL]     if (ann != null) { [EOL]         curr = curr.withGetterVisibility(ann.getterVisibility()); [EOL]         curr = curr.withIsGetterVisibility(ann.isGetterVisibility()); [EOL]         curr = curr.withSetterVisibility(ann.setterVisibility()); [EOL]         curr = curr.withCreatorVisibility(ann.creatorVisibility()); [EOL]         curr = curr.withFieldVisibility(ann.fieldVisibility()); [EOL]     } [EOL]     return curr; [EOL] } <line_num>: 241,253
@Override [EOL] public Std with(Visibility v) { [EOL]     if (v == Visibility.DEFAULT) { [EOL]         return DEFAULT; [EOL]     } [EOL]     return new Std(v); [EOL] } <line_num>: 255,262
@Override [EOL] public Std withVisibility(PropertyAccessor method, Visibility v) { [EOL]     switch(method) { [EOL]         case GETTER: [EOL]             return withGetterVisibility(v); [EOL]         case SETTER: [EOL]             return withSetterVisibility(v); [EOL]         case CREATOR: [EOL]             return withCreatorVisibility(v); [EOL]         case FIELD: [EOL]             return withFieldVisibility(v); [EOL]         case IS_GETTER: [EOL]             return withIsGetterVisibility(v); [EOL]         case ALL: [EOL]             return with(v); [EOL]         default: [EOL]             return this; [EOL]     } [EOL] } <line_num>: 264,285
@Override [EOL] public Std withGetterVisibility(Visibility v) { [EOL]     if (v == Visibility.DEFAULT) [EOL]         v = DEFAULT._getterMinLevel; [EOL]     if (_getterMinLevel == v) [EOL]         return this; [EOL]     return new Std(v, _isGetterMinLevel, _setterMinLevel, _creatorMinLevel, _fieldMinLevel); [EOL] } <line_num>: 287,292
@Override [EOL] public Std withIsGetterVisibility(Visibility v) { [EOL]     if (v == Visibility.DEFAULT) [EOL]         v = DEFAULT._isGetterMinLevel; [EOL]     if (_isGetterMinLevel == v) [EOL]         return this; [EOL]     return new Std(_getterMinLevel, v, _setterMinLevel, _creatorMinLevel, _fieldMinLevel); [EOL] } <line_num>: 294,299
@Override [EOL] public Std withSetterVisibility(Visibility v) { [EOL]     if (v == Visibility.DEFAULT) [EOL]         v = DEFAULT._setterMinLevel; [EOL]     if (_setterMinLevel == v) [EOL]         return this; [EOL]     return new Std(_getterMinLevel, _isGetterMinLevel, v, _creatorMinLevel, _fieldMinLevel); [EOL] } <line_num>: 301,306
@Override [EOL] public Std withCreatorVisibility(Visibility v) { [EOL]     if (v == Visibility.DEFAULT) [EOL]         v = DEFAULT._creatorMinLevel; [EOL]     if (_creatorMinLevel == v) [EOL]         return this; [EOL]     return new Std(_getterMinLevel, _isGetterMinLevel, _setterMinLevel, v, _fieldMinLevel); [EOL] } <line_num>: 308,313
@Override [EOL] public Std withFieldVisibility(Visibility v) { [EOL]     if (v == Visibility.DEFAULT) [EOL]         v = DEFAULT._fieldMinLevel; [EOL]     if (_fieldMinLevel == v) [EOL]         return this; [EOL]     return new Std(_getterMinLevel, _isGetterMinLevel, _setterMinLevel, _creatorMinLevel, v); [EOL] } <line_num>: 315,320
@Override [EOL] public boolean isCreatorVisible(Member m) { [EOL]     return _creatorMinLevel.isVisible(m); [EOL] } <line_num>: 328,331
@Override [EOL] public boolean isCreatorVisible(AnnotatedMember m) { [EOL]     return isCreatorVisible(m.getMember()); [EOL] } <line_num>: 333,336
@Override [EOL] public boolean isFieldVisible(Field f) { [EOL]     return _fieldMinLevel.isVisible(f); [EOL] } <line_num>: 338,341
@Override [EOL] public boolean isFieldVisible(AnnotatedField f) { [EOL]     return isFieldVisible(f.getAnnotated()); [EOL] } <line_num>: 343,346
@Override [EOL] public boolean isGetterVisible(Method m) { [EOL]     return _getterMinLevel.isVisible(m); [EOL] } <line_num>: 348,351
@Override [EOL] public boolean isGetterVisible(AnnotatedMethod m) { [EOL]     return isGetterVisible(m.getAnnotated()); [EOL] } <line_num>: 353,356
@Override [EOL] public boolean isIsGetterVisible(Method m) { [EOL]     return _isGetterMinLevel.isVisible(m); [EOL] } <line_num>: 358,361
@Override [EOL] public boolean isIsGetterVisible(AnnotatedMethod m) { [EOL]     return isIsGetterVisible(m.getAnnotated()); [EOL] } <line_num>: 363,366
@Override [EOL] public boolean isSetterVisible(Method m) { [EOL]     return _setterMinLevel.isVisible(m); [EOL] } <line_num>: 368,371
@Override [EOL] public boolean isSetterVisible(AnnotatedMethod m) { [EOL]     return isSetterVisible(m.getAnnotated()); [EOL] } <line_num>: 373,376
@Override [EOL] public String toString() { [EOL]     return new StringBuilder("[Visibility:").append(" getter: ").append(_getterMinLevel).append(", isGetter: ").append(_isGetterMinLevel).append(", setter: ").append(_setterMinLevel).append(", creator: ").append(_creatorMinLevel).append(", field: ").append(_fieldMinLevel).append("]").toString(); [EOL] } <line_num>: 384,393
