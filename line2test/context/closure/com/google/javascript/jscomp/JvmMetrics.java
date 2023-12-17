public static void maybeWriteJvmMetrics(PrintStream out, String options)
private static void writeMetrics(PrintStream out, String type, boolean verbose, boolean pretty)
private static void writeJitMetrics(PrintStream out, boolean verbose, boolean pretty)
private static void writeOverallMemoryUsage(PrintStream out, MemoryUsage usage, String prefix, boolean pretty)
private static void writePoolMemoryUsage(PrintStream out, MemoryUsage usage, MemoryUsage peakUsage, String prefix, boolean pretty)
private static void writeMemoryMetrics(PrintStream out, boolean verbose, boolean pretty)
private static void writeGarbageCollectionStats(PrintStream out, boolean verbose, boolean pretty)
private static String normalizeName(String name)
private static String normalizeTabularColonPos(String string)
private static String formatBytes(long numBytes)
int TABULAR_COLON_POS=Optional[40]
long ONE_KILO_BYTE=Optional[1L << 10L]
long ONE_MEGA_BYTE=Optional[1L << 20L]
long ONE_GIGA_BYTE=Optional[1L << 30L]
