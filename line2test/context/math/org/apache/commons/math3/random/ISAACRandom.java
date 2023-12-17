public ISAACRandom()
public ISAACRandom(long seed)
public ISAACRandom(int[] seed)
public void setSeed(int seed)
public void setSeed(long seed)
public void setSeed(int[] seed)
protected int next(int bits)
private void isaac()
private void isaac2()
private void isaac3()
private void initState()
private void shuffle()
private void setState(int start)
long serialVersionUID=Optional[7288197941165002400L]
int SIZE_L=Optional[8]
int SIZE=Optional[1 << SIZE_L]
int H_SIZE=Optional[SIZE >> 1]
int MASK=Optional[SIZE - 1 << 2]
int GLD_RATIO=Optional[0x9e3779b9]
int[] rsl=Optional[new int[SIZE]]
int[] mem=Optional[new int[SIZE]]
int count
int isaacA
int isaacB
int isaacC
int[] arr=Optional[new int[8]]
int isaacX
int isaacI
int isaacJ
