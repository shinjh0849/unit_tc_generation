private FastMath()
 CodyWaite(double xa)
private static double doubleHighPart(double d)
public static double sqrt(final double a)
public static double cosh(double x)
public static double sinh(double x)
public static double tanh(double x)
public static double acosh(final double a)
public static double asinh(double a)
public static double atanh(double a)
public static double signum(final double a)
public static float signum(final float a)
public static double nextUp(final double a)
public static float nextUp(final float a)
public static double random()
public static double exp(double x)
private static double exp(double x, double extra, double[] hiPrec)
public static double expm1(double x)
private static double expm1(double x, double[] hiPrecOut)
public static double log(final double x)
private static double log(final double x, final double[] hiPrec)
public static double log1p(final double x)
public static double log10(final double x)
public static double log(double base, double x)
public static double pow(double x, double y)
public static double pow(double d, int e)
private static double polySine(final double x)
private static double polyCosine(double x)
private static double sinQ(double xa, double xb)
private static double cosQ(double xa, double xb)
private static double tanQ(double xa, double xb, boolean cotanFlag)
private static void reducePayneHanek(double x, double[] result)
public static double sin(double x)
public static double cos(double x)
public static double tan(double x)
public static double atan(double x)
private static double atan(double xa, double xb, boolean leftPlane)
public static double atan2(double y, double x)
public static double asin(double x)
public static double acos(double x)
public static double cbrt(double x)
public static double toRadians(double x)
public static double toDegrees(double x)
public static int abs(final int x)
public static long abs(final long x)
public static float abs(final float x)
public static double abs(double x)
public static double ulp(double x)
public static float ulp(float x)
public static double scalb(final double d, final int n)
public static float scalb(final float f, final int n)
public static double nextAfter(double d, double direction)
public static float nextAfter(final float f, final double direction)
public static double floor(double x)
public static double ceil(double x)
public static double rint(double x)
public static long round(double x)
public static int round(final float x)
public static int min(final int a, final int b)
public static long min(final long a, final long b)
public static float min(final float a, final float b)
public static double min(final double a, final double b)
public static int max(final int a, final int b)
public static long max(final long a, final long b)
public static float max(final float a, final float b)
public static double max(final double a, final double b)
public static double hypot(final double x, final double y)
public static double IEEEremainder(double dividend, double divisor)
public static double copySign(double magnitude, double sign)
public static float copySign(float magnitude, float sign)
public static int getExponent(final double d)
public static int getExponent(final float f)
public static void main(String[] a)
 int getK()
 double getRemA()
 double getRemB()
