public MediaItem() { [EOL] } <line_num>: 18,18
public MediaItem(Content c) { [EOL]     _content = c; [EOL] } <line_num>: 20,23
public Photo() { [EOL] } <line_num>: 54,54
public Photo(String uri, String title, int w, int h, Size s) { [EOL]     _uri = uri; [EOL]     _title = title; [EOL]     _width = w; [EOL]     _height = h; [EOL]     _size = s; [EOL] } <line_num>: 55,62
public Content() { [EOL] } <line_num>: 93,93
public void addPhoto(Photo p) { [EOL]     if (_photos == null) { [EOL]         _photos = new ArrayList<Photo>(); [EOL]     } [EOL]     _photos.add(p); [EOL] } <line_num>: 25,30
public List<Photo> getImages() { [EOL]     return _photos; [EOL] } <line_num>: 32,32
public void setImages(List<Photo> p) { [EOL]     _photos = p; [EOL] } <line_num>: 33,33
public Content getContent() { [EOL]     return _content; [EOL] } <line_num>: 35,35
public void setContent(Content c) { [EOL]     _content = c; [EOL] } <line_num>: 36,36
public String getUri() { [EOL]     return _uri; [EOL] } <line_num>: 64,64
public String getTitle() { [EOL]     return _title; [EOL] } <line_num>: 65,65
public int getWidth() { [EOL]     return _width; [EOL] } <line_num>: 66,66
public int getHeight() { [EOL]     return _height; [EOL] } <line_num>: 67,67
public Size getSize() { [EOL]     return _size; [EOL] } <line_num>: 68,68
public void setUri(String u) { [EOL]     _uri = u; [EOL] } <line_num>: 70,70
public void setTitle(String t) { [EOL]     _title = t; [EOL] } <line_num>: 71,71
public void setWidth(int w) { [EOL]     _width = w; [EOL] } <line_num>: 72,72
public void setHeight(int h) { [EOL]     _height = h; [EOL] } <line_num>: 73,73
public void setSize(Size s) { [EOL]     _size = s; [EOL] } <line_num>: 74,74
public void addPerson(String p) { [EOL]     if (_persons == null) { [EOL]         _persons = new ArrayList<String>(); [EOL]     } [EOL]     _persons.add(p); [EOL] } <line_num>: 95,100
public Player getPlayer() { [EOL]     return _player; [EOL] } <line_num>: 102,102
public String getUri() { [EOL]     return _uri; [EOL] } <line_num>: 103,103
public String getTitle() { [EOL]     return _title; [EOL] } <line_num>: 104,104
public int getWidth() { [EOL]     return _width; [EOL] } <line_num>: 105,105
public int getHeight() { [EOL]     return _height; [EOL] } <line_num>: 106,106
public String getFormat() { [EOL]     return _format; [EOL] } <line_num>: 107,107
public long getDuration() { [EOL]     return _duration; [EOL] } <line_num>: 108,108
public long getSize() { [EOL]     return _size; [EOL] } <line_num>: 109,109
public int getBitrate() { [EOL]     return _bitrate; [EOL] } <line_num>: 110,110
public List<String> getPersons() { [EOL]     return _persons; [EOL] } <line_num>: 111,111
public String getCopyright() { [EOL]     return _copyright; [EOL] } <line_num>: 112,112
public void setPlayer(Player p) { [EOL]     _player = p; [EOL] } <line_num>: 114,114
public void setUri(String u) { [EOL]     _uri = u; [EOL] } <line_num>: 115,115
public void setTitle(String t) { [EOL]     _title = t; [EOL] } <line_num>: 116,116
public void setWidth(int w) { [EOL]     _width = w; [EOL] } <line_num>: 117,117
public void setHeight(int h) { [EOL]     _height = h; [EOL] } <line_num>: 118,118
public void setFormat(String f) { [EOL]     _format = f; [EOL] } <line_num>: 119,119
public void setDuration(long d) { [EOL]     _duration = d; [EOL] } <line_num>: 120,120
public void setSize(long s) { [EOL]     _size = s; [EOL] } <line_num>: 121,121
public void setBitrate(int b) { [EOL]     _bitrate = b; [EOL] } <line_num>: 122,122
public void setPersons(List<String> p) { [EOL]     _persons = p; [EOL] } <line_num>: 123,123
public void setCopyright(String c) { [EOL]     _copyright = c; [EOL] } <line_num>: 124,124
