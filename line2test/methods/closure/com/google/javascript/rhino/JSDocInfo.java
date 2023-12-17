JSDocInfo(boolean includeDocumentation) { [EOL]     this.includeDocumentation = includeDocumentation; [EOL] } <line_num>: 334,336
public JSDocInfo() { [EOL] } <line_num>: 339,339
@Override [EOL] public void setItem(String item) { [EOL]     Preconditions.checkArgument(item.charAt(0) != ' ' && item.charAt(item.length() - 1) != ' ', "String has leading or trailing whitespace"); [EOL]     super.setItem(item); [EOL] } <line_num>: 135,141
public boolean hasBrackets() { [EOL]     return brackets; [EOL] } <line_num>: 158,160
void setHasBrackets(boolean newVal) { [EOL]     brackets = newVal; [EOL] } <line_num>: 162,164
public StringPosition getAnnotation() { [EOL]     return annotation; [EOL] } <line_num>: 187,189
void setAnnotation(TrimmedStringPosition p) { [EOL]     annotation = p; [EOL] } <line_num>: 191,193
@Deprecated [EOL] public StringPosition getName() { [EOL]     return name; [EOL] } <line_num>: 200,203
void setName(TrimmedStringPosition p) { [EOL]     name = p; [EOL] } <line_num>: 205,207
public SourcePosition<Node> getNameNode() { [EOL]     return nameNode; [EOL] } <line_num>: 213,215
void setNameNode(SourcePosition<Node> p) { [EOL]     nameNode = p; [EOL] } <line_num>: 217,219
public StringPosition getDescription() { [EOL]     return description; [EOL] } <line_num>: 225,227
void setDescription(StringPosition p) { [EOL]     description = p; [EOL] } <line_num>: 229,231
public TypePosition getType() { [EOL]     return type; [EOL] } <line_num>: 237,239
void setType(TypePosition p) { [EOL]     type = p; [EOL] } <line_num>: 241,243
void setConsistentIdGenerator(boolean value) { [EOL]     setFlag(value, MASK_CONSISTIDGEN); [EOL] } <line_num>: 341,343
void setStableIdGenerator(boolean value) { [EOL]     setFlag(value, MASK_STALBEIDGEN); [EOL] } <line_num>: 345,347
void setConstant(boolean value) { [EOL]     setFlag(value, MASK_CONSTANT); [EOL] } <line_num>: 349,351
void setConstructor(boolean value) { [EOL]     setFlag(value, MASK_CONSTRUCTOR); [EOL] } <line_num>: 353,355
void setStruct() { [EOL]     setFlag(true, MASK_STRUCT); [EOL] } <line_num>: 357,359
void setDict() { [EOL]     setFlag(true, MASK_DICT); [EOL] } <line_num>: 361,363
void setDefine(boolean value) { [EOL]     setFlag(value, MASK_DEFINE); [EOL] } <line_num>: 365,367
void setHidden(boolean value) { [EOL]     setFlag(value, MASK_HIDDEN); [EOL] } <line_num>: 369,371
void setNoCheck(boolean value) { [EOL]     setFlag(value, MASK_NOCHECK); [EOL] } <line_num>: 373,375
void setShouldPreserveTry(boolean value) { [EOL]     setFlag(value, MASK_PRESERVETRY); [EOL] } <line_num>: 377,379
void setOverride(boolean value) { [EOL]     setFlag(value, MASK_OVERRIDE); [EOL] } <line_num>: 381,383
void setNoAlias(boolean value) { [EOL]     setFlag(value, MASK_NOALIAS); [EOL] } <line_num>: 385,387
public void setDeprecated(boolean value) { [EOL]     setFlag(value, MASK_DEPRECATED); [EOL] } <line_num>: 390,392
void setInterface(boolean value) { [EOL]     setFlag(value, MASK_INTERFACE); [EOL] } <line_num>: 394,396
void setExport(boolean value) { [EOL]     setFlag(value, MASK_EXPORT); [EOL] } <line_num>: 398,400
void setExpose(boolean value) { [EOL]     setFlag(value, MASK_EXPOSE); [EOL] } <line_num>: 402,404
void setNoShadow(boolean value) { [EOL]     setFlag(value, MASK_NOSHADOW); [EOL] } <line_num>: 406,408
void setIdGenerator(boolean value) { [EOL]     setFlag(value, MASK_IDGEN); [EOL] } <line_num>: 410,412
void setImplicitCast(boolean value) { [EOL]     setFlag(value, MASK_IMPLICITCAST); [EOL] } <line_num>: 414,416
void setNoSideEffects(boolean value) { [EOL]     setFlag(value, MASK_NOSIDEEFFECTS); [EOL] } <line_num>: 418,420
void setExterns(boolean value) { [EOL]     setFlag(value, MASK_EXTERNS); [EOL] } <line_num>: 422,424
void setJavaDispatch(boolean value) { [EOL]     setFlag(value, MASK_JAVADISPATCH); [EOL] } <line_num>: 426,428
void setNoCompile(boolean value) { [EOL]     setFlag(value, MASK_NOCOMPILE); [EOL] } <line_num>: 430,432
private void setFlag(boolean value, int mask) { [EOL]     if (value) { [EOL]         bitset |= mask; [EOL]     } else { [EOL]         bitset &= ~mask; [EOL]     } [EOL] } <line_num>: 434,440
public boolean isConsistentIdGenerator() { [EOL]     return getFlag(MASK_CONSISTIDGEN); [EOL] } <line_num>: 446,448
public boolean isStableIdGenerator() { [EOL]     return getFlag(MASK_STALBEIDGEN); [EOL] } <line_num>: 453,455
public boolean isConstant() { [EOL]     return getFlag(MASK_CONSTANT) || isDefine(); [EOL] } <line_num>: 461,463
public boolean isConstructor() { [EOL]     return getFlag(MASK_CONSTRUCTOR); [EOL] } <line_num>: 469,471
public boolean makesStructs() { [EOL]     return getFlag(MASK_STRUCT); [EOL] } <line_num>: 477,479
public boolean makesDicts() { [EOL]     return getFlag(MASK_DICT); [EOL] } <line_num>: 485,487
public boolean isDefine() { [EOL]     return getFlag(MASK_DEFINE); [EOL] } <line_num>: 494,496
public boolean isHidden() { [EOL]     return getFlag(MASK_HIDDEN); [EOL] } <line_num>: 502,504
public boolean isNoTypeCheck() { [EOL]     return getFlag(MASK_NOCHECK); [EOL] } <line_num>: 510,512
public boolean shouldPreserveTry() { [EOL]     return getFlag(MASK_PRESERVETRY); [EOL] } <line_num>: 518,520
public boolean isOverride() { [EOL]     return getFlag(MASK_OVERRIDE); [EOL] } <line_num>: 526,528
public boolean isNoAlias() { [EOL]     return getFlag(MASK_NOALIAS); [EOL] } <line_num>: 534,536
public boolean isDeprecated() { [EOL]     return getFlag(MASK_DEPRECATED); [EOL] } <line_num>: 542,544
public boolean isInterface() { [EOL]     return getFlag(MASK_INTERFACE); [EOL] } <line_num>: 550,552
public boolean isExport() { [EOL]     return getFlag(MASK_EXPORT); [EOL] } <line_num>: 558,560
public boolean isExpose() { [EOL]     return getFlag(MASK_EXPOSE); [EOL] } <line_num>: 566,568
public boolean isNoShadow() { [EOL]     return getFlag(MASK_NOSHADOW); [EOL] } <line_num>: 574,576
public boolean isIdGenerator() { [EOL]     return getFlag(MASK_IDGEN); [EOL] } <line_num>: 582,584
public boolean isImplicitCast() { [EOL]     return getFlag(MASK_IMPLICITCAST); [EOL] } <line_num>: 590,592
public boolean isNoSideEffects() { [EOL]     return getFlag(MASK_NOSIDEEFFECTS); [EOL] } <line_num>: 598,600
public boolean isExterns() { [EOL]     return getFlag(MASK_EXTERNS); [EOL] } <line_num>: 606,608
public boolean isJavaDispatch() { [EOL]     return getFlag(MASK_JAVADISPATCH); [EOL] } <line_num>: 614,616
public boolean isNoCompile() { [EOL]     return getFlag(MASK_NOCOMPILE); [EOL] } <line_num>: 622,624
public boolean containsDeclaration() { [EOL]     return (hasType() || hasReturnType() || hasEnumParameterType() || hasTypedefType() || hasThisType() || getParameterCount() > 0 || getFlag(MASK_CONSTANT | MASK_CONSTRUCTOR | MASK_DEFINE | MASK_OVERRIDE | MASK_NOALIAS | MASK_DEPRECATED | MASK_INTERFACE | MASK_NOSHADOW | MASK_IMPLICITCAST | MASK_NOSIDEEFFECTS)); [EOL] } <line_num>: 629,646
private boolean getFlag(int mask) { [EOL]     return (bitset & mask) != 0x00; [EOL] } <line_num>: 648,650
public void setVisibility(Visibility visibility) { [EOL]     this.visibility = visibility; [EOL] } <line_num>: 653,655
private void lazyInitInfo() { [EOL]     if (info == null) { [EOL]         info = new LazilyInitializedInfo(); [EOL]     } [EOL] } <line_num>: 657,661
private boolean lazyInitDocumentation() { [EOL]     if (!includeDocumentation) { [EOL]         return false; [EOL]     } [EOL]     if (documentation == null) { [EOL]         documentation = new LazilyInitializedDocumentation(); [EOL]     } [EOL]     return true; [EOL] } <line_num>: 667,677
Marker addMarker() { [EOL]     if (!lazyInitDocumentation()) { [EOL]         return null; [EOL]     } [EOL]     if (documentation.markers == null) { [EOL]         documentation.markers = Lists.newArrayList(); [EOL]     } [EOL]     Marker marker = new Marker(); [EOL]     documentation.markers.add(marker); [EOL]     return marker; [EOL] } <line_num>: 683,695
boolean setDeprecationReason(String reason) { [EOL]     lazyInitInfo(); [EOL]     if (info.deprecated != null) { [EOL]         return false; [EOL]     } [EOL]     info.deprecated = reason; [EOL]     return true; [EOL] } <line_num>: 702,711
public void addSuppression(String suppression) { [EOL]     lazyInitInfo(); [EOL]     if (info.suppressions == null) { [EOL]         info.suppressions = Sets.newHashSet(); [EOL]     } [EOL]     info.suppressions.add(suppression); [EOL] } <line_num>: 716,723
boolean setSuppressions(Set<String> suppressions) { [EOL]     lazyInitInfo(); [EOL]     if (info.suppressions != null) { [EOL]         return false; [EOL]     } [EOL]     info.suppressions = suppressions; [EOL]     return true; [EOL] } <line_num>: 729,738
void addModifies(String modifies) { [EOL]     lazyInitInfo(); [EOL]     if (info.modifies == null) { [EOL]         info.modifies = Sets.newHashSet(); [EOL]     } [EOL]     info.modifies.add(modifies); [EOL] } <line_num>: 743,750
boolean setModifies(Set<String> modifies) { [EOL]     lazyInitInfo(); [EOL]     if (info.modifies != null) { [EOL]         return false; [EOL]     } [EOL]     info.modifies = modifies; [EOL]     return true; [EOL] } <line_num>: 756,765
boolean documentVersion(String version) { [EOL]     if (!lazyInitDocumentation()) { [EOL]         return true; [EOL]     } [EOL]     if (documentation.version != null) { [EOL]         return false; [EOL]     } [EOL]     documentation.version = version; [EOL]     return true; [EOL] } <line_num>: 770,781
boolean documentReference(String reference) { [EOL]     if (!lazyInitDocumentation()) { [EOL]         return true; [EOL]     } [EOL]     if (documentation.sees == null) { [EOL]         documentation.sees = Lists.newArrayList(); [EOL]     } [EOL]     documentation.sees.add(reference); [EOL]     return true; [EOL] } <line_num>: 786,797
boolean documentAuthor(String author) { [EOL]     if (!lazyInitDocumentation()) { [EOL]         return true; [EOL]     } [EOL]     if (documentation.authors == null) { [EOL]         documentation.authors = Lists.newArrayList(); [EOL]     } [EOL]     documentation.authors.add(author); [EOL]     return true; [EOL] } <line_num>: 802,813
boolean documentThrows(JSTypeExpression type, String throwsDescription) { [EOL]     if (!lazyInitDocumentation()) { [EOL]         return true; [EOL]     } [EOL]     if (documentation.throwsDescriptions == null) { [EOL]         documentation.throwsDescriptions = new LinkedHashMap<JSTypeExpression, String>(); [EOL]     } [EOL]     if (!documentation.throwsDescriptions.containsKey(type)) { [EOL]         documentation.throwsDescriptions.put(type, throwsDescription); [EOL]         return true; [EOL]     } [EOL]     return false; [EOL] } <line_num>: 818,834
boolean documentParam(String parameter, String description) { [EOL]     if (!lazyInitDocumentation()) { [EOL]         return true; [EOL]     } [EOL]     if (documentation.parameters == null) { [EOL]         documentation.parameters = new LinkedHashMap<String, String>(); [EOL]     } [EOL]     if (!documentation.parameters.containsKey(parameter)) { [EOL]         documentation.parameters.put(parameter, description); [EOL]         return true; [EOL]     } else { [EOL]         return false; [EOL]     } [EOL] } <line_num>: 844,859
boolean documentBlock(String description) { [EOL]     if (!lazyInitDocumentation()) { [EOL]         return true; [EOL]     } [EOL]     if (documentation.blockDescription != null) { [EOL]         return false; [EOL]     } [EOL]     documentation.blockDescription = description; [EOL]     return true; [EOL] } <line_num>: 866,877
boolean documentFileOverview(String description) { [EOL]     setFlag(true, MASK_FILEOVERVIEW); [EOL]     if (!lazyInitDocumentation()) { [EOL]         return true; [EOL]     } [EOL]     if (documentation.fileOverview != null) { [EOL]         return false; [EOL]     } [EOL]     documentation.fileOverview = description; [EOL]     return true; [EOL] } <line_num>: 884,896
boolean documentReturn(String description) { [EOL]     if (!lazyInitDocumentation()) { [EOL]         return true; [EOL]     } [EOL]     if (documentation.returnDescription != null) { [EOL]         return false; [EOL]     } [EOL]     documentation.returnDescription = description; [EOL]     return true; [EOL] } <line_num>: 904,915
boolean declareParam(JSTypeExpression jsType, String parameter) { [EOL]     lazyInitInfo(); [EOL]     if (info.parameters == null) { [EOL]         info.parameters = new LinkedHashMap<String, JSTypeExpression>(); [EOL]     } [EOL]     if (!info.parameters.containsKey(parameter)) { [EOL]         info.parameters.put(parameter, jsType); [EOL]         return true; [EOL]     } else { [EOL]         return false; [EOL]     } [EOL] } <line_num>: 925,936
boolean declareTemplateTypeNames(List<String> templateTypeNames) { [EOL]     lazyInitInfo(); [EOL]     if (info.templateTypeNames != null) { [EOL]         return false; [EOL]     } [EOL]     info.templateTypeNames = ImmutableList.copyOf(templateTypeNames); [EOL]     return true; [EOL] } <line_num>: 944,953
boolean declareThrows(JSTypeExpression jsType) { [EOL]     lazyInitInfo(); [EOL]     if (info.thrownTypes == null) { [EOL]         info.thrownTypes = Lists.newArrayList(); [EOL]     } [EOL]     info.thrownTypes.add(jsType); [EOL]     return true; [EOL] } <line_num>: 960,969
public Visibility getVisibility() { [EOL]     return visibility; [EOL] } <line_num>: 976,978
public JSTypeExpression getParameterType(String parameter) { [EOL]     if (info == null || info.parameters == null) { [EOL]         return null; [EOL]     } [EOL]     return info.parameters.get(parameter); [EOL] } <line_num>: 986,991
public boolean hasParameter(String parameter) { [EOL]     if (info == null || info.parameters == null) { [EOL]         return false; [EOL]     } [EOL]     return info.parameters.containsKey(parameter); [EOL] } <line_num>: 996,1001
public boolean hasParameterType(String parameter) { [EOL]     return getParameterType(parameter) != null; [EOL] } <line_num>: 1009,1011
public Set<String> getParameterNames() { [EOL]     if (info == null || info.parameters == null) { [EOL]         return ImmutableSet.of(); [EOL]     } [EOL]     return ImmutableSet.copyOf(info.parameters.keySet()); [EOL] } <line_num>: 1020,1025
public int getParameterCount() { [EOL]     if (info == null || info.parameters == null) { [EOL]         return 0; [EOL]     } [EOL]     return info.parameters.size(); [EOL] } <line_num>: 1030,1035
void setType(JSTypeExpression type) { [EOL]     setType(type, TYPEFIELD_TYPE); [EOL] } <line_num>: 1037,1039
void setReturnType(JSTypeExpression type) { [EOL]     setType(type, TYPEFIELD_RETURN); [EOL] } <line_num>: 1041,1043
void setEnumParameterType(JSTypeExpression type) { [EOL]     setType(type, TYPEFIELD_ENUM); [EOL] } <line_num>: 1045,1047
void setTypedefType(JSTypeExpression type) { [EOL]     setType(type, TYPEFIELD_TYPEDEF); [EOL] } <line_num>: 1049,1051
private void setType(JSTypeExpression type, int mask) { [EOL]     if ((bitset & MASK_TYPEFIELD) != 0) { [EOL]         throw new IllegalStateException("API tried to add two incompatible type tags. " + "This should have been blocked and emitted a warning."); [EOL]     } [EOL]     this.bitset = (bitset & MASK_FLAGS) | mask; [EOL]     this.type = type; [EOL] } <line_num>: 1053,1061
public List<JSTypeExpression> getThrownTypes() { [EOL]     if (info == null || info.thrownTypes == null) { [EOL]         return ImmutableList.of(); [EOL]     } [EOL]     return Collections.unmodifiableList(info.thrownTypes); [EOL] } <line_num>: 1066,1071
public boolean hasType() { [EOL]     return hasType(TYPEFIELD_TYPE); [EOL] } <line_num>: 1077,1079
public boolean hasEnumParameterType() { [EOL]     return hasType(TYPEFIELD_ENUM); [EOL] } <line_num>: 1085,1087
public boolean hasTypedefType() { [EOL]     return hasType(TYPEFIELD_TYPEDEF); [EOL] } <line_num>: 1093,1095
public boolean hasReturnType() { [EOL]     return hasType(TYPEFIELD_RETURN); [EOL] } <line_num>: 1101,1103
private boolean hasType(int mask) { [EOL]     return (bitset & MASK_TYPEFIELD) == mask; [EOL] } <line_num>: 1105,1107
public JSTypeExpression getType() { [EOL]     return getType(TYPEFIELD_TYPE); [EOL] } <line_num>: 1112,1114
public JSTypeExpression getReturnType() { [EOL]     return getType(TYPEFIELD_RETURN); [EOL] } <line_num>: 1119,1121
public JSTypeExpression getEnumParameterType() { [EOL]     return getType(TYPEFIELD_ENUM); [EOL] } <line_num>: 1126,1128
public JSTypeExpression getTypedefType() { [EOL]     return getType(TYPEFIELD_TYPEDEF); [EOL] } <line_num>: 1133,1135
private JSTypeExpression getType(int typefield) { [EOL]     if ((MASK_TYPEFIELD & bitset) == typefield) { [EOL]         return type; [EOL]     } else { [EOL]         return null; [EOL]     } [EOL] } <line_num>: 1137,1143
public JSTypeExpression getThisType() { [EOL]     return thisType; [EOL] } <line_num>: 1148,1150
void setThisType(JSTypeExpression type) { [EOL]     this.thisType = type; [EOL] } <line_num>: 1155,1157
public boolean hasThisType() { [EOL]     return thisType != null; [EOL] } <line_num>: 1163,1165
void setBaseType(JSTypeExpression type) { [EOL]     lazyInitInfo(); [EOL]     info.baseType = type; [EOL] } <line_num>: 1167,1170
public JSTypeExpression getBaseType() { [EOL]     return (info == null) ? null : info.baseType; [EOL] } <line_num>: 1175,1177
public String getDescription() { [EOL]     return (info == null) ? null : info.description; [EOL] } <line_num>: 1182,1184
void setDescription(String desc) { [EOL]     lazyInitInfo(); [EOL]     info.description = desc; [EOL] } <line_num>: 1186,1189
public String getMeaning() { [EOL]     return (info == null) ? null : info.meaning; [EOL] } <line_num>: 1202,1204
void setMeaning(String meaning) { [EOL]     lazyInitInfo(); [EOL]     info.meaning = meaning; [EOL] } <line_num>: 1206,1209
public String getLendsName() { [EOL]     return (info == null) ? null : info.lendsName; [EOL] } <line_num>: 1219,1221
void setLendsName(String name) { [EOL]     lazyInitInfo(); [EOL]     info.lendsName = name; [EOL] } <line_num>: 1223,1226
public String getLicense() { [EOL]     return (info == null) ? null : info.license; [EOL] } <line_num>: 1231,1233
public void setLicense(String license) { [EOL]     lazyInitInfo(); [EOL]     info.license = license; [EOL] } <line_num>: 1242,1245
@Override [EOL] public String toString() { [EOL]     return "JSDocInfo"; [EOL] } <line_num>: 1247,1250
public boolean hasBaseType() { [EOL]     return getBaseType() != null; [EOL] } <line_num>: 1256,1258
boolean addImplementedInterface(JSTypeExpression interfaceName) { [EOL]     lazyInitInfo(); [EOL]     if (info.implementedInterfaces == null) { [EOL]         info.implementedInterfaces = Lists.newArrayListWithCapacity(2); [EOL]     } [EOL]     if (info.implementedInterfaces.contains(interfaceName)) { [EOL]         return false; [EOL]     } [EOL]     info.implementedInterfaces.add(interfaceName); [EOL]     return true; [EOL] } <line_num>: 1264,1274
public List<JSTypeExpression> getImplementedInterfaces() { [EOL]     if (info == null || info.implementedInterfaces == null) { [EOL]         return ImmutableList.of(); [EOL]     } [EOL]     return Collections.unmodifiableList(info.implementedInterfaces); [EOL] } <line_num>: 1282,1287
public int getImplementedInterfaceCount() { [EOL]     if (info == null || info.implementedInterfaces == null) { [EOL]         return 0; [EOL]     } [EOL]     return info.implementedInterfaces.size(); [EOL] } <line_num>: 1293,1298
boolean addExtendedInterface(JSTypeExpression type) { [EOL]     lazyInitInfo(); [EOL]     if (info.extendedInterfaces == null) { [EOL]         info.extendedInterfaces = Lists.newArrayListWithCapacity(2); [EOL]     } [EOL]     if (info.extendedInterfaces.contains(type)) { [EOL]         return false; [EOL]     } [EOL]     info.extendedInterfaces.add(type); [EOL]     return true; [EOL] } <line_num>: 1305,1315
public List<JSTypeExpression> getExtendedInterfaces() { [EOL]     if (info == null || info.extendedInterfaces == null) { [EOL]         return ImmutableList.of(); [EOL]     } [EOL]     return Collections.unmodifiableList(info.extendedInterfaces); [EOL] } <line_num>: 1323,1328
public int getExtendedInterfacesCount() { [EOL]     if (info == null || info.extendedInterfaces == null) { [EOL]         return 0; [EOL]     } [EOL]     return info.extendedInterfaces.size(); [EOL] } <line_num>: 1333,1338
public String getDeprecationReason() { [EOL]     return info == null ? null : info.deprecated; [EOL] } <line_num>: 1343,1345
public Set<String> getSuppressions() { [EOL]     Set<String> suppressions = info == null ? null : info.suppressions; [EOL]     return suppressions == null ? Collections.<String>emptySet() : suppressions; [EOL] } <line_num>: 1350,1353
public Set<String> getModifies() { [EOL]     Set<String> modifies = info == null ? null : info.modifies; [EOL]     return modifies == null ? Collections.<String>emptySet() : modifies; [EOL] } <line_num>: 1358,1361
public boolean hasDescriptionForParameter(String name) { [EOL]     if (documentation == null || documentation.parameters == null) { [EOL]         return false; [EOL]     } [EOL]     return documentation.parameters.containsKey(name); [EOL] } <line_num>: 1367,1373
public String getDescriptionForParameter(String name) { [EOL]     if (documentation == null || documentation.parameters == null) { [EOL]         return null; [EOL]     } [EOL]     return documentation.parameters.get(name); [EOL] } <line_num>: 1379,1385
public Collection<String> getAuthors() { [EOL]     return documentation == null ? null : documentation.authors; [EOL] } <line_num>: 1390,1392
public Collection<String> getReferences() { [EOL]     return documentation == null ? null : documentation.sees; [EOL] } <line_num>: 1397,1399
public String getVersion() { [EOL]     return documentation == null ? null : documentation.version; [EOL] } <line_num>: 1404,1406
public String getReturnDescription() { [EOL]     return documentation == null ? null : documentation.returnDescription; [EOL] } <line_num>: 1411,1413
public String getBlockDescription() { [EOL]     return documentation == null ? null : documentation.blockDescription; [EOL] } <line_num>: 1418,1420
public boolean hasFileOverview() { [EOL]     return getFlag(MASK_FILEOVERVIEW); [EOL] } <line_num>: 1425,1427
public String getFileOverview() { [EOL]     return documentation == null ? null : documentation.fileOverview; [EOL] } <line_num>: 1432,1434
public Node getAssociatedNode() { [EOL]     return this.associatedNode; [EOL] } <line_num>: 1436,1438
public void setAssociatedNode(Node node) { [EOL]     this.associatedNode = node; [EOL] } <line_num>: 1447,1449
public String getSourceName() { [EOL]     return this.associatedNode != null ? this.associatedNode.getSourceFileName() : null; [EOL] } <line_num>: 1452,1455
public Collection<Marker> getMarkers() { [EOL]     return (documentation == null || documentation.markers == null) ? ImmutableList.<Marker>of() : documentation.markers; [EOL] } <line_num>: 1458,1461
public ImmutableList<String> getTemplateTypeNames() { [EOL]     if (info == null || info.templateTypeNames == null) { [EOL]         return ImmutableList.of(); [EOL]     } [EOL]     return info.templateTypeNames; [EOL] } <line_num>: 1464,1469
public Collection<Node> getTypeNodes() { [EOL]     List<Node> nodes = Lists.newArrayList(); [EOL]     if (type != null) { [EOL]         nodes.add(type.getRoot()); [EOL]     } [EOL]     if (thisType != null) { [EOL]         nodes.add(thisType.getRoot()); [EOL]     } [EOL]     if (info != null) { [EOL]         if (info.baseType != null) { [EOL]             nodes.add(info.baseType.getRoot()); [EOL]         } [EOL]         if (info.extendedInterfaces != null) { [EOL]             for (JSTypeExpression interfaceType : info.extendedInterfaces) { [EOL]                 nodes.add(interfaceType.getRoot()); [EOL]             } [EOL]         } [EOL]         if (info.implementedInterfaces != null) { [EOL]             for (JSTypeExpression interfaceType : info.implementedInterfaces) { [EOL]                 nodes.add(interfaceType.getRoot()); [EOL]             } [EOL]         } [EOL]         if (info.parameters != null) { [EOL]             for (JSTypeExpression parameterType : info.parameters.values()) { [EOL]                 if (parameterType != null) { [EOL]                     nodes.add(parameterType.getRoot()); [EOL]                 } [EOL]             } [EOL]         } [EOL]         if (info.thrownTypes != null) { [EOL]             for (JSTypeExpression thrownType : info.thrownTypes) { [EOL]                 if (thrownType != null) { [EOL]                     nodes.add(thrownType.getRoot()); [EOL]                 } [EOL]             } [EOL]         } [EOL]     } [EOL]     return nodes; [EOL] } <line_num>: 1478,1524
public boolean hasModifies() { [EOL]     return info != null && info.modifies != null; [EOL] } <line_num>: 1526,1528
public String getOriginalCommentString() { [EOL]     return documentation == null ? null : documentation.sourceComment; [EOL] } <line_num>: 1534,1536
void setOriginalCommentString(String sourceComment) { [EOL]     if (!lazyInitDocumentation()) { [EOL]         return; [EOL]     } [EOL]     documentation.sourceComment = sourceComment; [EOL] } <line_num>: 1538,1543
