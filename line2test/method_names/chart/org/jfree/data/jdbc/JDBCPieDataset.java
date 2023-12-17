public JDBCPieDataset(String url, String driverName, String user, String password) throws SQLException, ClassNotFoundException
public JDBCPieDataset(Connection con)
public JDBCPieDataset(Connection con, String query) throws SQLException
public void executeQuery(String query) throws SQLException
public void executeQuery(Connection con, String query) throws SQLException
public void close()
