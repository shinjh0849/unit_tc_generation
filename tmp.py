infos = {'Chart': ('tests/org/jfree/', 3), 'Cli': ('src/test/org/apache/commons/cli', 7),
                     'Closure': ('test/com/google', 3), 'Codec': ('src/test/org/apache/commons/codec', 4),
                     'Compress': ('src/test/java/org/apache/commons/compress', 5), 'Csv': ('src/test/java/org/apache/commons/csv', 5),
                     'Gson': ('gson/src/test/java/com/google/gson', 6), 'JacksonCore': ('src/test/java/com/fasterxml/jackson', 5), 
                     'JacksonDatabind': ('src/test/java/com/fasterxml/jackson/databind', 5), 'Jsoup': ('src/test/java/org/jsoup', 5),
                     'JxPath': ('src/test/org/apache/commons/jxpath', 4), 'Lang': ('src/test/java/org/apache/commons/lang3', 5),
                     'Time': ('src/test/java/org/joda/time', 5)}

infos = infos
    
for keys, (v1, v2) in infos.items():
    print(keys, v1, v2)