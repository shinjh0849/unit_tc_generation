public JarArchiveOutputStream(final OutputStream out) { [EOL]     super(out); [EOL] } <line_num>: 37,39
public void putNextEntry(ZipArchiveEntry ze) throws IOException { [EOL]     if (!jarMarkerAdded) { [EOL]         ze.addAsFirstExtraField(JarMarker.getInstance()); [EOL]         jarMarkerAdded = true; [EOL]     } [EOL]     super.putNextEntry(ze); [EOL] } <line_num>: 41,47
