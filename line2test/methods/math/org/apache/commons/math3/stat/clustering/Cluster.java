public Cluster(final T center) { [EOL]     this.center = center; [EOL]     points = new ArrayList<T>(); [EOL] } <line_num>: 48,51
public void addPoint(final T point) { [EOL]     points.add(point); [EOL] } <line_num>: 57,59
public List<T> getPoints() { [EOL]     return points; [EOL] } <line_num>: 65,67
public T getCenter() { [EOL]     return center; [EOL] } <line_num>: 73,75
