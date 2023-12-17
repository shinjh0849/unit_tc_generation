public CSV()
public CSV(char fieldDelimiter, char textDelimiter)
public CategoryDataset readCategoryDataset(Reader in) throws IOException
private List extractColumnKeys(String line)
private void extractRowKeyAndData(String line, DefaultCategoryDataset dataset, List columnKeys)
private String removeStringDelimiters(String key)
