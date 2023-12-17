public RectangleConstraint(double w, double h)
public RectangleConstraint(Range w, Range h)
public RectangleConstraint(Range w, double h)
public RectangleConstraint(double w, Range h)
public RectangleConstraint(double w, Range widthRange, LengthConstraintType widthConstraintType, double h, Range heightRange, LengthConstraintType heightConstraintType)
public double getWidth()
public Range getWidthRange()
public LengthConstraintType getWidthConstraintType()
public double getHeight()
public Range getHeightRange()
public LengthConstraintType getHeightConstraintType()
public RectangleConstraint toUnconstrainedWidth()
public RectangleConstraint toUnconstrainedHeight()
public RectangleConstraint toFixedWidth(double width)
public RectangleConstraint toFixedHeight(double height)
public RectangleConstraint toRangeWidth(Range range)
public RectangleConstraint toRangeHeight(Range range)
public String toString()
public Size2D calculateConstrainedSize(Size2D base)
RectangleConstraint NONE=Optional[new RectangleConstraint(0.0, null, LengthConstraintType.NONE, 0.0, null, LengthConstraintType.NONE)]
double width
Range widthRange
LengthConstraintType widthConstraintType
double height
Range heightRange
LengthConstraintType heightConstraintType
