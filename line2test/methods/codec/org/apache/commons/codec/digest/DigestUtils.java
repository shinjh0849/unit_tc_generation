static MessageDigest getDigest(String algorithm) { [EOL]     try { [EOL]         return MessageDigest.getInstance(algorithm); [EOL]     } catch (NoSuchAlgorithmException e) { [EOL]         throw new RuntimeException(e.getMessage()); [EOL]     } [EOL] } <line_num>: 50,56
private static MessageDigest getMd5Digest() { [EOL]     return getDigest("MD5"); [EOL] } <line_num>: 65,67
private static MessageDigest getSha256Digest() { [EOL]     return getDigest("SHA-256"); [EOL] } <line_num>: 79,81
private static MessageDigest getSha384Digest() { [EOL]     return getDigest("SHA-384"); [EOL] } <line_num>: 93,95
private static MessageDigest getSha512Digest() { [EOL]     return getDigest("SHA-512"); [EOL] } <line_num>: 107,109
private static MessageDigest getShaDigest() { [EOL]     return getDigest("SHA"); [EOL] } <line_num>: 118,120
private static byte[] digest(MessageDigest digest, InputStream data) throws IOException { [EOL]     byte[] buffer = new byte[STREAM_BUFFER_LENGTH]; [EOL]     int read = data.read(buffer, 0, STREAM_BUFFER_LENGTH); [EOL]     while (read > -1) { [EOL]         digest.update(buffer, 0, read); [EOL]         read = data.read(buffer, 0, STREAM_BUFFER_LENGTH); [EOL]     } [EOL]     return digest.digest(); [EOL] } <line_num>: 130,140
public static byte[] md5(byte[] data) { [EOL]     return getMd5Digest().digest(data); [EOL] } <line_num>: 149,151
public static byte[] md5(InputStream data) throws IOException { [EOL]     return digest(getMd5Digest(), data); [EOL] } <line_num>: 161,163
public static byte[] md5(String data) { [EOL]     return md5(data.getBytes()); [EOL] } <line_num>: 172,174
public static String md5Hex(byte[] data) { [EOL]     return new String(Hex.encodeHex(md5(data))); [EOL] } <line_num>: 183,185
public static String md5Hex(String data) { [EOL]     return new String(Hex.encodeHex(md5(data))); [EOL] } <line_num>: 194,196
public static String md5Hex(InputStream data) throws IOException { [EOL]     return new String(Hex.encodeHex(md5(data))); [EOL] } <line_num>: 206,208
public static byte[] sha(byte[] data) { [EOL]     return getShaDigest().digest(data); [EOL] } <line_num>: 217,219
public static byte[] sha(String data) { [EOL]     return sha(data.getBytes()); [EOL] } <line_num>: 228,230
public static byte[] sha(InputStream data) throws IOException { [EOL]     return digest(getShaDigest(), data); [EOL] } <line_num>: 240,242
public static byte[] sha256(byte[] data) { [EOL]     return getSha256Digest().digest(data); [EOL] } <line_num>: 254,256
public static byte[] sha256(String data) { [EOL]     return sha256(data.getBytes()); [EOL] } <line_num>: 268,270
public static byte[] sha256(InputStream data) throws IOException { [EOL]     return digest(getSha256Digest(), data); [EOL] } <line_num>: 283,285
public static String sha256Hex(byte[] data) { [EOL]     return new String(Hex.encodeHex(sha256(data))); [EOL] } <line_num>: 297,299
public static String sha256Hex(String data) { [EOL]     return new String(Hex.encodeHex(sha256(data))); [EOL] } <line_num>: 311,313
public static String sha256Hex(InputStream data) throws IOException { [EOL]     return new String(Hex.encodeHex(sha256(data))); [EOL] } <line_num>: 326,328
public static byte[] sha384(byte[] data) { [EOL]     return getSha384Digest().digest(data); [EOL] } <line_num>: 340,343
public static byte[] sha384(String data) { [EOL]     return sha384(data.getBytes()); [EOL] } <line_num>: 355,357
public static byte[] sha384(InputStream data) throws IOException { [EOL]     return digest(getSha384Digest(), data); [EOL] } <line_num>: 370,372
public static String sha384Hex(byte[] data) { [EOL]     return new String(Hex.encodeHex(sha384(data))); [EOL] } <line_num>: 384,386
public static String sha384Hex(String data) { [EOL]     return new String(Hex.encodeHex(sha384(data))); [EOL] } <line_num>: 398,400
public static String sha384Hex(InputStream data) throws IOException { [EOL]     return new String(Hex.encodeHex(sha384(data))); [EOL] } <line_num>: 413,415
public static byte[] sha512(byte[] data) { [EOL]     return getSha512Digest().digest(data); [EOL] } <line_num>: 427,429
public static byte[] sha512(String data) { [EOL]     return sha512(data.getBytes()); [EOL] } <line_num>: 441,443
public static byte[] sha512(InputStream data) throws IOException { [EOL]     return digest(getSha512Digest(), data); [EOL] } <line_num>: 456,458
public static String sha512Hex(byte[] data) { [EOL]     return new String(Hex.encodeHex(sha512(data))); [EOL] } <line_num>: 470,472
public static String sha512Hex(String data) { [EOL]     return new String(Hex.encodeHex(sha512(data))); [EOL] } <line_num>: 484,486
public static String sha512Hex(InputStream data) throws IOException { [EOL]     return new String(Hex.encodeHex(sha512(data))); [EOL] } <line_num>: 499,501
public static String shaHex(byte[] data) { [EOL]     return new String(Hex.encodeHex(sha(data))); [EOL] } <line_num>: 510,512
public static String shaHex(String data) { [EOL]     return new String(Hex.encodeHex(sha(data))); [EOL] } <line_num>: 521,523
public static String shaHex(InputStream data) throws IOException { [EOL]     return new String(Hex.encodeHex(sha(data))); [EOL] } <line_num>: 533,535
