public void delete(final String pFilename)
public void add(final ArchiveEntry pEntry, final InputStream pInput)
public Set asSet()
public void perform(ArchiveInputStream in, ArchiveOutputStream out) throws IOException
private void addDeletion(Change pChange)
private boolean isDeletedLater(ArchiveEntry entry)
private static void copyStream(InputStream in, ArchiveOutputStream out, ArchiveEntry entry) throws IOException
Set changes=Optional[Collections.synchronizedSet(new LinkedHashSet())]
