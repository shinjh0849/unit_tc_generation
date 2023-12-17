public DormandPrince853Integrator(final double minStep, final double maxStep, final double scalAbsoluteTolerance, final double scalRelativeTolerance)
public DormandPrince853Integrator(final double minStep, final double maxStep, final double[] vecAbsoluteTolerance, final double[] vecRelativeTolerance)
public int getOrder()
protected double estimateError(final double[][] yDotK, final double[] y0, final double[] y1, final double h)
String METHOD_NAME=Optional["Dormand-Prince 8 (5, 3)"]
double[] STATIC_C=Optional[{ (12.0 - 2.0 * FastMath.sqrt(6.0)) / 135.0, (6.0 - FastMath.sqrt(6.0)) / 45.0, (6.0 - FastMath.sqrt(6.0)) / 30.0, (6.0 + FastMath.sqrt(6.0)) / 30.0, 1.0 / 3.0, 1.0 / 4.0, 4.0 / 13.0, 127.0 / 195.0, 3.0 / 5.0, 6.0 / 7.0, 1.0, 1.0 }]
double[][] STATIC_A=Optional[{ // k2
{ (12.0 - 2.0 * FastMath.sqrt(6.0)) / 135.0 }, // k3
{ (6.0 - FastMath.sqrt(6.0)) / 180.0, (6.0 - FastMath.sqrt(6.0)) / 60.0 }, // k4
{ (6.0 - FastMath.sqrt(6.0)) / 120.0, 0.0, (6.0 - FastMath.sqrt(6.0)) / 40.0 }, // k5
{ (462.0 + 107.0 * FastMath.sqrt(6.0)) / 3000.0, 0.0, (-402.0 - 197.0 * FastMath.sqrt(6.0)) / 1000.0, (168.0 + 73.0 * FastMath.sqrt(6.0)) / 375.0 }, // k6
{ 1.0 / 27.0, 0.0, 0.0, (16.0 + FastMath.sqrt(6.0)) / 108.0, (16.0 - FastMath.sqrt(6.0)) / 108.0 }, // k7
{ 19.0 / 512.0, 0.0, 0.0, (118.0 + 23.0 * FastMath.sqrt(6.0)) / 1024.0, (118.0 - 23.0 * FastMath.sqrt(6.0)) / 1024.0, -9.0 / 512.0 }, // k8
{ 13772.0 / 371293.0, 0.0, 0.0, (51544.0 + 4784.0 * FastMath.sqrt(6.0)) / 371293.0, (51544.0 - 4784.0 * FastMath.sqrt(6.0)) / 371293.0, -5688.0 / 371293.0, 3072.0 / 371293.0 }, // k9
{ 58656157643.0 / 93983540625.0, 0.0, 0.0, (-1324889724104.0 - 318801444819.0 * FastMath.sqrt(6.0)) / 626556937500.0, (-1324889724104.0 + 318801444819.0 * FastMath.sqrt(6.0)) / 626556937500.0, 96044563816.0 / 3480871875.0, 5682451879168.0 / 281950621875.0, -165125654.0 / 3796875.0 }, // k10
{ 8909899.0 / 18653125.0, 0.0, 0.0, (-4521408.0 - 1137963.0 * FastMath.sqrt(6.0)) / 2937500.0, (-4521408.0 + 1137963.0 * FastMath.sqrt(6.0)) / 2937500.0, 96663078.0 / 4553125.0, 2107245056.0 / 137915625.0, -4913652016.0 / 147609375.0, -78894270.0 / 3880452869.0 }, // k11
{ -20401265806.0 / 21769653311.0, 0.0, 0.0, (354216.0 + 94326.0 * FastMath.sqrt(6.0)) / 112847.0, (354216.0 - 94326.0 * FastMath.sqrt(6.0)) / 112847.0, -43306765128.0 / 5313852383.0, -20866708358144.0 / 1126708119789.0, 14886003438020.0 / 654632330667.0, 35290686222309375.0 / 14152473387134411.0, -1477884375.0 / 485066827.0 }, // k12
{ 39815761.0 / 17514443.0, 0.0, 0.0, (-3457480.0 - 960905.0 * FastMath.sqrt(6.0)) / 551636.0, (-3457480.0 + 960905.0 * FastMath.sqrt(6.0)) / 551636.0, -844554132.0 / 47026969.0, 8444996352.0 / 302158619.0, -2509602342.0 / 877790785.0, -28388795297996250.0 / 3199510091356783.0, 226716250.0 / 18341897.0, 1371316744.0 / 2131383595.0 }, // k13 should be for interpolation only, but since it is the same
// stage as the first evaluation of the next step, we perform it
// here at no cost by specifying this is an fsal method
{ 104257.0 / 1920240.0, 0.0, 0.0, 0.0, 0.0, 3399327.0 / 763840.0, 66578432.0 / 35198415.0, -1674902723.0 / 288716400.0, 54980371265625.0 / 176692375811392.0, -734375.0 / 4826304.0, 171414593.0 / 851261400.0, 137909.0 / 3084480.0 } }]
double[] STATIC_B=Optional[{ 104257.0 / 1920240.0, 0.0, 0.0, 0.0, 0.0, 3399327.0 / 763840.0, 66578432.0 / 35198415.0, -1674902723.0 / 288716400.0, 54980371265625.0 / 176692375811392.0, -734375.0 / 4826304.0, 171414593.0 / 851261400.0, 137909.0 / 3084480.0, 0.0 }]
double E1_01=Optional[116092271.0 / 8848465920.0]
double E1_06=Optional[-1871647.0 / 1527680.0]
double E1_07=Optional[-69799717.0 / 140793660.0]
double E1_08=Optional[1230164450203.0 / 739113984000.0]
double E1_09=Optional[-1980813971228885.0 / 5654156025964544.0]
double E1_10=Optional[464500805.0 / 1389975552.0]
double E1_11=Optional[1606764981773.0 / 19613062656000.0]
double E1_12=Optional[-137909.0 / 6168960.0]
double E2_01=Optional[-364463.0 / 1920240.0]
double E2_06=Optional[3399327.0 / 763840.0]
double E2_07=Optional[66578432.0 / 35198415.0]
double E2_08=Optional[-1674902723.0 / 288716400.0]
double E2_09=Optional[-74684743568175.0 / 176692375811392.0]
double E2_10=Optional[-734375.0 / 4826304.0]
double E2_11=Optional[171414593.0 / 851261400.0]
double E2_12=Optional[69869.0 / 3084480.0]
