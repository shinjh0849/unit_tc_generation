public ExceptionWithCause(final String str, final Throwable cause)
public ExceptionWithCause(final Throwable cause)
public NestableException()
public NestableException(final Throwable t)
public void setUp()
public void tearDown() throws Exception
private Throwable createExceptionWithoutCause()
private Throwable createExceptionWithCause()
public void testConstructor()
public void testGetCause_Throwable()
public void testGetCause_ThrowableArray()
public void testGetRootCause_Throwable()
public void testGetThrowableCount_Throwable()
public void testGetThrowables_Throwable_null()
public void testGetThrowables_Throwable_withoutCause()
public void testGetThrowables_Throwable_nested()
public void testGetThrowables_Throwable_withCause()
public void testGetThrowables_Throwable_jdkNoCause()
public void testGetThrowables_Throwable_recursiveCause()
public void testGetThrowableList_Throwable_null()
public void testGetThrowableList_Throwable_withoutCause()
public void testGetThrowableList_Throwable_nested()
public void testGetThrowableList_Throwable_withCause()
public void testGetThrowableList_Throwable_jdkNoCause()
public void testGetThrowableList_Throwable_recursiveCause()
public void testIndexOf_ThrowableClass()
public void testIndexOf_ThrowableClassInt()
public void testIndexOfType_ThrowableClass()
public void testIndexOfType_ThrowableClassInt()
public void testPrintRootCauseStackTrace_Throwable() throws Exception
public void testPrintRootCauseStackTrace_ThrowableStream() throws Exception
public void testPrintRootCauseStackTrace_ThrowableWriter() throws Exception
public void testGetRootCauseStackTrace_Throwable() throws Exception
public void testRemoveCommonFrames_ListList() throws Exception
public void test_getMessage_Throwable()
public void test_getRootCauseMessage_Throwable()
public Throwable getCause()
public void setCause(final Throwable cause)
public void getTargetException()
NestableException nested
Throwable withCause
Throwable withoutCause
Throwable jdkNoCause
ExceptionWithCause cyclicCause
