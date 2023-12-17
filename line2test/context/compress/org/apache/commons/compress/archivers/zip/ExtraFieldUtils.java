public static void register(Class c)
public static ZipExtraField createExtraField(ZipShort headerId) throws InstantiationException, IllegalAccessException
public static ZipExtraField[] parse(byte[] data) throws ZipException
public static ZipExtraField[] parse(byte[] data, boolean local) throws ZipException
public static byte[] mergeLocalFileDataData(ZipExtraField[] data)
public static byte[] mergeCentralDirectoryData(ZipExtraField[] data)
int WORD=Optional[4]
Map implementations