double PI=Optional[105414357.0 / 33554432.0 + 1.984187159361080883e-9]
double E=Optional[2850325.0 / 1048576.0 + 8.254840070411028747e-8]
int EXP_INT_TABLE_MAX_INDEX=Optional[750]
int EXP_INT_TABLE_LEN=Optional[EXP_INT_TABLE_MAX_INDEX * 2]
int LN_MANT_LEN=Optional[1024]
int EXP_FRAC_TABLE_LEN=Optional[1025]
double LOG_MAX_VALUE=Optional[StrictMath.log(Double.MAX_VALUE)]
boolean RECOMPUTE_TABLES_AT_RUNTIME=Optional[false]
double LN_2_A=Optional[0.693147063255310059]
double LN_2_B=Optional[1.17304635250823482e-7]
double[][] LN_QUICK_COEF=Optional[{ { 1.0, 5.669184079525E-24 }, { -0.25, -0.25 }, { 0.3333333134651184, 1.986821492305628E-8 }, { -0.25, -6.663542893624021E-14 }, { 0.19999998807907104, 1.1921056801463227E-8 }, { -0.1666666567325592, -7.800414592973399E-9 }, { 0.1428571343421936, 5.650007086920087E-9 }, { -0.12502530217170715, -7.44321345601866E-11 }, { 0.11113807559013367, 9.219544613762692E-9 } }]
double[][] LN_HI_PREC_COEF=Optional[{ { 1.0, -6.032174644509064E-23 }, { -0.25, -0.25 }, { 0.3333333134651184, 1.9868161777724352E-8 }, { -0.2499999701976776, -2.957007209750105E-8 }, { 0.19999954104423523, 1.5830993332061267E-10 }, { -0.16624879837036133, -2.6033824355191673E-8 } }]
int SINE_TABLE_LEN=Optional[14]
double[] SINE_TABLE_A=Optional[{ +0.0d, +0.1246747374534607d, +0.24740394949913025d, +0.366272509098053d, +0.4794255495071411d, +0.5850973129272461d, +0.6816387176513672d, +0.7675435543060303d, +0.8414709568023682d, +0.902267575263977d, +0.9489846229553223d, +0.9808930158615112d, +0.9974949359893799d, +0.9985313415527344d }]
double[] SINE_TABLE_B=Optional[{ +0.0d, -4.068233003401932E-9d, +9.755392680573412E-9d, +1.9987994582857286E-8d, -1.0902938113007961E-8d, -3.9986783938944604E-8d, +4.23719669792332E-8d, -5.207000323380292E-8d, +2.800552834259E-8d, +1.883511811213715E-8d, -3.5997360512765566E-9d, +4.116164446561962E-8d, +5.0614674548127384E-8d, -1.0129027912496858E-9d }]
double[] COSINE_TABLE_A=Optional[{ +1.0d, +0.9921976327896118d, +0.9689123630523682d, +0.9305076599121094d, +0.8775825500488281d, +0.8109631538391113d, +0.7316888570785522d, +0.6409968137741089d, +0.5403022766113281d, +0.4311765432357788d, +0.3153223395347595d, +0.19454771280288696d, +0.07073719799518585d, -0.05417713522911072d }]
double[] COSINE_TABLE_B=Optional[{ +0.0d, +3.4439717236742845E-8d, +5.865827662008209E-8d, -3.7999795083850525E-8d, +1.184154459111628E-8d, -3.43338934259355E-8d, +1.1795268640216787E-8d, +4.438921624363781E-8d, +2.925681159240093E-8d, -2.6437112632041807E-8d, +2.2860509143963117E-8d, -4.813899778443457E-9d, +3.6725170580355583E-9d, +2.0217439756338078E-10d }]
double[] TANGENT_TABLE_A=Optional[{ +0.0d, +0.1256551444530487d, +0.25534194707870483d, +0.3936265707015991d, +0.5463024377822876d, +0.7214844226837158d, +0.9315965175628662d, +1.1974215507507324d, +1.5574076175689697d, +2.092571258544922d, +3.0095696449279785d, +5.041914939880371d, +14.101419448852539d, -18.430862426757812d }]
double[] TANGENT_TABLE_B=Optional[{ +0.0d, -7.877917738262007E-9d, -2.5857668567479893E-8d, +5.2240336371356666E-9d, +5.206150291559893E-8d, +1.8307188599677033E-8d, -5.7618793749770706E-8d, +7.848361555046424E-8d, +1.0708593250394448E-7d, +1.7827257129423813E-8d, +2.893485277253286E-8d, +3.1660099222737955E-7d, +4.983191803254889E-7d, -3.356118100840571E-7d }]
long[] RECIP_2PI=Optional[new long[] { (0x28be60dbL << 32) | 0x9391054aL, (0x7f09d5f4L << 32) | 0x7d4d3770L, (0x36d8a566L << 32) | 0x4f10e410L, (0x7f9458eaL << 32) | 0xf7aef158L, (0x6dc91b8eL << 32) | 0x909374b8L, (0x01924bbaL << 32) | 0x82746487L, (0x3f877ac7L << 32) | 0x2c4a69cfL, (0xba208d7dL << 32) | 0x4baed121L, (0x3a671c09L << 32) | 0xad17df90L, (0x4e64758eL << 32) | 0x60d4ce7dL, (0x272117e2L << 32) | 0xef7e4a0eL, (0xc7fe25ffL << 32) | 0xf7816603L, (0xfbcbc462L << 32) | 0xd6829b47L, (0xdb4d9fb3L << 32) | 0xc9f2c26dL, (0xd3d18fd9L << 32) | 0xa797fa8bL, (0x5d49eeb1L << 32) | 0xfaf97c5eL, (0xcf41ce7dL << 32) | 0xe294a4baL, 0x9afed7ecL << 32 }]
long[] PI_O_4_BITS=Optional[new long[] { (0xc90fdaa2L << 32) | 0x2168c234L, (0xc4c6628bL << 32) | 0x80dc1cd1L }]
double[] EIGHTHS=Optional[{ 0, 0.125, 0.25, 0.375, 0.5, 0.625, 0.75, 0.875, 1.0, 1.125, 1.25, 1.375, 1.5, 1.625 }]
double[] CBRTTWO=Optional[{ 0.6299605249474366, 0.7937005259840998, 1.0, 1.2599210498948732, 1.5874010519681994 }]
long HEX_40000000=Optional[0x40000000L]
long MASK_30BITS=Optional[-1L - (HEX_40000000 - 1)]
int MASK_NON_SIGN_INT=Optional[0x7fffffff]
long MASK_NON_SIGN_LONG=Optional[0x7fffffffffffffffl]
double TWO_POWER_52=Optional[4503599627370496.0]
double TWO_POWER_53=Optional[2 * TWO_POWER_52]
double F_1_3=Optional[1d / 3d]
double F_1_5=Optional[1d / 5d]
double F_1_7=Optional[1d / 7d]
double F_1_9=Optional[1d / 9d]
double F_1_11=Optional[1d / 11d]
double F_1_13=Optional[1d / 13d]
double F_1_15=Optional[1d / 15d]
double F_1_17=Optional[1d / 17d]
double F_3_4=Optional[3d / 4d]
double F_15_16=Optional[15d / 16d]
double F_13_14=Optional[13d / 14d]
double F_11_12=Optional[11d / 12d]
double F_9_10=Optional[9d / 10d]
double F_7_8=Optional[7d / 8d]
double F_5_6=Optional[5d / 6d]
double F_1_2=Optional[1d / 2d]
double F_1_4=Optional[1d / 4d]
