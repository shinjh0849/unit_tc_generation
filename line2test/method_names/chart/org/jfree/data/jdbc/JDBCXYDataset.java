private JDBCXYDataset()
public JDBCXYDataset(String url, String driverName, String user, String password) throws SQLException, ClassNotFoundException
public JDBCXYDataset(Connection con) throws SQLException
public JDBCXYDataset(Connection con, String query) throws SQLException
public boolean isTimeSeries()
public void setTimeSeries(boolean timeSeries)
public void executeQuery(String query) throws SQLException
public void executeQuery(Connection con, String query) throws SQLException
public Number getX(int seriesIndex, int itemIndex)
public Number getY(int seriesIndex, int itemIndex)
public int getItemCount(int seriesIndex)
public int getItemCount()
public int getSeriesCount()
public Comparable getSeriesKey(int seriesIndex)
public void close()
public double getRangeLowerBound(boolean includeInterval)
public double getRangeUpperBound(boolean includeInterval)
public Range getRangeBounds(boolean includeInterval)
