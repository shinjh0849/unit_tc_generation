public void add(double x, double y) { [EOL]     add(1d, x, y); [EOL] } <line_num>: 51,53
public void add(double weight, double x, double y) { [EOL]     observations.add(new WeightedObservedPoint(weight, x, y)); [EOL] } <line_num>: 67,69
public void add(WeightedObservedPoint observed) { [EOL]     observations.add(observed); [EOL] } <line_num>: 80,82
public List<WeightedObservedPoint> toList() { [EOL]     return new ArrayList<WeightedObservedPoint>(observations); [EOL] } <line_num>: 100,105
public void clear() { [EOL]     observations.clear(); [EOL] } <line_num>: 110,112
