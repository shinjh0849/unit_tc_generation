private RotationOrder(final String name, final Vector3D a1, final Vector3D a2, final Vector3D a3) { [EOL]     this.name = name; [EOL]     this.a1 = a1; [EOL]     this.a2 = a2; [EOL]     this.a3 = a3; [EOL] } <line_num>: 138,144
@Override [EOL] public String toString() { [EOL]     return name; [EOL] } <line_num>: 149,152
public Vector3D getA1() { [EOL]     return a1; [EOL] } <line_num>: 157,159
public Vector3D getA2() { [EOL]     return a2; [EOL] } <line_num>: 164,166
public Vector3D getA3() { [EOL]     return a3; [EOL] } <line_num>: 171,173
