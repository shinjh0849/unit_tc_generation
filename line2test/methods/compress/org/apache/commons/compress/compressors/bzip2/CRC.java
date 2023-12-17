CRC() { [EOL]     initialiseCRC(); [EOL] } <line_num>: 93,95
void initialiseCRC() { [EOL]     globalCrc = 0xffffffff; [EOL] } <line_num>: 97,99
int getFinalCRC() { [EOL]     return ~globalCrc; [EOL] } <line_num>: 101,103
int getGlobalCRC() { [EOL]     return globalCrc; [EOL] } <line_num>: 105,107
void setGlobalCRC(int newCrc) { [EOL]     globalCrc = newCrc; [EOL] } <line_num>: 109,111
void updateCRC(int inCh) { [EOL]     int temp = (globalCrc >> 24) ^ inCh; [EOL]     if (temp < 0) { [EOL]         temp = 256 + temp; [EOL]     } [EOL]     globalCrc = (globalCrc << 8) ^ CRC.crc32Table[temp]; [EOL] } <line_num>: 113,119
void updateCRC(int inCh, int repeat) { [EOL]     int globalCrcShadow = this.globalCrc; [EOL]     while (repeat-- > 0) { [EOL]         int temp = (globalCrcShadow >> 24) ^ inCh; [EOL]         globalCrcShadow = (globalCrcShadow << 8) ^ crc32Table[(temp >= 0) ? temp : (temp + 256)]; [EOL]     } [EOL]     this.globalCrc = globalCrcShadow; [EOL] } <line_num>: 121,130
