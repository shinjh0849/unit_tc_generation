public float getQuality() { [EOL]     return 0.0f; [EOL] } <line_num>: 63,65
public void setQuality(float quality) { [EOL] } <line_num>: 73,75
public boolean isEncodingAlpha() { [EOL]     return false; [EOL] } <line_num>: 82,84
public void setEncodingAlpha(boolean encodingAlpha) { [EOL] } <line_num>: 93,95
public byte[] encode(BufferedImage bufferedImage) throws IOException { [EOL]     ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); [EOL]     encode(bufferedImage, outputStream); [EOL]     return outputStream.toByteArray(); [EOL] } <line_num>: 106,110
public void encode(BufferedImage bufferedImage, OutputStream outputStream) throws IOException { [EOL]     if (bufferedImage == null) { [EOL]         throw new IllegalArgumentException("Null 'image' argument."); [EOL]     } [EOL]     if (outputStream == null) { [EOL]         throw new IllegalArgumentException("Null 'outputStream' argument."); [EOL]     } [EOL]     ImageIO.write(bufferedImage, ImageFormat.PNG, outputStream); [EOL] } <line_num>: 119,128
