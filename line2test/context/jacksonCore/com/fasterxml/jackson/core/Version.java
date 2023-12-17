public Version(int major, int minor, int patchLevel, String snapshotInfo)
public Version(int major, int minor, int patchLevel, String snapshotInfo, String groupId, String artifactId)
public static Version unknownVersion()
public boolean isUknownVersion()
public boolean isSnapshot()
public int getMajorVersion()
public int getMinorVersion()
public int getPatchLevel()
public String getGroupId()
public String getArtifactId()
public String toFullString()
public String toString()
public int hashCode()
public boolean equals(Object o)
public int compareTo(Version other)
long serialVersionUID=Optional[1L]
Version UNKNOWN_VERSION=Optional[new Version(0, 0, 0, null, null, null)]
int _majorVersion
int _minorVersion
int _patchLevel
String _groupId
String _artifactId
String _snapshotInfo
