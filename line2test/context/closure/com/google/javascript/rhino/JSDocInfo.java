 JSDocInfo(boolean includeDocumentation)
public JSDocInfo()
public void setItem(String item)
public boolean hasBrackets()
 void setHasBrackets(boolean newVal)
public StringPosition getAnnotation()
 void setAnnotation(TrimmedStringPosition p)
public StringPosition getName()
 void setName(TrimmedStringPosition p)
public SourcePosition<Node> getNameNode()
 void setNameNode(SourcePosition<Node> p)
public StringPosition getDescription()
 void setDescription(StringPosition p)
public TypePosition getType()
 void setType(TypePosition p)
 void setConsistentIdGenerator(boolean value)
 void setStableIdGenerator(boolean value)
 void setConstant(boolean value)
 void setConstructor(boolean value)
 void setStruct()
 void setDict()
 void setDefine(boolean value)
 void setHidden(boolean value)
 void setNoCheck(boolean value)
 void setShouldPreserveTry(boolean value)
 void setOverride(boolean value)
 void setNoAlias(boolean value)
public void setDeprecated(boolean value)
 void setInterface(boolean value)
 void setExport(boolean value)
 void setExpose(boolean value)
 void setNoShadow(boolean value)
 void setIdGenerator(boolean value)
 void setImplicitCast(boolean value)
 void setNoSideEffects(boolean value)
 void setExterns(boolean value)
 void setJavaDispatch(boolean value)
 void setNoCompile(boolean value)
private void setFlag(boolean value, int mask)
public boolean isConsistentIdGenerator()
public boolean isStableIdGenerator()
public boolean isConstant()
public boolean isConstructor()
public boolean makesStructs()
public boolean makesDicts()
public boolean isDefine()
public boolean isHidden()
public boolean isNoTypeCheck()
public boolean shouldPreserveTry()
public boolean isOverride()
public boolean isNoAlias()
public boolean isDeprecated()
public boolean isInterface()
public boolean isExport()
public boolean isExpose()
public boolean isNoShadow()
public boolean isIdGenerator()
public boolean isImplicitCast()
public boolean isNoSideEffects()
public boolean isExterns()
public boolean isJavaDispatch()
public boolean isNoCompile()
public boolean containsDeclaration()
private boolean getFlag(int mask)
public void setVisibility(Visibility visibility)
private void lazyInitInfo()
private boolean lazyInitDocumentation()
 Marker addMarker()
 boolean setDeprecationReason(String reason)
public void addSuppression(String suppression)
 boolean setSuppressions(Set<String> suppressions)
 void addModifies(String modifies)
 boolean setModifies(Set<String> modifies)
 boolean documentVersion(String version)
 boolean documentReference(String reference)
 boolean documentAuthor(String author)
 boolean documentThrows(JSTypeExpression type, String throwsDescription)
 boolean documentParam(String parameter, String description)
 boolean documentBlock(String description)
 boolean documentFileOverview(String description)
 boolean documentReturn(String description)
 boolean declareParam(JSTypeExpression jsType, String parameter)
 boolean declareTemplateTypeNames(List<String> templateTypeNames)
 boolean declareThrows(JSTypeExpression jsType)
public Visibility getVisibility()
public JSTypeExpression getParameterType(String parameter)
public boolean hasParameter(String parameter)
public boolean hasParameterType(String parameter)
public Set<String> getParameterNames()
public int getParameterCount()
 void setType(JSTypeExpression type)
 void setReturnType(JSTypeExpression type)
 void setEnumParameterType(JSTypeExpression type)
 void setTypedefType(JSTypeExpression type)
private void setType(JSTypeExpression type, int mask)
public List<JSTypeExpression> getThrownTypes()
public boolean hasType()
public boolean hasEnumParameterType()
public boolean hasTypedefType()
public boolean hasReturnType()
private boolean hasType(int mask)
public JSTypeExpression getType()
public JSTypeExpression getReturnType()
public JSTypeExpression getEnumParameterType()
public JSTypeExpression getTypedefType()
private JSTypeExpression getType(int typefield)
public JSTypeExpression getThisType()
 void setThisType(JSTypeExpression type)
