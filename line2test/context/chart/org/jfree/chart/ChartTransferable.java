public ChartTransferable(JFreeChart chart, int width, int height)
public ChartTransferable(JFreeChart chart, int width, int height, boolean cloneData)
public ChartTransferable(JFreeChart chart, int width, int height, int minDrawW, int minDrawH, int maxDrawW, int maxDrawH, boolean cloneData)
public DataFlavor[] getTransferDataFlavors()
public boolean isDataFlavorSupported(DataFlavor flavor)
public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException
private BufferedImage createBufferedImage(JFreeChart chart, int w, int h, int minDrawW, int minDrawH, int maxDrawW, int maxDrawH)
DataFlavor imageFlavor=Optional[new DataFlavor("image/x-java-image; class=java.awt.Image", "Image")]
JFreeChart chart
int width
int height
int minDrawWidth
int minDrawHeight
int maxDrawWidth
int maxDrawHeight
