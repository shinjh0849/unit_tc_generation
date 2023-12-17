public void testFileSystemRoot()
public void testTarFileWithFSRoot() throws IOException
String OS=Optional[System.getProperty("os.name").toLowerCase(Locale.US)]
String ROOT=Optional[OS.startsWith("windows") || OS.startsWith("netware") ? "C:\\" : "/"]
