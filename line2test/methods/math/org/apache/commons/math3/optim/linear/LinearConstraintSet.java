public LinearConstraintSet(LinearConstraint... constraints) { [EOL]     for (LinearConstraint c : constraints) { [EOL]         linearConstraints.add(c); [EOL]     } [EOL] } <line_num>: 41,45
public LinearConstraintSet(Collection<LinearConstraint> constraints) { [EOL]     linearConstraints.addAll(constraints); [EOL] } <line_num>: 52,54
public Collection<LinearConstraint> getConstraints() { [EOL]     return Collections.unmodifiableSet(linearConstraints); [EOL] } <line_num>: 61,63
