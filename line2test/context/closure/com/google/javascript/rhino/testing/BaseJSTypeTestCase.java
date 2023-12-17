protected void setUp() throws Exception
protected void initTypes()
public static void addNativeProperties(JSTypeRegistry registry)
private static void addMethod(JSTypeRegistry registry, ObjectType receivingType, String methodName, JSType returnType)
protected JSType createUnionType(JSType... variants)
protected RecordTypeBuilder createRecordTypeBuilder()
protected JSType createNullableType(JSType type)
protected JSType createOptionalType(JSType type)
protected JSType createTemplatizedType(JSType baseType, ImmutableList<JSType> templatizedTypes)
protected JSType createParameterizedType(ObjectType type, JSType typeParameter)
protected void assertTypeEquals(JSType expected, Node actual)
protected void assertTypeEquals(JSType expected, JSTypeExpression actual)
protected JSType resolve(JSTypeExpression n, String... warnings)
protected final void assertTypeEquals(JSType a, JSType b)
protected final void assertTypeEquals(String msg, JSType a, JSType b)
protected final void assertTypeNotEquals(JSType a, JSType b)
protected final void assertTypeNotEquals(String msg, JSType a, JSType b)
protected final ParameterizedType parameterize(ObjectType objType, JSType t)
JSTypeRegistry registry
TestErrorReporter errorReporter
JSType ALL_TYPE
ObjectType NO_OBJECT_TYPE
ObjectType NO_TYPE
ObjectType NO_RESOLVED_TYPE
FunctionType ARRAY_FUNCTION_TYPE
ObjectType ARRAY_TYPE
JSType BOOLEAN_OBJECT_FUNCTION_TYPE
ObjectType BOOLEAN_OBJECT_TYPE
JSType BOOLEAN_TYPE
ObjectType CHECKED_UNKNOWN_TYPE
JSType DATE_FUNCTION_TYPE
ObjectType DATE_TYPE
JSType ERROR_FUNCTION_TYPE
ObjectType ERROR_TYPE
JSType EVAL_ERROR_FUNCTION_TYPE
ObjectType EVAL_ERROR_TYPE
FunctionType FUNCTION_FUNCTION_TYPE
FunctionType FUNCTION_INSTANCE_TYPE
ObjectType FUNCTION_PROTOTYPE
JSType GREATEST_FUNCTION_TYPE
JSType LEAST_FUNCTION_TYPE
JSType MATH_TYPE
JSType NULL_TYPE
JSType NUMBER_OBJECT_FUNCTION_TYPE
ObjectType NUMBER_OBJECT_TYPE
JSType NUMBER_STRING_BOOLEAN
JSType NUMBER_TYPE
FunctionType OBJECT_FUNCTION_TYPE
JSType NULL_VOID
JSType OBJECT_NUMBER_STRING
JSType OBJECT_NUMBER_STRING_BOOLEAN
JSType OBJECT_PROTOTYPE
ObjectType OBJECT_TYPE
JSType RANGE_ERROR_FUNCTION_TYPE
ObjectType RANGE_ERROR_TYPE
JSType REFERENCE_ERROR_FUNCTION_TYPE
ObjectType REFERENCE_ERROR_TYPE
JSType REGEXP_FUNCTION_TYPE
ObjectType REGEXP_TYPE
JSType STRING_OBJECT_FUNCTION_TYPE
ObjectType STRING_OBJECT_TYPE
JSType STRING_TYPE
JSType SYNTAX_ERROR_FUNCTION_TYPE
ObjectType SYNTAX_ERROR_TYPE
JSType TYPE_ERROR_FUNCTION_TYPE
ObjectType TYPE_ERROR_TYPE
FunctionType U2U_CONSTRUCTOR_TYPE
FunctionType U2U_FUNCTION_TYPE
ObjectType UNKNOWN_TYPE
JSType URI_ERROR_FUNCTION_TYPE
ObjectType URI_ERROR_TYPE
JSType VOID_TYPE
int NATIVE_PROPERTIES_COUNT
String ALL_NATIVE_EXTERN_TYPES=Optional["/**\n" + " * @constructor\n" + " * @param {*=} opt_value\n" + " */\n" + "function Object(opt_value) {}\n" + "\n" + "/**\n" + " * @constructor\n" + " * @extends {Object}\n" + " * @param {...*} var_args\n" + " */\n" + "\n" + "function Function(var_args) {}\n" + "/**\n" + " * @constructor\n" + " * @extends {Object}\n" + " * @param {...*} var_args\n" + " * @return {!Array}\n" + " */\n" + "function Array(var_args) {}\n" + "\n" + "/**\n" + " * @constructor\n" + " * @param {*=} opt_value\n" + " * @return {boolean}\n" + " */\n" + "function Boolean(opt_value) {}\n" + "\n" + "/**\n" + " * @constructor\n" + " * @param {*=} opt_value\n" + " * @return {number}\n" + " */\n" + "function Number(opt_value) {}\n" + "\n" + "/**\n" + " * @constructor\n" + " * @param {?=} opt_yr_num\n" + " * @param {?=} opt_mo_num\n" + " * @param {?=} opt_day_num\n" + " * @param {?=} opt_hr_num\n" + " * @param {?=} opt_min_num\n" + " * @param {?=} opt_sec_num\n" + " * @param {?=} opt_ms_num\n" + " * @return {string}\n" + " */\n" + "function Date(opt_yr_num, opt_mo_num, opt_day_num, opt_hr_num," + "    opt_min_num, opt_sec_num, opt_ms_num) {}\n" + "\n" + "/**\n" + " * @constructor\n" + " * @extends {Object}\n" + " * @param {*=} opt_str\n" + " * @return {string}\n" + " */\n" + "function String(opt_str) {}\n" + "\n" + "/**\n" + " * @constructor\n" + " * @param {*=} opt_pattern\n" + " * @param {*=} opt_flags\n" + " * @return {!RegExp}\n" + " */\n" + "function RegExp(opt_pattern, opt_flags) {}\n" + "\n" + "/**\n" + " * @constructor\n" + " * @param {*=} opt_message\n" + " * @param {*=} opt_file\n" + " * @param {*=} opt_line\n" + " * @return {!Error}\n" + " */\n" + "function Error(opt_message, opt_file, opt_line) {}\n" + "\n" + "/**\n" + " * @constructor\n" + " * @extends {Error}\n" + " * @param {*=} opt_message\n" + " * @param {*=} opt_file\n" + " * @param {*=} opt_line\n" + " * @return {!EvalError}\n" + " */\n" + "function EvalError(opt_message, opt_file, opt_line) {}\n" + "\n" + "/**\n" + " * @constructor\n" + " * @extends {Error}\n" + " * @param {*=} opt_message\n" + " * @param {*=} opt_file\n" + " * @param {*=} opt_line\n" + " * @return {!RangeError}\n" + " */\n" + "function RangeError(opt_message, opt_file, opt_line) {}\n" + "\n" + "/**\n" + " * @constructor\n" + " * @extends {Error}\n" + " * @param {*=} opt_message\n" + " * @param {*=} opt_file\n" + " * @param {*=} opt_line\n" + " * @return {!ReferenceError}\n" + " */\n" + "function ReferenceError(opt_message, opt_file, opt_line) {}\n" + "\n" + "/**\n" + " * @constructor\n" + " * @extends {Error}\n" + " * @param {*=} opt_message\n" + " * @param {*=} opt_file\n" + " * @param {*=} opt_line\n" + " * @return {!SyntaxError}\n" + " */\n" + "function SyntaxError(opt_message, opt_file, opt_line) {}\n" + "\n" + "/**\n" + " * @constructor\n" + " * @extends {Error}\n" + " * @param {*=} opt_message\n" + " * @param {*=} opt_file\n" + " * @param {*=} opt_line\n" + " * @return {!TypeError}\n" + " */\n" + "function TypeError(opt_message, opt_file, opt_line) {}\n" + "\n" + "/**\n" + " * @constructor\n" + " * @extends {Error}\n" + " * @param {*=} opt_message\n" + " * @param {*=} opt_file\n" + " * @param {*=} opt_line\n" + " * @return {!URIError}\n" + " */\n" + "function URIError(opt_message, opt_file, opt_line) {}\n" + "\n" + "/**\n" + " * @param {string} progId\n" + " * @param {string=} opt_location\n" + " * @constructor\n" + " */\n" + "function ActiveXObject(progId, opt_location) {}\n"]
