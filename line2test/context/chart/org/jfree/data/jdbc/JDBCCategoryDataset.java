public JDBCCategoryDataset(String url, String driverName, String user, String passwd) throws ClassNotFoundException, SQLException
public JDBCCategoryDataset(Connection connection)
public JDBCCategoryDataset(Connection connection, String query) throws SQLException
public boolean getTranspose()
public void setTranspose(boolean transpose)
public void executeQuery(String query) throws SQLException
public void executeQuery(Connection con, String query) throws SQLException
long serialVersionUID=Optional[-3080395327918844965L]
Connection connection
boolean transpose=Optional[true]
