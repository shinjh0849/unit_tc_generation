public AbstractPieLabelDistributor() { [EOL]     this.labels = new java.util.ArrayList(); [EOL] } <line_num>: 60,62
public PieLabelRecord getPieLabelRecord(int index) { [EOL]     return (PieLabelRecord) this.labels.get(index); [EOL] } <line_num>: 71,73
public void addPieLabelRecord(PieLabelRecord record) { [EOL]     if (record == null) { [EOL]         throw new IllegalArgumentException("Null 'record' argument."); [EOL]     } [EOL]     this.labels.add(record); [EOL] } <line_num>: 80,85
public int getItemCount() { [EOL]     return this.labels.size(); [EOL] } <line_num>: 92,94
public void clear() { [EOL]     this.labels.clear(); [EOL] } <line_num>: 99,101
public abstract void distributeLabels(double minY, double height); <line_num>: 110,110