public boolean hasThisType()
 void setBaseType(JSTypeExpression type)
public JSTypeExpression getBaseType()
public String getDescription()
 void setDescription(String desc)
public String getMeaning()
 void setMeaning(String meaning)
public String getLendsName()
 void setLendsName(String name)
public String getLicense()
public void setLicense(String license)
public String toString()
public boolean hasBaseType()
 boolean addImplementedInterface(JSTypeExpression interfaceName)
public List<JSTypeExpression> getImplementedInterfaces()
public int getImplementedInterfaceCount()
 boolean addExtendedInterface(JSTypeExpression type)
public List<JSTypeExpression> getExtendedInterfaces()
public int getExtendedInterfacesCount()
public String getDeprecationReason()
public Set<String> getSuppressions()
public Set<String> getModifies()
public boolean hasDescriptionForParameter(String name)
public String getDescriptionForParameter(String name)
public Collection<String> getAuthors()
public Collection<String> getReferences()
public String getVersion()
public String getReturnDescription()
public String getBlockDescription()
public boolean hasFileOverview()
public String getFileOverview()
public Node getAssociatedNode()
public void setAssociatedNode(Node node)
public String getSourceName()
public Collection<Marker> getMarkers()
public ImmutableList<String> getTemplateTypeNames()
public Collection<Node> getTypeNodes()
public boolean hasModifies()
public String getOriginalCommentString()
 void setOriginalCommentString(String sourceComment)
long serialVersionUID=Optional[1L]
LazilyInitializedInfo info=Optional[null]
LazilyInitializedDocumentation documentation=Optional[null]
Node associatedNode=Optional[null]
Visibility visibility=Optional[null]
int bitset=Optional[0x00]
JSTypeExpression type=Optional[null]
JSTypeExpression thisType=Optional[null]
boolean includeDocumentation=Optional[false]
int MASK_FLAGS=Optional[0x3FFFFFFF]
int MASK_CONSTANT=Optional[0x00000001]
int MASK_CONSTRUCTOR=Optional[0x00000002]
int MASK_DEFINE=Optional[0x00000004]
int MASK_HIDDEN=Optional[0x00000008]
int MASK_PRESERVETRY=Optional[0x00000010]
int MASK_NOCHECK=Optional[0x00000020]
int MASK_OVERRIDE=Optional[0x00000040]
int MASK_NOALIAS=Optional[0x00000080]
int MASK_DEPRECATED=Optional[0x00000100]
int MASK_INTERFACE=Optional[0x00000200]
int MASK_EXPORT=Optional[0x00000400]
int MASK_NOSHADOW=Optional[0x00000800]
int MASK_FILEOVERVIEW=Optional[0x00001000]
int MASK_IMPLICITCAST=Optional[0x00002000]
int MASK_NOSIDEEFFECTS=Optional[0x00004000]
int MASK_EXTERNS=Optional[0x00008000]
int MASK_JAVADISPATCH=Optional[0x00010000]
int MASK_NOCOMPILE=Optional[0x00020000]
int MASK_CONSISTIDGEN=Optional[0x00040000]
int MASK_IDGEN=Optional[0x00080000]
int MASK_EXPOSE=Optional[0x00100000]
int MASK_STRUCT=Optional[0x00200000]
int MASK_DICT=Optional[0x00400000]
int MASK_STALBEIDGEN=Optional[0x00800000]
int MASK_TYPEFIELD=Optional[0xE0000000]
int TYPEFIELD_TYPE=Optional[0x20000000]
int TYPEFIELD_RETURN=Optional[0x40000000]
int TYPEFIELD_ENUM=Optional[0x60000000]
int TYPEFIELD_TYPEDEF=Optional[0x80000000]
