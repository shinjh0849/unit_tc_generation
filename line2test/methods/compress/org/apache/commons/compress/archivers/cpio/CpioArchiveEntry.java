public CpioArchiveEntry(final short format) { [EOL]     setFormat(format); [EOL] } <line_num>: 170,172
public CpioArchiveEntry(final String name) { [EOL]     this(FORMAT_NEW); [EOL]     this.name = name; [EOL] } <line_num>: 181,184
public CpioArchiveEntry(final String name, final long size) { [EOL]     this(FORMAT_NEW); [EOL]     this.name = name; [EOL]     this.setSize(size); [EOL] } <line_num>: 195,199
private void checkNewFormat() { [EOL]     if ((this.fileFormat & FORMAT_NEW_MASK) == 0) { [EOL]         throw new UnsupportedOperationException(); [EOL]     } [EOL] } <line_num>: 204,208
private void checkOldFormat() { [EOL]     if ((this.fileFormat & FORMAT_OLD_MASK) == 0) { [EOL]         throw new UnsupportedOperationException(); [EOL]     } [EOL] } <line_num>: 213,217
public long getChksum() { [EOL]     checkNewFormat(); [EOL]     return this.chksum; [EOL] } <line_num>: 224,227
public long getDevice() { [EOL]     checkOldFormat(); [EOL]     return this.min; [EOL] } <line_num>: 237,240
public long getDeviceMaj() { [EOL]     checkNewFormat(); [EOL]     return this.maj; [EOL] } <line_num>: 250,253
public long getDeviceMin() { [EOL]     checkNewFormat(); [EOL]     return this.min; [EOL] } <line_num>: 260,263
public long getSize() { [EOL]     return this.filesize; [EOL] } <line_num>: 275,277
public short getFormat() { [EOL]     return this.fileFormat; [EOL] } <line_num>: 284,286
public long getGID() { [EOL]     return this.gid; [EOL] } <line_num>: 293,295
public long getHeaderSize() { [EOL]     return this.headerSize; [EOL] } <line_num>: 302,304
public long getInode() { [EOL]     return this.inode; [EOL] } <line_num>: 311,313
public long getMode() { [EOL]     return this.mode; [EOL] } <line_num>: 320,322
public String getName() { [EOL]     return this.name; [EOL] } <line_num>: 329,331
public long getNumberOfLinks() { [EOL]     return this.nlink; [EOL] } <line_num>: 338,340
public long getRemoteDevice() { [EOL]     checkOldFormat(); [EOL]     return this.rmin; [EOL] } <line_num>: 350,353
public long getRemoteDeviceMaj() { [EOL]     checkNewFormat(); [EOL]     return this.rmaj; [EOL] } <line_num>: 363,366
public long getRemoteDeviceMin() { [EOL]     checkNewFormat(); [EOL]     return this.rmin; [EOL] } <line_num>: 376,379
public long getTime() { [EOL]     return this.mtime; [EOL] } <line_num>: 386,388
public long getUID() { [EOL]     return this.uid; [EOL] } <line_num>: 395,397
public boolean isBlockDevice() { [EOL]     return (this.mode & S_IFMT) == C_ISBLK; [EOL] } <line_num>: 404,406
public boolean isCharacterDevice() { [EOL]     return (this.mode & S_IFMT) == C_ISCHR; [EOL] } <line_num>: 413,415
public boolean isDirectory() { [EOL]     return (this.mode & S_IFMT) == C_ISDIR; [EOL] } <line_num>: 422,424
public boolean isNetwork() { [EOL]     return (this.mode & S_IFMT) == C_ISNWK; [EOL] } <line_num>: 431,433
public boolean isPipe() { [EOL]     return (this.mode & S_IFMT) == C_ISFIFO; [EOL] } <line_num>: 440,442
public boolean isRegularFile() { [EOL]     return (this.mode & S_IFMT) == C_ISREG; [EOL] } <line_num>: 449,451
public boolean isSocket() { [EOL]     return (this.mode & S_IFMT) == C_ISSOCK; [EOL] } <line_num>: 458,460
public boolean isSymbolicLink() { [EOL]     return (this.mode & S_IFMT) == C_ISLNK; [EOL] } <line_num>: 467,469
public void setChksum(final long chksum) { [EOL]     checkNewFormat(); [EOL]     this.chksum = chksum; [EOL] } <line_num>: 478,481
public void setDevice(final long device) { [EOL]     checkOldFormat(); [EOL]     this.min = device; [EOL] } <line_num>: 492,495
public void setDeviceMaj(final long maj) { [EOL]     checkNewFormat(); [EOL]     this.maj = maj; [EOL] } <line_num>: 503,506
public void setDeviceMin(final long min) { [EOL]     checkNewFormat(); [EOL]     this.min = min; [EOL] } <line_num>: 514,517
public void setSize(final long size) { [EOL]     if (size < 0 || size > 0xFFFFFFFFL) { [EOL]         throw new IllegalArgumentException("invalid entry size <" + size + ">"); [EOL]     } [EOL]     this.filesize = size; [EOL] } <line_num>: 525,531
final void setFormat(final short format) { [EOL]     switch(format) { [EOL]         case FORMAT_NEW: [EOL]             this.fileFormat = FORMAT_NEW; [EOL]             this.headerSize = 110; [EOL]             break; [EOL]         case FORMAT_NEW_CRC: [EOL]             this.fileFormat = FORMAT_NEW_CRC; [EOL]             this.headerSize = 110; [EOL]             break; [EOL]         case FORMAT_OLD_ASCII: [EOL]             this.fileFormat = FORMAT_OLD_ASCII; [EOL]             this.headerSize = 76; [EOL]             break; [EOL]         case FORMAT_OLD_BINARY: [EOL]             this.fileFormat = FORMAT_OLD_BINARY; [EOL]             this.headerSize = 26; [EOL]             break; [EOL]         default: [EOL]             throw new IllegalArgumentException("Unknown header type"); [EOL]     } [EOL] } <line_num>: 541,562
public void setGID(final long gid) { [EOL]     this.gid = gid; [EOL] } <line_num>: 570,572
public void setInode(final long inode) { [EOL]     this.inode = inode; [EOL] } <line_num>: 580,582
public void setMode(final long mode) { [EOL]     switch((int) (mode & S_IFMT)) { [EOL]         case C_ISDIR: [EOL]         case C_ISLNK: [EOL]         case C_ISREG: [EOL]         case C_ISFIFO: [EOL]         case C_ISCHR: [EOL]         case C_ISBLK: [EOL]         case C_ISSOCK: [EOL]         case C_ISNWK: [EOL]             break; [EOL]         default: [EOL]             new IllegalArgumentException("Unknown mode (full mode: " + mode + ", masked mode: " + (mode & S_IFMT)); [EOL]     } [EOL]     this.mode = mode; [EOL] } <line_num>: 590,609
public void setName(final String name) { [EOL]     this.name = name; [EOL] } <line_num>: 617,619
public void setNumberOfLinks(final long nlink) { [EOL]     this.nlink = nlink; [EOL] } <line_num>: 627,629
public void setRemoteDevice(final long device) { [EOL]     checkOldFormat(); [EOL]     this.rmin = device; [EOL] } <line_num>: 640,643
public void setRemoteDeviceMaj(final long rmaj) { [EOL]     checkNewFormat(); [EOL]     this.rmaj = rmaj; [EOL] } <line_num>: 654,657
public void setRemoteDeviceMin(final long rmin) { [EOL]     checkNewFormat(); [EOL]     this.rmin = rmin; [EOL] } <line_num>: 668,671
public void setTime(final long time) { [EOL]     this.mtime = time; [EOL] } <line_num>: 679,681
public void setUID(final long uid) { [EOL]     this.uid = uid; [EOL] } <line_num>: 689,691
