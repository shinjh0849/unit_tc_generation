void appendTo(Appendable out, String name) throws IOException; <line_num>: 40,40
void appendIndexMapTo(Appendable out, String name, List<SourceMapSection> sections) throws IOException; <line_num>: 51,53
void reset(); <line_num>: 59,59
void addMapping(String sourceName, @Nullable String symbolName, FilePosition sourceStartPosition, FilePosition outputStartPosition, FilePosition outputEndPosition); <line_num>: 73,75
void setWrapperPrefix(String prefix); <line_num>: 84,84
void setStartingPosition(int offsetLine, int offsetIndex); <line_num>: 96,96
void validate(boolean validate); <line_num>: 102,102
