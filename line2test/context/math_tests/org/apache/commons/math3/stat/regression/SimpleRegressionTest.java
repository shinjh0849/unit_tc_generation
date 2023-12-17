public void testAppend()
private void check(boolean includeIntercept)
private boolean equals(SimpleRegression model1, SimpleRegression model2, double tol)
public void testRegressIfaceMethod()
public void testRegressExceptions()
public void testNoInterceot_noint2()
public void testNoIntercept_noint1()
public void testNorris()
public void testCorr()
public void testNaNs()
public void testClear()
public void testInference()
public void testPerfect()
public void testPerfectNegative()
public void testRandom()
public void testSSENonNegative()
public void testRemoveXY()
public void testRemoveSingle()
public void testRemoveMultiple()
public void testRemoveObsFromEmpty()
public void testRemoveObsFromSingle()
public void testRemoveMultipleToEmpty()
public void testRemoveMultiplePastEmpty()
double[][] data=Optional[{ { 0.1, 0.2 }, { 338.8, 337.4 }, { 118.1, 118.2 }, { 888.0, 884.6 }, { 9.2, 10.1 }, { 228.1, 226.5 }, { 668.5, 666.3 }, { 998.5, 996.3 }, { 449.1, 448.6 }, { 778.9, 777.0 }, { 559.2, 558.2 }, { 0.3, 0.4 }, { 0.1, 0.6 }, { 778.1, 775.5 }, { 668.8, 666.9 }, { 339.3, 338.0 }, { 448.9, 447.5 }, { 10.8, 11.6 }, { 557.7, 556.0 }, { 228.3, 228.1 }, { 998.0, 995.8 }, { 888.8, 887.6 }, { 119.6, 120.2 }, { 0.3, 0.3 }, { 0.6, 0.3 }, { 557.6, 556.8 }, { 339.3, 339.1 }, { 888.0, 887.2 }, { 998.5, 999.0 }, { 778.9, 779.0 }, { 10.2, 11.1 }, { 117.6, 118.3 }, { 228.9, 229.2 }, { 668.4, 669.1 }, { 449.2, 448.9 }, { 0.2, 0.5 } }]
double[][] corrData=Optional[{ { 101.0, 99.2 }, { 100.1, 99.0 }, { 100.0, 100.0 }, { 90.6, 111.6 }, { 86.5, 122.2 }, { 89.7, 117.6 }, { 90.6, 121.1 }, { 82.8, 136.0 }, { 70.1, 154.2 }, { 65.4, 153.6 }, { 61.3, 158.5 }, { 62.5, 140.6 }, { 63.6, 136.2 }, { 52.6, 168.0 }, { 59.7, 154.3 }, { 59.5, 149.0 }, { 61.3, 165.5 } }]
double[][] infData=Optional[{ { 15.6, 5.2 }, { 26.8, 6.1 }, { 37.8, 8.7 }, { 36.4, 8.5 }, { 35.5, 8.8 }, { 18.6, 4.9 }, { 15.3, 4.5 }, { 7.9, 2.5 }, { 0.0, 1.1 } }]
double[][] removeSingle=Optional[{ infData[1] }]
double[][] removeMultiple=Optional[{ infData[1], infData[2] }]
double removeX=Optional[infData[0][0]]
double removeY=Optional[infData[0][1]]
double[][] infData2=Optional[{ { 1, 1 }, { 2, 0 }, { 3, 5 }, { 4, 2 }, { 5, -1 }, { 6, 12 } }]
double[][] noint1=Optional[{ { 130.0, 60.0 }, { 131.0, 61.0 }, { 132.0, 62.0 }, { 133.0, 63.0 }, { 134.0, 64.0 }, { 135.0, 65.0 }, { 136.0, 66.0 }, { 137.0, 67.0 }, { 138.0, 68.0 }, { 139.0, 69.0 }, { 140.0, 70.0 } }]
double[][] noint2=Optional[{ { 3.0, 4 }, { 4, 5 }, { 4, 6 } }]
